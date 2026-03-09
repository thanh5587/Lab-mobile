# 🧪 TESTING CHECKLIST - Lab 1

## Pre-flight Checks ✈️

- [ ] Android Studio đã mở project
- [ ] Gradle sync đã hoàn thành (no errors)
- [ ] Emulator đã khởi động hoặc device đã kết nối
- [ ] Build variant: debug

---

## Test Sequence 🔍

### 1️⃣ Main Menu (MainActivity)
- [ ] App khởi động thành công
- [ ] Title bar hiển thị: "Lab 1 - Android Layouts"
- [ ] Hiển thị 4 buttons:
  - [ ] "Bài 1A - LinearLayout (Code)"
  - [ ] "Bài 1B - LinearLayout (XML)"
  - [ ] "Bài 2 - RelativeLayout"
  - [ ] "Bài 3 - ConstraintLayout"
- [ ] Header "CÁC LAYOUT CƠ BẢN" hiển thị ở trên cùng

---

### 2️⃣ Bài 1A - LinearLayout (Code)
**Click button "Bài 1A"**

✅ **Expected Results:**
- [ ] Navigate sang Lab1AActivity
- [ ] Title bar: "Bài 1A - LinearLayout (Code)"
- [ ] Hiển thị 2 dòng text:
  ```
  Name: John Doe
  Address: 911 Hollywood Blvd
  ```
- [ ] Text hiển thị ở góc trên trái màn hình
- [ ] Back button quay về Main Menu

**Kiểm tra code:**
- [ ] Layout được tạo 100% bằng Java code
- [ ] Không có file XML layout cho Lab1A
- [ ] Sử dụng createNameContainer(), createAddressContainer()

---

### 3️⃣ Bài 1B - LinearLayout (XML)
**Click button "Bài 1B"**

✅ **Expected Results:**
- [ ] Navigate sang Lab1BActivity  
- [ ] Title bar: "Bài 1B - LinearLayout (XML)"
- [ ] Hiển thị layout với nhiều màu sắc:
  - **Top half** (3 columns):
    - [ ] Column 1: Chia 2 phần (màu khác nhau)
    - [ ] Column 2: Chia 2 phần (màu khác nhau)
    - [ ] Column 3: 1 màu đồng nhất
  - **Bottom half** (4 rows):
    - [ ] Row 1: Chia 2 cột (màu khác nhau)
    - [ ] Row 2-4: Mỗi row 1 màu
- [ ] Back button quay về Main Menu

**Kiểm tra code:**
- [ ] Layout trong activity_lab1b.xml
- [ ] Sử dụng nested LinearLayouts
- [ ] Sử dụng layout_weight="1"
- [ ] Colors từ colors.xml

---

### 4️⃣ Bài 2 - RelativeLayout
**Click button "Bài 2"**

✅ **Expected Results:**
- [ ] Navigate sang Lab2Activity
- [ ] Title bar: "Bài 2 - RelativeLayout"
- [ ] Form đăng nhập hiển thị:
  - [ ] "SIGN IN" title (căn giữa, chữ in hoa)
  - [ ] "Username:" label + EditText (hint: name@gmail.com)
  - [ ] "Password:" label + EditText (hint: ******, password input)
  - [ ] Button "Sign Up" (bên trái)
  - [ ] Button "Sign In" (bên phải)
  - [ ] "Forgot password?" link (căn giữa, màu purple)
- [ ] Labels rộng 100dp
- [ ] EditTexts chiếm hết width còn lại
- [ ] Buttons căn phải
- [ ] Back button quay về Main Menu

**Kiểm tra code:**
- [ ] Sử dụng RelativeLayout
- [ ] Attributes: layout_below, layout_toRightOf, layout_alignParentRight
- [ ] Strings từ strings.xml
- [ ] Dimens từ dimens.xml

---

### 5️⃣ Bài 3 - ConstraintLayout
**Click button "Bài 3"**

✅ **Expected Results:**
- [ ] Navigate sang Lab3Activity
- [ ] Title bar: "Bài 3 - ConstraintLayout"
- [ ] Form đăng nhập GIỐNG BÀI 2:
  - [ ] "SIGN IN" title (căn giữa, chữ in hoa)
  - [ ] "Username:" label + EditText
  - [ ] "Password:" label + EditText
  - [ ] Button "Sign Up" + "Sign In"
  - [ ] "Forgot password?" link
- [ ] Layout tương tự Bài 2 nhưng dùng ConstraintLayout
- [ ] Back button quay về Main Menu

**Kiểm tra code:**
- [ ] Sử dụng ConstraintLayout
- [ ] Attributes: layout_constraint*
- [ ] Không có nested layouts
- [ ] Flat view hierarchy

---

## 🐛 Common Issues & Solutions

### Issue 1: App crashes on button click
**Solution**: 
- Kiểm tra AndroidManifest.xml - tất cả activities đã registered
- Rebuild project

### Issue 2: Colors không hiển thị
**Solution**:
- Kiểm tra colors.xml có đầy đủ color0-color7
- Sync Gradle

### Issue 3: Strings not found
**Solution**:
- Kiểm tra strings.xml
- Clean & Rebuild project

### Issue 4: Layout không đúng
**Solution**:
- So sánh code với mẫu trong tài liệu
- Check layout_weight, orientations
- Verify constraints trong ConstraintLayout

---

## 📊 Grading Criteria (Tự đánh giá)

| Tiêu chí | Điểm | Đạt? |
|----------|------|------|
| Main menu hoạt động | 10 | [ ] |
| Bài 1A - LinearLayout code | 20 | [ ] |
| Bài 1B - LinearLayout XML | 25 | [ ] |
| Bài 2 - RelativeLayout | 25 | [ ] |
| Bài 3 - ConstraintLayout | 20 | [ ] |
| **TOTAL** | **100** | |

---

## ✅ Final Verification

Trước khi submit, kiểm tra:

1. **Code Quality**
   - [ ] No compile errors
   - [ ] No runtime crashes
   - [ ] Proper naming conventions
   - [ ] Code comments (if required)

2. **Functionality**
   - [ ] All 4 exercises work correctly
   - [ ] Navigation works both ways (forward & back)
   - [ ] Layouts display as expected
   - [ ] Forms look professional

3. **Resources**
   - [ ] All resources in proper folders
   - [ ] No hardcoded strings in layouts
   - [ ] Colors defined in colors.xml
   - [ ] Dimens used consistently

4. **Best Practices**
   - [ ] AndroidManifest properly configured
   - [ ] Activity titles set
   - [ ] Proper use of layout types
   - [ ] Clean code structure

---

## 🚀 Ready to Submit!

If all checkboxes are marked, your lab is complete and ready for submission!

**Good luck! 🎓**

