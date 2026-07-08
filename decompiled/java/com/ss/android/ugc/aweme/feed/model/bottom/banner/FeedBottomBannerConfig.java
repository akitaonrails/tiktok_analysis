package com.ss.android.ugc.aweme.feed.model.bottom.banner;

import X.C08FF;
import X.C0HH2;
import X.C0SH7;
import X.C1331670kl3;
import X.C2254308sP;
import X.C342810DcF;
import X.C342820DcG;
import X.C345710Dgv;
import X.C419910GdJ;
import X.C786410Ut5;
import X.InterfaceC2044707zh;
import android.view.View;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedBottomBannerConfig {
    public final Boolean backgroundOverride;
    public final String bannerName;
    public final Function1<C1331670kl3, Unit> iconLighten;
    public final Integer iconRes;
    public final Boolean iconTintOverride;
    public final IconType iconType;
    public final C0SH7 interactionAction;
    public final Callback interactionLayoutCallback;
    public final Integer interactionLayoutId;
    public final View interactionLayoutView;
    public final InteractionType interactionType;
    public final C419910GdJ titleEndIcon;
    public final Function1<View, Unit> titleEndIconView;
    public final int titleMaxLine;
    public final boolean titleSyncSet;
    public final Set<String> whiteList;

    public static final class Builder {
        public Boolean backgroundOverride;
        public final String bannerName;
        public Integer iconRes;
        public Boolean iconTintOverride;
        public C0SH7 interactionAction;
        public Callback interactionLayoutCallback;
        public Integer interactionLayoutId;
        public View interactionLayoutView;
        public Function1<? super C1331670kl3, Unit> lightenImageRequestBuilder;
        public C419910GdJ titleEndIcon;
        public Function1<? super View, Unit> titleEndIconView;
        public boolean titleSyncSet;
        public final Set<String> whiteList;
        public IconType iconType = IconType.LOCAL;
        public int titleMaxLine = 1;
        public InteractionType interactionType = InteractionType.ARROW;

        public final FeedBottomBannerConfig build() {
            return new FeedBottomBannerConfig(this);
        }

        public final Boolean getBackgroundOverride() {
            return this.backgroundOverride;
        }

        public final String getBannerName$common_feed_api_release() {
            return this.bannerName;
        }

        public final Integer getIconRes() {
            return this.iconRes;
        }

        public final Boolean getIconTintOverride() {
            return this.iconTintOverride;
        }

        public final IconType getIconType() {
            return this.iconType;
        }

        public final C0SH7 getInteractionAction() {
            return this.interactionAction;
        }

        public final Callback getInteractionLayoutCallback() {
            return this.interactionLayoutCallback;
        }

        public final Integer getInteractionLayoutId() {
            return this.interactionLayoutId;
        }

        public final View getInteractionLayoutView() {
            return this.interactionLayoutView;
        }

        public final InteractionType getInteractionType() {
            return this.interactionType;
        }

        public final Function1<C1331670kl3, Unit> getLightenImageRequestBuilder() {
            return this.lightenImageRequestBuilder;
        }

        public final C419910GdJ getTitleEndIcon() {
            return this.titleEndIcon;
        }

        public final Function1<View, Unit> getTitleEndIconView() {
            return this.titleEndIconView;
        }

        public final int getTitleMaxLine() {
            return this.titleMaxLine;
        }

        public final boolean getTitleSyncSet() {
            return this.titleSyncSet;
        }

        public final Set<String> getWhiteList$common_feed_api_release() {
            return this.whiteList;
        }

        public final Builder setBackgroundOverride(boolean z) {
            this.backgroundOverride = Boolean.valueOf(z);
            return this;
        }

        public final void setBackgroundOverride$common_feed_api_release(Boolean bool) {
            this.backgroundOverride = bool;
        }

        public final void setIconRes$common_feed_api_release(Integer num) {
            this.iconRes = num;
        }

        public final Builder setIconTintOverride(boolean z) {
            this.iconTintOverride = Boolean.valueOf(z);
            return this;
        }

        public final void setIconTintOverride$common_feed_api_release(Boolean bool) {
            this.iconTintOverride = bool;
        }

        public final void setIconType$common_feed_api_release(IconType iconType) {
            this.iconType = iconType;
        }

        public final Builder setIconWithLocalRes(int i) {
            this.iconType = IconType.LOCAL;
            this.iconRes = Integer.valueOf(i);
            return this;
        }

        public final Builder setIconWithRemoteLighten(Function1<? super C1331670kl3, Unit> function1) {
            this.iconType = IconType.REMOTE;
            this.lightenImageRequestBuilder = function1;
            return this;
        }

        public final void setInteractionAction$common_feed_api_release(C0SH7 c0sh7) {
            this.interactionAction = c0sh7;
        }

        public final void setInteractionLayoutCallback$common_feed_api_release(Callback callback) {
            this.interactionLayoutCallback = callback;
        }

        public final void setInteractionLayoutId$common_feed_api_release(Integer num) {
            this.interactionLayoutId = num;
        }

        public final void setInteractionLayoutView$common_feed_api_release(View view) {
            this.interactionLayoutView = view;
        }

        public final void setInteractionType$common_feed_api_release(InteractionType interactionType) {
            this.interactionType = interactionType;
        }

        public final Builder setInteractionWithArrow(Function1<? super C342810DcF, Unit> function1) {
            C342810DcF c342810DcF = new C342810DcF();
            function1.invoke(c342810DcF);
            this.interactionAction = c342810DcF;
            this.interactionType = InteractionType.ARROW;
            return this;
        }

        public final Builder setInteractionWithButton(Function1<? super C0HH2, Unit> function1) {
            C0HH2 c0hh2 = new C0HH2();
            function1.invoke(c0hh2);
            this.interactionAction = c0hh2;
            this.interactionType = InteractionType.BUTTON;
            return this;
        }

        public final Builder setInteractionWithClose(Function1<? super C342820DcG, Unit> function1) {
            C342820DcG c342820DcG = new C342820DcG();
            function1.invoke(c342820DcG);
            this.interactionAction = c342820DcG;
            this.interactionType = InteractionType.CLOSE;
            return this;
        }

        public final Builder setInteractionWithCustomView(View view) {
            this.interactionLayoutView = view;
            this.interactionType = InteractionType.CUSTOM;
            return this;
        }

        public final Builder setInteractionWithText(Function1<? super C345710Dgv, Unit> function1) {
            C345710Dgv c345710Dgv = new C345710Dgv();
            function1.invoke(c345710Dgv);
            this.interactionAction = c345710Dgv;
            this.interactionType = InteractionType.TEXT;
            return this;
        }

        public final void setLightenImageRequestBuilder$common_feed_api_release(Function1<? super C1331670kl3, Unit> function1) {
            this.lightenImageRequestBuilder = function1;
        }

        public final void setTitleEndIcon$common_feed_api_release(C419910GdJ c419910GdJ) {
            this.titleEndIcon = c419910GdJ;
        }

        public final void setTitleEndIconView$common_feed_api_release(Function1<? super View, Unit> function1) {
            this.titleEndIconView = function1;
        }

        public final Builder setTitleMaxLine(int i) {
            if (this.whiteList.contains(this.bannerName)) {
                if (i <= 2) {
                    this.titleMaxLine = i;
                    return this;
                }
                "currently support maxLines is <=2".toString();
                throw new IllegalStateException("currently support maxLines is <=2");
            }
            "\n                   current assem does support set title maxLines, \n                   you should contact @sunkejian.1168 or @yangqifan.harry to \n                   add this component to whitelist \n                ".toString();
            throw new IllegalStateException("\n                   current assem does support set title maxLines, \n                   you should contact @sunkejian.1168 or @yangqifan.harry to \n                   add this component to whitelist \n                ");
        }

        public final void setTitleMaxLine$common_feed_api_release(int i) {
            this.titleMaxLine = i;
        }

        public final void setTitleSyncSet$common_feed_api_release(boolean z) {
            this.titleSyncSet = z;
        }

        public final Builder setUpdateTitleSync(boolean z) {
            this.titleSyncSet = z;
            return this;
        }

        public Builder(String str, Set<String> set) {
            this.bannerName = str;
            this.whiteList = set;
        }

        public final Builder setInteractionWithCustomViewAsync(int i, Callback callback) {
            this.interactionLayoutId = Integer.valueOf(i);
            this.interactionLayoutCallback = callback;
            this.interactionType = InteractionType.CUSTOM;
            return this;
        }

        public final Builder setTitleEndIcon(C419910GdJ c419910GdJ, Function1<? super View, Unit> function1) {
            this.titleEndIcon = c419910GdJ;
            this.titleEndIconView = function1;
            return this;
        }
    }

    public interface Callback {
        void onFinishedInflate(View view);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class IconType {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ IconType[] $VALUES;
        public static final IconType LOCAL = new IconType("LOCAL", 0);
        public static final IconType REMOTE = new IconType("REMOTE", 1);

        public static final /* synthetic */ IconType[] $values() {
            return new IconType[]{LOCAL, REMOTE};
        }

        public static InterfaceC2044707zh<IconType> getEntries() {
            return $ENTRIES;
        }

        static {
            IconType[] iconTypeArr$values = $values();
            $VALUES = iconTypeArr$values;
            $ENTRIES = new C2254308sP(iconTypeArr$values);
        }

        public static IconType[] values() {
            return (IconType[]) $VALUES.clone();
        }

        public static IconType valueOf(String str) {
            return (IconType) C08FF.LIZ(IconType.class, str);
        }

        public IconType(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InteractionType {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ InteractionType[] $VALUES;
        public static final InteractionType UNKNOWN = new InteractionType("UNKNOWN", 0);
        public static final InteractionType ARROW = new InteractionType("ARROW", 1);
        public static final InteractionType TEXT = new InteractionType("TEXT", 2);
        public static final InteractionType BUTTON = new InteractionType("BUTTON", 3);
        public static final InteractionType CLOSE = new InteractionType("CLOSE", 4);
        public static final InteractionType CUSTOM = new InteractionType("CUSTOM", 5);
        public static final InteractionType SEARCH_TAKO_TEXT_ICON = new InteractionType("SEARCH_TAKO_TEXT_ICON", 6);

        public static final /* synthetic */ InteractionType[] $values() {
            return new InteractionType[]{UNKNOWN, ARROW, TEXT, BUTTON, CLOSE, CUSTOM, SEARCH_TAKO_TEXT_ICON};
        }

        public static InterfaceC2044707zh<InteractionType> getEntries() {
            return $ENTRIES;
        }

        static {
            InteractionType[] interactionTypeArr$values = $values();
            $VALUES = interactionTypeArr$values;
            $ENTRIES = new C2254308sP(interactionTypeArr$values);
        }

        public static InteractionType[] values() {
            return (InteractionType[]) $VALUES.clone();
        }

        public static InteractionType valueOf(String str) {
            return (InteractionType) C08FF.LIZ(InteractionType.class, str);
        }

        public InteractionType(String str, int i) {
        }
    }

    public int hashCode() {
        Integer num = this.iconRes;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        Function1<C1331670kl3, Unit> function1 = this.iconLighten;
        int iHashCode2 = (((((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + this.iconType.hashCode()) * 31) + C786410Ut5.Z2(this.titleSyncSet)) * 31;
        C419910GdJ c419910GdJ = this.titleEndIcon;
        int iHashCode3 = (iHashCode2 + (c419910GdJ != null ? c419910GdJ.hashCode() : 0)) * 31;
        Function1<View, Unit> function12 = this.titleEndIconView;
        int iHashCode4 = (((((iHashCode3 + (function12 != null ? function12.hashCode() : 0)) * 31) + this.titleMaxLine) * 31) + this.interactionType.hashCode()) * 31;
        C0SH7 c0sh7 = this.interactionAction;
        int iHashCode5 = (iHashCode4 + (c0sh7 != null ? c0sh7.hashCode() : 0)) * 31;
        View view = this.interactionLayoutView;
        int iHashCode6 = (iHashCode5 + (view != null ? view.hashCode() : 0)) * 31;
        Integer num2 = this.interactionLayoutId;
        int iHashCode7 = (iHashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Callback callback = this.interactionLayoutCallback;
        return iHashCode7 + (callback != null ? callback.hashCode() : 0);
    }

    public final Builder toBuilder() {
        Builder builder = new Builder(this.bannerName, this.whiteList);
        builder.iconRes = this.iconRes;
        builder.lightenImageRequestBuilder = this.iconLighten;
        builder.setIconType$common_feed_api_release(this.iconType);
        builder.titleSyncSet = this.titleSyncSet;
        builder.titleMaxLine = this.titleMaxLine;
        builder.titleEndIcon = this.titleEndIcon;
        builder.titleEndIconView = this.titleEndIconView;
        builder.setInteractionType$common_feed_api_release(this.interactionType);
        builder.interactionAction = this.interactionAction;
        builder.interactionLayoutView = this.interactionLayoutView;
        builder.interactionLayoutId = this.interactionLayoutId;
        builder.interactionLayoutCallback = this.interactionLayoutCallback;
        return builder;
    }

    public final Boolean getBackgroundOverride() {
        return this.backgroundOverride;
    }

    public final String getBannerName$common_feed_api_release() {
        return this.bannerName;
    }

    public final Function1<C1331670kl3, Unit> getIconLighten() {
        return this.iconLighten;
    }

    public final Integer getIconRes() {
        return this.iconRes;
    }

    public final Boolean getIconTintOverride() {
        return this.iconTintOverride;
    }

    public final IconType getIconType() {
        return this.iconType;
    }

    public final C0SH7 getInteractionAction() {
        return this.interactionAction;
    }

    public final Callback getInteractionLayoutCallback() {
        return this.interactionLayoutCallback;
    }

    public final Integer getInteractionLayoutId() {
        return this.interactionLayoutId;
    }

    public final View getInteractionLayoutView() {
        return this.interactionLayoutView;
    }

    public final InteractionType getInteractionType() {
        return this.interactionType;
    }

    public final C419910GdJ getTitleEndIcon() {
        return this.titleEndIcon;
    }

    public final Function1<View, Unit> getTitleEndIconView() {
        return this.titleEndIconView;
    }

    public final int getTitleMaxLine() {
        return this.titleMaxLine;
    }

    public final boolean getTitleSyncSet() {
        return this.titleSyncSet;
    }

    public final Set<String> getWhiteList$common_feed_api_release() {
        return this.whiteList;
    }

    public FeedBottomBannerConfig(Builder builder) {
        this(builder.bannerName, builder.whiteList, builder.iconType, builder.iconRes, builder.lightenImageRequestBuilder, builder.titleSyncSet, builder.titleMaxLine, builder.titleEndIcon, builder.titleEndIconView, builder.interactionType, builder.interactionAction, builder.interactionLayoutView, builder.interactionLayoutId, builder.interactionLayoutCallback, builder.backgroundOverride, builder.iconTintOverride);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FeedBottomBannerConfig)) {
            return false;
        }
        FeedBottomBannerConfig feedBottomBannerConfig = (FeedBottomBannerConfig) obj;
        if (Intrinsics.LJFF(this.iconRes, feedBottomBannerConfig.iconRes) && Intrinsics.LJFF(this.iconLighten, feedBottomBannerConfig.iconLighten) && this.iconType == feedBottomBannerConfig.iconType && this.titleSyncSet == feedBottomBannerConfig.titleSyncSet && Intrinsics.LJFF(this.titleEndIcon, feedBottomBannerConfig.titleEndIcon) && Intrinsics.LJFF(this.titleEndIconView, feedBottomBannerConfig.titleEndIconView) && this.titleMaxLine == feedBottomBannerConfig.titleMaxLine && this.interactionType == feedBottomBannerConfig.interactionType && Intrinsics.LJFF(this.interactionAction, feedBottomBannerConfig.interactionAction) && Intrinsics.LJFF(this.interactionLayoutView, feedBottomBannerConfig.interactionLayoutView) && Intrinsics.LJFF(this.interactionLayoutId, feedBottomBannerConfig.interactionLayoutId) && Intrinsics.LJFF(this.interactionLayoutCallback, feedBottomBannerConfig.interactionLayoutCallback)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeedBottomBannerConfig(String str, Set<String> set, IconType iconType, Integer num, Function1<? super C1331670kl3, Unit> function1, boolean z, int i, C419910GdJ c419910GdJ, Function1<? super View, Unit> function12, InteractionType interactionType, C0SH7 c0sh7, View view, Integer num2, Callback callback, Boolean bool, Boolean bool2) {
        this.bannerName = str;
        this.whiteList = set;
        this.iconType = iconType;
        this.iconRes = num;
        this.iconLighten = function1;
        this.titleSyncSet = z;
        this.titleMaxLine = i;
        this.titleEndIcon = c419910GdJ;
        this.titleEndIconView = function12;
        this.interactionType = interactionType;
        this.interactionAction = c0sh7;
        this.interactionLayoutView = view;
        this.interactionLayoutId = num2;
        this.interactionLayoutCallback = callback;
        this.backgroundOverride = bool;
        this.iconTintOverride = bool2;
    }
}
