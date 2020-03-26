package org.prebid.server.events;

import lombok.Builder;
import lombok.Value;

/**
 * Represents event request.
 */
@Builder
@Value
public class EventRequest {

    Type type;

    String bidId;

    String bidder;

    String accountId;

    Format format;

    Analytics analytics;

    Long timestamp;

    public enum Type {

        win, imp
    }

    public enum Format {

        blank, image
    }

    public enum Analytics {

        enabled, disabled
    }
}
