package com.microsoft.bingads.bulk.entities;

import com.microsoft.bingads.bulk.BulkServiceManager;
import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.BulkFileWriter;
import com.microsoft.bingads.bulk.BulkOperation;

/**
 * Represents one age target bid within an age target that is associated with a campaign.
 *
 * This class exposes the {@link BulkAgeTargetBid#setAgeTargetBid} and {@link BulkAgeTargetBid#getAgeTargetBid} methods
 * that can be used to read and write fields of the Campaign Age Target record in a bulk file.
 *
 * <p>
 *     For more information, see Campaign Age Target at
 *     <a href="http://go.microsoft.com/fwlink/?LinkID=511530">http://go.microsoft.com/fwlink/?LinkID=511530</a>.
 * </p>
 *
 * <p>
 *     One {@link BulkCampaignAgeTarget} exposes a read only list of {@link BulkCampaignAgeTargetBid}.
 *     Each {@link BulkCampaignAgeTargetBid} instance corresponds to one Campaign Age Target record in the bulk file.
 *     If you upload a {@link BulkCampaignAgeTarget},
 *     then you are effectively replacing any existing bids for the corresponding age target.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkCampaignAgeTargetBid extends BulkAgeTargetBid {

    /**
     * Initializes a new instanced of the BulkCampaignAgeTargetBid class.
     */
    public BulkCampaignAgeTargetBid() {
        super(new BulkCampaignTargetIdentifier(BulkCampaignAgeTargetBid.class));
    }

    /**
     * Gets the identifier of the campaign that the target is associated.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public Long getCampaignId() {
        return getEntityId();
    }

    /**
     * Sets the identifier of the campaign that the target is associated.
     *
     * <p>
     *     Corresponds to the 'Parent Id' field in the bulk file.
     * </p>
     */
    public void setCampaignId(Long campaignId) {
        setEntityId(campaignId);
    }

    /**
     * Gets the name of the campaign that target is associated.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public String getCampaignName() {
        return getEntityName();
    }

    /**
     * Sets the name of the campaign that target is associated.
     *
     * <p>
     *     Corresponds to the 'Campaign' field in the bulk file.
     * </p>
     */
    public void setCampaignName(String campaignName) {
        setEntityName(campaignName);
    }
}
