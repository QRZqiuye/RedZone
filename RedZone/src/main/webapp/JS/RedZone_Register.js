// 🔒 비밀번호 보기 토글
function togglePassword(fieldId) {
  const field = document.getElementById(fieldId);
  field.type = field.type === 'password' ? 'text' : 'password';
}

// ✅ 비밀번호 일치 확인
document.addEventListener('DOMContentLoaded', function () {
  const form = document.getElementById('register-form');
  form.addEventListener('submit', function (e) {
    const pw = document.getElementById('password').value;
    const confirmPw = document.getElementById('confirm-password').value;
    const errorMsg = document.getElementById('pw-error');

    if (pw !== confirmPw) {
      e.preventDefault();
      errorMsg.textContent = '비밀번호가 일치하지 않습니다.';
    } else {
      errorMsg.textContent = '';
    }
  });
});
