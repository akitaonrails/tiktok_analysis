package com.ss.android.ugc.aweme.inbox.bulletin.viewmodel;

import X.AbstractC1623806Xk;
import X.AbstractC19994813Le;
import X.C01GW;
import X.C036E;
import X.C09R9;
import X.C0C64;
import X.C0OI4;
import X.C0OIO;
import X.C0OIQ;
import X.C0OIR;
import X.C0OIS;
import X.C0OIT;
import X.C0OIU;
import X.C0OIV;
import X.C0OIW;
import X.C0OIY;
import X.C0OJR;
import X.C0OKY;
import X.C0OL5;
import X.C0OM6;
import X.C0ONE;
import X.C0ONJ;
import X.C0OOY;
import X.C0OPX;
import X.C0ORP;
import X.C0PEM;
import X.C0XQ7;
import X.C118300cf;
import X.C11JF;
import X.C13LE;
import X.C13LP;
import X.C1618770sE7;
import X.C1623606Xi;
import X.C1623706Xj;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2286608xc;
import X.C23250099c;
import X.C293310Beb;
import X.C452501pT;
import X.C491001vg;
import X.C605180NoS;
import X.C605400Noo;
import X.C605810NpT;
import X.C605820NpU;
import X.C617040OIc;
import X.C617090OIh;
import X.C617100OIi;
import X.C617110OIj;
import X.C617130OIl;
import X.C617220OIu;
import X.C617310OJd;
import X.C618910OPh;
import X.C844470XAv;
import X.C866950Xzh;
import X.EnumC604980No8;
import X.EnumC617010OHz;
import X.EnumC617060OIe;
import X.EnumC617480OJu;
import X.EnumC617610OKh;
import X.EnumC620170OUd;
import X.EnumC620430OVd;
import X.InterfaceC0148002o;
import X.InterfaceC420801kM;
import X.InterfaceC617070OIf;
import X.InterfaceC617160OIo;
import X.InterfaceC618620OOe;
import X.InterfaceC736910SvR;
import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinShareModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.ApplySkin;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountEditResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBizResourceEntryToggle;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinEmbeddedPublishContent;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFunctionSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPublishAction;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSettingList;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction;
import com.ss.android.ugc.aweme.notification.api.BulletinCommentSetting;
import com.ss.android.ugc.aweme.notification.api.EventExtra;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS24S0001000_9;
import kotlin.jvm.internal.AwS27S0000100_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS40S0301000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinProfileViewModel extends AssemViewModel<C0OKY> implements InterfaceC618620OOe, InterfaceC617160OIo {
    public static Pair<String, BulletinAccountEditResponse> LLJLLL;
    public Long LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public boolean LLIZLLLIL;
    public InterfaceC420801kM LLJ;
    public InterfaceC420801kM LLJI;
    public InterfaceC420801kM LLJIJIL;
    public InterfaceC420801kM LLJILJIL;
    public List<BulletinPublishAction> LLJILJILJ;
    public User LLJILLL;
    public Boolean LLJJ;
    public Boolean LLJJI;
    public Boolean LLJJIII;
    public Boolean LLJJIJI;
    public Boolean LLJJIJIIJIL;
    public List<BulletinBizResourceEntryToggle> LLJJIJIL;
    public Boolean LLJJJ;
    public boolean LLJJJJ;
    public ApplySkin LLJJJJJIL;
    public Boolean LLJJJJLIIL;
    public C0OI4 LLJLILLLLZIIL;
    public volatile boolean LLJLL;
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C0ONJ.class));
    public String LLILZIL = "";
    public String LLILZLL = "";
    public int LLIZ = -1;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(195));
    public final C0OIR LLJJL = new C0OIR();
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(196));
    public boolean LLJL = true;
    public final C01GW LLJLIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(197));
    public final C0OL5 LLJLLIL = new AbsDownloadListener() { // from class: X.0OL5
        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            int i;
            String mimeType;
            super.onSuccessed(downloadInfo);
            if (downloadInfo != null && (mimeType = downloadInfo.getMimeType()) != null && u.LJJIIJZLJL(mimeType, "image/", false)) {
                i = 2131828123;
            } else {
                i = 2131828163;
            }
            this.LL.setState(new AwS24S0001000_9(i, 2));
        }

        @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            int i;
            String mimeType;
            super.onFailed(downloadInfo, baseException);
            if (downloadInfo != null && (mimeType = downloadInfo.getMimeType()) != null && u.LJJIIJZLJL(mimeType, "image/", false)) {
                i = 2131828135;
            } else {
                i = 2131828136;
            }
            this.LL.setState(new AwS24S0001000_9(i, 1));
        }
    };

    @Override // X.InterfaceC618620OOe
    public final void LU0(BulletinBaseItem bulletinBaseItem, int i, String str, Map<String, String> map) {
    }

    @Override // X.InterfaceC618620OOe
    public final void YV(BulletinItem bulletinItem, BulletinBaseItem bulletinBaseItem, Map<String, String> map) {
    }

    @Override // X.InterfaceC618620OOe
    public final void eA2(BulletinBaseItem bulletinBaseItem) {
    }

    @Override // X.InterfaceC618620OOe
    public final void sp2(BulletinItem bulletinItem, BulletinBaseItem bulletinBaseItem, Map<String, String> map) {
    }

    public final InterfaceC736910SvR<C0OIU> DQ2() {
        return (InterfaceC736910SvR) this.LL.getValue();
    }

    public final boolean FQ2() {
        return this.LLJLILLLLZIIL != null;
    }

    public final boolean GQ2() {
        return ((Boolean) this.LLJJLIIIJLLLLLLLZ.getValue()).booleanValue();
    }

    public final boolean QQ2() {
        ArrayList arrayList;
        List<BulletinPublishAction> list = this.LLJILJILJ;
        if (list != null) {
            arrayList = new ArrayList();
            for (BulletinPublishAction bulletinPublishAction : list) {
                if (bulletinPublishAction.getPublishActionType() == EnumC620430OVd.POLL.getPostType()) {
                    arrayList.add(bulletinPublishAction);
                }
            }
        } else {
            arrayList = null;
        }
        return C866950Xzh.LIZIZ(arrayList);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0OKY(0);
    }

    @Override // X.InterfaceC617160OIo
    public final C617310OJd u51() {
        return (C617310OJd) this.LLJJJIL.getValue();
    }

    @Override // X.InterfaceC617160OIo
    public final C605820NpU vg0() {
        return (C605820NpU) this.LLJLIL.getValue();
    }

    public final String CQ2() {
        String str;
        if (!To() || ((str = this.LLILZIL) != null && !a0.LJJJIL(str))) {
            return this.LLILZIL;
        }
        String curUserId = C0XQ7.LJFF().getCurUserId();
        curUserId.toString();
        return curUserId;
    }

    public final int EQ2() {
        C0OJR c0ojr = (C0OJR) C13LP.LJJJLZIJ(0, getState().LLIZLLLIL.getBulletinAccountStatus());
        return c0ojr != null ? c0ojr.getStatus() : C0OJR.INVALID.getStatus();
    }

    public final int HQ2() {
        EnumC617060OIe enumC617060OIeLIZ = getState().LLILLJJLI.LIZ();
        if (enumC617060OIeLIZ == null) {
            enumC617060OIeLIZ = EnumC617060OIe.INVALID;
        }
        return enumC617060OIeLIZ.getValue();
    }

    public final int IE() {
        EnumC617060OIe enumC617060OIeLIZ = getState().LLILLJJLI.LIZ();
        if (enumC617060OIeLIZ == null) {
            return -1;
        }
        int i = C0OIW.LIZIZ[enumC617060OIeLIZ.ordinal()];
        if (i != 1) {
            return i == 2 ? 1 : -1;
        }
        return 0;
    }

    public final int JQ2() {
        return getState().LLILLL.getStatus();
    }

    @Override // X.InterfaceC617160OIo
    public final EnumC617480OJu Kf() {
        return getState().LLIZLLLIL;
    }

    public final void NQ2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinProfileViewModel initResource() - bulletinId = ");
        sbLIZ.append(this.LLILLJJLI);
        C0OPX.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        Long l = this.LLILLJJLI;
        if (l != null) {
            long jLongValue = l.longValue();
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            try {
                if (C036E.LIZ.LIZIZ()) {
                    if ((getState().LLJJJJJIL instanceof C1623706Xj) || (getState().LLJJJJJIL instanceof C491001vg)) {
                        return;
                    }
                    setState(AFwS240S0000000_9.get$arr$(352));
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C617090OIh(this, jLongValue, null), 2);
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C0OPX.LJIIJ("BulletinProfileViewModel initResource() getBulletinProfileInfo() network is unavailable");
            setState(AFwS240S0000000_9.get$arr$(351));
            u51().LJIIIZ("inspiration_card", EnumC620170OUd.FAIL, EnumC617610OKh.LOCAL_NETWORK_AVAILABLE.getStatusCode());
        }
    }

    @Override // X.InterfaceC617160OIo
    public final boolean Nl() {
        return getState().LLIZLLLIL == EnumC617480OJu.NOT_SUBSCRIBED;
    }

    public final boolean PQ2() {
        return getState().LLILLJJLI.LIZ() == EnumC617060OIe.IDENTITY_SUBSCRIBER;
    }

    @Override // X.InterfaceC617160OIo
    public final boolean To() {
        return getState().LLILLJJLI.LIZ() == EnumC617060OIe.IDENTITY_CREATOR;
    }

    public final void UQ2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinProfileViewModel refreshFromNetwork() - bulletinId = ");
        sbLIZ.append(this.LLILLJJLI);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        SQ2(false);
    }

    @Override // X.InterfaceC617160OIo
    public final Object Wz2() {
        return C2286608xc.LJFF(getState().LLJJIJIL);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C0OOY.LIZ.getClass();
        C0OOY.LJII.remove(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C0OOY.LIZ.getClass();
        C0OOY.LJII.add(this);
    }

    public final boolean q11() {
        int i = C0OIW.LIZ[getState().LLIZLLLIL.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    public final int qF() {
        return getState().LLILLL.getStatus();
    }

    public final void xQ2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("closeBulletin() - bulletinId = ");
        sbLIZ.append(this.LLILLJJLI);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        Long l = this.LLILLJJLI;
        if (l != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C0OIO(this, l.longValue(), null), 2);
        }
    }

    public final void yQ2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteBulletin() - bulletinId = ");
        sbLIZ.append(this.LLILLJJLI);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        Long l = this.LLILLJJLI;
        if (l != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C617130OIl(this, l.longValue(), null), 2);
        }
    }

    public final boolean OQ2(long j) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fe bbid");
        sbLIZ.append(j);
        sbLIZ.append("cur bb id:");
        sbLIZ.append(this.LLILLJJLI);
        C1720106oR.LJI("wwwzccc", C2188811AlT.LIZIZ(sbLIZ));
        Long l = this.LLILLJJLI;
        if (l != null && j == l.longValue()) {
            return true;
        }
        return false;
    }

    public final void RQ2(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinProfileViewModel onRefresh() - bulletinId = ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", dcSyncMode=");
        sbLIZ.append(FQ2());
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        if (FQ2()) {
            return;
        }
        SQ2(z);
    }

    public final void SQ2(boolean z) {
        Long l = this.LLILLJJLI;
        if (l != null) {
            long jLongValue = l.longValue();
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
            try {
                if (C036E.LIZ.LIZIZ()) {
                    if (FQ2()) {
                        setStateImmediate(AFwS240S0000000_9.get$arr$(358));
                    } else {
                        setStateImmediate(AFwS240S0000000_9.get$arr$(359));
                        if ((getState().LL instanceof C1623606Xi) && getState().LLIZLLLIL != EnumC617480OJu.UNINITIALIZED) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("BulletinProfileViewModel onRefresh() - useCache Wait Db, bulletinId = ");
                            sbLIZ.append(jLongValue);
                            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                        } else {
                            setState(AFwS240S0000000_9.get$arr$(360));
                        }
                    }
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C605180NoS(z, this, jLongValue, null), 2);
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("BulletinBoardProfileRepository", "getBulletinProfileInfo() network is unavailable");
            setState(AFwS240S0000000_9.get$arr$(357));
            C605400Noo c605400Noo = C605400Noo.LIZ;
            String strValueOf = String.valueOf(jLongValue);
            if (strValueOf == null) {
                strValueOf = "";
            }
            c605400Noo.getClass();
            C605400Noo.LIZ(strValueOf).LJIIIZ("account_info", EnumC620170OUd.FAIL, EnumC617610OKh.LOCAL_NETWORK_AVAILABLE.getStatusCode());
        }
    }

    public final void WQ2(BulletinBoardInfo bulletinBoardInfo) {
        ((C0OIU) DQ2().getOperator()).n(bulletinBoardInfo);
    }

    public final void YQ2(Context context) {
        Long l = this.LLILLJJLI;
        if (l != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C617110OIj(context, l.longValue(), this, null), 2);
        }
    }

    public final void ZQ2(BulletinBoardInfo bulletinBoardInfo) {
        if (FQ2()) {
            C0OI4 c0oi4 = this.LLJLILLLLZIIL;
            if (c0oi4 != null) {
                c0oi4.LJFF(new AwS588S0100000_9(bulletinBoardInfo, 226));
            }
            C0OPX.LJII("BBArch [ProfileVM] updatePageState(bulletinInfo) → DC write");
            return;
        }
        setState(new AwS588S0100000_9(bulletinBoardInfo, 227));
    }

    public final void aR2(Integer num) {
        EnumC617010OHz enumC617010OHzLIZIZ = C0OIV.LIZIZ(num);
        if (FQ2()) {
            C0OI4 c0oi4 = this.LLJLILLLLZIIL;
            if (c0oi4 != null) {
                c0oi4.LJFF(new AwS588S0100000_9(enumC617010OHzLIZIZ, 223));
            }
            C0OPX.LJII("BBArch [ProfileVM] updatePageState(subscriptionStatus) → DC write");
            return;
        }
        setStateImmediate(new AwS588S0100000_9(enumC617010OHzLIZIZ, 224));
        withState(new AwS588S0100000_9(this, 225));
    }

    public final void cR2(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSubscribeCount: ");
        sbLIZ.append(j);
        sbLIZ.append(", dcSyncMode=");
        sbLIZ.append(FQ2());
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        if (FQ2()) {
            C0OI4 c0oi4 = this.LLJLILLLLZIIL;
            if (c0oi4 != null) {
                c0oi4.LJFF(new AwS27S0000100_9(j, 1));
                return;
            }
            return;
        }
        setState(new AwS27S0000100_9(j, 0));
    }

    @Override // X.InterfaceC617160OIo
    public final void hx2(Boolean bool) {
        BulletinCommentSetting bulletinCommentSetting;
        if (!Intrinsics.LJFF(this.LLJJIJI, bool)) {
            this.LLJJIJI = bool;
            C0OIR c0oir = this.LLJJL;
            BulletinCommentSetting bulletinCommentSettingLIZIZ = c0oir.LIZIZ();
            if (bulletinCommentSettingLIZIZ == null || (bulletinCommentSetting = bulletinCommentSettingLIZIZ.copy(bool, bulletinCommentSettingLIZIZ.allowItemTypes)) == null) {
                bulletinCommentSetting = new BulletinCommentSetting(bool, null);
            }
            c0oir.LIZJ = bulletinCommentSetting;
            ((Keva) c0oir.LIZIZ.getValue()).storeString("key_comment_enable", GsonProtectorUtils.toJson((Gson) c0oir.LIZ.getValue(), bulletinCommentSetting));
            setState(new AwS588S0100000_9(bool, 524));
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                setState(new AwS588S0100000_9(bool, 528));
            }
        }
    }

    @Override // X.InterfaceC617160OIo
    public final void lD1(int i) {
        if (FQ2()) {
            C0OI4 c0oi4 = this.LLJLILLLLZIIL;
            if (c0oi4 != null) {
                c0oi4.LJFF(new AwS24S0001000_9(i, 3));
                return;
            }
            return;
        }
        if (!(getState().LLILLJJLI instanceof C1623606Xi)) {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_fix_identity_init_setting", true, true)) {
                C618910OPh.LIZ.getClass();
                AbstractC1623806Xk abstractC1623806XkLIZ = C618910OPh.LIZ(i);
                setState(new AwS588S0100000_9(abstractC1623806XkLIZ, (AbstractC1623806Xk<? extends Pair<? extends FileInputStream, String>>) 221));
                withState(new AwS375S0200000_9(abstractC1623806XkLIZ, (AbstractC1623806Xk<? extends EnumC617060OIe>) this, (BulletinProfileViewModel) 53));
            } else {
                C618910OPh.LIZ.getClass();
                AbstractC1623806Xk abstractC1623806XkLIZ2 = C618910OPh.LIZ(i);
                setStateImmediate(new AwS588S0100000_9(abstractC1623806XkLIZ2, (AbstractC1623806Xk<? extends Pair<? extends FileInputStream, String>>) 222));
                C23250099c.LIZLLL(getAssemVMScope(), null, null, new C605810NpT(abstractC1623806XkLIZ2, this, null), 3);
            }
        }
        C0OI4 c0oi42 = this.LLJLILLLLZIIL;
        if (c0oi42 != null) {
            c0oi42.LJFF(new AwS24S0001000_9(i, 4));
        }
    }

    @Override // X.InterfaceC618620OOe
    public final void ov0(long j) {
        String string;
        BulletinBoardInfo bulletinBoardInfoLIZ = getState().LL.LIZ();
        if (bulletinBoardInfoLIZ != null) {
            ZQ2(bulletinBoardInfoLIZ.copy(bulletinBoardInfoLIZ.bulletinId, bulletinBoardInfoLIZ.name, bulletinBoardInfoLIZ.avatarUrl, bulletinBoardInfoLIZ.description, bulletinBoardInfoLIZ.subscriberCount, bulletinBoardInfoLIZ.enableReply, Long.valueOf(j), bulletinBoardInfoLIZ.status, bulletinBoardInfoLIZ.reopenDeadline, bulletinBoardInfoLIZ.editQuota, bulletinBoardInfoLIZ.channelOwner, bulletinBoardInfoLIZ.accountType, bulletinBoardInfoLIZ.accountIcon));
            IBulletinBoardDataService iBulletinBoardDataService = (IBulletinBoardDataService) PluggableExtentionKt.pluggableSpi$default(IBulletinBoardDataService.class, false, false, false, 14, null);
            if (iBulletinBoardDataService != null) {
                Long l = this.LLILLJJLI;
                if (l == null || (string = l.toString()) == null) {
                    string = "";
                }
                iBulletinBoardDataService.LIZIZ(j, string);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vQ2(com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse r13) {
        /*
            r12 = this;
            r9 = r13
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo r10 = r9.accountInfo
            if (r10 != 0) goto L6
            return
        L6:
            r8 = r12
            java.lang.Long r0 = r8.LLILLJJLI
            if (r0 == 0) goto L6a
            long r6 = r0.longValue()
            r5 = 0
            r8.LLJL = r5
            com.ss.android.ugc.aweme.profile.model.User r0 = r10.channelOwner
            r8.LLJILLL = r0
            java.lang.String r1 = ""
            if (r0 == 0) goto L20
            java.lang.String r0 = r0.getUid()
            if (r0 != 0) goto L21
        L20:
            r0 = r1
        L21:
            r8.LLILZIL = r0
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r9.logPb
            if (r0 == 0) goto L2e
            java.lang.String r0 = r0.getImprId()
            if (r0 == 0) goto L2e
            r1 = r0
        L2e:
            r8.LLILZLL = r1
            com.ss.android.ugc.aweme.profile.model.User r0 = r10.channelOwner
            r4 = -1
            if (r0 == 0) goto L76
            int r3 = r0.getFollowStatus()
        L39:
            com.ss.android.ugc.aweme.profile.model.User r0 = r10.channelOwner
            if (r0 == 0) goto L74
            int r2 = r0.getFollowerStatus()
        L41:
            r1 = 1
            if (r3 == 0) goto L6f
            if (r3 == r1) goto L6d
            r0 = 2
            if (r3 == r0) goto L6b
            r0 = 4
            if (r3 == r0) goto L6f
        L4c:
            r8.LLIZ = r4
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSubscriptionInfo r0 = r9.subscriptionInfo
            if (r0 == 0) goto L54
            boolean r5 = r0.noNeedFollowOnSubscribe
        L54:
            r8.LLIZLLLIL = r5
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBizResourceEntryToggle> r0 = r9.bizResourceEntryToggle
            r8.LLJJIJIL = r0
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPublishAction> r0 = r9.plusPostSettingList
            r8.LLJILJILJ = r0
            kotlin.jvm.internal.AwS10S0300100_9 r5 = new kotlin.jvm.internal.AwS10S0300100_9
            r11 = 0
            r5.<init>(r6, r8, r9, r10, r11)
            r8.setState(r5)
            r8.WQ2(r10)
        L6a:
            return
        L6b:
            r4 = 2
            goto L4c
        L6d:
            r4 = 1
            goto L4c
        L6f:
            r4 = 0
            if (r2 != r1) goto L4c
            r4 = 3
            goto L4c
        L74:
            r2 = -1
            goto L41
        L76:
            r3 = -1
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel.vQ2(com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse):void");
    }

    public final Pair<String, String> zQ2(Context context) {
        List<String> list;
        ArrayList arrayList = new ArrayList();
        BulletinEmbeddedPublishContent bulletinEmbeddedPublishContent = getState().LLJJJIL;
        if (bulletinEmbeddedPublishContent != null && (list = bulletinEmbeddedPublishContent.textHintList) != null) {
            for (String str : list) {
                if (str != null && (!a0.LJJJIL(str))) {
                    arrayList.add(new Pair("topic_from_server", str));
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new Pair("bulletinBoardTextBulletinGuidance_writeBulletinPage_desc1", context.getString(2131827972)));
            arrayList.add(new Pair("bulletinBoardTextBulletinGuidance_writeBulletinPage_desc2", context.getString(2131827979)));
            arrayList.add(new Pair("bulletinBoardTextBulletinGuidance_writeBulletinPage_desc3", context.getString(2131827980)));
            arrayList.add(new Pair("bulletinBoardTextBulletinGuidance_writeBulletinPage_desc4", context.getString(2131827981)));
            arrayList.add(new Pair("bulletinBoardTextBulletinGuidance_writeBulletinPage_desc5", context.getString(2131827982)));
            arrayList.add(new Pair("bulletinBoardTextBulletinGuidance_writeBulletinPage_desc6", context.getString(2131827983)));
            arrayList.add(new Pair("bulletinBoardTextBulletinGuidance_writeBulletinPage_desc7", context.getString(2131827984)));
            arrayList.add(new Pair("bulletinBoardTextBulletinGuidance_writeBulletinPage_desc8", context.getString(2131827985)));
            arrayList.add(new Pair("bulletinBoardTextBulletinGuidance_writeBulletinPage_desc9", context.getString(2131827986)));
            arrayList.add(new Pair("bulletinBoardTextBulletinGuidance_writeBulletinPage_desc10", context.getString(2131827973)));
            arrayList.add(new Pair("bulletinBoardTextBulletinGuidance_writeBulletinPage_desc11", context.getString(2131827974)));
            arrayList.add(new Pair("bulletinBoardTextBulletinGuidance_writeBulletinPage_desc12", context.getString(2131827975)));
            arrayList.add(new Pair("bulletinBoardTextBulletinGuidance_writeBulletinPage_desc13", context.getString(2131827976)));
            arrayList.add(new Pair("bulletinBoardTextBulletinGuidance_writeBulletinPage_desc14", context.getString(2131827977)));
            arrayList.add(new Pair("bulletinBoardTextBulletinGuidance_writeBulletinPage_desc15", context.getString(2131827978)));
        }
        return (Pair) C13LP.LJLJJI(arrayList, AbstractC19994813Le.Default);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQ2(long r14, X.InterfaceC1364105Vn<? super kotlin.Pair<com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse, java.lang.Boolean>> r16) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel.AQ2(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(long r13, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof X.C606060Nps
            if (r0 == 0) goto L97
            r11 = r15
            X.0Nps r11 = (X.C606060Nps) r11
            int r2 = r11.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L97
            int r2 = r2 - r1
            r11.LLILZ = r2
        L12:
            java.lang.Object r1 = r11.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r11.LLILZ
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L31
            if (r0 == r4) goto L65
            if (r0 != r3) goto L9e
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse r4 = r11.LL
            X.C155000ia.LIZIZ(r1)
        L27:
            r0 = 361(0x169, float:5.06E-43)
            kotlin.jvm.internal.AFwS240S0000000_9 r0 = kotlin.jvm.internal.AFwS240S0000000_9.get$arr$(r0)
            r12.setStateImmediate(r0)
        L30:
            return r4
        L31:
            X.C155000ia.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getBulletin AccountInfo from Server; bbId:"
            r1.append(r0)
            r6 = r13
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C0OPX.LJII(r0)
            X.0SvR r0 = r12.DQ2()
            X.00hg r5 = r0.getOperator()
            X.0OIU r5 = (X.C0OIU) r5
            X.0Nol r0 = X.EnumC605370Nol.ACCOUNT_INFO_LOAD_TYPE_DEFAULT
            int r8 = r0.getType()
            java.lang.String r9 = r12.LLILLL
            java.lang.String r10 = r12.LLILZ
            r11.LLILZ = r4
            java.lang.Object r1 = r5.LJJLIIIJLLLLLLLZ(r6, r8, r9, r10, r11)
            if (r1 != r2) goto L68
            return r2
        L65:
            X.C155000ia.LIZIZ(r1)
        L68:
            r4 = r1
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse r4 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse) r4
            if (r4 == 0) goto L90
            int r0 = r4.statusCode
            if (r0 != 0) goto L90
        L71:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBoardInfo r0 = r4.accountInfo
            if (r0 == 0) goto L30
            java.lang.Class<com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService> r5 = com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService.class
            r6 = 0
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService r0 = (com.ss.android.ugc.aweme.inbox.bulletin.core.service.IBulletinBoardDataService) r0
            if (r0 == 0) goto L27
            r11.LL = r4
            r11.LLILZ = r3
            java.lang.Object r0 = r0.LJIIJJI(r4, r11)
            if (r0 != r2) goto L27
            return r2
        L90:
            r1 = 0
            r0 = 0
            if (r1 == 0) goto La6
            if (r4 == 0) goto L30
            goto L71
        L97:
            X.0Nps r11 = new X.0Nps
            r11.<init>(r12, r15)
            goto L12
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel.BQ2(long, X.05Vn):java.lang.Object");
    }

    public final void MQ2(BulletinAccountEditResponse bulletinAccountEditResponse, int i) {
        Boolean boolValueOf;
        String uid;
        if (FQ2()) {
            C0OI4 c0oi4 = this.LLJLILLLLZIIL;
            if (c0oi4 != null) {
                c0oi4.LJFF(AFwS240S0000000_9.get$arr$(368));
            }
        } else {
            setStateImmediate(AFwS240S0000000_9.get$arr$(369));
        }
        BulletinBoardInfo bulletinBoardInfo = bulletinAccountEditResponse.accountInfo;
        if (bulletinBoardInfo != null) {
            this.LLILLJJLI = Long.valueOf(bulletinBoardInfo.bulletinId);
            lD1(i);
            if (C293310Beb.LJ(EnumC617060OIe.Companion.LIZIZ(i), bulletinAccountEditResponse.commentEnable)) {
                setState(AFwS240S0000000_9.get$arr$(370));
            }
            this.LLJJ = bulletinAccountEditResponse.liveManagementEnable;
            this.LLJJI = bulletinAccountEditResponse.liveRoomAutoShareEnable;
            this.LLJJIII = bulletinAccountEditResponse.liveEventAutoShareEnable;
            this.LLJILJILJ = bulletinAccountEditResponse.plusPostSettingList;
            BulletinFunctionSetting bulletinFunctionSettingLIZ = C617100OIi.LIZ(bulletinAccountEditResponse.bulletinFunctionSettings);
            if (bulletinFunctionSettingLIZ != null) {
                int i2 = bulletinFunctionSettingLIZ.status;
                boolean z = true;
                if (i2 != 1) {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            } else {
                boolValueOf = null;
            }
            this.LLJJJ = boolValueOf;
            BulletinShareModel bulletinShareModelWQ2 = wQ2(bulletinBoardInfo, bulletinAccountEditResponse.contentPb, bulletinAccountEditResponse.shareUrl, i, null);
            if (FQ2()) {
                C0OI4 c0oi42 = this.LLJLILLLLZIIL;
                if (c0oi42 != null) {
                    c0oi42.LJFF(new AwS375S0200000_9(bulletinBoardInfo, bulletinShareModelWQ2, 55));
                }
                C0OPX.LJII("BBArch [ProfileVM] initBulletinBoardInfoFromCreate → DC write");
                setState(new AwS40S0301000_9(this, bulletinBoardInfo, bulletinAccountEditResponse, i, 0));
            } else {
                setState(new C0OIS(bulletinBoardInfo, this, bulletinAccountEditResponse, i, bulletinShareModelWQ2));
            }
            WQ2(bulletinBoardInfo);
            User user = bulletinBoardInfo.channelOwner;
            this.LLJILLL = user;
            if (user == null || (uid = user.getUid()) == null) {
                uid = "";
            }
            this.LLILZIL = uid;
            this.LLJJIJIL = bulletinAccountEditResponse.bizResourceEntryToggle;
        }
    }

    public final void TQ2(C617220OIu c617220OIu, InterfaceC617070OIf interfaceC617070OIf) {
        InboxEntranceFunction inboxEntranceFunction;
        String str;
        int i;
        if (c617220OIu == null || (inboxEntranceFunction = c617220OIu.LL) == null || (str = c617220OIu.LLILLL) == null) {
            return;
        }
        if (interfaceC617070OIf != null) {
            interfaceC617070OIf.LIZJ();
        }
        int i2 = inboxEntranceFunction.actionStatus;
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        int i3 = inboxEntranceFunction.functionType;
        C0ORP c0orp = C0ORP.MUTE;
        int i4 = 1;
        if (i3 == c0orp.getType()) {
            if (i2 == 1) {
                i = 6;
                i4 = 0;
            } else {
                i = 5;
            }
            c118300cf.element = i4;
            InterfaceC420801kM interfaceC420801kM = this.LLJ;
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
        } else if (i3 == C0ORP.PIN.getType()) {
            if (i2 == 1) {
                i = 2;
                i4 = 0;
            } else {
                i = 1;
            }
            c118300cf.element = i4;
            InterfaceC420801kM interfaceC420801kM2 = this.LLJI;
            if (interfaceC420801kM2 != null) {
                interfaceC420801kM2.dispose();
            }
        } else if (i3 == C0ORP.ARCHIVE.getType()) {
            if (i2 == 1) {
                i = 8;
                i4 = 0;
            } else {
                i = 7;
            }
            c118300cf.element = i4;
            InterfaceC420801kM interfaceC420801kM3 = this.LLJIJIL;
            if (interfaceC420801kM3 != null) {
                interfaceC420801kM3.dispose();
            }
        } else {
            return;
        }
        C11JF c11jfLLJ = ((C0OIU) DQ2().getOperator()).LLJ(c617220OIu.LLILLJJLI, str, i, new C0OIY(i2, this, c617220OIu, inboxEntranceFunction, str, c118300cf), new AwS553S0100000_9(interfaceC617070OIf, 827));
        int i5 = inboxEntranceFunction.functionType;
        if (i5 == c0orp.getType()) {
            this.LLJ = c11jfLLJ;
            return;
        }
        if (i5 == C0ORP.PIN.getType()) {
            this.LLJI = c11jfLLJ;
        } else if (i5 == C0ORP.ARCHIVE.getType()) {
            this.LLJIJIL = c11jfLLJ;
        } else {
            c11jfLLJ.dispose();
        }
    }

    public final void bR2(BulletinAccountInfoResponse bulletinAccountInfoResponse, BulletinSettingList bulletinSettingList) {
        List<BulletinSetting> list;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        List<BulletinFunctionSetting> list2;
        Boolean boolLIZIZ;
        Boolean boolLIZIZ2;
        Boolean boolLIZIZ3;
        Boolean boolLIZIZ4;
        Boolean boolValueOf = null;
        if (bulletinSettingList != null) {
            list = bulletinSettingList.settings;
        } else {
            list = null;
        }
        boolean z = false;
        if (C866950Xzh.LIZIZ(list)) {
            if (bulletinSettingList != null) {
                boolLIZIZ = C617100OIi.LIZIZ(bulletinSettingList, EnumC604980No8.BULLETIN_SETTING_TYPE_AUTO_SHARE_LIVE_ROOM);
            } else {
                boolLIZIZ = null;
            }
            this.LLJJI = boolLIZIZ;
            if (bulletinSettingList != null) {
                boolLIZIZ2 = C617100OIi.LIZIZ(bulletinSettingList, EnumC604980No8.BULLETIN_SETTING_TYPE_AUTO_SHARE_LIVE_EVENT);
            } else {
                boolLIZIZ2 = null;
            }
            this.LLJJIII = boolLIZIZ2;
            if (bulletinSettingList != null) {
                boolLIZIZ3 = C617100OIi.LIZIZ(bulletinSettingList, EnumC604980No8.BULLETIN_SETTING_TYPE_AUTO_SHARE_POST);
            } else {
                boolLIZIZ3 = null;
            }
            this.LLJJJ = boolLIZIZ3;
            if (this.LLJJI != null || this.LLJJIII != null) {
                z = true;
            }
            this.LLJJ = Boolean.valueOf(z);
            if (bulletinSettingList != null) {
                boolLIZIZ4 = C617100OIi.LIZIZ(bulletinSettingList, EnumC604980No8.BULLETIN_SETTING_TYPE_CHANNEL_COMMENT);
            } else {
                boolLIZIZ4 = null;
            }
            this.LLJJIJI = boolLIZIZ4;
            this.LLJJL.LIZJ(bulletinSettingList);
            if (bulletinSettingList != null) {
                boolValueOf = C617100OIi.LIZIZ(bulletinSettingList, EnumC604980No8.BULLETIN_SETTING_TYPE_CHANNEL_ALLOW_DOWNLOAD_VIDEO);
            }
            this.LLJJIJIIJIL = boolValueOf;
            return;
        }
        if (bulletinAccountInfoResponse != null) {
            bool = bulletinAccountInfoResponse.liveManagementEnable;
        } else {
            bool = null;
        }
        this.LLJJ = bool;
        if (bulletinAccountInfoResponse != null) {
            bool2 = bulletinAccountInfoResponse.liveRoomAutoShareEnable;
        } else {
            bool2 = null;
        }
        this.LLJJI = bool2;
        if (bulletinAccountInfoResponse != null) {
            bool3 = bulletinAccountInfoResponse.liveEventAutoShareEnable;
        } else {
            bool3 = null;
        }
        this.LLJJIII = bool3;
        if (bulletinAccountInfoResponse != null) {
            list2 = bulletinAccountInfoResponse.bulletinFunctionSettings;
        } else {
            list2 = null;
        }
        BulletinFunctionSetting bulletinFunctionSettingLIZ = C617100OIi.LIZ(list2);
        if (bulletinFunctionSettingLIZ != null) {
            if (bulletinFunctionSettingLIZ.status == 1) {
                z = true;
            }
            boolValueOf = Boolean.valueOf(z);
        }
        this.LLJJJ = boolValueOf;
    }

    @Override // X.InterfaceC618620OOe
    public final String sL0(boolean z, boolean z2) {
        int i;
        Boolean bool;
        Long l = this.LLILLJJLI;
        if (l != null) {
            long jLongValue = l.longValue();
            boolean z3 = false;
            if (C617040OIc.LIZ() && this.LLJJJ != null) {
                z3 = true;
            }
            if (To()) {
                i = 10;
            } else {
                i = 15;
            }
            StringBuilder sb = new StringBuilder("aweme://inbox/bulletin_board/setting_child?title=");
            sb.append(C1618770sE7.LIZJ(2131828031));
            sb.append("&live_management_enable=");
            sb.append(this.LLJJ);
            sb.append("&live_room_auto_share_enable=");
            sb.append(this.LLJJI);
            sb.append("&live_event_auto_share_enable=");
            sb.append(this.LLJJIII);
            sb.append("&has_post_auto_share=");
            sb.append(z3);
            sb.append("&post_auto_share_need_highlight=");
            sb.append(z);
            sb.append("&comment_enable=");
            Boolean bool2 = null;
            if (!To() || (bool = this.LLJJIJI) == null) {
                bool = null;
            }
            sb.append(bool);
            sb.append("&download_enable=");
            if (To()) {
                bool2 = this.LLJJIJIIJIL;
            }
            sb.append(bool2);
            sb.append("&comment_need_highlight=");
            sb.append(z2);
            sb.append("&entrance_id=");
            sb.append(i);
            sb.append("&entrance_key=");
            sb.append(jLongValue);
            sb.append("&bulletin_board_id=");
            sb.append(jLongValue);
            sb.append("&mob_identity_type=");
            sb.append(IE());
            return sb.toString();
        }
        return "";
    }

    public final void VQ2(C0OM6 c0om6, C0ONE c0one, List<EventExtra> list) {
        Long l = this.LLILLJJLI;
        if (l != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C0OIT(this, l.longValue(), c0om6, c0one, list, null), 2);
        }
    }

    public final void KQ2(long j, String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinProfileViewModel init() - bulletinId = ");
        sbLIZ.append(j);
        sbLIZ.append(", dcSessionId=");
        sbLIZ.append(str3);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI = Long.valueOf(j);
        if (str != null) {
            this.LLILLL = str;
        }
        if (str2 != null) {
            this.LLILZ = str2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LQ2(com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse r14, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSettingList r15, long r16, boolean r18) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel.LQ2(com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse, com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSettingList, long, boolean):void");
    }

    public final void XQ2(Context context, String str, String str2, Function1<? super Boolean, Unit> function1) {
        Long l = this.LLILLJJLI;
        if (l != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C0OIQ(this, context, l.longValue(), str, str2, function1, null), 2);
        }
    }

    public static BulletinShareModel wQ2(BulletinBoardInfo bulletinBoardInfo, String str, String str2, int i, Integer num) {
        if (str2 != null && str2.length() != 0 && str != null && str.length() != 0) {
            String strValueOf = String.valueOf(bulletinBoardInfo.bulletinId);
            String str3 = bulletinBoardInfo.name;
            String str4 = bulletinBoardInfo.description;
            if (str4 == null) {
                str4 = "";
            }
            return new BulletinShareModel(strValueOf, str3, str4, str2, str, bulletinBoardInfo, i, num);
        }
        C0OPX.LJIIIIZZ("can't build ShareModel");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC1891350zJl> IQ2(long r30, java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFunctionSetting> r32, java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction> r33, java.lang.Long r34, java.lang.Integer r35, java.lang.Integer r36) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel.IQ2(long, java.util.List, java.util.List, java.lang.Long, java.lang.Integer, java.lang.Integer):java.util.List");
    }
}
