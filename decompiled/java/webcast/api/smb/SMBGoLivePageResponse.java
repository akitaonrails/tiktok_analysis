package webcast.api.smb;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class SMBGoLivePageResponse {

    @C09CT("data")
    public Data data;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Data {

        @C09CT("board_info")
        public BoardInfo boardInfo;

        @C09CT("decoration_permissions")
        public SMBDecorationPermissions decorationPermissions;

        @C09CT("label_info")
        public LabelInfo labelInfo;

        @C09CT("misc")
        public Misc misc;

        @C09CT("smb_info")
        public SMBInfo smbInfo;

        @C09CT("verification_info")
        public GoLivePageVerificationInfo verificationInfo;
    }
}
