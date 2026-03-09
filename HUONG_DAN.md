# Hướng dẫn sử dụng Lab 1 - Android Layouts

## Cấu trúc dự án

Dự án này bao gồm 4 bài tập về các loại Layout cơ bản trong Android:

### 📱 Main Menu (MainActivity)
Màn hình chính với 4 nút để điều hướng đến các bài tập:
- **Bài 1A**: LinearLayout tạo bằng code Java
- **Bài 1B**: LinearLayout tạo bằng XML với nested layouts
- **Bài 2**: RelativeLayout - Form đăng nhập
- **Bài 3**: ConstraintLayout - Form đăng nhập (modern approach)

---

## 📚 Chi tiết các bài tập

### Bài 1A - LinearLayout (Programmatic)
**File**: `Lab1AActivity.java`

**Nội dung**:
- Tạo LinearLayout hoàn toàn bằng Java code (không dùng XML)
- Hiển thị thông tin Name và Address
- Học cách:
  - Khởi tạo LinearLayout trong code
  - Sử dụng LayoutParams
  - Thêm View động
  - Orientation: HORIZONTAL và VERTICAL

**Kết quả**: Hiển thị 2 dòng text:
```
Name: John Doe
Address: 911 Hollywood Blvd
```

---

### Bài 1B - LinearLayout (XML)
**Files**: `Lab1BActivity.java` + `activity_lab1b.xml`

**Nội dung**:
- Tạo layout phức tạp với nhiều LinearLayout lồng nhau
- Sử dụng layout_weight để chia tỷ lệ
- Màn hình chia 2 phần:
  - **Phần trên**: 3 cột, cột 1 và 2 chia 2 phần nhỏ
  - **Phần dưới**: 4 hàng với màu khác nhau, hàng 1 chia 2 cột

**Học được**:
- Nested LinearLayout
- layout_weight để chia tỷ lệ
- Tạo giao diện phức tạp bằng XML

---

### Bài 2 - RelativeLayout
**Files**: `Lab2Activity.java` + `activity_lab2.xml`

**Nội dung**:
- Form đăng nhập với RelativeLayout
- Các thành phần:
  - Tiêu đề "SIGN IN" (căn giữa)
  - Username label + EditText
  - Password label + EditText
  - 2 Button: Sign Up và Sign In
  - Link "Forgot password?"

**Học được**:
- Positioning tương đối: layout_below, layout_toRightOf
- Căn chỉnh: layout_alignParentRight, layout_centerHorizontal
- Sử dụng resources: strings, dimens
- Thiết kế form chuẩn

**Thuộc tính quan trọng**:
- `layout_below`: Đặt dưới element khác
- `layout_toRightOf`: Đặt bên phải element khác
- `layout_alignParentRight`: Căn phải parent
- `layout_centerHorizontal`: Căn giữa ngang

---

### Bài 3 - ConstraintLayout
**Files**: `Lab3Activity.java` + `activity_lab3.xml`

**Nội dung**:
- Làm lại form đăng nhập như Bài 2 nhưng dùng ConstraintLayout
- Layout hiện đại, được Google khuyến nghị
- Không cần nested layouts → Performance tốt hơn

**Học được**:
- Constraint-based positioning
- Flat view hierarchy (không lồng nhiều tầng)
- Responsive design
- Modern Android best practices

**Ưu điểm**:
- ✅ Performance tốt hơn RelativeLayout
- ✅ Ít lồng layout hơn
- ✅ Dễ responsive với nhiều màn hình
- ✅ Visual editor hỗ trợ tốt

---

## 🎨 Resource Files

### colors.xml
Định nghĩa các màu sử dụng trong Lab 1B:
- color0 → color7: Các màu khác nhau

### strings.xml
Các chuỗi text:
- sign_in, username, password, signup, forgot_password

### dimens.xml
Kích thước chuẩn:
- Margins: 5dp, 10dp, 15dp, 20dp
- Text sizes: 16sp, 18sp, 20sp

---

## 🚀 Cách chạy

1. Mở project trong Android Studio
2. Chờ Gradle sync xong
3. Chạy app trên emulator hoặc thiết bị thật
4. Màn hình chính hiển thị 4 nút
5. Nhấn từng nút để xem kết quả các bài tập
6. Dùng nút Back để quay lại menu chính

---

## 📝 So sánh các Layout

| Layout | Ưu điểm | Nhược điểm | Sử dụng khi |
|--------|---------|------------|-------------|
| **LinearLayout** | Đơn giản, dễ hiểu | Cần nested nhiều cho layout phức tạp | Layout đơn giản, danh sách |
| **RelativeLayout** | Linh hoạt, ít nested hơn | Phức tạp khi có nhiều views | Form, căn chỉnh tương đối |
| **ConstraintLayout** | Modern, powerful, flat hierarchy | Đường học hơi cao | Mọi trường hợp (recommended) |

---

## 🎯 Mục tiêu học tập

Sau khi hoàn thành lab này, bạn sẽ:
- ✅ Hiểu cách tạo layout bằng code và XML
- ✅ Biết cách sử dụng LinearLayout với orientation và weight
- ✅ Nắm vững RelativeLayout với relative positioning
- ✅ Biết cách dùng ConstraintLayout hiện đại
- ✅ Biết cách navigation giữa các Activity
- ✅ Sử dụng resources đúng cách

---

## 💡 Tips

1. **LinearLayout**: Dùng `layout_weight` để chia tỷ lệ, nhớ set `layout_height="0dp"` (vertical) hoặc `layout_width="0dp"` (horizontal)

2. **RelativeLayout**: Luôn set ID cho views nếu view khác cần reference đến nó

3. **ConstraintLayout**: Mỗi view cần ít nhất 2 constraints (horizontal + vertical)

4. **Resources**: Luôn dùng strings.xml, colors.xml, dimens.xml thay vì hardcode values

---

**Chúc bạn học tốt! 🎓**

