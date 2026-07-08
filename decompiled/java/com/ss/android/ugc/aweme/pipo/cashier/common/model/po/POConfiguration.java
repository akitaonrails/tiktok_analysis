package com.ss.android.ugc.aweme.pipo.cashier.common.model.po;

import X.C08FF;
import X.C09CT;
import X.C2188811AlT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoRichText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class POConfiguration {

    @C09CT("payment_option_action_mode")
    public final POActionMode actionMode;

    @C09CT("ccdc_bind_type")
    public final CCDCBindType bindType;

    @C09CT("installation_review_info")
    public final InstallationReviewInfo installationReviewInfo;

    @C09CT("pci_sensitive")
    public final Boolean pciSensitive;

    @C09CT("support_networks")
    public final List<String> supportNetworks;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class CCDCBindType {

        @C09CT(CardStruct.IStatusCode.DEFAULT)
        public static final CCDCBindType FAKE;
        public static final /* synthetic */ CCDCBindType[] LL;
        public static final /* synthetic */ C2254308sP LLILLJJLI;

        @C09CT("1")
        public static final CCDCBindType REAL;

        public static InterfaceC2044707zh<CCDCBindType> getEntries() {
            return LLILLJJLI;
        }

        static {
            CCDCBindType cCDCBindType = new CCDCBindType("FAKE", 0);
            FAKE = cCDCBindType;
            CCDCBindType cCDCBindType2 = new CCDCBindType("REAL", 1);
            REAL = cCDCBindType2;
            CCDCBindType[] cCDCBindTypeArr = {cCDCBindType, cCDCBindType2};
            LL = cCDCBindTypeArr;
            LLILLJJLI = new C2254308sP(cCDCBindTypeArr);
        }

        public static CCDCBindType[] values() {
            return (CCDCBindType[]) LL.clone();
        }

        public static CCDCBindType valueOf(String str) {
            return (CCDCBindType) C08FF.LIZ(CCDCBindType.class, str);
        }

        public CCDCBindType(String str, int i) {
        }
    }

    public POConfiguration() {
        this(null, CCDCBindType.FAKE, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POConfiguration)) {
            return false;
        }
        POConfiguration pOConfiguration = (POConfiguration) obj;
        return this.actionMode == pOConfiguration.actionMode && this.bindType == pOConfiguration.bindType && Intrinsics.LJFF(this.installationReviewInfo, pOConfiguration.installationReviewInfo) && Intrinsics.LJFF(this.supportNetworks, pOConfiguration.supportNetworks) && Intrinsics.LJFF(this.pciSensitive, pOConfiguration.pciSensitive);
    }

    public final int hashCode() {
        POActionMode pOActionMode = this.actionMode;
        int iHashCode = (pOActionMode == null ? 0 : pOActionMode.hashCode()) * 31;
        CCDCBindType cCDCBindType = this.bindType;
        int iHashCode2 = (iHashCode + (cCDCBindType == null ? 0 : cCDCBindType.hashCode())) * 31;
        InstallationReviewInfo installationReviewInfo = this.installationReviewInfo;
        int iHashCode3 = (iHashCode2 + (installationReviewInfo == null ? 0 : installationReviewInfo.hashCode())) * 31;
        List<String> list = this.supportNetworks;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.pciSensitive;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("POConfiguration(actionMode=");
        sbLIZ.append(this.actionMode);
        sbLIZ.append(", bindType=");
        sbLIZ.append(this.bindType);
        sbLIZ.append(", installationReviewInfo=");
        sbLIZ.append(this.installationReviewInfo);
        sbLIZ.append(", supportNetworks=");
        sbLIZ.append(this.supportNetworks);
        sbLIZ.append(", pciSensitive=");
        sbLIZ.append(this.pciSensitive);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final class InstallationReviewInfo {

        @C09CT("installation_review_type")
        public final String installationReviewType;

        @C09CT("package_name")
        public final String packageName;

        @C09CT("tips")
        public final PipoRichText tips;

        public InstallationReviewInfo() {
            this(null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstallationReviewInfo)) {
                return false;
            }
            InstallationReviewInfo installationReviewInfo = (InstallationReviewInfo) obj;
            return Intrinsics.LJFF(this.installationReviewType, installationReviewInfo.installationReviewType) && Intrinsics.LJFF(this.packageName, installationReviewInfo.packageName) && Intrinsics.LJFF(this.tips, installationReviewInfo.tips);
        }

        public final int hashCode() {
            String str = this.installationReviewType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.packageName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            PipoRichText pipoRichText = this.tips;
            return iHashCode2 + (pipoRichText != null ? pipoRichText.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("InstallationReviewInfo(installationReviewType=");
            sbLIZ.append(this.installationReviewType);
            sbLIZ.append(", packageName=");
            sbLIZ.append(this.packageName);
            sbLIZ.append(", tips=");
            sbLIZ.append(this.tips);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public InstallationReviewInfo(String str, String str2, PipoRichText pipoRichText) {
            this.installationReviewType = str;
            this.packageName = str2;
            this.tips = pipoRichText;
        }
    }

    public POConfiguration(POActionMode pOActionMode, CCDCBindType cCDCBindType, InstallationReviewInfo installationReviewInfo, List<String> list, Boolean bool) {
        this.actionMode = pOActionMode;
        this.bindType = cCDCBindType;
        this.installationReviewInfo = installationReviewInfo;
        this.supportNetworks = list;
        this.pciSensitive = bool;
    }
}
