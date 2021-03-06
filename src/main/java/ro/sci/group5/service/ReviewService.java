package ro.sci.group5.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sci.group5.dao.ReviewDAO;
import ro.sci.group5.domain.Doctor;
import ro.sci.group5.domain.Review;

@Service
public class ReviewService {
	@Autowired
	private ReviewDAO reviewDao;

	public Review save(Review review) {
		return reviewDao.update(review);
	}

	public Collection<Review> listAll() {
		return reviewDao.getAll();
	}
	
	public Review findById(long id) {
		Review review = reviewDao.findById(id);
		return review;
	}
	
	public Collection<Doctor> getByReviewGrade(Float grade) {
		return reviewDao.filterByReview(grade);
	}

}