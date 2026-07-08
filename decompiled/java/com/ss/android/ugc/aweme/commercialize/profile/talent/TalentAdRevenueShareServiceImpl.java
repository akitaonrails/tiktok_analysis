package com.ss.android.ugc.aweme.commercialize.profile.talent;

import X.C04TD;
import X.C1001140c9w;
import X.C1019240cd8;
import X.C1022820ciu;
import X.C1057590dcz;
import X.C1057600dd0;
import X.C1057630dd3;
import X.C11U6;
import X.C135Q;
import X.C13LP;
import X.C1AF0;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C994130byd;
import X.EnumC311460CIu;
import X.ExecutorC1592406Li;
import X.InterfaceC1019350cdJ;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.commercialize.profile.talent.model.ProfileAdData;
import com.ss.android.ugc.aweme.commercialize.profile.talent.model.ProfileTalentShareAdResult;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes17.dex */
public final class TalentAdRevenueShareServiceImpl implements ITalentAdRevenueShareService {
    public int LIZIZ;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public String LJII;
    public C1057600dd0 LJIIIIZZ;
    public final ArrayList<String> LIZ = new ArrayList<>();
    public int LIZJ = -1;
    public int LIZLLL = -1;

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void LIZJ() {
    }

    public static ITalentAdRevenueShareService LJIIL() {
        Object objLIZ = C04TD.LIZ(ITalentAdRevenueShareService.class, false);
        if (objLIZ != null) {
            return (ITalentAdRevenueShareService) objLIZ;
        }
        if (C04TD.LLLILZJ == null) {
            synchronized (ITalentAdRevenueShareService.class) {
                if (C04TD.LLLILZJ == null) {
                    C04TD.LLLILZJ = new TalentAdRevenueShareServiceImpl();
                }
            }
        }
        return C04TD.LLLILZJ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void LIZ() {
        this.LIZ.clear();
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJ = false;
        this.LJFF = false;
        this.LJII = null;
        C1019240cd8.LIZ.LIZIZ(this.LJIIIIZZ);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final boolean LJIIIZ() {
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final List<String> LJIIJ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void LJ(AwemeRawAd awemeRawAd) throws JSONException {
        if (!this.LJFF) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("filter_words", "not interested");
        jSONObject2.put("unified_dislike", 1);
        jSONObject.put("ad_extra_data", jSONObject2);
        C1001140c9w c1001140c9w = new C1001140c9w();
        c1001140c9w.LIZ = awemeRawAd;
        c1001140c9w.LIZLLL = jSONObject;
        C994130byd.LIZ("draw_ad", "dislike", c1001140c9w.LIZ(), awemeRawAd);
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "dislike", awemeRawAd);
        c1022820ciuLIZLLL.LIZIZ("not interested", "filter_words");
        c1022820ciuLIZLLL.LIZIZ(1, "unified_dislike");
        c1022820ciuLIZLLL.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final boolean LJFF(int i) {
        int i2;
        int i3 = this.LIZIZ;
        if (i3 <= 0) {
            return false;
        }
        int i4 = this.LIZJ;
        if (i4 < 0) {
            return true;
        }
        if (i <= i4) {
            return false;
        }
        if (i4 == this.LIZLLL && !this.LJI) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (i - i4 < i3 + i2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void LJIIIIZZ(String str) {
        if (str != null && !this.LIZ.isEmpty() && Intrinsics.LJFF(C13LP.LJJLIIIJJI(this.LIZ), str)) {
            this.LIZ.remove(str);
            this.LJI = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void LIZIZ(AwemeRawAd awemeRawAd, String str) {
        C1001140c9w c1001140c9w = new C1001140c9w();
        c1001140c9w.LIZ = awemeRawAd;
        c1001140c9w.LIZIZ = str;
        C994130byd.LIZ("draw_ad", "otherclick", c1001140c9w.LIZ(), awemeRawAd);
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ(str, "refer");
        c1022820ciuLIZLLL.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void LIZLLL(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (str != null && jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(this.LJII) && this.LIZ.contains(str)) {
                    String strOptString = jSONObject.optString("ad_extra_data");
                    if (TextUtils.isEmpty(strOptString)) {
                        jSONObject2 = new JSONObject();
                    } else {
                        jSONObject2 = new JSONObject(strOptString);
                    }
                    jSONObject2.put("creator_uid", this.LJII);
                    jSONObject.put("ad_extra_data", C786410Ut5.J3(jSONObject2));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0dd0, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void LJI(String str, boolean z) {
        this.LJFF = z;
        this.LJII = str;
        ?? r3 = new InterfaceC1019350cdJ() { // from class: X.0dd0
            @Override // X.InterfaceC1019350cdJ
            public final void LIZ(String str2, String str3, String str4, JSONObject jSONObject) {
                this.LIZ.LIZLLL(str4, jSONObject);
            }
        };
        this.LJIIIIZZ = r3;
        synchronized (C1019240cd8.LIZ) {
            List<InterfaceC1019350cdJ> list = C1019240cd8.LIZIZ;
            if (((ArrayList) list).contains(r3)) {
                return;
            }
            ((ArrayList) list).add(r3);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void LJIIJJI(AwemeRawAd awemeRawAd, JSONObject jSONObject) throws JSONException {
        int iOptInt;
        String strOptString;
        String strOptString2;
        String strOptString3;
        if (awemeRawAd.getCreativeIdStr() != null && Intrinsics.LJFF(awemeRawAd.getCreativeIdStr(), C13LP.LJJLIIIJJI(this.LIZ))) {
            if (jSONObject.opt("reason_id") != null) {
                iOptInt = jSONObject.optInt("reason_id");
            } else {
                iOptInt = 0;
            }
            String str = "";
            if (jSONObject.opt("report_from") == null) {
                strOptString = "";
            } else {
                strOptString = jSONObject.optString("report_from");
            }
            if (jSONObject.opt("screenshot_uri") == null) {
                strOptString2 = "";
            } else {
                strOptString2 = jSONObject.optString("screenshot_uri");
            }
            if (jSONObject.opt("description") == null) {
                strOptString3 = "";
            } else {
                strOptString3 = jSONObject.optString("description");
            }
            int iHashCode = strOptString.hashCode();
            if (iHashCode != -1755408457) {
                if (iHashCode != -326696768) {
                    if (iHashCode == 1820422063 && strOptString.equals("creative")) {
                        str = "share_ad";
                    }
                } else if (strOptString.equals("long_press")) {
                    str = "draw_ad";
                }
            } else if (strOptString.equals("landing_page")) {
                str = "landing_ad";
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("reason_id", iOptInt);
            jSONObject3.put("screenshot_url", strOptString2);
            jSONObject3.put("description", strOptString3);
            jSONObject2.put("ad_extra_data", jSONObject3);
            C1001140c9w c1001140c9w = new C1001140c9w();
            c1001140c9w.LIZ = awemeRawAd;
            c1001140c9w.LIZLLL = jSONObject2;
            C994130byd.LIZ(str, "report", c1001140c9w.LIZ(), awemeRawAd);
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(str, "report", awemeRawAd);
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(iOptInt), "reason_id");
            c1022820ciuLIZLLL.LIZIZ(strOptString2, "screenshot_url");
            c1022820ciuLIZLLL.LIZIZ(strOptString3, "description");
            c1022820ciuLIZLLL.LJIIIIZZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService
    public final void LJII(String str, List list, final int i, EnumC311460CIu enumC311460CIu, final C1057630dd3 c1057630dd3) {
        Integer numValueOf;
        int i2;
        if (this.LJ) {
            return;
        }
        String strLIZIZ = e3.e;
        for (String str2 : (ArrayList) list) {
            if (!Intrinsics.LJFF(strLIZIZ, e3.e)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(',');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(str2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(']');
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        if (enumC311460CIu == EnumC311460CIu.PROFILE_AD_REQUEST_SOURCE_LOAD_MORE && (i2 = this.LIZLLL) >= 0) {
            numValueOf = Integer.valueOf(i - i2);
        } else {
            numValueOf = null;
        }
        this.LJ = true;
        this.LJI = false;
        ProfileAdTalentShareApi.LIZ.getClass();
        ListenableFuture<ProfileTalentShareAdResult> talentProfileAd = ((ProfileAdTalentShareApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C1057590dcz.LIZIZ).build().retrofit.LIZ(ProfileAdTalentShareApi.class)).getTalentProfileAd(str, strLIZIZ2, i, enumC311460CIu.getSOURCE(), numValueOf);
        talentProfileAd.LJIIJJI(new C135Q(talentProfileAd, new C11U6<ProfileTalentShareAdResult>() { // from class: X.0dd2
            @Override // X.C11U6
            public final void onFailure(Throwable th) {
                TalentAdRevenueShareServiceImpl talentAdRevenueShareServiceImpl = this.LIZ;
                talentAdRevenueShareServiceImpl.LIZJ = i;
                talentAdRevenueShareServiceImpl.LJ = false;
                c1057630dd3.getClass();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C11U6
            public final void onSuccess(ProfileTalentShareAdResult profileTalentShareAdResult) {
                int i3;
                Aweme aweme;
                Aweme aweme2;
                AwemeRawAd awemeRawAd;
                ProfileTalentShareAdResult profileTalentShareAdResult2 = profileTalentShareAdResult;
                TalentAdRevenueShareServiceImpl talentAdRevenueShareServiceImpl = this.LIZ;
                talentAdRevenueShareServiceImpl.LJ = false;
                if (profileTalentShareAdResult2 != null) {
                    int i4 = i;
                    talentAdRevenueShareServiceImpl.LIZJ = i4;
                    talentAdRevenueShareServiceImpl.LIZLLL = i4;
                    talentAdRevenueShareServiceImpl.LIZIZ = profileTalentShareAdResult2.adGap;
                    List<ProfileAdData> list2 = profileTalentShareAdResult2.profileAds;
                    if (list2 != null) {
                        for (ProfileAdData profileAdData : list2) {
                            if (profileAdData != null && (aweme2 = profileAdData.aweme) != null && (awemeRawAd = aweme2.getAwemeRawAd()) != null) {
                                talentAdRevenueShareServiceImpl.LIZ.add(awemeRawAd.getCreativeIdStr());
                            }
                        }
                    }
                }
                C1057630dd3 c1057630dd32 = (C1057630dd3) c1057630dd3;
                if (profileTalentShareAdResult2 == null) {
                    c1057630dd32.getClass();
                    return;
                }
                C1255780ime c1255780ime = c1057630dd32.LIZ;
                List<ProfileAdData> list3 = profileTalentShareAdResult2.profileAds;
                c1255780ime.getClass();
                if (list3 != null && !list3.isEmpty() && ((FeedItemList) c1255780ime.mData).getItems() != null && !((FeedItemList) c1255780ime.mData).getItems().isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i5 = 0; i5 < ((FeedItemList) c1255780ime.mData).getItems().size(); i5++) {
                        Aweme aweme3 = (Aweme) ListProtector.get(((FeedItemList) c1255780ime.mData).getItems(), i5);
                        arrayList.add(aweme3);
                        if (aweme3 != null && !list3.isEmpty()) {
                            Iterator<ProfileAdData> it2 = list3.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ProfileAdData next = it2.next();
                                if (next != null && !TextUtils.isEmpty(next.previousItemId) && next.previousItemId.equals(aweme3.getAid())) {
                                    Aweme aweme4 = next.aweme;
                                    if (aweme4 != null && ((i3 = i5 + 1) >= ((FeedItemList) c1255780ime.mData).getItems().size() || (aweme = (Aweme) ListProtector.get(((FeedItemList) c1255780ime.mData).getItems(), i3)) == null || !aweme.isAd())) {
                                        arrayList.add(((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme4));
                                    }
                                }
                            }
                        }
                    }
                    ((FeedItemList) c1255780ime.mData).setItems(arrayList);
                }
                C1440005kM.LIZ(new C989870brl(((FeedItemList) c1057630dd32.LIZ.mData).getItems()));
            }
        }), ExecutorC1592406Li.LLILLJJLI);
    }
}
