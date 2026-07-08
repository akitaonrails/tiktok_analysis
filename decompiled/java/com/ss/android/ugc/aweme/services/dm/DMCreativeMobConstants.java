package com.ss.android.ugc.aweme.services.dm;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX INFO: loaded from: classes23.dex */
public final class DMCreativeMobConstants {
    public static final DMCreativeMobConstants INSTANCE = new DMCreativeMobConstants();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EnterFrom {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ EnterFrom[] $VALUES;
        public static final EnterFrom VIDEO_EDIT_PAGE = new EnterFrom("VIDEO_EDIT_PAGE", 0, "video_edit_page");
        public final String value;

        public static final /* synthetic */ EnterFrom[] $values() {
            return new EnterFrom[]{VIDEO_EDIT_PAGE};
        }

        public static InterfaceC2044707zh<EnterFrom> getEntries() {
            return $ENTRIES;
        }

        static {
            EnterFrom[] enterFromArr$values = $values();
            $VALUES = enterFromArr$values;
            $ENTRIES = new C2254308sP(enterFromArr$values);
        }

        public static EnterFrom[] values() {
            return (EnterFrom[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public static EnterFrom valueOf(String str) {
            return (EnterFrom) C08FF.LIZ(EnterFrom.class, str);
        }

        public EnterFrom(String str, int i, String str2) {
            this.value = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EnterMethod {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ EnterMethod[] $VALUES;
        public final String value;
        public static final EnterMethod MAIN_POSTING_CAMERA_ICON = new EnterMethod("MAIN_POSTING_CAMERA_ICON", 0, "main_posting_camera_icon");
        public static final EnterMethod DOWNLOAD_SHARE_PANEL_AUTO = new EnterMethod("DOWNLOAD_SHARE_PANEL_AUTO", 1, "download_share_panel_auto");

        public static final /* synthetic */ EnterMethod[] $values() {
            return new EnterMethod[]{MAIN_POSTING_CAMERA_ICON, DOWNLOAD_SHARE_PANEL_AUTO};
        }

        public static InterfaceC2044707zh<EnterMethod> getEntries() {
            return $ENTRIES;
        }

        static {
            EnterMethod[] enterMethodArr$values = $values();
            $VALUES = enterMethodArr$values;
            $ENTRIES = new C2254308sP(enterMethodArr$values);
        }

        public static EnterMethod[] values() {
            return (EnterMethod[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public static EnterMethod valueOf(String str) {
            return (EnterMethod) C08FF.LIZ(EnterMethod.class, str);
        }

        public EnterMethod(String str, int i, String str2) {
            this.value = str2;
        }
    }

    public static final class Event {
        public static final Event INSTANCE = new Event();
    }

    public static final class Key {
        public static final Key INSTANCE = new Key();
    }
}
