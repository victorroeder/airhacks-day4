var gulp = require('gulp');

gulp.task('clean', function () {
    console.log('cleaning');
});


gulp.task('build', ['clean'], function () {
    console.log('building');
});



gulp.watch('../**/*.html', function (event) {
    console.log(event);
});

gulp.task('default', ['build']);