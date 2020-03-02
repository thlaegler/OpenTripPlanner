/*
 * This file is based on code copied from project OneBusAway, see the LICENSE file for further
 * information.
 */
package org.opentripplanner.model;

import lombok.Data;

@Data
public final class FareAttribute extends TransitEntity<FeedScopedId> {

  private static final long serialVersionUID = 1L;

  private static final int MISSING_VALUE = -999;

  private FeedScopedId id;

  private float price;

  private String currencyType;

  private int paymentMethod;

  private int transfers = MISSING_VALUE;

  private int transferDuration = MISSING_VALUE;

  /** youthPrice is an extension to the GTFS spec to support Seattle fare types. */
  private float youthPrice;

  /** seniorPrice is an extension to the GTFS spec to support Seattle fare types. */
  private float seniorPrice;

  /** This is a proposed extension to the GTFS spec */
  private int journeyDuration = MISSING_VALUE;

  private float adultCashPrice;
  private float adultCardPrice;
  private float childCashPrice;
  private float childCardPrice;
  private float tertiaryCashPrice;
  private float tertiaryCardPrice;

  public FareAttribute() {}

  public FareAttribute(FareAttribute fa) {
    this.id = fa.id;
    this.price = fa.price;
    this.currencyType = fa.currencyType;
    this.paymentMethod = fa.paymentMethod;
    this.transfers = fa.transfers;
    this.transferDuration = fa.transferDuration;
    this.journeyDuration = fa.journeyDuration;
  }


  public boolean isTransfersSet() {
    return transfers != MISSING_VALUE;
  }

  public int getTransfers() {
    return transfers;
  }

  public void setTransfers(int transfers) {
    this.transfers = transfers;
  }

  public void clearTransfers() {
    this.transfers = MISSING_VALUE;
  }

  public boolean isTransferDurationSet() {
    return transferDuration != MISSING_VALUE;
  }

  public void clearTransferDuration() {
    this.transferDuration = MISSING_VALUE;
  }

  public boolean isJourneyDurationSet() {
    return journeyDuration != MISSING_VALUE;
  }

  public void setJourneyDuration(int journeyDuration) {
    this.journeyDuration = journeyDuration;
  }

  public void clearJourneyDuration() {
    this.journeyDuration = MISSING_VALUE;
  }

  @Override
  public String toString() {
    return "<FareAttribute " + getId() + ">";
  }

}
