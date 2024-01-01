package class1.ex;

public class MoveReviewMain2 {
    public static void main(String[] args) {
        MoveReview[] reviews = new MoveReview[2];

        MoveReview inception = new MoveReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        reviews[0] = inception;

        MoveReview aboutTime = new MoveReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";
        reviews[1] = aboutTime;

        for (MoveReview review : reviews) {
            System.out.println("영화 제목: " + review.title + ", 리뷰: "+ review.review);
        }
    }
}
