package com.ss.android.ugc.aweme.tag.viewmodel;

import X.AbstractC316870CbV;
import X.C003Z;
import X.C01GW;
import X.C098200Yq;
import X.C1235790iGP;
import X.C13BV;
import X.C13LP;
import X.C150D;
import X.C1559260qg8;
import X.C1572660r1k;
import X.C1697810uHb;
import X.C189200o6;
import X.C20509315Nb;
import X.C20509415Nc;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C317290CcB;
import X.C317760Ccw;
import X.C452501pT;
import X.C627660Ojc;
import X.C723600SZy;
import X.C737520SwQ;
import X.C844470XAv;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoTagSearchListViewModel extends AssemListViewModel<C1235790iGP, InterfaceC1891350zJl, Boolean> {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C1572660r1k.class, null), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(288));
    public final C13BV LLILLL;
    public List<? extends InterfaceC1891350zJl> LLILZ;
    public final C01GW LLILZIL;
    public String LLILZLL;
    public int LLIZ;
    public final Set<String> LLIZLLLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1235790iGP(new Pair(C13BV.INSTANCE, ""), new C627660Ojc(null, null, null, null, 15));
    }

    public final C1572660r1k wQ2() {
        C1572660r1k c1572660r1k = (C1572660r1k) this.LL.getValue();
        return c1572660r1k == null ? new C1572660r1k(null, null, 0, null, null, 31, null) : c1572660r1k;
    }

    public VideoTagSearchListViewModel() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LLILLL = c13bv;
        this.LLILZ = c13bv;
        this.LLILZIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(287));
        this.LLILZLL = "";
        this.LLIZLLLIL = new LinkedHashSet();
    }

    public static IMUser vQ2(SugExtraInfo sugExtraInfo) {
        String str;
        IMUser iMUser = new IMUser();
        iMUser.setUid(sugExtraInfo.getUserId());
        iMUser.setSecUid(sugExtraInfo.getSecUserId());
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(sugExtraInfo.getUserAvatarUri());
        urlModel.setUrlList(C1697810uHb.LJIIJJI(sugExtraInfo.getUserAvatarUri(), sugExtraInfo.getUserAvatarUri()));
        iMUser.setAvatarThumb(urlModel);
        iMUser.setFollowStatus(sugExtraInfo.getFollowStatus());
        iMUser.setNickName(sugExtraInfo.getUsername());
        iMUser.setUniqueId(sugExtraInfo.getUserNickname());
        if (sugExtraInfo.isVerifiedUser()) {
            str = "verified";
        } else {
            str = "";
        }
        iMUser.setCustomVerify(str);
        iMUser.setSearchIsBusinessAccount(sugExtraInfo.isBusinessAccount());
        return iMUser;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS610S0100000_31(c627660Ojc, (C627660Ojc<C150D>) 248));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn) {
        ((HashSet) this.LLILZIL.getValue()).clear();
        return xQ2(true);
    }

    public final AbstractC316870CbV<Boolean> xQ2(boolean z) {
        Long lValueOf;
        Integer num;
        boolean z2;
        SugExtraInfo sugExtraInfo;
        SugExtraInfo sugExtraInfo2;
        String aid;
        try {
            ISearchUserService iSearchUserService = (ISearchUserService) this.LLILLJJLI.getValue();
            if (iSearchUserService != null) {
                Aweme aweme = wQ2().getAweme();
                if (aweme != null && (aid = aweme.getAid()) != null) {
                    lValueOf = Long.valueOf(CastLongProtector.parseLong(aid));
                } else {
                    lValueOf = null;
                }
                String str = this.LLILZLL;
                List listLLIIII = C13LP.LLIIII((HashSet) this.LLILZIL.getValue());
                if (ComplianceServiceProvider.LJI().LJJII()) {
                    num = 1;
                } else {
                    num = null;
                }
                SearchUserSugResponse searchUserSugResponseLIZJ = iSearchUserService.LIZJ(new C317760Ccw(4L, lValueOf, str, "at_user", 20L, listLLIIII, num));
                if (searchUserSugResponseLIZJ != null) {
                    ArrayList arrayList = new ArrayList();
                    List<? extends SearchSugEntity> list = searchUserSugResponseLIZJ.sugList;
                    if (list != null && (!list.isEmpty())) {
                        if (z) {
                            this.LLIZ = 0;
                        }
                        boolean z3 = false;
                        boolean z4 = false;
                        for (SearchSugEntity searchSugEntity : list) {
                            if (z) {
                                ISearchUserService iSearchUserService2 = (ISearchUserService) this.LLILLJJLI.getValue();
                                if (iSearchUserService2 == null || !iSearchUserService2.LIZLLL()) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    if (!z3 && (sugExtraInfo2 = searchSugEntity.sugExtraInfo) != null && sugExtraInfo2.getHasUserRelation()) {
                                        C844470XAv.LIZ.getClass();
                                        arrayList.add(new C003Z(C844470XAv.LIZ().getString(R.string.jq2)));
                                        z3 = true;
                                    }
                                    if (!z4 && (sugExtraInfo = searchSugEntity.sugExtraInfo) != null && !sugExtraInfo.getHasUserRelation()) {
                                        C844470XAv.LIZ.getClass();
                                        arrayList.add(new C003Z(C844470XAv.LIZ().getString(2131826711)));
                                        z4 = true;
                                    }
                                } else if (!z4) {
                                    C844470XAv.LIZ.getClass();
                                    arrayList.add(new C003Z(C844470XAv.LIZ().getString(2131826711)));
                                    z4 = true;
                                }
                            }
                            IMUser iMUserVQ2 = vQ2(searchSugEntity.sugExtraInfo);
                            C20509315Nb c20509315Nb = new C20509315Nb(iMUserVQ2, this.LLILZLL, new C20509415Nc(searchSugEntity, searchUserSugResponseLIZJ.requestId));
                            String uid = iMUserVQ2.getUid();
                            if (uid != null) {
                                ((HashSet) this.LLILZIL.getValue()).add(uid);
                            }
                            if (!this.LLILLL.contains(iMUserVQ2)) {
                                arrayList.add(c20509315Nb);
                                this.LLIZ++;
                            }
                        }
                        try {
                            C737520SwQ.LIZ("trending_show", new AwS397S0200000_31(searchUserSugResponseLIZJ, this, 121));
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                    if (searchUserSugResponseLIZJ.LIZ()) {
                        return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, Boolean.TRUE, arrayList, 1);
                    }
                    AbstractC316870CbV.LIZ.getClass();
                    return new C316640Cb8(arrayList);
                }
            }
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            Exception exc = new Exception();
            c317290CcB.getClass();
            return new C316650Cb9(exc);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
            Exception exc2 = new Exception(e);
            c317290CcB2.getClass();
            return new C316650Cb9(exc2);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Boolean bool, InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn) {
        bool.booleanValue();
        return xQ2(false);
    }
}
