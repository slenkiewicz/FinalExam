package exceptions;

public class RateException extends Exception {
	rocketDomain.RateDomainModel RateDomainModel;

	public RateException(rocketDomain.RateDomainModel rateDomainModel) {
		super();
		RateDomainModel = rateDomainModel;
	}

	public rocketDomain.RateDomainModel getRateDomainModel() {
		return RateDomainModel;
	}
}
