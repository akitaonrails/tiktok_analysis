package webcast.api.smb_external;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CalendlyEventTypePayload {

    @C09CT("active")
    public boolean active;

    @C09CT("admin_managed")
    public boolean adminManaged;

    @C09CT("duration")
    public int duration;

    @C09CT("is_paid")
    public boolean isPaid;

    @C09CT("position")
    public int position;

    @C09CT("profile")
    public CalendlyProfile profile;

    @C09CT("secret")
    public boolean secret;

    @C09CT("uri")
    public String uri = "";

    @C09CT("name")
    public String name = "";

    @C09CT("booking_method")
    public String bookingMethod = "";

    @C09CT("slug")
    public String slug = "";

    @C09CT("scheduling_url")
    public String schedulingUrl = "";

    @C09CT("duration_options")
    public List<Integer> durationOptions = new ArrayList();

    @C09CT("kind")
    public String kind = "";

    @C09CT("pooling_type")
    public String poolingType = "";

    @C09CT("type")
    public String type = "";

    @C09CT("color")
    public String color = "";

    @C09CT("created_at")
    public String createdAt = "";

    @C09CT("updated_at")
    public String updatedAt = "";

    @C09CT("internal_note")
    public String internalNote = "";

    @C09CT("description_plain")
    public String descriptionPlain = "";

    @C09CT("description_html")
    public String descriptionHtml = "";

    @C09CT("deleted_at")
    public String deletedAt = "";

    @C09CT("locations")
    public List<CalendlyLocation> locations = new ArrayList();

    @C09CT("locale")
    public String locale = "";
}
