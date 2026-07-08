package com.ss.android.ugc.aweme.services.publisherror;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.Set;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes23.dex */
public final class ErrorMessageHandleDto {
    public static final Companion Companion = new Companion();
    public static final Gson gson = new Gson();
    public static final C01GW<Set<Integer>> supportedBtnTypes$delegate = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(109));

    @C09CT("btnAction")
    public final String btnAction;

    @C09CT("btnTextLoc")
    public final String btnTextLoc;

    @C09CT("btnType")
    public final int btnType;

    @C09CT("contentLoc")
    public final String contentLoc;

    public static final class Companion {
        public final Set<Integer> getSupportedBtnTypes() {
            return ErrorMessageHandleDto.supportedBtnTypes$delegate.getValue();
        }

        public final ErrorMessageHandleDto parseErrorMessageHandle(String str) {
            boolean z;
            ErrorMessageHandleDto errorMessageHandleDto;
            if (str != null && !a0.LJJJIL(str)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return null;
            }
            try {
                errorMessageHandleDto = (ErrorMessageHandleDto) ErrorMessageHandleDto.gson.LJII(str, ErrorMessageHandleDto.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!errorMessageHandleDto.isValid()) {
                return null;
            }
            return errorMessageHandleDto;
        }
    }

    public ErrorMessageHandleDto() {
        this(null, null, PublishErrorHandleBtnType.UNKNOWN.getValue(), null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorMessageHandleDto)) {
            return false;
        }
        ErrorMessageHandleDto errorMessageHandleDto = (ErrorMessageHandleDto) obj;
        return Intrinsics.LJFF(this.contentLoc, errorMessageHandleDto.contentLoc) && Intrinsics.LJFF(this.btnTextLoc, errorMessageHandleDto.btnTextLoc) && this.btnType == errorMessageHandleDto.btnType && Intrinsics.LJFF(this.btnAction, errorMessageHandleDto.btnAction);
    }

    public int hashCode() {
        String str = this.contentLoc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.btnTextLoc;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.btnType) * 31;
        String str3 = this.btnAction;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ErrorMessageHandleDto(contentLoc=");
        sbLIZ.append(this.contentLoc);
        sbLIZ.append(", btnTextLoc=");
        sbLIZ.append(this.btnTextLoc);
        sbLIZ.append(", btnType=");
        sbLIZ.append(this.btnType);
        sbLIZ.append(", btnAction=");
        sbLIZ.append(this.btnAction);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isValid() {
        String str;
        String str2 = this.contentLoc;
        return (str2 == null || a0.LJJJIL(str2) || (str = this.btnTextLoc) == null || a0.LJJJIL(str) || !Companion.getSupportedBtnTypes().contains(Integer.valueOf(this.btnType))) ? false : true;
    }

    public ErrorMessageHandleDto(String str, String str2, int i, String str3) {
        this.contentLoc = str;
        this.btnTextLoc = str2;
        this.btnType = i;
        this.btnAction = str3;
    }
}
