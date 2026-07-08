package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C08FF;
import X.C0ZLO;
import X.C13BV;
import X.C2254308sP;
import X.C455420HtU;
import X.C459160HzW;
import X.EnumC912790ZrR;
import X.InterfaceC2044707zh;
import X.InterfaceC455400HtS;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
public final class LongPressConfig {
    public final View itemView;
    public final LegacyConfig legacyConfig;
    public final View longPressPopup;
    public final MovingLongPressPanelConfig movingLongPressPanelConfig;
    public final C0ZLO onLongPressPopupProvider;
    public final EnumC912790ZrR position;
    public final ReactionConfig reactionConfig;
    public final View unmaskedView;

    public static final class LegacyConfig {
        public final E2EMode e2eMode;
        public final int topChatNoticeHeight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class E2EMode {
            public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
            public static final /* synthetic */ E2EMode[] $VALUES;
            public static final E2EMode DISABLED = new E2EMode("DISABLED", 0);
            public static final E2EMode STATUS_BAR_2_EDGE = new E2EMode("STATUS_BAR_2_EDGE", 1);
            public static final E2EMode NAV_AND_STATUS_BAR_2_EDGE = new E2EMode("NAV_AND_STATUS_BAR_2_EDGE", 2);

            public static final /* synthetic */ E2EMode[] $values() {
                return new E2EMode[]{DISABLED, STATUS_BAR_2_EDGE, NAV_AND_STATUS_BAR_2_EDGE};
            }

            public static InterfaceC2044707zh<E2EMode> getEntries() {
                return $ENTRIES;
            }

            static {
                E2EMode[] e2EModeArr$values = $values();
                $VALUES = e2EModeArr$values;
                $ENTRIES = new C2254308sP(e2EModeArr$values);
            }

            public static E2EMode[] values() {
                return (E2EMode[]) $VALUES.clone();
            }

            public final boolean isNavBarApplied() {
                return this == NAV_AND_STATUS_BAR_2_EDGE;
            }

            public final boolean isStatusApplied() {
                return this == STATUS_BAR_2_EDGE || this == NAV_AND_STATUS_BAR_2_EDGE;
            }

            public static E2EMode valueOf(String str) {
                return (E2EMode) C08FF.LIZ(E2EMode.class, str);
            }

            public E2EMode(String str, int i) {
            }
        }

        public LegacyConfig() {
            this(0, E2EMode.DISABLED);
        }

        public LegacyConfig(int i, E2EMode e2EMode) {
            this.topChatNoticeHeight = i;
            this.e2eMode = e2EMode;
        }
    }

    public static final class MovingLongPressPanelConfig {
        public final List<Integer> requireHeightAdjustmentBottomComponents;
        public final List<Integer> requireHeightAdjustmentTopComponents;
        public final List<Integer> toHideMessageComponents;

        public MovingLongPressPanelConfig() {
            this(null, null, null, 7, null);
        }

        public MovingLongPressPanelConfig(List<Integer> list, List<Integer> list2, List<Integer> list3) {
            this.toHideMessageComponents = list;
            this.requireHeightAdjustmentTopComponents = list2;
            this.requireHeightAdjustmentBottomComponents = list3;
        }

        public MovingLongPressPanelConfig(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class ReactionConfig {
        public final InterfaceC455400HtS reactionSelectedListener;
        public final List<C455420HtU> selectedAimojis;
        public final List<C459160HzW> selectedEmojis;
        public final boolean showAimojiPanel;
        public final boolean showEmojiPanel;

        public ReactionConfig() {
            this(null, null, false, false, null, 31, null);
        }

        public ReactionConfig(List<C459160HzW> list, List<C455420HtU> list2, boolean z, boolean z2, InterfaceC455400HtS interfaceC455400HtS) {
            this.selectedEmojis = list;
            this.selectedAimojis = list2;
            this.showEmojiPanel = z;
            this.showAimojiPanel = z2;
            this.reactionSelectedListener = interfaceC455400HtS;
        }

        public ReactionConfig(List list, List list2, boolean z, boolean z2, InterfaceC455400HtS interfaceC455400HtS, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? false : z, (i & 8) == 0 ? z2 : false, (i & 16) != 0 ? null : interfaceC455400HtS);
        }
    }

    public LongPressConfig(View view, View view2, View view3, EnumC912790ZrR enumC912790ZrR, ReactionConfig reactionConfig, LegacyConfig legacyConfig, MovingLongPressPanelConfig movingLongPressPanelConfig, C0ZLO c0zlo) {
        this.itemView = view;
        this.unmaskedView = view2;
        this.longPressPopup = view3;
        this.position = enumC912790ZrR;
        this.reactionConfig = reactionConfig;
        this.legacyConfig = legacyConfig;
        this.movingLongPressPanelConfig = movingLongPressPanelConfig;
        this.onLongPressPopupProvider = c0zlo;
    }
}
