package com.ss.android.ugc.aweme.inbox.followerv2;

import X.C0PEM;
import X.C1245040iVK;
import X.C1245050iVL;
import X.C1245060iVM;
import X.C1440005kM;
import X.C1900300zYC;
import X.C1900760zYw;
import X.C1900840zZ4;
import X.C1900970zZH;
import X.C1900990zZJ;
import X.C1901070zZR;
import X.C1901120zZW;
import X.C1901180zZc;
import X.C1901350zZt;
import X.C1904500zey;
import X.C20684815ws;
import X.C2188811AlT;
import X.C23250099c;
import X.C2344009Gk;
import X.C299940BpI;
import X.C866950Xzh;
import X.EnumC1889520zGo;
import X.EnumC1889770zHD;
import X.EnumC1900750zYv;
import X.EnumC1901190zZd;
import X.EnumC1901360zZu;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.experiment.Configuration;
import com.ss.android.ugc.aweme.inbox.followerv2.FollowerViewModel;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.notification.perf.FollowerPreCacheManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS237S0300000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes29.dex */
public final class FollowerViewModel extends AssemViewModel<C1900300zYC> {
    public boolean LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public NoticeTabModel LLJJ;
    public boolean LLJJI;
    public final boolean LL = true;
    public String LLIZLLLIL = "";
    public final CopyOnWriteArrayList<InterfaceC1891350zJl> LLJ = new CopyOnWriteArrayList<>();
    public final Set<String> LLJI = new LinkedHashSet();
    public EnumC1889520zGo LLJIJIL = EnumC1889520zGo.COMPLETE;
    public int LLJILJIL = Integer.MIN_VALUE;
    public final Object LLJILJILJ = new Object();
    public int LLJILLL = 21;
    public final C1901180zZc LLJJIII = new Comparator() { // from class: X.0zZc
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            FollowPageData followPageData = (FollowPageData) obj;
            FollowPageData followPageData2 = (FollowPageData) obj2;
            if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().historyMaxFollowerCount > ((Configuration) C1901310zZp.LIZIZ.getValue()).maxFansDivide) {
                return 0;
            }
            FollowerViewModel followerViewModel = this.LL;
            EnumC1901190zZd enumC1901190zZd = EnumC1901190zZd.HAS_READ;
            followerViewModel.getClass();
            int iXQ2 = FollowerViewModel.xQ2(followPageData, followPageData2, enumC1901190zZd);
            if (iXQ2 == 0) {
                FollowerViewModel followerViewModel2 = this.LL;
                EnumC1901190zZd enumC1901190zZd2 = EnumC1901190zZd.FOLLOW_STATE;
                followerViewModel2.getClass();
                int iXQ22 = FollowerViewModel.xQ2(followPageData, followPageData2, enumC1901190zZd2);
                if (iXQ22 == 0) {
                    FollowerViewModel followerViewModel3 = this.LL;
                    EnumC1901190zZd enumC1901190zZd3 = EnumC1901190zZd.CREATE_TIME;
                    followerViewModel3.getClass();
                    return FollowerViewModel.xQ2(followPageData, followPageData2, enumC1901190zZd3);
                }
                return iXQ22;
            }
            return iXQ2;
        }
    };

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1900300zYC(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void BQ2(X.EnumC1900750zYv r22) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.followerv2.FollowerViewModel.BQ2(X.0zYv):void");
    }

    public final void CQ2(NoticeTabModel noticeTabModel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowerViewModel, setTabModel, tabModel: ");
        sbLIZ.append(noticeTabModel);
        C1245050iVL.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJ = noticeTabModel;
    }

    public final void wQ2(Object obj) {
        BaseNotice baseNotice;
        FollowRequestData followRequestData;
        User user;
        String uid;
        C1900990zZJ c1900990zZJ;
        FollowRequestData followRequestData2;
        GeneralTemplateNotice generalTemplateNotice;
        Long l;
        String string;
        C1900970zZH c1900970zZH;
        MusNotice musNotice;
        if (obj instanceof MusNotice) {
            baseNotice = (BaseNotice) obj;
        } else {
            baseNotice = null;
        }
        if (baseNotice != null && (generalTemplateNotice = baseNotice.templateNotice) != null && (l = generalTemplateNotice.nid) != null && (string = l.toString()) != null) {
            for (InterfaceC1891350zJl interfaceC1891350zJl : this.LLJ) {
                if ((interfaceC1891350zJl instanceof C1900970zZH) && (c1900970zZH = (C1900970zZH) interfaceC1891350zJl) != null && (musNotice = c1900970zZH.LL) != null && Intrinsics.LJFF(musNotice.nid, string)) {
                    C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1245040iVK(string, musNotice, this, null), 2);
                    FollowerPreCacheManager.LIZ(FollowerPreCacheManager.LIZ, musNotice.nid, null, 2);
                    C1440005kM.LIZ(new C1900840zZ4());
                }
            }
        }
        if ((obj instanceof FollowRequestData) && (followRequestData = (FollowRequestData) obj) != null && (user = followRequestData.user) != null && (uid = user.getUid()) != null) {
            for (InterfaceC1891350zJl interfaceC1891350zJl2 : this.LLJ) {
                if ((interfaceC1891350zJl2 instanceof C1900990zZJ) && (c1900990zZJ = (C1900990zZJ) interfaceC1891350zJl2) != null && (followRequestData2 = c1900990zZJ.LL) != null) {
                    User user2 = followRequestData2.user;
                    if (Intrinsics.LJFF(user2.getUid(), uid)) {
                        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1245060iVM(user2, this, uid, followRequestData2, null), 2);
                        LogHelper logHelper = (LogHelper) ServiceManager.get().getService(LogHelper.class);
                        user2.getUid();
                        logHelper.LIZ(user2);
                        FollowerPreCacheManager.LIZ(FollowerPreCacheManager.LIZ, null, user2.getUid(), 1);
                        C1440005kM.LIZ(new C1900840zZ4());
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0406 A[PHI: r9
      0x0406: PHI (r9v2 java.lang.Boolean) = 
      (r9v1 java.lang.Boolean)
      (r9v4 java.lang.Boolean)
      (r9v4 java.lang.Boolean)
      (r9v4 java.lang.Boolean)
      (r9v4 java.lang.Boolean)
      (r9v4 java.lang.Boolean)
     binds: [B:183:0x0402, B:177:0x03e5, B:146:0x0359, B:148:0x035d, B:150:0x0361, B:152:0x0365] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2(com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse r37, X.EnumC1900750zYv r38) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.followerv2.FollowerViewModel.yQ2(com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse, X.0zYv):void");
    }

    public final void zQ2(EnumC1900750zYv enumC1900750zYv, int i) throws JSONException {
        C1901120zZW c1901120zZWLIZIZ;
        FollowerPreCacheManager.FollowNoticeData followNoticeDataLIZIZ;
        FollowPageResponse followPageResponse;
        List<FollowPageData> data;
        FollowerPreCacheManager.FollowNoticeData followNoticeDataLIZIZ2;
        List<FollowPageData> data2;
        if (enumC1900750zYv == EnumC1900750zYv.FIRST_REFRESH && this.LLJILLL == 21) {
            C1901070zZR c1901070zZR = C1901070zZR.LJI;
            c1901070zZR.LIZLLL();
            if (c1901070zZR.LIZ.compareAndSet(0, 1)) {
                C1901070zZR.LJII = true;
                C1901070zZR.LJIIIIZZ = false;
            }
            FollowerPreCacheManager.LIZ.getClass();
            if (FollowerPreCacheManager.LIZIZ() != null && (c1901120zZWLIZIZ = FollowerPreCacheManager.LIZIZ()) != null && (followNoticeDataLIZIZ = c1901120zZWLIZIZ.LIZIZ()) != null && (followPageResponse = followNoticeDataLIZIZ.resp) != null && (data = followPageResponse.getData()) != null && (!data.isEmpty())) {
                C1245050iVL.LIZ("FollowerViewModel, preloadNotice...");
                C1901350zZt.LIZ.getClass();
                if (C1901350zZt.LIZJ()) {
                    EnumC1901360zZu.LLJJIJIIJIL.LJI(1);
                }
                C1901120zZW c1901120zZWLIZIZ2 = FollowerPreCacheManager.LIZIZ();
                FollowPageResponse followPageResponse2 = null;
                if (c1901120zZWLIZIZ2 != null && (followNoticeDataLIZIZ2 = c1901120zZWLIZIZ2.LIZIZ()) != null && (followPageResponse2 = followNoticeDataLIZIZ2.resp) != null && (data2 = followPageResponse2.getData()) != null) {
                    Iterator<FollowPageData> it2 = data2.iterator();
                    while (it2.hasNext()) {
                        MusNotice musNotice = it2.next().notice;
                        if (musNotice != null) {
                            musNotice.setCache(true);
                        }
                    }
                }
                yQ2(followPageResponse2, EnumC1900750zYv.PRELOAD);
            } else {
                C1901350zZt.LIZ.getClass();
                if (C1901350zZt.LIZJ()) {
                    EnumC1901360zZu.LLJJIJIIJIL.LJI(0);
                }
            }
        } else {
            C1901070zZR c1901070zZR2 = C1901070zZR.LJI;
            c1901070zZR2.LIZLLL();
            if (c1901070zZR2.LIZ.compareAndSet(0, 1)) {
                C1901070zZR.LJII = false;
                C1901070zZR.LJIIIIZZ = false;
            }
        }
        this.LLJILJIL = i;
        BQ2(enumC1900750zYv);
    }

    public static void AQ2(FollowerViewModel followerViewModel, String str, String str2) {
        followerViewModel.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
        c2344009Gk.LJIIIIZZ("target", str);
        c2344009Gk.LJIIIIZZ("to_user_id", str2);
        Map<String, String> map = c2344009Gk.LIZ;
        if (C299940BpI.LIZ()) {
            ((HashMap) map).put("remove_linked_account_toggle", "off");
        }
        C20684815ws.LJIILLIIL("block_confirm", map);
    }

    public static int xQ2(FollowPageData followPageData, FollowPageData followPageData2, EnumC1901190zZd enumC1901190zZd) {
        if (enumC1901190zZd == EnumC1901190zZd.CREATE_TIME) {
            return enumC1901190zZd.weight(followPageData, followPageData2) - enumC1901190zZd.weight(followPageData2, followPageData);
        }
        return enumC1901190zZd.weight(followPageData) - enumC1901190zZd.weight(followPageData2);
    }

    public final void vQ2(EnumC1900750zYv enumC1900750zYv, FollowPageResponse followPageResponse, List<? extends InterfaceC1891350zJl> list, Exception exc) {
        EnumC1889520zGo enumC1889520zGo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowerViewModel, checkResultStatus, reason: ");
        sbLIZ.append(enumC1900750zYv);
        sbLIZ.append(", resultItems size: ");
        sbLIZ.append(list.size());
        C1245050iVL.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (enumC1900750zYv == EnumC1900750zYv.PRELOAD || enumC1900750zYv == EnumC1900750zYv.FIRST_REFRESH) {
            C1901350zZt c1901350zZt = C1901350zZt.LIZ;
            int size = list.size();
            c1901350zZt.getClass();
            if (C1901350zZt.LIZJ()) {
                EnumC1901360zZu.LLIZLLLIL.LIZJ();
                EnumC1901360zZu.LLIZ.LJI(size);
            }
        }
        if (followPageResponse == null) {
            if (list.isEmpty()) {
                this.LLJIJIL = EnumC1889520zGo.COMPLETE;
                C1245050iVL.LIZ("FollowerViewModel, checkResultStatus, empty, NetworkErrorThrowable");
                setStateImmediate(new AwS237S0300000_28(enumC1900750zYv, exc, this, 2));
                C1904500zey.LJFF.LJIIJ("notice", EnumC1889770zHD.FAIL);
                C1901350zZt.LIZ.getClass();
                C1901350zZt.LIZIZ();
                return;
            }
            if (C1900760zYw.LIZ.contains(enumC1900750zYv)) {
                setStateImmediate(new AwS237S0300000_28((List) list, (List<? extends InterfaceC1891350zJl>) enumC1900750zYv, (EnumC1900750zYv) exc, (Exception) 3));
                return;
            }
            if (enumC1900750zYv != EnumC1900750zYv.LOAD_MORE) {
                return;
            }
            EnumC1889520zGo enumC1889520zGo2 = this.LLJIJIL;
            EnumC1889520zGo enumC1889520zGo3 = EnumC1889520zGo.COMPLETE;
            if (enumC1889520zGo2 != enumC1889520zGo3) {
                enumC1889520zGo3 = EnumC1889520zGo.ERROR;
            }
            this.LLJIJIL = enumC1889520zGo3;
            C1245050iVL.LIZ("FollowerViewModel, checkResultStatus, not empty, has more error");
            setStateImmediate(new AwS394S0200000_28((List) list, (List<? extends InterfaceC1891350zJl>) this, (FollowerViewModel) 21));
            return;
        }
        if (C866950Xzh.LIZIZ(followPageResponse.getData()) && followPageResponse.getHasMore()) {
            enumC1889520zGo = EnumC1889520zGo.HAS_MORE;
        } else {
            enumC1889520zGo = EnumC1889520zGo.COMPLETE;
        }
        this.LLJIJIL = enumC1889520zGo;
        if (list.isEmpty() && enumC1889520zGo == EnumC1889520zGo.COMPLETE) {
            C1245050iVL.LIZ("FollowerViewModel, checkResultStatus, EmptyThrowable");
            setStateImmediate(new AwS607S0100000_28(enumC1889520zGo, 77));
            C1904500zey.LJFF.LJIIJ("notice", EnumC1889770zHD.EMPTY);
            C1901350zZt.LIZ.getClass();
            C1901350zZt.LIZIZ();
            return;
        }
        C1245050iVL.LIZ("FollowerViewModel, checkResultStatus, success");
        setStateImmediate(new AwS237S0300000_28((List) list, (List<? extends InterfaceC1891350zJl>) enumC1889520zGo, (EnumC1889520zGo) enumC1900750zYv, (EnumC1900750zYv) 4));
    }
}
