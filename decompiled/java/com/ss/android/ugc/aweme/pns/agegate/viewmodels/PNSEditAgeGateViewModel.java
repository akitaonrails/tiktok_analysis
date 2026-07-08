package com.ss.android.ugc.aweme.pns.agegate.viewmodels;

import X.C0NRA;
import X.C10UK;
import X.C10WT;
import X.C19249810Sq;
import X.C19257310Vn;
import X.C19299010eq;
import X.C2097608Jq;
import X.InterfaceC19258010Vu;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.network.DoBResponse;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSEditAgeGateViewModel extends PNSBaseAgeGateViewModel {
    public Map<String, String> LLJLIL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel
    public final void DQ2() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("input_time", String.valueOf(System.currentTimeMillis() - this.LLJJJJ));
        C0NRA.LIZ("click_age_edit_confirm", linkedHashMap, this.LLILZ);
        vQ2();
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel
    public final PNSFeedbackModel EQ2(DoBResponse doBResponse) {
        int iIntValue;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        PNSFeedbackModel pNSFeedbackModelLJ;
        InterfaceC19258010Vu interfaceC19258010Vu;
        PNSFeedbackModel pNSFeedbackModelCopy;
        C19299010eq c19299010eqLJI;
        Boolean bool;
        C19299010eq c19299010eqLJI2;
        Date date;
        Pair[] pairArr = new Pair[4];
        Integer age = doBResponse.getAge();
        if (age != null) {
            iIntValue = age.intValue();
        } else {
            iIntValue = -1;
        }
        Calendar calendar = Calendar.getInstance();
        C10WT c10wt = this.LLILLL;
        if (c10wt != null && (c19299010eqLJI2 = c10wt.LJI()) != null && (date = c19299010eqLJI2.defaultDate) != null) {
            calendar.setTime(date);
        }
        C10WT c10wt2 = this.LLILLL;
        if (c10wt2 != null && (c19299010eqLJI = c10wt2.LJI()) != null && (bool = c19299010eqLJI.hasAge) != null) {
            z = !bool.booleanValue();
        } else {
            z = false;
        }
        Date time = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTime(time);
        int i = calendar2.get(1) - calendar3.get(1);
        if (calendar2.get(6) < calendar3.get(6)) {
            i--;
        }
        if (i >= 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (iIntValue >= 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            if (z3) {
                str = "6";
            } else {
                str = "5";
            }
        } else if (z2) {
            if (z3) {
                str = "3";
            } else {
                str = "4";
            }
        } else if (z3) {
            str = "1";
        } else {
            str = "2";
        }
        pairArr[0] = new Pair("change_type", str);
        String appealUrl = doBResponse.getAppealUrl();
        if (appealUrl != null && appealUrl.length() > 0) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("verification_required", str2);
        String verificationReason = doBResponse.getVerificationReason();
        if (verificationReason == null) {
            verificationReason = "";
        }
        pairArr[2] = new Pair("verification_reason", verificationReason);
        pairArr[3] = new Pair("is_success", "1");
        this.LLJLIL = C2097608Jq.LJIIJ(pairArr);
        if (doBResponse.getAgeGateFeedback() != null) {
            pNSFeedbackModelLJ = doBResponse.getAgeGateFeedback();
        } else {
            if (doBResponse.getAge() != null) {
                C0NRA.LIZ("show_age_edit_confirm_popup", new LinkedHashMap(), this.LLILZ);
                Integer age2 = doBResponse.getAge();
                if (age2 != null) {
                    int iIntValue2 = age2.intValue();
                    C10WT c10wt3 = this.LLILLL;
                    if ((c10wt3 instanceof InterfaceC19258010Vu) && (interfaceC19258010Vu = (InterfaceC19258010Vu) c10wt3) != null) {
                        pNSFeedbackModelLJ = interfaceC19258010Vu.LJII(iIntValue2, this.LLJJIJI.getValue());
                    }
                }
            } else {
                C10WT c10wt4 = this.LLILLL;
                if ((c10wt4 instanceof InterfaceC19258010Vu) && c10wt4 != null) {
                    pNSFeedbackModelLJ = c10wt4.LJ();
                }
            }
            return new PNSFeedbackModel(null, null, -1, null, true);
        }
        if (pNSFeedbackModelLJ != null && (pNSFeedbackModelCopy = pNSFeedbackModelLJ.copy(pNSFeedbackModelLJ.errorModel, pNSFeedbackModelLJ.dialogModel, pNSFeedbackModelLJ.f72case, pNSFeedbackModelLJ.business, true)) != null) {
            return pNSFeedbackModelCopy;
        }
        return new PNSFeedbackModel(null, null, -1, null, true);
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel
    public final void CQ2(C19249810Sq c19249810Sq, int i, int i2) {
        Map<String, String> map = this.LLJLIL;
        map.put("error_code", String.valueOf(i2));
        map.put("page_stay_time", String.valueOf(SystemClock.elapsedRealtime() - this.LL));
        map.put("is_success", String.valueOf(i));
        if (c19249810Sq != null && c19249810Sq.LIZLLL) {
            map.put("has_delete_content", String.valueOf(i));
        }
        C0NRA.LIZ(this.LLJJLIIIJLLLLLLLZ, map, this.LLILZ);
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel
    public final void zQ2(C10UK c10uk, C10WT c10wt, long j, C19257310Vn c19257310Vn) {
        super.zQ2(c10uk, c10wt, j, c19257310Vn);
        this.LLJJJJLIIL = 2;
        this.LLJJL = 2;
        C0NRA.LIZ("show_age_edit_page", new LinkedHashMap(), this.LLILZ);
        this.LLJJLIIIJLLLLLLLZ = "age_edit_response";
        this.LLJL = false;
    }
}
