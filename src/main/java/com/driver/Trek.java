package com.driver;

import java.util.List;

public class Trek {
	private String name;
	private int duration;
	private int altitudeGain;
	private List<Object> knownChallenges;

	public Trek(String name, int duration, int altitudeGain, List<Object> knownChallenges2) {
		this.name = name;
		this.duration = duration;
		this.altitudeGain = altitudeGain;
		this.knownChallenges = knownChallenges2;
	}

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}

	public int getAltitudeGain() {
		return altitudeGain;
	}

	public List<Object> getKnownChallenges() {
		return knownChallenges;
	}
}