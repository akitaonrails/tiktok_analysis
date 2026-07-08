package com.ss.android.ugc.aweme.share;

import X.C01GW;
import X.C2188811AlT;
import X.C2230608oa;
import X.C452501pT;
import X.C746350TPl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeControl;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class AwemeACLStruct {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(312));

    public static final class ACLCommonStruct implements Serializable {
        public int code;
        public int showType = 2;
        public String toastMsg = "";
        public String extra = "";

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("code = ");
            sbLIZ.append(this.code);
            sbLIZ.append(", showType = ");
            sbLIZ.append(this.showType);
            sbLIZ.append(", toastMsg = ");
            sbLIZ.append(this.toastMsg);
            sbLIZ.append(" extra = ");
            sbLIZ.append(this.extra);
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final int getCode() {
            return this.code;
        }

        public final String getExtra() {
            return this.extra;
        }

        public final int getShowType() {
            return this.showType;
        }

        public final String getToastMsg() {
            return this.toastMsg;
        }

        public final void setCode(int i) {
            this.code = i;
        }

        public final void setExtra(String str) {
            this.extra = str;
        }

        public final void setShowType(int i) {
            this.showType = i;
        }

        public final void setToastMsg(String str) {
            this.toastMsg = str;
        }
    }

    public static final class ServerExtra implements Serializable {
        public Integer aa;
        public Boolean aac;
        public Integer aad;
        public Boolean aas;
        public Boolean ad;
        public Boolean ap;
        public Boolean arw;
        public Boolean asa;
        public Integer asd;
        public Boolean asr;
        public Integer avp;
        public Integer sd;

        /* JADX INFO: renamed from: ss, reason: collision with root package name */
        public Boolean f412ss;

        public ServerExtra() {
            Boolean bool = Boolean.FALSE;
            this.aas = bool;
            this.aad = 0;
            this.avp = 0;
            this.arw = bool;
            this.aa = 0;
            this.aac = Boolean.TRUE;
            this.asr = bool;
            this.sd = 0;
            this.ap = bool;
            this.asa = bool;
            this.asd = 0;
            this.f412ss = bool;
            this.ad = bool;
        }

        public final Integer getAa() {
            return this.aa;
        }

        public final Boolean getAac() {
            return this.aac;
        }

        public final Integer getAad() {
            return this.aad;
        }

        public final Boolean getAas() {
            return this.aas;
        }

        public final Boolean getAd() {
            return this.ad;
        }

        public final Boolean getAp() {
            return this.ap;
        }

        public final Boolean getArw() {
            return this.arw;
        }

        public final Boolean getAsa() {
            return this.asa;
        }

        public final Integer getAsd() {
            return this.asd;
        }

        public final Boolean getAsr() {
            return this.asr;
        }

        public final Integer getAvp() {
            return this.avp;
        }

        public final Integer getSd() {
            return this.sd;
        }

        public final Boolean getSs() {
            return this.f412ss;
        }

        public final ServerExtra buildServerExtraJson(Aweme aweme) {
            Boolean boolValueOf;
            Integer numValueOf;
            Integer numValueOf2;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Integer numLIZ;
            Boolean boolValueOf5;
            Integer numValueOf3;
            ServerExtra serverExtra = new ServerExtra();
            User author = aweme.getAuthor();
            Boolean bool = null;
            if (author != null) {
                boolValueOf = Boolean.valueOf(author.isSecret());
            } else {
                boolValueOf = null;
            }
            serverExtra.aas = boolValueOf;
            User author2 = aweme.getAuthor();
            if (author2 != null) {
                numValueOf = Integer.valueOf(author2.getDownloadSetting());
            } else {
                numValueOf = null;
            }
            serverExtra.aad = numValueOf;
            VideoControl videoControl = aweme.getVideoControl();
            if (videoControl != null) {
                numValueOf2 = Integer.valueOf(videoControl.preventDownloadType);
            } else {
                numValueOf2 = null;
            }
            serverExtra.avp = numValueOf2;
            AwemeRiskModel awemeRiskModel = aweme.getAwemeRiskModel();
            if (awemeRiskModel != null) {
                boolValueOf2 = Boolean.valueOf(awemeRiskModel.isWarn());
            } else {
                boolValueOf2 = null;
            }
            serverExtra.arw = boolValueOf2;
            serverExtra.aa = Integer.valueOf(aweme.getAwemeType());
            AwemeControl awemeControl = aweme.getAwemeControl();
            if (awemeControl != null) {
                boolValueOf3 = Boolean.valueOf(awemeControl.canShare());
            } else {
                boolValueOf3 = null;
            }
            serverExtra.aac = boolValueOf3;
            AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme);
            if (statusSafety != null) {
                boolValueOf4 = Boolean.valueOf(statusSafety.isReviewed());
            } else {
                boolValueOf4 = null;
            }
            serverExtra.asr = boolValueOf4;
            C2230608oa<Integer> c2230608oaLIZLLL = C746350TPl.LIZ.LIZLLL();
            if (c2230608oaLIZLLL != null) {
                numLIZ = c2230608oaLIZLLL.LIZ();
            } else {
                numLIZ = null;
            }
            serverExtra.sd = numLIZ;
            serverExtra.ap = Boolean.valueOf(aweme.isPreventDownload());
            AwemeStatus statusSafety2 = AwemeExtKt.getStatusSafety(aweme);
            if (statusSafety2 != null) {
                boolValueOf5 = Boolean.valueOf(statusSafety2.isAllowShare());
            } else {
                boolValueOf5 = null;
            }
            serverExtra.asa = boolValueOf5;
            AwemeStatus statusSafety3 = AwemeExtKt.getStatusSafety(aweme);
            if (statusSafety3 != null) {
                numValueOf3 = Integer.valueOf(statusSafety3.getDownloadStatus());
            } else {
                numValueOf3 = null;
            }
            serverExtra.asd = numValueOf3;
            VideoControl videoControl2 = aweme.getVideoControl();
            if (videoControl2 != null) {
                bool = videoControl2.allowDownload;
            }
            serverExtra.ad = bool;
            return serverExtra;
        }

        public final void setAa(Integer num) {
            this.aa = num;
        }

        public final void setAac(Boolean bool) {
            this.aac = bool;
        }

        public final void setAad(Integer num) {
            this.aad = num;
        }

        public final void setAas(Boolean bool) {
            this.aas = bool;
        }

        public final void setAd(Boolean bool) {
            this.ad = bool;
        }

        public final void setAp(Boolean bool) {
            this.ap = bool;
        }

        public final void setArw(Boolean bool) {
            this.arw = bool;
        }

        public final void setAsa(Boolean bool) {
            this.asa = bool;
        }

        public final void setAsd(Integer num) {
            this.asd = num;
        }

        public final void setAsr(Boolean bool) {
            this.asr = bool;
        }

        public final void setAvp(Integer num) {
            this.avp = num;
        }

        public final void setSd(Integer num) {
            this.sd = num;
        }

        public final void setSs(Boolean bool) {
            this.f412ss = bool;
        }
    }

    public static final ACLCommonStruct LIZ() {
        return (ACLCommonStruct) LIZ.getValue();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ACLCommonStruct = [");
        sbLIZ.append(LIZ());
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
