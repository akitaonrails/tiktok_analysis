package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C098200Yq;
import X.C09CT;
import X.C09DE;
import X.C13BV;
import X.C189200o6;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.p;
import com.google.gson.q;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class AnchorCommonStruct implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("custom_anchor_state")
    public int anchorState;

    @C09CT("animate_info")
    public AnchorAnimateStruct animateInfo;

    @C09CT("biz_group")
    public int bizGroup;

    @C09CT("anchor_strong")
    public EnhancedProduct enhancedProduct;

    @C09CT("friends_tab_v2_icon")
    public UrlModel friendsTabV2Icon;

    @C09CT("general_type")
    public int generalType;

    @C09CT("icon")
    public UrlModel icon;

    @C09CT("keyword")
    public String keyword;

    @C09CT("log_extra")
    public String logExtra;

    @C09CT("new_style_bubble_icon")
    @C09DE
    public UrlModel newStyleBubbleIcon;

    @C09CT("real_count")
    public int realCount;

    @C09CT("show_in_search_result")
    public boolean showInSearchResult;

    @C09CT("standard_info")
    public StandardComponentStruct standardComponentInfo;

    @C09CT("story_immersive_feed_icon")
    public UrlModel storyImmersiveFeedIcon;

    @C09CT("style")
    public int style;

    @C09CT("thumbnail")
    public UrlModel thumbnail;

    @C09CT("type")
    public int type;

    @C09CT("url")
    public String url;

    @C09CT("view_object_str")
    public String viewObjectStr;

    @C09CT("language")
    public String language = "";

    @C09CT("schema")
    public String schema = "";

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("most_relevant_product_id")
    public String mostRelevantProductId = "";

    @C09CT("extra")
    public String extra = "";

    @C09CT("deep_link")
    public String deepLink = "";

    @C09CT("universal_link")
    public String universalLink = "";

    @C09CT("show_type")
    public int showType = 1;

    @C09CT("description")
    public String description = "";

    @C09CT("actions")
    public List<AnchorPanelAction> actions = C13BV.INSTANCE;

    @C09CT("component_key")
    public String componentKey = "";

    @C09CT("impression_id")
    public String impressionId = "";

    @C09CT("caption")
    public String caption = "";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes4.dex */
    public static final class BCToggleABTestMode {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ BCToggleABTestMode[] $VALUES;
        public final int value;
        public static final BCToggleABTestMode UNKNOWN = new BCToggleABTestMode("UNKNOWN", 0, -1);
        public static final BCToggleABTestMode SHOW = new BCToggleABTestMode("SHOW", 1, 1);
        public static final BCToggleABTestMode DISABLE = new BCToggleABTestMode("DISABLE", 2, 0);

        public static final /* synthetic */ BCToggleABTestMode[] $values() {
            return new BCToggleABTestMode[]{UNKNOWN, SHOW, DISABLE};
        }

        public static InterfaceC2044707zh<BCToggleABTestMode> getEntries() {
            return $ENTRIES;
        }

        static {
            BCToggleABTestMode[] bCToggleABTestModeArr$values = $values();
            $VALUES = bCToggleABTestModeArr$values;
            $ENTRIES = new C2254308sP(bCToggleABTestModeArr$values);
        }

        public static BCToggleABTestMode[] values() {
            return (BCToggleABTestMode[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        public static BCToggleABTestMode valueOf(String str) {
            return (BCToggleABTestMode) C08FF.LIZ(BCToggleABTestMode.class, str);
        }

        public BCToggleABTestMode(String str, int i, int i2) {
            this.value = i2;
        }
    }

    public static final class Companion {
    }

    public final boolean isCCTemplate() {
        String dataFromLogExtra = getDataFromLogExtra("template_id");
        return dataFromLogExtra.length() > 0 && !Intrinsics.LJFF(dataFromLogExtra, "none");
    }

    public final String subType() {
        return getDataFromExtra("sub_type", "");
    }

    public final List<AnchorPanelAction> getActions() {
        return this.actions;
    }

    public final int getAnchorState() {
        return this.anchorState;
    }

    public final AnchorAnimateStruct getAnimateInfo() {
        return this.animateInfo;
    }

    public final int getBizGroup() {
        return this.bizGroup;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getComponentKey() {
        return this.componentKey;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final String getDescription() {
        return this.description;
    }

    public final EnhancedProduct getEnhancedProduct() {
        return this.enhancedProduct;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getFriendsTabV2Icon() {
        return this.friendsTabV2Icon;
    }

    public final int getGeneralType() {
        return this.generalType;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImpressionId() {
        return this.impressionId;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getMostRelevantProductId() {
        return this.mostRelevantProductId;
    }

    public final UrlModel getNewStyleBubbleIcon() {
        return this.newStyleBubbleIcon;
    }

    public final int getRealCount() {
        return this.realCount;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final boolean getShowInSearchResult() {
        return this.showInSearchResult;
    }

    public final int getShowType() {
        return this.showType;
    }

    public final StandardComponentStruct getStandardComponentInfo() {
        return this.standardComponentInfo;
    }

    public final UrlModel getStoryImmersiveFeedIcon() {
        return this.storyImmersiveFeedIcon;
    }

    public final int getStyle() {
        return this.style;
    }

    public final UrlModel getThumbnail() {
        return this.thumbnail;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUniversalLink() {
        return this.universalLink;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getViewObjectStr() {
        return this.viewObjectStr;
    }

    public final String getDataFromLogExtra(String str) {
        Object c098200Yq;
        Object obj = null;
        try {
            new p();
            String str2 = this.logExtra;
            if (str2 == null) {
                str2 = "";
            }
            q qVarLJJIJIIJI = p.LIZJ(str2).LJIILIIL().LJJIJIIJI(str);
            if (qVarLJJIJIIJI != null) {
                c098200Yq = qVarLJJIJIIJI.LJIL();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        String str3 = (String) obj;
        if (str3 == null) {
            return "";
        }
        return str3;
    }

    public final void setAnchorState(int i) {
        this.anchorState = i;
    }

    public final void setBizGroup(int i) {
        this.bizGroup = i;
    }

    public final void setCaption(String str) {
        this.caption = str;
    }

    public final void setComponentKey(String str) {
        this.componentKey = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setFriendsTabV2Icon(UrlModel urlModel) {
        this.friendsTabV2Icon = urlModel;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setImpressionId(String str) {
        this.impressionId = str;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setLogExtra(String str) {
        this.logExtra = str;
    }

    public final void setNewStyleBubbleIcon(UrlModel urlModel) {
        this.newStyleBubbleIcon = urlModel;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setStandardComponentInfo(StandardComponentStruct standardComponentStruct) {
        this.standardComponentInfo = standardComponentStruct;
    }

    public final void setStoryImmersiveFeedIcon(UrlModel urlModel) {
        this.storyImmersiveFeedIcon = urlModel;
    }

    public final void setStyle(int i) {
        this.style = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setViewObjectStr(String str) {
        this.viewObjectStr = str;
    }

    public final String getDataFromExtra(String str, String str2) {
        try {
            new p();
            String str3 = this.extra;
            if (str3 == null) {
                str3 = "";
            }
            q qVarLJJIJIIJI = p.LIZJ(str3).LJIILIIL().LJJIJIIJI(str);
            if (qVarLJJIJIIJI != null) {
                String strLJIL = qVarLJJIJIIJI.LJIL();
                if (strLJIL != null) {
                    return strLJIL;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return str2;
    }
}
