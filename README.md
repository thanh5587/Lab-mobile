# Lab 1 - Các Layout Cơ Bản trong Android

## 📌 Mô tả
Dự án lab thực hành về các loại Layout cơ bản trong Android, bao gồm:
- LinearLayout (Code & XML)
- RelativeLayout
- ConstraintLayout

## 🏗️ Cấu trúc Project

```
lab1/
├── MainActivity.java           → Main Menu
├── Lab1AActivity.java         → Bài 1A (LinearLayout - Code)
├── Lab1BActivity.java         → Bài 1B (LinearLayout - XML)
├── Lab2Activity.java          → Bài 2 (RelativeLayout)
├── Lab3Activity.java          → Bài 3 (ConstraintLayout)
└── res/
    ├── layout/
    │   ├── activity_main_menu.xml    → Main menu layout
    │   ├── activity_lab1b.xml        → Lab 1B layout
    │   ├── activity_lab2.xml         → Lab 2 layout
    │   └── activity_lab3.xml         → Lab 3 layout
    └── values/
        ├── strings.xml               → String resources
        ├── colors.xml                → Color resources
        └── dimens.xml                → Dimension resources
```

## 🎯 Các bài tập

### Bài 1A: LinearLayout (Tạo bằng Code)
**Mục tiêu**: Học cách tạo layout hoàn toàn bằng Java code

**Kỹ năng**:
- Khởi tạo LinearLayout programmatically
- Sử dụng LayoutParams
- Thêm View động vào container
- Set orientation (HORIZONTAL, VERTICAL)

**Hiển thị**:
```
Name: John Doe
Address: 911 Hollywood Blvd
```

---

### Bài 1B: LinearLayout (Tạo bằng XML)
**Mục tiêu**: Tạo layout phức tạp với nhiều LinearLayout lồng nhau

**Kỹ năng**:
- Nested LinearLayouts
- Sử dụng layout_weight cho tỷ lệ
- Background colors
- Kết hợp orientation khác nhau

**Hiển thị**: 
- Phần trên: 3 cột màu khác nhau (cột 1,2 chia thành 2 phần)
- Phần dưới: 4 hàng màu khác nhau (hàng 1 chia 2 cột)

---

### Bài 2: RelativeLayout
**Mục tiêu**: Tạo form đăng nhập với RelativeLayout

**Kỹ năng**:
- Relative positioning (layout_below, layout_toRightOf, etc.)
- Parent alignment (alignParentRight, centerHorizontal)
- Form design
- Using resources properly

**Components**:
- Title: "SIGN IN"
- Username field
- Password field
- Sign Up button
- Sign In button  
- Forgot password? link

---

### Bài 3: ConstraintLayout
**Mục tiêu**: Làm lại Bài 2 nhưng với ConstraintLayout (Modern approach)

**Kỹ năng**:
- Constraint-based positioning
- Flat view hierarchy
- Modern Android best practices
- Responsive design

**Components**: Giống Bài 2 nhưng dùng constraints thay vì relative positioning

---

## 🚀 Cách chạy

### 1. Mở project
```bash
- Mở Android Studio
- File → Open → Chọn thư mục lab1
- Đợi Gradle sync hoàn thành
```

### 2. Chạy app
```bash
- Nhấn nút Run (▶️) hoặc Shift+F10
- Chọn emulator hoặc thiết bị thật
- Đợi app build và cài đặt
```

### 3. Test từng bài
```bash
- Màn hình chính hiển thị 4 nút
- Nhấn từng nút để xem kết quả
- Dùng Back button để quay lại menu
```

---

## 📱 Screenshots Expected

### Main Menu
```
┌─────────────────────────┐
│  CÁC LAYOUT CƠ BẢN    │
│                         │
│ [Bài 1A - LinearLayout] │
│ [Bài 1B - LinearLayout] │
│ [Bài 2 - RelativeLayout]│
│ [Bài 3 - ConstraintLayo]│
└─────────────────────────┘
```

### Bài 1A
```
┌─────────────────────────┐
│ Name: John Doe          │
│ Address: 911 Hollywood  │
└─────────────────────────┘
```

### Bài 1B
```
┌─────────────────────────┐
│ [Colored blocks layout] │
│ [Various colors]        │
└─────────────────────────┘
```

### Bài 2 & 3
```
┌─────────────────────────┐
│       SIGN IN           │
│                         │
│ Username: [________]    │
│ Password: [________]    │
│                         │
│      [Sign Up] [Sign In]│
│   Forgot password?      │
└─────────────────────────┘
```

---

## 📚 Kiến thức đạt được

### LinearLayout
- ✅ Orientation: horizontal, vertical
- ✅ layout_weight cho tỷ lệ
- ✅ Tạo bằng code và XML
- ✅ Nested layouts

### RelativeLayout  
- ✅ Positioning tương đối
- ✅ Parent alignment
- ✅ Sibling positioning
- ✅ Form design

### ConstraintLayout
- ✅ Modern approach
- ✅ Constraint system
- ✅ Flat hierarchy
- ✅ Better performance

---

## 🔧 Troubleshooting

### Lỗi "Cannot resolve symbol 'R'"
```bash
- Build → Clean Project
- Build → Rebuild Project
- File → Invalidate Caches / Restart
```

### Gradle sync failed
```bash
- Check internet connection
- File → Sync Project with Gradle Files
- Update Android Studio if needed
```

### App crashes on start
```bash
- Check AndroidManifest.xml (all activities registered)
- Check logcat for error messages
- Verify all resource files exist
```

---

## 📖 Tài liệu tham khảo

- [Android Layouts Documentation](https://developer.android.com/guide/topics/ui/declaring-layout)
- [LinearLayout Guide](https://developer.android.com/reference/android/widget/LinearLayout)
- [RelativeLayout Guide](https://developer.android.com/reference/android/widget/RelativeLayout)
- [ConstraintLayout Guide](https://developer.android.com/training/constraint-layout)

---

## ✅ Checklist hoàn thành

- [x] MainActivity với menu điều hướng
- [x] Lab1AActivity - LinearLayout bằng code
- [x] Lab1BActivity - LinearLayout bằng XML
- [x] Lab2Activity - RelativeLayout
- [x] Lab3Activity - ConstraintLayout
- [x] Resource files (strings, colors, dimens)
- [x] AndroidManifest cấu hình đầy đủ
- [x] No compile errors

---

**🎓 Chúc bạn học tốt!**

Mọi thắc mắc xin liên hệ giảng viên hoặc trợ giảng.

