package ro.sci.group5.dao;

import java.util.Collection;

import ro.sci.group5.domain.Doctor;
import ro.sci.group5.domain.Review;

public interface ReviewDAO extends BaseDAO<Review> {

	Collection<Review> searchByName(String query);
	Collection<Doctor> filterByReview(Float grade);
}
