package com.ss.android.ugc.aweme.notification.v2.viewmodel;

import X.C01GW;
import X.C036E;
import X.C05RZ;
import X.C0OKV;
import X.C0PEM;
import X.C1075780e6K;
import X.C1244920iV8;
import X.C1260910iuv;
import X.C13BV;
import X.C13LP;
import X.C1440005kM;
import X.C1697810uHb;
import X.C1720106oR;
import X.C1868400yik;
import X.C1900610zYh;
import X.C1900620zYi;
import X.C1900660zYm;
import X.C1900700zYq;
import X.C1900770zYx;
import X.C1900840zZ4;
import X.C1900870zZ7;
import X.C1900900zZA;
import X.C1900960zZG;
import X.C1901130zZX;
import X.C1901150zZZ;
import X.C1901380zZw;
import X.C1901580zaG;
import X.C1901660zaO;
import X.C1903780zdo;
import X.C1904270zeb;
import X.C1DFB;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C23250099c;
import X.C262100AOy;
import X.C279900Ay4;
import X.C298710BnJ;
import X.C304900BxI;
import X.C452501pT;
import X.C844470XAv;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.EnumC1782720wUY;
import X.EnumC1900710zYr;
import X.EnumC1901370zZv;
import X.EnumC624380OeK;
import X.InterfaceC0148002o;
import X.InterfaceC497601wk;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.api.bean.EntranceKey;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupFilterStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeTabModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS51S0301000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationFragmentV2ViewModel extends AssemViewModel<C1900660zYm> {
    public static final /* synthetic */ int LLIZ = 0;
    public C1868400yik LL;
    public List<NoticeTabModel> LLILLJJLI = new ArrayList();
    public List<GroupFilterStruct> LLILLL = new ArrayList();
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(310));
    public boolean LLILZIL;
    public boolean LLILZLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1900660zYm(0);
    }

    public final void vQ2() {
        Object next;
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            } else {
                next = it2.next();
            }
        } while (!((NoticeTabModel) next).isAllTab);
        NoticeTabModel noticeTabModel = (NoticeTabModel) next;
        if (noticeTabModel != null) {
            int i = noticeTabModel.filterType;
            int i2 = noticeTabModel.group;
            if (i != Integer.MIN_VALUE && i != 0) {
                C1903780zdo.LJII().LJJIFFI(EnumC624380OeK.Normal, new int[]{i});
                C1901580zaG.LIZ.getClass();
                C1901580zaG.LJIIJ();
            } else if (i2 == C1904270zeb.LIZJ) {
                C1903780zdo.LIZ(EnumC624380OeK.Normal, 13, LSPassThroughRecordSizeConfig.DEFAULT, C1904270zeb.LIZJ, C1904270zeb.LIZ, C1904270zeb.LIZLLL, 84, C1904270zeb.LIZIZ);
            } else {
                C1903780zdo.LIZ(EnumC624380OeK.Normal, i2);
            }
            C1903780zdo.LIZIZ(new EntranceKey(1, null));
            C1440005kM.LIZ(new C0OKV());
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((LinkedHashMap) C1900620zYi.LIZ).clear();
    }

    public final void wQ2(MusNotice musNotice) {
        Integer numValueOf;
        String str;
        User user;
        String str2;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deletedNotice start, type=");
        if (musNotice != null) {
            numValueOf = Integer.valueOf(musNotice.type);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", nid=");
        if (musNotice != null) {
            str = musNotice.nid;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C1720106oR.LJI("NotificationFragmentV2ViewModel", C2188811AlT.LIZIZ(sbLIZ));
        if (musNotice == null) {
            return;
        }
        if (musNotice.isMock()) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cannot delete a mock notice:");
            sbLIZ2.append(musNotice.type);
            sbLIZ2.append(", ");
            sbLIZ2.append(musNotice.nid);
            C1720106oR.LIZ("NotificationFragmentV2ViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (musNotice.type == 225) {
                    C1260910iuv c1260910iuv = new C1260910iuv(0);
                    c1260910iuv.LJJLIIIJJI = EnumC1260930iux.CLOSE;
                    c1260910iuv.LJJIJLIJ("notification_page");
                    c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.INBOX_NOTICE;
                    c1260910iuv.LJJJJLL();
                    String str3 = C1900870zZ7.LIZ;
                    if (str3 == null) {
                        str3 = "";
                    }
                    c1260910iuv.LJJJJIZL(str3);
                    GeneralTemplateNotice generalTemplateNotice = musNotice.templateNotice;
                    if (generalTemplateNotice != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null) {
                        user = (User) C13LP.LJJJLL(list);
                    } else {
                        user = null;
                    }
                    c1260910iuv.LJJJJZI(user);
                    GeneralTemplateNotice generalTemplateNotice2 = musNotice.templateNotice;
                    if (generalTemplateNotice2 != null) {
                        str2 = generalTemplateNotice2.messageExtra;
                    } else {
                        str2 = null;
                    }
                    c1260910iuv.LIZIZ(C1075780e6K.LIZ(str2));
                    c1260910iuv.LJIILJJIL();
                }
                C1440005kM.LIZ(new C1900840zZ4());
                C1901130zZX c1901130zZX = C1901130zZX.LIZJ;
                synchronized (c1901130zZX) {
                    C1900960zZG c1900960zZGLJ = c1901130zZX.LJ();
                    if (c1900960zZGLJ != null) {
                        c1900960zZGLJ.LIZ(musNotice);
                    }
                }
                C1901150zZZ.LIZJ.LIZJ(musNotice);
                C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1244920iV8(musNotice, this, null), 2);
                setState(new AwS607S0100000_28(musNotice, 109));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LIZ("NotificationFragmentV2ViewModel", "deletedNotice net unavailable");
        setState(AFwS271S0000000_28.get$arr$(187));
    }

    public final void xQ2(boolean z) {
        int i;
        int iIntValue;
        Integer num;
        int i2;
        int i3;
        CreatorNoticeResponse creatorNoticeResponseLIZJ;
        List<NoticeTabModel> list;
        int i4 = 1;
        if (z) {
            C1901150zZZ c1901150zZZ = C1901150zZZ.LIZJ;
            synchronized (c1901150zZZ) {
                C1900900zZA c1900900zZALJ = c1901150zZZ.LJ();
                if (c1900900zZALJ != null) {
                    creatorNoticeResponseLIZJ = c1900900zZALJ.LIZJ();
                } else {
                    creatorNoticeResponseLIZJ = null;
                }
            }
            CreatorNoticeResponse creatorNoticeResponse = creatorNoticeResponseLIZJ;
            if (creatorNoticeResponse != null && (list = creatorNoticeResponse.tabDataModel) != null && !list.isEmpty()) {
                int i5 = C2187451AjH.LIZ;
                C1720106oR.LJI("NotificationFragmentV2ViewModel", "use PreLoad CreatorNotice Success");
                yQ2(EnumC1900710zYr.PRELOAD, creatorNoticeResponse);
                this.LLILZLL = true;
            } else {
                i4 = 0;
            }
            C1901380zZw.LIZ.getClass();
            if (C1901380zZw.LIZ()) {
                EnumC1901370zZv.LLJILJILJ.LJII(i4);
            }
            InterfaceC497601wk assemVMScope = getAssemVMScope();
            C1DFB c1dfb = C0PEM.LIZJ;
            C23250099c.LIZLLL(assemVMScope, c1dfb, null, new C05RZ(null), 2);
            C23250099c.LIZLLL(getAssemVMScope(), c1dfb, null, new C1900770zYx(this, EnumC1900710zYr.FIRST_REQUEST, null), 2);
            return;
        }
        new Object() { // from class: X.0zZ8
        }.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new GroupFilterStruct(C1904270zeb.LIZJ, 2131824675, R.raw.icon_bubble_line_fill, 2131824675, 2131838271, Integer.valueOf(R.raw.icon_large_inbox)));
        if (((IFavoriteService) ServiceManager.get().getService(IFavoriteService.class)).LJJIIZ()) {
            C01GW c01gw = C279900Ay4.LIZ;
            if (((Boolean) c01gw.getValue()).booleanValue()) {
                i2 = 2131838314;
            } else {
                i2 = 2131838320;
            }
            if (((Boolean) c01gw.getValue()).booleanValue()) {
                i3 = 2131838316;
            } else {
                i3 = 2131838321;
            }
            arrayList.add(new GroupFilterStruct(C1904270zeb.LIZ, i2, R.raw.icon_heart_fill, i2, i3, Integer.valueOf(R.raw.icon_large_heart)));
        } else {
            arrayList.add(new GroupFilterStruct(C1904270zeb.LIZ, 2131838283, R.raw.icon_heart_fill, 2131838289, 2131838288, Integer.valueOf(R.raw.icon_large_heart)));
        }
        arrayList.add(new GroupFilterStruct(C1904270zeb.LIZLLL, 2131838281, R.raw.icon_bubble_ellipsis_right_fill, 2131838269, 2131838268, Integer.valueOf(R.raw.icon_large_comment)));
        if (C304900BxI.LIZ()) {
            arrayList.add(new GroupFilterStruct(84, 2131825076, R.raw.icon_camera_plus_fill, 2131825099, 2131825101, null));
        }
        int i6 = C1904270zeb.LIZIZ;
        int iLIZIZ = C298710BnJ.LIZIZ();
        if (1 <= iLIZIZ && iLIZIZ < 5) {
            i = 2131837168;
        } else {
            i = R.string.m_y;
        }
        arrayList.add(new GroupFilterStruct(i6, i, R.raw.icon_at_fill, 2131838294, 2131838293, Integer.valueOf(R.raw.icon_large_at_mention)));
        this.LLILLL = arrayList;
        GroupFilterStruct groupFilterStruct = (GroupFilterStruct) C13LP.LJJJLL(arrayList);
        if (groupFilterStruct != null) {
            C1868400yik c1868400yik = this.LL;
            if (c1868400yik != null && (num = c1868400yik.LLILZ) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = Integer.MIN_VALUE;
            }
            groupFilterStruct.filterType = iIntValue;
        }
        setState(new AwS607S0100000_28(this, 110));
    }

    public final void zQ2(C1900610zYh c1900610zYh) {
        List<NoticeTabModel> list;
        int type;
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        C1900610zYh c1900610zYh2 = c1900610zYh;
        List<NoticeTabModel> list2 = this.LLILLJJLI;
        if (list2 != null && !((ArrayList) list2).isEmpty() && (list = c1900610zYh2.LIZJ) != null && ((ArrayList) list2).size() == list.size()) {
            List<NoticeTabModel> list3 = c1900610zYh2.LIZJ;
            switch (C1900700zYq.LIZ[c1900610zYh2.LIZ.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    type = EnumC1782720wUY.CHANGE_WALL_TIME.getType() | EnumC1782720wUY.CHANGE_UNREAD_COUNT.getType() | EnumC1782720wUY.CHANGE_LAST_READ_TIME.getType();
                    break;
                case 4:
                    type = EnumC1782720wUY.CHANGE_UNREAD_COUNT_DECREASE.getType();
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case BdTuring.TYPE_ECAF /* 9 */:
                    type = EnumC1782720wUY.NO_CHANGE.getType();
                    break;
                default:
                    type = EnumC1782720wUY.NO_CHANGE.getType();
                    break;
            }
            int i4 = c1900610zYh2.LIZIZ;
            EnumC1900710zYr enumC1900710zYr = c1900610zYh2.LIZ;
            if (enumC1900710zYr != EnumC1900710zYr.FIRST_REQUEST && enumC1900710zYr != EnumC1900710zYr.REFRESH_ALL && enumC1900710zYr != EnumC1900710zYr.PRELOAD) {
                z = false;
            } else {
                z = true;
            }
            ArrayList arrayList = new ArrayList();
            int size = list3.size();
            for (int i5 = 0; i5 < size; i5++) {
                NoticeTabModel noticeTabModel = (NoticeTabModel) ListProtector.get(list3, i5);
                NoticeTabModel noticeTabModelCopy = (NoticeTabModel) ListProtector.get(list2, i5);
                if (noticeTabModel.wallTime >= noticeTabModelCopy.wallTime) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i6 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateByType: Tab = ");
                sbLIZ.append(noticeTabModel.tabName);
                sbLIZ.append(", isNewTab = ");
                sbLIZ.append(z2);
                sbLIZ.append(", isUpdateAll= ");
                sbLIZ.append(z);
                C1720106oR.LJI("Creators_Inbox", C2188811AlT.LIZIZ(sbLIZ));
                if ((z || noticeTabModel.tabId == i4) && z2) {
                    EnumC1782720wUY enumC1782720wUY = EnumC1782720wUY.CHANGE_WALL_TIME;
                    if ((enumC1782720wUY.getType() & type) == enumC1782720wUY.getType()) {
                        i = noticeTabModel.wallTime;
                    } else {
                        i = noticeTabModelCopy.wallTime;
                    }
                    EnumC1782720wUY enumC1782720wUY2 = EnumC1782720wUY.CHANGE_UNREAD_COUNT;
                    if ((enumC1782720wUY2.getType() & type) == enumC1782720wUY2.getType()) {
                        i2 = noticeTabModel.unReadCount;
                    } else {
                        EnumC1782720wUY enumC1782720wUY3 = EnumC1782720wUY.CHANGE_UNREAD_COUNT_DECREASE;
                        i2 = (enumC1782720wUY3.getType() & type) == enumC1782720wUY3.getType() ? noticeTabModelCopy.unReadCount - 1 : noticeTabModelCopy.unReadCount;
                    }
                    EnumC1782720wUY enumC1782720wUY4 = EnumC1782720wUY.CHANGE_LAST_READ_TIME;
                    if ((enumC1782720wUY4.getType() & type) == enumC1782720wUY4.getType()) {
                        i3 = noticeTabModel.lastReadTime;
                    } else {
                        i3 = noticeTabModelCopy.lastReadTime;
                    }
                    noticeTabModelCopy = noticeTabModel.copy(noticeTabModel.tabId, noticeTabModel.group, noticeTabModel.tabName, i2, noticeTabModel.isAllTab, noticeTabModel.isDefaultLanding, noticeTabModel.filterOptionList, noticeTabModel.sortOptionList, i3, i, noticeTabModel.trackingName, noticeTabModel.filterType, noticeTabModel.needCombineExtraData, noticeTabModel.isFollowerTab, noticeTabModel.schemaUrl, noticeTabModel.index);
                }
                arrayList.add(noticeTabModelCopy);
            }
            c1900610zYh2 = new C1900610zYh(c1900610zYh2.LIZIZ, c1900610zYh2.LIZ, arrayList);
        }
        Collection collection = c1900610zYh2.LIZJ;
        if (collection == null) {
            collection = C13BV.INSTANCE;
        }
        this.LLILLJJLI = new ArrayList(collection);
        setState(new AwS607S0100000_28(c1900610zYh2, 111));
    }

    public final void yQ2(EnumC1900710zYr enumC1900710zYr, CreatorNoticeResponse creatorNoticeResponse) {
        int i;
        EnumC1900710zYr enumC1900710zYr2 = enumC1900710zYr;
        if (((Number) C262100AOy.LIZ.getValue()).intValue() == 1) {
            C1868400yik c1868400yik = this.LL;
            if (c1868400yik == null || c1868400yik.LLILZIL == Integer.MIN_VALUE) {
                i = creatorNoticeResponse.resultTabId;
            } else {
                i = c1868400yik.LLILZIL;
            }
        } else {
            C1868400yik c1868400yik2 = this.LL;
            if (c1868400yik2 != null) {
                i = c1868400yik2.LLILZIL;
            } else {
                i = creatorNoticeResponse.resultTabId;
            }
        }
        List<NoticeTabModel> list = creatorNoticeResponse.tabDataModel;
        if (list != null) {
            if (!this.LLILZIL) {
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LJI("NotificationFragmentV2ViewModel", "initTabsAndNotice");
                if (enumC1900710zYr2 == null) {
                    enumC1900710zYr2 = creatorNoticeResponse.requestType;
                }
                Iterator<NoticeTabModel> it2 = list.iterator();
                int i3 = 0;
                while (true) {
                    NoticeTabModel noticeTabModel = null;
                    if (it2.hasNext()) {
                        NoticeTabModel next = it2.next();
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            next.index = i3;
                            i3 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    } else {
                        this.LLILLJJLI = new ArrayList(list);
                        Iterator<NoticeTabModel> it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            NoticeTabModel next2 = it3.next();
                            if (next2.tabId == i) {
                                noticeTabModel = next2;
                                break;
                            }
                        }
                        NoticeTabModel noticeTabModel2 = noticeTabModel;
                        if (noticeTabModel2 == null) {
                            noticeTabModel2 = (NoticeTabModel) C13LP.LJJJJZI(list);
                        }
                        setState(new AwS51S0301000_28(noticeTabModel2, (NoticeTabModel) enumC1900710zYr2, (EnumC1900710zYr) i, (int) list, (List<NoticeTabModel>) 1));
                        C1901660zaO c1901660zaO = new C1901660zaO();
                        c1901660zaO.LIZJ = "notification_page";
                        c1901660zaO.LJ = "go_back_tab";
                        c1901660zaO.LIZLLL = noticeTabModel2.trackingName;
                        c1901660zaO.LJI = noticeTabModel2.unReadCount;
                        c1901660zaO.LJII();
                        this.LLILZIL = true;
                    }
                }
            } else {
                int i5 = C2187451AjH.LIZ;
                C1720106oR.LJI("NotificationFragmentV2ViewModel", "updateTabList");
                if (enumC1900710zYr2 == null) {
                    enumC1900710zYr2 = creatorNoticeResponse.requestType;
                }
                zQ2(new C1900610zYh(i, enumC1900710zYr2, list));
            }
        }
        C1900620zYi.LIZ.put(Integer.valueOf(i), creatorNoticeResponse);
    }
}
