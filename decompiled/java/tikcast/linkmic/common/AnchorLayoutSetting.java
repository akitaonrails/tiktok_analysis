package tikcast.linkmic.common;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorLayoutSetting {

    @C09CT("latest_layout_style")
    public int latestLayoutStyle;

    @C09CT("layout_style_settings")
    public List<AnchorLayoutStyleSetting> layoutStyleSettings = new ArrayList();

    @C09CT("panel_layout_type_setting")
    public List<AnchorPanelLayoutTypeSetting> panelLayoutTypeSetting = new ArrayList();
}
