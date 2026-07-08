package com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0DXR;
import X.C0OLV;
import X.C0OPQ;
import X.C0OPT;
import X.C0OU6;
import X.C0OVY;
import X.C1220000hqw;
import X.C1227904rF;
import X.C1389880mGw;
import X.C13LE;
import X.C14EU;
import X.C1529590puH;
import X.C1537060q6K;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1578630rBN;
import X.C1618770sE7;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C19EG;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C290760BaU;
import X.C443090HZb;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C618910OPh;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.EnumC620430OVd;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.creative.model.CollectMusicModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.HighLightVideoParametersModel;
import com.ss.android.ugc.aweme.creative.model.ProfileParametersModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinQuickPostCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollCreateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPublishViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinPostTypeAbility;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS658S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCreatorEditAssem extends BulletinBottomBaseAssem implements BulletinPostTypeAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJI;
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(136));
    public final C1559260qg8 LLJJIJI = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJJIJIIJIL;
    public final C736950SvV LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C736950SvV LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public final List<C443090HZb> LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinCreatorEditAssem.class, "publishVm", "getPublishVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinPublishViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BulletinCreatorEditAssem.class, "listVm", "getListVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinListViewModel;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1276376500) {
            return null;
        }
        return this;
    }

    public BulletinCreatorEditAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 339);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinProfileViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(202);
        AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9((AbstractC738140SxQ) this, 342);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJIJIIJIL = new C736950SvV(c19719912DlLIZ, awS553S0100000_9, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS240S0000000_9, awS553S0100000_92, c451610HnL, c723700Sa8);
        this.LLJJIJIL = new C736950SvV(C13LE.LIZ(BulletinEditViewModel.class), new AwS553S0100000_9(this, 333), c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(203), new AwS553S0100000_9((AbstractC738140SxQ) this, 343), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 337));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 332));
        this.LLJJJJ = new C736950SvV(C13LE.LIZ(BulletinPollCreateViewModel.class), new AwS553S0100000_9(this, 338), c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(204), new AwS553S0100000_9((AbstractC738140SxQ) this, 331), new C451610HnL(this, true, true), new C723700Sa8(this));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinPublishViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 340), AFwS240S0000000_9.get$arr$(200), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(BulletinListViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ3, 341), AFwS240S0000000_9.get$arr$(201), null, true);
        this.LLJJL = true;
        this.LLJJLIIIJLLLLLLLZ = C1697810uHb.LJIILJJIL(new C443090HZb(C1618770sE7.LIZJ(2131828058), new AwS553S0100000_9(this, 334), R.raw.icon_camera, null, 0, null, 0, false, false, null, 1016), new C443090HZb(C1618770sE7.LIZJ(2131828059), new AwS553S0100000_9(this, 335), R.raw.icon_image_square, null, 0, null, 0, false, false, null, 1016), new C443090HZb(C1618770sE7.LIZJ(2131828060), new AwS553S0100000_9(this, 336), R.raw.icon_post, null, 0, null, 0, false, false, null, 1016));
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinPostTypeAbility
    public final boolean Lq() {
        if (!this.LLJJL) {
            return false;
        }
        this.LLJJL = false;
        return true;
    }

    public final C0OLV kp() {
        return (C0OLV) this.LLJJIJI.getValue();
    }

    public final BulletinEditViewModel lp() {
        return (BulletinEditViewModel) this.LLJJIJIL.getValue();
    }

    public final boolean mp() {
        return ((Boolean) this.LLJJIII.getValue()).booleanValue();
    }

    public final BulletinProfileViewModel op() {
        return (BulletinProfileViewModel) this.LLJJIJIIJIL.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv sp() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.snk) : null;
            this.LLJJI = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final void AK() {
        String str;
        C0OLV c0olvKp = kp();
        if (c0olvKp != null && (str = c0olvKp.LL) != null) {
            C0OPQ.LIZ.getClass();
            C0OPQ.LJJIL(str);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1389880mGw c1389880mGw = new C1389880mGw(fragmentLJI);
            c1389880mGw.LJIIIZ(C1618770sE7.LIZJ(2131828055));
            c1389880mGw.LJIIJ();
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return mp() ? R.layout.a5x : R.layout.a5w;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinBottomBaseAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        if (C290760BaU.LIZ()) {
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            C1537060q6K.LJIILL("bulletin_live_event_page");
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    public final void Bp(String str) {
        C0OLV c0olvKp = kp();
        if (c0olvKp != null) {
            C0OPQ c0opq = C0OPQ.LIZ;
            String str2 = c0olvKp.LL;
            Pair[] pairArr = new Pair[2];
            String str3 = c0olvKp.LLILLJJLI;
            if (str3 == null) {
                str3 = "";
            }
            pairArr[0] = new Pair("previous_page", str3);
            pairArr[1] = new Pair("enter_method", str);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            c0opq.getClass();
            C0OPQ.LJIIJ(str2, mapLJIIIIZZ);
        }
    }

    public final void Ep(String str) {
        C0OLV c0olvKp = kp();
        if (c0olvKp != null) {
            C0OPQ c0opq = C0OPQ.LIZ;
            String str2 = c0olvKp.LL;
            Pair[] pairArr = new Pair[2];
            String str3 = c0olvKp.LLILLJJLI;
            if (str3 == null) {
                str3 = "";
            }
            pairArr[0] = new Pair("previous_page", str3);
            pairArr[1] = new Pair("enter_method", str);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            c0opq.getClass();
            C0OPQ.LJJJIL(str2, mapLJIIIIZZ);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvSp = sp();
        if (viewOnAttachStateChangeListenerC20604515jvSp != null) {
            viewOnAttachStateChangeListenerC20604515jvSp.LJIILJJIL(BulletinQuickPostCell.class);
            viewOnAttachStateChangeListenerC20604515jvSp.setAnimation(null);
            viewOnAttachStateChangeListenerC20604515jvSp.setOrientation(0);
            viewOnAttachStateChangeListenerC20604515jvSp.addItemDecoration(new C0DXR() { // from class: X.0OZY
                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    int itemCount = 0;
                    boolean z = true;
                    if (recyclerView.getLayoutDirection() != 1) {
                        z = false;
                    }
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                    if (childAdapterPosition == 0) {
                        if (z) {
                            rect.right = C1338790kwX.LIZ(12.0f);
                            return;
                        } else {
                            rect.left = C1338790kwX.LIZ(12.0f);
                            return;
                        }
                    }
                    AbstractC21673619ry adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        itemCount = adapter.getItemCount();
                    }
                    if (childAdapterPosition == itemCount - 1) {
                        if (z) {
                            rect.left = C1338790kwX.LIZ(12.0f);
                            rect.right = C1338790kwX.LIZ(8.0f);
                            return;
                        } else {
                            rect.left = C1338790kwX.LIZ(8.0f);
                            rect.right = C1338790kwX.LIZ(12.0f);
                            return;
                        }
                    }
                    if (z) {
                        rect.right = C1338790kwX.LIZ(8.0f);
                    } else {
                        rect.left = C1338790kwX.LIZ(8.0f);
                    }
                }
            });
        }
        AssemViewModel.asyncSubscribe$default(op(), new C2217381BqS() { // from class: X.0OVf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LL;
            }
        }, this, null, null, null, new AwS588S0100000_9(this, 129), 28, null);
        C736680Sv4.LJIIIZ(this, op(), new C2217381BqS() { // from class: X.0OVg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLILZIL;
            }
        }, new C2217381BqS() { // from class: X.0OVh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLILZLL;
            }
        }, null, new AwS658S0100000_9(this, 6), 12);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void showTemplatePost(C0OVY c0ovy) {
        String str;
        if (!C0OU6.LIZ() || !C1578630rBN.LJIIJ(this) || !op().OQ2(c0ovy.LIZ)) {
            return;
        }
        if (!this.LLJJJJLIIL) {
            AK();
            return;
        }
        C618910OPh.LIZ.getClass();
        ((LinkedHashMap) C618910OPh.LIZLLL).clear();
        for (Map.Entry<String, Object> entry : c0ovy.LIZLLL.entrySet()) {
            if ((!a0.LJJJIL(entry.getKey())) && (true ^ a0.LJJJIL(entry.getValue().toString()))) {
                C618910OPh.LIZ.getClass();
                C618910OPh.LIZLLL.put(entry.getKey(), entry.getValue().toString());
            }
        }
        int i = c0ovy.LIZIZ;
        if (i != EnumC620430OVd.IMAGE_UPLOAD.getPostType() && i != EnumC620430OVd.VIDEO_UPLOAD.getPostType()) {
            String str2 = null;
            Object obj = null;
            if (i == EnumC620430OVd.AWEME_POST.getPostType()) {
                Object obj2 = c0ovy.LIZJ.get("unique_key");
                if (obj2 instanceof String) {
                    obj = obj2;
                }
                zp(C2097908Jt.LIZJ(new Pair("unique_key", obj)), true);
                return;
            }
            if (i == EnumC620430OVd.CAMERA.getPostType()) {
                yp(true);
                return;
            }
            if (i == EnumC620430OVd.POLL.getPostType()) {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                Map<String, Object> map = c0ovy.LIZJ;
                c1227904rF.getClass();
                tp(C1227904rF.LJI(map), true);
                return;
            }
            if (i == EnumC620430OVd.TEXT.getPostType()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(c0ovy.LIZLLL);
                linkedHashMap.putAll(c0ovy.LIZJ);
                Ap(linkedHashMap, false);
                return;
            }
            Uri.Builder builderBuildUpon = UriProtector.parse(String.valueOf(c0ovy.LIZJ.get("post_schema"))).buildUpon();
            C0OLV c0olvKp = kp();
            if (c0olvKp == null || (str = c0olvKp.LLILLJJLI) == null) {
                str = "";
            }
            builderBuildUpon.appendQueryParameter("enter_from", str).appendQueryParameter("bulletin_quota", String.valueOf(op().getState().LLJJIJIL)).appendQueryParameter("bulletin_board_id", String.valueOf(c0ovy.LIZ));
            for (Map.Entry<String, Object> entry2 : c0ovy.LIZJ.entrySet()) {
                String key = entry2.getKey();
                String string = entry2.getValue().toString();
                if ((!a0.LJJJIL(key)) && (!a0.LJJJIL(string)) && !Intrinsics.LJFF(key, "post_schema")) {
                    builderBuildUpon.appendQueryParameter(key, string);
                }
            }
            for (Map.Entry<String, Object> entry3 : c0ovy.LIZLLL.entrySet()) {
                String key2 = entry3.getKey();
                String string2 = entry3.getValue().toString();
                if ((!a0.LJJJIL(key2)) && (!a0.LJJJIL(string2))) {
                    builderBuildUpon.appendQueryParameter(key2, string2);
                }
            }
            if (c0ovy.LIZIZ == EnumC620430OVd.LIVE_EVENT.getPostType()) {
                Object obj3 = c0ovy.LIZJ.get("unique_key");
                if (obj3 instanceof String) {
                    str2 = (String) obj3;
                }
                builderBuildUpon.appendQueryParameter("bb_inspiration_card_key", str2);
            }
            SmartRouter.buildRoute(LJJIJL().getContext(), builderBuildUpon.build().toString()).open();
            return;
        }
        up(true);
    }

    public final void up(boolean z) {
        final C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(c19egLIZ, "bulletin_board", new IExternalService.ServiceLoadCallback() { // from class: X.0OlK
                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onDismiss() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onFailed() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onOK() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    if (this.LIZ.mp()) {
                        asyncAVService.uiService().recordService().openBulletinAlbumForSingleMedia(c19egLIZ);
                    } else {
                        asyncAVService.uiService().recordService().openBulletinAlbum(c19egLIZ);
                    }
                }
            });
            if (mp()) {
                Bp("album");
            } else if (z) {
                Bp("quick_upload");
            } else {
                Ep("upload");
            }
        }
    }

    public final void yp(boolean z) {
        final C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(c19egLIZ, "bulletin_board", new IExternalService.ServiceLoadCallback() { // from class: X.15M6
                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onDismiss() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onFailed() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onOK() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    CreativeInitialModel creativeInitialModel = new CreativeInitialModel(new ProfileParametersModel(""), new DMCameraModel(false, null, "", false, false, false, "", null, -1, false, 0, "", -1, "", "", false, false, null, false, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, true, false, "", null, null, 0L, false, null, null, null, null), null, null, null, null, null, null, new HighLightVideoParametersModel(null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, false, false, 2097151, null), null, null, null, null, null, null, null, null, null, null, null, null, new CollectMusicModel(null, false, false, false, false, null));
                    DMCameraModel dMCameraModel = creativeInitialModel.dmCameraModel;
                    dMCameraModel.enterFromDM = true;
                    dMCameraModel.isBulletin = true;
                    IRecordService iRecordServiceRecordService = asyncAVService.uiService().recordService();
                    C19EG c19eg = c19egLIZ;
                    RecordConfig.Builder builder = new RecordConfig.Builder();
                    builder.shootWay("chat_shoot");
                    builder.initialInputModel(creativeInitialModel);
                    iRecordServiceRecordService.startRecord(c19eg, builder.build());
                }
            });
            if (z) {
                Bp("quick_camera");
            } else {
                Ep("camera");
            }
        }
    }

    public final void Ap(Map<String, ? extends Object> map, boolean z) {
        String str;
        String str2;
        BulletinEditViewModel bulletinEditViewModelLp = lp();
        C0OLV c0olvKp = kp();
        String str3 = null;
        if (c0olvKp != null) {
            str = c0olvKp.LL;
        } else {
            str = null;
        }
        bulletinEditViewModelLp.LLILZLL = str;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "aweme://inbox/bulletin_board/post_text");
        C0OLV c0olvKp2 = kp();
        if (c0olvKp2 != null) {
            str2 = c0olvKp2.LL;
        } else {
            str2 = null;
        }
        smartRouteBuildRoute.withParam("bulletin_board_id", str2);
        C0OLV c0olvKp3 = kp();
        if (c0olvKp3 != null) {
            str3 = c0olvKp3.LLILLJJLI;
        }
        smartRouteBuildRoute.withParam("previous_page", str3);
        if (!z) {
            smartRouteBuildRoute.withParam("inspirational_content", LJJIJL().getContext().getString(2131828120));
        }
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            if ((!a0.LJJJIL(entry.getKey())) && (true ^ a0.LJJJIL(entry.getValue().toString()))) {
                smartRouteBuildRoute.withParam(entry.getKey(), entry.getValue().toString());
            }
        }
        smartRouteBuildRoute.open();
        C0OLV c0olvKp4 = kp();
        if (c0olvKp4 != null) {
            C0OPQ c0opq = C0OPQ.LIZ;
            String str4 = c0olvKp4.LL;
            Pair[] pairArr = new Pair[2];
            String str5 = c0olvKp4.LLILLJJLI;
            if (str5 == null) {
                str5 = "";
            }
            pairArr[0] = new Pair("previous_page", str5);
            pairArr[1] = new Pair("enter_method", "write");
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            c0opq.getClass();
            C0OPQ.LJIIJ(str4, mapLJIIIIZZ);
        }
    }

    public final void tp(String str, boolean z) {
        String str2;
        String str3;
        if (z) {
            str2 = "quick_vote";
        } else {
            str2 = "vote";
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C724240Sb0.LJI(this), "aweme://inbox/bulletin_board/post_poll");
        C0OLV c0olvKp = kp();
        String str4 = null;
        if (c0olvKp != null) {
            str3 = c0olvKp.LL;
        } else {
            str3 = null;
        }
        smartRouteBuildRoute.withParam("bulletin_board_id", str3);
        C0OLV c0olvKp2 = kp();
        if (c0olvKp2 != null) {
            str4 = c0olvKp2.LLILLJJLI;
        }
        smartRouteBuildRoute.withParam("previous_page", str4);
        smartRouteBuildRoute.withParam("enter_method", str2);
        if (str != null && (!a0.LJJJIL(str)) && C0OU6.LIZ()) {
            smartRouteBuildRoute.withParam("bulletin_template_poll_content", str);
        }
        smartRouteBuildRoute.open();
        if (z) {
            Bp(str2);
        } else {
            Ep(str2);
        }
        C0OPT.LIZ.getClass();
        C0OPT.LIZIZ();
    }

    public final void zp(Map map, boolean z) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C724240Sb0.LJI(this), "//im/bulletin_board/open_share_video_panel");
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    smartRouteBuildRoute.withParam((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        smartRouteBuildRoute.open();
        if (z) {
            Bp("quick_post");
        } else {
            Ep("post");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x020b A[PHI: r4
      0x020b: PHI (r4v9 java.lang.String) = (r4v6 java.lang.String), (r4v10 java.lang.String) binds: [B:118:0x0209, B:116:0x0206] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020f A[PHI: r4
      0x020f: PHI (r4v8 java.lang.String) = (r4v6 java.lang.String), (r4v9 java.lang.String) binds: [B:118:0x0209, B:120:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136 A[PHI: r4
      0x0136: PHI (r4v17 java.lang.String) = (r4v14 java.lang.String), (r4v18 java.lang.String) binds: [B:67:0x0134, B:65:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013a A[PHI: r4
      0x013a: PHI (r4v16 java.lang.String) = (r4v14 java.lang.String), (r4v17 java.lang.String) binds: [B:67:0x0134, B:69:0x0138] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b8 A[PHI: r6
      0x01b8: PHI (r6v4 java.lang.String) = (r6v1 java.lang.String), (r6v5 java.lang.String) binds: [B:93:0x01b6, B:91:0x01b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bc A[PHI: r6
      0x01bc: PHI (r6v3 java.lang.String) = (r6v1 java.lang.String), (r6v4 java.lang.String) binds: [B:93:0x01b6, B:95:0x01ba] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinPostTypeAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Yl(int r10, java.lang.String r11, java.util.List r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinCreatorEditAssem.Yl(int, java.lang.String, java.util.List, boolean):void");
    }
}
