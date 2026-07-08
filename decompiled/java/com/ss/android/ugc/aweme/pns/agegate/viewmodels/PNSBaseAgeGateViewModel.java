package com.ss.android.ugc.aweme.pns.agegate.viewmodels;

import X.C0NRA;
import X.C100C;
import X.C10UK;
import X.C10WC;
import X.C10WT;
import X.C10WU;
import X.C15O7;
import X.C19249810Sq;
import X.C19257210Vm;
import X.C19257310Vn;
import X.C19258510Vz;
import X.C19299010eq;
import X.C2097608Jq;
import X.C259800zU;
import X.EnumC19256910Vj;
import X.InterfaceC1519030pdF;
import X.InterfaceC2385309Wh;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.network.AgeGateResponse;
import com.ss.android.ugc.aweme.pns.agegate.network.BaseResponse;
import com.ss.android.ugc.aweme.pns.agegate.network.DoBResponse;
import com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public abstract class PNSBaseAgeGateViewModel extends ViewModel {
    public long LL;
    public C10UK LLILLJJLI;
    public C10WT LLILLL;
    public Map<String, String> LLILZ = new LinkedHashMap();
    public boolean LLILZIL;
    public boolean LLILZLL;
    public Integer LLIZ;
    public int LLIZLLLIL;
    public Locale LLJ;
    public final SimpleDateFormat LLJI;
    public DateFormat LLJIJIL;
    public int LLJILJIL;
    public final MutableLiveData<C10WU> LLJILJILJ;
    public final MutableLiveData<Boolean> LLJILLL;
    public final MutableLiveData<C19299010eq> LLJJ;
    public final MutableLiveData<Boolean> LLJJI;
    public final MutableLiveData<Boolean> LLJJIII;
    public final MutableLiveData<String> LLJJIJI;
    public final MutableLiveData<Integer> LLJJIJIIJIL;
    public final MutableLiveData<Boolean> LLJJIJIL;
    public Date LLJJJ;
    public C19258510Vz LLJJJIL;
    public long LLJJJJ;
    public long LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;

    public void DQ2() {
    }

    public boolean onBackPressed() {
        C19299010eq c19299010eqLJI;
        C10WT c10wt = this.LLILLL;
        if (c10wt == null || (c19299010eqLJI = c10wt.LJI()) == null || !Intrinsics.LJFF(c19299010eqLJI.canQuit, Boolean.TRUE)) {
            return false;
        }
        CQ2(null, 0, -3001);
        C10UK c10uk = this.LLILLJJLI;
        if (c10uk != null) {
            c10uk.onCancel();
        }
        return true;
    }

    public final void vQ2() {
        this.LLJJIII.postValue(Boolean.TRUE);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C19257210Vm.LIZ.getClass();
        ((C10WC) C19257210Vm.LIZJ.getValue()).LIZIZ(wQ2(), this.LLJJJJLIIL, this.LLJJL, this.LLILZLL, this.LLIZ).LJ(new InterfaceC2385309Wh() { // from class: X.10WQ
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("PNSBaseAgeGateViewModel@4804.calculateAge$1");
                this.LIZ.LLJJIII.postValue(Boolean.FALSE);
                DoBResponse doBResponse = (DoBResponse) c15o7.LJIIL();
                String str = "";
                if (c15o7.LJIILJJIL() && doBResponse != null) {
                    PNSBaseAgeGateViewModel pNSBaseAgeGateViewModel = this.LIZ;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    int status_code = doBResponse.getStatus_code();
                    pNSBaseAgeGateViewModel.getClass();
                    PNSBaseAgeGateViewModel.AQ2(jCurrentTimeMillis2, "/tiktok/v1/calculate/age/", status_code, true, false);
                    if (doBResponse.getStatus_code() != 0) {
                        this.LIZ.xQ2(doBResponse.getStatus_code(), doBResponse.getStatus_msg());
                    } else {
                        PNSBaseAgeGateViewModel pNSBaseAgeGateViewModel2 = this.LIZ;
                        if (pNSBaseAgeGateViewModel2.LLJL && !pNSBaseAgeGateViewModel2.LLILZIL) {
                            pNSBaseAgeGateViewModel2.LLJJIJIL.postValue(Boolean.TRUE);
                            PNSBaseAgeGateViewModel pNSBaseAgeGateViewModel3 = this.LIZ;
                            C10WV c10wv = (C10WV) pNSBaseAgeGateViewModel3.LLILLL;
                            String value = pNSBaseAgeGateViewModel3.LLJJIJI.getValue();
                            if (value != null) {
                                str = value;
                            }
                            pNSBaseAgeGateViewModel3.yQ2(c10wv.LIZIZ(str), new AwS572S0100000_28(this.LIZ, 502));
                        } else {
                            if (doBResponse.getAppealUrl() != null && (!a0.LJJJIL(r0))) {
                                PNSBaseAgeGateViewModel pNSBaseAgeGateViewModel4 = this.LIZ;
                                pNSBaseAgeGateViewModel4.yQ2(pNSBaseAgeGateViewModel4.EQ2(doBResponse), new AwS429S0200000_28(this.LIZ, doBResponse, 49));
                            } else {
                                PNSBaseAgeGateViewModel pNSBaseAgeGateViewModel5 = this.LIZ;
                                pNSBaseAgeGateViewModel5.yQ2(pNSBaseAgeGateViewModel5.EQ2(doBResponse), new AwS572S0100000_28(this.LIZ, 503));
                            }
                        }
                    }
                } else {
                    PNSBaseAgeGateViewModel pNSBaseAgeGateViewModel6 = this.LIZ;
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                    pNSBaseAgeGateViewModel6.getClass();
                    PNSBaseAgeGateViewModel.AQ2(jCurrentTimeMillis3, "/tiktok/v1/calculate/age/", -1, false, false);
                    this.LIZ.xQ2(-1, "");
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PNSBaseAgeGateViewModel@4804.calculateAge$1");
                return unit;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    public final String wQ2() {
        String str;
        Date date = this.LLJJJ;
        return (date == null || (str = this.LLJI.format(date)) == null) ? "" : str;
    }

    public PNSBaseAgeGateViewModel() {
        Locale locale = Locale.ROOT;
        this.LLJ = locale;
        this.LLJI = new SimpleDateFormat("yyyy-MM-dd", locale);
        this.LLJIJIL = DateFormat.getDateInstance(1, locale);
        this.LLJILJIL = EnumC19256910Vj.NONE.getValue();
        this.LLJILJILJ = new MutableLiveData<>();
        this.LLJILLL = new MutableLiveData<>();
        this.LLJJ = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.postValue(Boolean.FALSE);
        this.LLJJI = mutableLiveData;
        this.LLJJIII = new MutableLiveData<>();
        this.LLJJIJI = new MutableLiveData<>();
        this.LLJJIJIIJIL = new MutableLiveData<>();
        this.LLJJIJIL = new MutableLiveData<>();
        this.LLJJJJLIIL = -1;
        this.LLJJL = -1;
        this.LLJJLIIIJLLLLLLLZ = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void FQ2() {
        boolean zLJI = MethodIDManager.LJI(202480);
        this.LLJJIII.postValue(Boolean.TRUE);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String strWQ2 = wQ2();
        final C259800zU c259800zU = new C259800zU();
        C19258510Vz c19258510Vz = this.LLJJJIL;
        c259800zU.element = c19258510Vz != null ? c19258510Vz.LIZ : 0;
        final C259800zU c259800zU2 = new C259800zU();
        C19258510Vz c19258510Vz2 = this.LLJJJIL;
        c259800zU2.element = c19258510Vz2 != null ? c19258510Vz2.LIZIZ : 0;
        C19257210Vm.LIZ.getClass();
        C10WC c10wc = (C10WC) C19257210Vm.LIZJ.getValue();
        if (c10wc != null) {
            int i = this.LLJJJJLIIL;
            int i2 = this.LLJJL;
            boolean z = this.LLILZLL;
            int i3 = this.LLIZLLLIL;
            Integer num = this.LLIZ;
            C19258510Vz c19258510Vz3 = this.LLJJJIL;
            C15O7<AgeGateResponse> c15o7LIZ = c10wc.LIZ(strWQ2, i, i2, z, i3, num, c19258510Vz3 != null ? c19258510Vz3.LIZJ : null, (Integer) c259800zU.element, (Integer) c259800zU2.element);
            if (c15o7LIZ != null) {
                c15o7LIZ.LJ(new InterfaceC2385309Wh() { // from class: X.10WP
                    @Override // X.InterfaceC2385309Wh
                    public final Object then(C15O7 c15o7) {
                        boolean z2;
                        boolean z3;
                        PNSFeedbackModel ageGateFeedback;
                        int value;
                        int value2;
                        String str;
                        C1C7U.LIZ("PNSBaseAgeGateViewModel@4804.verifyAge$1");
                        PNSFeedbackModel pNSFeedbackModelLIZLLL = null;
                        if (c15o7.LJIILJJIL() && c15o7.LJIIL() != null) {
                            PNSBaseAgeGateViewModel pNSBaseAgeGateViewModel = this.LIZ;
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            int status_code = ((BaseResponse) c15o7.LJIIL()).getStatus_code();
                            if (this.LIZ.LLJJL == 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            pNSBaseAgeGateViewModel.getClass();
                            PNSBaseAgeGateViewModel.AQ2(jCurrentTimeMillis2, "/aweme/v3/verification/age/", status_code, true, z3);
                            if (((BaseResponse) c15o7.LJIIL()).getStatus_code() != 0 || ((ageGateFeedback = ((BaseResponse) c15o7.LJIIL()).getAgeGateFeedback()) != null && ageGateFeedback.errorModel != null)) {
                                this.LIZ.LLJJIII.postValue(Boolean.FALSE);
                                this.LIZ.CQ2(null, 0, ((BaseResponse) c15o7.LJIIL()).getStatus_code());
                                if (((BaseResponse) c15o7.LJIIL()).getAgeGateFeedback() != null) {
                                    this.LIZ.yQ2(((BaseResponse) c15o7.LJIIL()).getAgeGateFeedback(), AFwS217S0000000_28.get$arr$(326));
                                } else {
                                    this.LIZ.xQ2(((BaseResponse) c15o7.LJIIL()).getStatus_code(), ((BaseResponse) c15o7.LJIIL()).getStatus_msg());
                                }
                            } else {
                                this.LIZ.LLJJIII.postValue(Boolean.FALSE);
                                boolean zIs_prompt = ((AgeGateResponse) c15o7.LJIIL()).is_prompt();
                                C10WI c10wi = C10WF.Companion;
                                Integer ageGatePostAction = ((AgeGateResponse) c15o7.LJIIL()).getAgeGatePostAction();
                                if (ageGatePostAction != null) {
                                    value = ageGatePostAction.intValue();
                                } else {
                                    value = C10WF.PASS.getValue();
                                }
                                Integer registerAgeGatePostAction = ((AgeGateResponse) c15o7.LJIIL()).getRegisterAgeGatePostAction();
                                if (registerAgeGatePostAction != null) {
                                    value2 = registerAgeGatePostAction.intValue();
                                } else {
                                    value2 = C10WF.PASS.getValue();
                                }
                                int iMax = Math.max(value, value2);
                                c10wi.getClass();
                                C10WF c10wf = C10WF.MAP.get(Integer.valueOf(iMax));
                                if (c10wf == null) {
                                    c10wf = C10WF.PASS;
                                }
                                Date date = this.LIZ.LLJJJ;
                                String status_msg = ((BaseResponse) c15o7.LJIIL()).getStatus_msg();
                                Boolean boolIsMixedAge = ((AgeGateResponse) c15o7.LJIIL()).isMixedAge();
                                ((AgeGateResponse) c15o7.LJIIL()).getNeedScreenTimeReminder();
                                Integer num2 = this.LIZ.LLIZ;
                                Integer supplementAction = ((AgeGateResponse) c15o7.LJIIL()).getSupplementAction();
                                Integer num3 = c259800zU.element;
                                Integer num4 = c259800zU2.element;
                                PNSBaseAgeGateViewModel pNSBaseAgeGateViewModel2 = this.LIZ;
                                C19258510Vz c19258510Vz4 = pNSBaseAgeGateViewModel2.LLJJJIL;
                                if (c19258510Vz4 != null) {
                                    str = c19258510Vz4.LIZJ;
                                } else {
                                    str = null;
                                }
                                C19249810Sq c19249810Sq = new C19249810Sq(c10wf, date, strWQ2, zIs_prompt, status_msg, boolIsMixedAge, num2, supplementAction, num3, num4, str);
                                PNSFeedbackModel ageGateFeedback2 = ((BaseResponse) c15o7.LJIIL()).getAgeGateFeedback();
                                if (ageGateFeedback2 == null) {
                                    C10WT c10wt = this.LIZ.LLILLL;
                                    if (c10wt != null) {
                                        pNSFeedbackModelLIZLLL = c10wt.LIZLLL(c19249810Sq);
                                    }
                                } else {
                                    pNSFeedbackModelLIZLLL = ageGateFeedback2;
                                }
                                pNSBaseAgeGateViewModel2.yQ2(pNSFeedbackModelLIZLLL, new AwS429S0200000_28(this.LIZ, c19249810Sq, 50));
                            }
                        } else {
                            this.LIZ.LLJJIII.postValue(Boolean.FALSE);
                            PNSBaseAgeGateViewModel pNSBaseAgeGateViewModel3 = this.LIZ;
                            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                            if (this.LIZ.LLJJL == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            pNSBaseAgeGateViewModel3.getClass();
                            PNSBaseAgeGateViewModel.AQ2(jCurrentTimeMillis3, "/aweme/v3/verification/age/", -1, false, z2);
                            C10UK c10uk = this.LIZ.LLILLJJLI;
                            if (c10uk != null) {
                                c10uk.onError(new PNSErrorModel(-1, c15o7.LJIIJJI().getMessage(), null, null));
                            }
                            this.LIZ.CQ2(null, 0, -1);
                            this.LIZ.xQ2(-1, "");
                        }
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("PNSBaseAgeGateViewModel@4804.verifyAge$1");
                        return unit;
                    }
                }, C15O7.LJIIIIZZ, null);
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public PNSFeedbackModel EQ2(DoBResponse doBResponse) {
        PNSFeedbackModel ageGateFeedback = doBResponse.getAgeGateFeedback();
        if (ageGateFeedback == null) {
            C10WT c10wt = this.LLILLL;
            if (c10wt != null) {
                return c10wt.LJ();
            }
            return null;
        }
        return ageGateFeedback;
    }

    public final void xQ2(int i, String str) {
        MutableLiveData<Boolean> mutableLiveData = this.LLJJIII;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.postValue(bool);
        this.LLJJI.postValue(bool);
        PNSFeedbackModel pNSFeedbackModelLIZJ = null;
        if (i == 56004) {
            C10WT c10wt = this.LLILLL;
            if (c10wt != null) {
                pNSFeedbackModelLIZJ = c10wt.LJIIIIZZ(str);
            }
            yQ2(pNSFeedbackModelLIZJ, new AwS572S0100000_28(this, 1029));
            return;
        }
        C10WT c10wt2 = this.LLILLL;
        if (c10wt2 != null) {
            pNSFeedbackModelLIZJ = c10wt2.LIZJ(Integer.valueOf(i), str);
        }
        yQ2(pNSFeedbackModelLIZJ, AFwS217S0000000_28.get$arr$(705));
    }

    public final void yQ2(PNSFeedbackModel pNSFeedbackModel, Function0<Unit> function0) {
        if (pNSFeedbackModel == null || (pNSFeedbackModel.dialogModel == null && (pNSFeedbackModel == null || pNSFeedbackModel.errorModel == null))) {
            function0.invoke();
        } else {
            this.LLJILJILJ.postValue(new C10WU(pNSFeedbackModel, new AwS394S0200000_28(this, (PNSBaseAgeGateViewModel) function0, (Function0<Unit>) 34)));
        }
    }

    public void CQ2(C19249810Sq c19249810Sq, int i, int i2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("error_code", String.valueOf(i2));
        linkedHashMap.put("page_stay_time", String.valueOf(SystemClock.elapsedRealtime() - this.LL));
        linkedHashMap.put("is_success", String.valueOf(i));
        if (c19249810Sq != null && c19249810Sq.LIZLLL) {
            linkedHashMap.put("has_delete_content", String.valueOf(i));
        }
        C0NRA.LIZ(this.LLJJLIIIJLLLLLLLZ, linkedHashMap, this.LLILZ);
        C0NRA.LIZ("pns_age_gate_response", linkedHashMap, this.LLILZ);
    }

    public void zQ2(C10UK c10uk, C10WT c10wt, long j, C19257310Vn c19257310Vn) {
        C19299010eq c19299010eqLJI;
        this.LLILLJJLI = c10uk;
        this.LLILLL = c10wt;
        MutableLiveData<C19299010eq> mutableLiveData = this.LLJJ;
        if (c10wt != null) {
            c19299010eqLJI = c10wt.LJI();
        } else {
            c19299010eqLJI = null;
        }
        mutableLiveData.postValue(c19299010eqLJI);
        this.LLILZ = c19257310Vn.getLogParams();
        this.LLILZIL = c19257310Vn.isFtc();
        this.LLILZLL = c19257310Vn.isGuestMode();
        this.LLIZLLLIL = c19257310Vn.getBirthdayConfidence();
        this.LLJ = c19257310Vn.getLocale();
        this.LLJILJIL = c19257310Vn.getConfirmationType();
        this.LL = j;
        this.LLJJJJJIL = SystemClock.elapsedRealtime() - this.LL;
        this.LLJIJIL = DateFormat.getDateInstance(1, this.LLJ);
    }

    public static void AQ2(long j, String str, int i, boolean z, boolean z2) {
        Object obj;
        InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
        Pair[] pairArr = new Pair[5];
        String str2 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("isSuccess", obj);
        pairArr[1] = new Pair("service", str);
        pairArr[2] = new Pair("code", String.valueOf(i));
        pairArr[3] = new Pair("duration", String.valueOf(j));
        if (!z2) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[4] = new Pair("log_id", str2);
        interfaceC1519030pdFLIZJ.LIZ("compliance_api_status", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
