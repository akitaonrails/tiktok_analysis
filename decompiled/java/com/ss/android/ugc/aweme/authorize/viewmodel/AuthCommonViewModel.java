package com.ss.android.ugc.aweme.authorize.viewmodel;

import X.C11S5;
import X.C1701940uOG;
import X.C19H9;
import X.C19HD;
import X.C1B35;
import X.C1B38;
import X.C1B3C;
import X.C1B3E;
import X.C1B3H;
import X.C1B3I;
import X.C1B3J;
import X.C1B3S;
import X.C1D19;
import X.C2198701B3k;
import X.C23250099c;
import X.C793770VBv;
import X.C794240VDq;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthCodeResponse;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthInfoResponseData;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedPage;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedScope;
import com.ss.android.ugc.aweme.openauthorize.entity.BCAuthorizationResponse;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthClientInfo;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthPageDetail;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthScope;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthScopeStruct;
import com.ss.android.ugc.aweme.openauthorize.entity.ScanCommonResponse;
import com.ss.android.ugc.aweme.openauthorize.entity.WebAuthV2Response;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class AuthCommonViewModel extends AndroidViewModel {
    public final C1B3S LL;
    public final C1B3J LLILLJJLI;
    public final C1B38 LLILLL;
    public final MutableLiveData<AuthInfoResponseData> LLILZ;
    public final MutableLiveData<AuthorizedPage> LLILZIL;
    public final MutableLiveData<OAuthPage> LLILZLL;
    public final MutableLiveData<OAuthPage> LLIZ;
    public final MutableLiveData<Boolean> LLIZLLLIL;
    public final MutableLiveData<Boolean> LLJ;
    public final MutableLiveData<String> LLJI;
    public final MutableLiveData<String> LLJIJIL;
    public final MutableLiveData<List<AuthorizedScope>> LLJILJIL;
    public final MutableLiveData<List<AuthorizedScope>> LLJILJILJ;
    public final MutableLiveData<List<OAuthScope>> LLJILLL;
    public final MutableLiveData<List<OAuthScope>> LLJJ;
    public final MutableLiveData<AuthCodeResponse> LLJJI;
    public final MutableLiveData<AuthCodeResponse> LLJJIII;
    public final MutableLiveData<ScanCommonResponse> LLJJIJI;
    public final MutableLiveData<ScanCommonResponse> LLJJIJIIJIL;
    public final MutableLiveData<ScanCommonResponse> LLJJIJIL;
    public final MutableLiveData<ScanCommonResponse> LLJJJ;
    public final MutableLiveData<C2198701B3k> LLJJJIL;
    public final MutableLiveData<C2198701B3k> LLJJJJ;
    public final MutableLiveData<BCAuthorizationResponse> LLJJJJJIL;
    public final MutableLiveData<Pair<WebAuthV2Response, String>> LLJJJJLIIL;
    public final MutableLiveData<Pair<WebAuthV2Response, String>> LLJJL;

    public final void yQ2(C1B3C c1b3c) {
        C1B38 c1b38 = this.LLILLL;
        C1B3E c1b3e = new C1B3E() { // from class: X.1B3A
            @Override // X.C1B3E
            public final void LIZ(ScanCommonResponse scanCommonResponse) {
                this.LIZ.LLJJIJIL.postValue(scanCommonResponse);
            }
        };
        c1b38.getClass();
        C1B3I.LIZ.getClass();
        C1B3I.LIZJ.LIZJ("", c1b3c.LIZ, c1b3c.LIZIZ, c1b3c.LIZJ, c1b3c.LIZLLL, c1b3c.LJ, c1b3c.LJFF).LJJ(C1701940uOG.LIZIZ()).LJJIJIIJI(C11S5.LIZ()).LIZ(new C1D19(c1b3e, 1));
    }

    public final void wQ2(C1B3S c1b3s, boolean z) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C19HD(this, c1b3s, z, null), 3);
    }

    public static void vQ2(long j, String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", String.valueOf(System.currentTimeMillis() - j));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("platform", "android");
        jSONObject2.put("api", "page_detail");
        jSONObject2.put("client_key", str);
        jSONObject2.put("result", str2);
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
        C793770VBv.LJFF("ttop_auth_load_time", jSONObject, jSONObject2);
    }

    public AuthCommonViewModel(Application application, C19H9 c19h9, C1B3S c1b3s, C1B3J c1b3j) {
        C1B38 c1b38 = new C1B38();
        super(application);
        this.LL = c1b3s;
        this.LLILLJJLI = c1b3j;
        this.LLILLL = c1b38;
        this.LLILZ = new MutableLiveData<>();
        this.LLILZIL = new MutableLiveData<>();
        MutableLiveData<OAuthPage> mutableLiveData = new MutableLiveData<>();
        this.LLILZLL = mutableLiveData;
        this.LLIZ = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.LLIZLLLIL = mutableLiveData2;
        this.LLJ = mutableLiveData2;
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>();
        this.LLJI = mutableLiveData3;
        this.LLJIJIL = mutableLiveData3;
        MutableLiveData<List<AuthorizedScope>> mutableLiveData4 = new MutableLiveData<>();
        this.LLJILJIL = mutableLiveData4;
        this.LLJILJILJ = mutableLiveData4;
        MutableLiveData<List<OAuthScope>> mutableLiveData5 = new MutableLiveData<>();
        this.LLJILLL = mutableLiveData5;
        this.LLJJ = mutableLiveData5;
        MutableLiveData<AuthCodeResponse> mutableLiveData6 = new MutableLiveData<>();
        this.LLJJI = mutableLiveData6;
        this.LLJJIII = mutableLiveData6;
        MutableLiveData<ScanCommonResponse> mutableLiveData7 = new MutableLiveData<>();
        this.LLJJIJI = mutableLiveData7;
        this.LLJJIJIIJIL = mutableLiveData7;
        MutableLiveData<ScanCommonResponse> mutableLiveData8 = new MutableLiveData<>();
        this.LLJJIJIL = mutableLiveData8;
        this.LLJJJ = mutableLiveData8;
        MutableLiveData<C2198701B3k> mutableLiveData9 = new MutableLiveData<>();
        this.LLJJJIL = mutableLiveData9;
        this.LLJJJJ = mutableLiveData9;
        this.LLJJJJJIL = new MutableLiveData<>();
        MutableLiveData<Pair<WebAuthV2Response, String>> mutableLiveData10 = new MutableLiveData<>();
        this.LLJJJJLIIL = mutableLiveData10;
        this.LLJJL = mutableLiveData10;
    }

    public final void xQ2(final String str, final String str2, String str3, String str4, String str5, String str6, final Boolean bool, String str7, String str8, String str9, final String str10, final C1B35 c1b35, final String str11, final boolean z) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C1B38 c1b38 = this.LLILLL;
        C1B3J c1b3j = this.LLILLJJLI;
        String str12 = c1b3j.LIZ;
        String str13 = c1b3j.LIZJ;
        C1B3H c1b3h = new C1B3H() { // from class: X.1B33
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v22 */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.String] */
            @Override // X.C1B3H
            public final void LIZ(OAuthPage oAuthPage) throws JSONException {
                boolean zBooleanValue;
                boolean z2;
                OAuthScopeStruct scopeListStruct;
                int size;
                int size2;
                OAuthClientInfo clientInfo;
                T tLIZIZ;
                OAuthScopeStruct scopeListStruct2;
                List<OAuthScope> list;
                Boolean bool2;
                OAuthClientInfo clientInfo2;
                Boolean boolIsLite;
                AuthCommonViewModel authCommonViewModel = this.LIZ;
                long j = jCurrentTimeMillis;
                String str14 = str;
                authCommonViewModel.getClass();
                AuthCommonViewModel.vQ2(j, str14, "success");
                OAuthPageDetail oAuthPageDetail = oAuthPage.pageDetail;
                if (oAuthPageDetail != null && (clientInfo2 = oAuthPageDetail.getClientInfo()) != null && (boolIsLite = clientInfo2.isLite()) != null) {
                    zBooleanValue = boolIsLite.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                Boolean bool3 = bool;
                if (bool3 != null && Intrinsics.LJFF(bool3, Boolean.FALSE) && (bool2 = oAuthPage.canSkipConfirm) != null && Intrinsics.LJFF(bool2, Boolean.TRUE)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.LIZ.LLIZLLLIL.postValue(Boolean.valueOf(z2));
                if (z2 && c1b35 != null) {
                    String strLJJLIIIJ = str2;
                    OAuthPageDetail oAuthPageDetail2 = oAuthPage.pageDetail;
                    if (oAuthPageDetail2 != null && (scopeListStruct2 = oAuthPageDetail2.getScopeListStruct()) != null && (list = scopeListStruct2.authorizedScopeList) != null) {
                        String str15 = str2;
                        HashSet hashSet = new HashSet();
                        Iterator<OAuthScope> it2 = list.iterator();
                        while (it2.hasNext()) {
                            String str16 = it2.next().scopeName;
                            if (str16 != null) {
                                hashSet.add(str16);
                            }
                        }
                        if (!hashSet.isEmpty()) {
                            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str15, new String[]{","}, 0, 6);
                            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
                            Iterator it3 = listLJJLIIIJILLIZJL.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(a0.LJLIIIL((String) it3.next()).toString());
                            }
                            hashSet.addAll(C13LP.LLIIJI(arrayList));
                            strLJJLIIIJ = C13LP.LJJLIIIJ(hashSet, ",", null, null, 0, null, null, 62);
                        }
                    }
                    AuthCommonViewModel authCommonViewModel2 = this.LIZ;
                    String str17 = str;
                    String str18 = c1b35.LIZ;
                    String str19 = str10;
                    String str20 = str11;
                    boolean z3 = z;
                    C1B38 c1b382 = authCommonViewModel2.LLILLL;
                    C1B34 c1b34 = new C1B34(authCommonViewModel2, strLJJLIIIJ);
                    c1b382.getClass();
                    C1B38.LIZIZ(str17, strLJJLIIIJ, str18, str19, str20, "", z3, c1b34);
                    return;
                }
                if (zBooleanValue && z2) {
                    AuthCommonViewModel authCommonViewModel3 = this.LIZ;
                    authCommonViewModel3.wQ2(authCommonViewModel3.LL, z);
                    return;
                }
                OAuthPageDetail oAuthPageDetail3 = oAuthPage.pageDetail;
                String str21 = null;
                if (oAuthPageDetail3 != null && oAuthPageDetail3.getScopeListStruct() != null && !zBooleanValue) {
                    OAuthPageDetail oAuthPageDetail4 = oAuthPage.pageDetail;
                    if (oAuthPageDetail4 != null && (scopeListStruct = oAuthPageDetail4.getScopeListStruct()) != null) {
                        ?? r0 = str2;
                        AuthCommonViewModel authCommonViewModel4 = this.LIZ;
                        boolean z4 = z;
                        C259800zU c259800zU = new C259800zU();
                        c259800zU.element = r0;
                        List<OAuthScope> list2 = scopeListStruct.authorizedScopeList;
                        List<OAuthScope> list3 = scopeListStruct.requestScopeList;
                        C2197371AzH.LIZ.getClass();
                        List listLIZJ = C2197371AzH.LIZJ(list2, list3);
                        List<OAuthScope> list4 = scopeListStruct.authorizedScopeList;
                        if (list4 != null) {
                            size = list4.size();
                        } else {
                            size = 0;
                        }
                        List<OAuthScope> list5 = scopeListStruct.requestScopeList;
                        if (list5 != null) {
                            size2 = list5.size();
                        } else {
                            size2 = 0;
                        }
                        int i = size + size2;
                        for (int i2 = 0; i2 < i; i2++) {
                            List listLLIIII = C13LP.LLIIII(listLIZJ);
                            if (listLLIIII != null) {
                                C2197371AzH c2197371AzH = C2197371AzH.LIZ;
                                String str22 = (String) c259800zU.element;
                                c2197371AzH.getClass();
                                tLIZIZ = C2197371AzH.LIZIZ(i2, str22, listLLIIII);
                            } else {
                                tLIZIZ = 0;
                            }
                            c259800zU.element = tLIZIZ;
                        }
                        authCommonViewModel4.LL.LJII = (String) c259800zU.element;
                        if (z2) {
                            MutableLiveData<String> mutableLiveData = authCommonViewModel4.LLJI;
                            OAuthPageDetail oAuthPageDetail5 = oAuthPage.pageDetail;
                            if (oAuthPageDetail5 != null && (clientInfo = oAuthPageDetail5.getClientInfo()) != null) {
                                str21 = clientInfo.clientName;
                            }
                            mutableLiveData.postValue(str21);
                            authCommonViewModel4.wQ2(authCommonViewModel4.LL, z4);
                            return;
                        }
                        authCommonViewModel4.LLILZLL.postValue(oAuthPage);
                        return;
                    }
                    return;
                }
                this.LIZ.LLILZLL.postValue(oAuthPage);
            }

            @Override // X.C1B3H
            public final void LIZIZ(OAuthPage oAuthPage) throws JSONException {
                AuthCommonViewModel authCommonViewModel = this.LIZ;
                long j = jCurrentTimeMillis;
                String str14 = str;
                authCommonViewModel.getClass();
                AuthCommonViewModel.vQ2(j, str14, "failure");
                this.LIZ.LLILZLL.postValue(oAuthPage);
            }
        };
        c1b38.getClass();
        C1B38.LIZ(str, str2, str3, str4, str5, str6, str12, str13, str7, bool, str8, str9, str10, str11, z, c1b3h);
    }
}
