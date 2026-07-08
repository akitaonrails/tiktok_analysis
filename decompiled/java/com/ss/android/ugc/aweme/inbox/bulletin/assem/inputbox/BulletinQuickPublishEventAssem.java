package com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C0OLV;
import X.C0OPQ;
import X.C0OPT;
import X.C0OSF;
import X.C0OU6;
import X.C0OVT;
import X.C0OVY;
import X.C1220000hqw;
import X.C1227904rF;
import X.C1389880mGw;
import X.C13LE;
import X.C14EU;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1578630rBN;
import X.C1618770sE7;
import X.C1637806bA;
import X.C1907940zkW;
import X.C19719912Dl;
import X.C19EG;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C291001Au;
import X.C296830BkH;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C618910OPh;
import X.C619990OTl;
import X.C620400OVa;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736950SvV;
import X.EnumC620000OTm;
import X.EnumC620430OVd;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
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
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinInputStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS117S0101000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinQuickPublishEventAssem extends AbstractC738140SxQ implements IBulletinQuickPublishAbility, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public boolean LL;
    public boolean LLILLJJLI = true;
    public final C1559260qg8 LLILLL = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLILZ;
    public final AssemVMLazy LLILZIL;
    public final C736950SvV LLILZLL;
    public final C01GW LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinQuickPublishEventAssem.class, "inputStateVm", "getInputStateVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinInputStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinEditFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinEditFragmentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        AssemViewModel.asyncSubscribe$default(m249do(), new C2217381BqS() { // from class: X.0OVZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LL;
            }
        }, this, null, null, null, new AwS588S0100000_9(this, 143), 28, null);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -951319067) {
            return null;
        }
        return this;
    }

    public BulletinQuickPublishEventAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 445);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinProfileViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(255);
        AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9((AbstractC738140SxQ) this, 447);
        C451610HnL c451610HnL = new C451610HnL(this, true, true);
        C723700Sa8 c723700Sa8 = new C723700Sa8(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLILZ = new C736950SvV(c19719912DlLIZ, awS553S0100000_9, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS240S0000000_9, awS553S0100000_92, c451610HnL, c723700Sa8);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinInputStateViewModel.class);
        this.LLILZIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ2, 446), AFwS240S0000000_9.get$arr$(254), null, true);
        AwS553S0100000_9 awS553S0100000_93 = new AwS553S0100000_9(this, 443);
        this.LLILZLL = new C736950SvV(C13LE.LIZ(BulletinEditViewModel.class), awS553S0100000_93, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(256), new AwS553S0100000_9((AbstractC738140SxQ) this, 448), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLIZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 444));
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.IBulletinQuickPublishAbility
    public final boolean Lq() {
        if (!this.LLILLJJLI) {
            return false;
        }
        this.LLILLJJLI = false;
        return true;
    }

    public final C0OLV bo() {
        return (C0OLV) this.LLILLL.getValue();
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final BulletinProfileViewModel m249do() {
        return (BulletinProfileViewModel) this.LLILZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.IBulletinQuickPublishAbility
    public final void AK() {
        String str;
        C0OLV c0olvBo = bo();
        if (c0olvBo != null && (str = c0olvBo.LL) != null) {
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

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final void ho(boolean z) {
        final C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
            if (iExternalService != null) {
                iExternalService.asyncService(c19egLIZ, "bulletin_board", new IExternalService.ServiceLoadCallback() { // from class: X.0OlL
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
                        asyncAVService.uiService().recordService().openBulletinAlbumForSingleMedia(c19egLIZ);
                    }
                });
            }
            mo("album");
        }
    }

    public final void ko(boolean z) {
        final C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
            if (iExternalService != null) {
                iExternalService.asyncService(c19egLIZ, "bulletin_board", new IExternalService.ServiceLoadCallback() { // from class: X.15M7
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
            }
            if (z) {
                mo("quick_camera");
            } else {
                oo("camera");
            }
        }
    }

    public final void mo(String str) {
        C0OLV c0olvBo = bo();
        if (c0olvBo != null) {
            C0OPQ c0opq = C0OPQ.LIZ;
            String str2 = c0olvBo.LL;
            Pair[] pairArr = new Pair[2];
            String str3 = c0olvBo.LLILLJJLI;
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

    public final void oo(String str) {
        C0OLV c0olvBo = bo();
        if (c0olvBo != null) {
            C0OPQ c0opq = C0OPQ.LIZ;
            String str2 = c0olvBo.LL;
            Pair[] pairArr = new Pair[2];
            String str3 = c0olvBo.LLILLJJLI;
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

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void openBulletinEditView(C620400OVa c620400OVa) {
        Pair<String, String> pairZQ2;
        C0OVT c0ovt;
        Integer numLJIIJJI;
        int iIntValue;
        if (!C296830BkH.LIZ() || !C1578630rBN.LJIIJ(this) || !m249do().OQ2(c620400OVa.LIZ)) {
            return;
        }
        AssemVMLazy assemVMLazy = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        if (((C619990OTl) assemVMLazy.getValue().getState()).LLILLL == EnumC620000OTm.INPUT) {
            Uri uri = c620400OVa.LIZIZ;
            Context context = getContext();
            Integer numLJIIJJI2 = null;
            if (context != null) {
                pairZQ2 = m249do().zQ2(context);
            } else {
                pairZQ2 = null;
            }
            if (uri == null) {
                c0ovt = new C0OVT(pairZQ2, 991);
            } else {
                String strLIZIZ = C1907940zkW.LIZIZ(uri, "bulletin_template_text");
                String strLIZIZ2 = C1907940zkW.LIZIZ(uri, "inspirational_content");
                String strLIZIZ3 = C1907940zkW.LIZIZ(uri, "enter_method");
                String strLIZIZ4 = C1907940zkW.LIZIZ(uri, "interactive_method");
                String strLIZIZ5 = C1907940zkW.LIZIZ(uri, "template_type");
                String strLIZIZ6 = C1907940zkW.LIZIZ(uri, "enable_activity_event");
                if (strLIZIZ6 != null) {
                    numLJIIJJI = C2095008Iq.LJIIJJI(strLIZIZ6);
                } else {
                    numLJIIJJI = null;
                }
                String strLIZIZ7 = C1907940zkW.LIZIZ(uri, "task_id");
                String strLIZIZ8 = C1907940zkW.LIZIZ(uri, "unique_key");
                String strLIZIZ9 = C1907940zkW.LIZIZ(uri, "text_input_mode");
                if (strLIZIZ9 != null) {
                    numLJIIJJI2 = C2095008Iq.LJIIJJI(strLIZIZ9);
                }
                c0ovt = new C0OVT(strLIZIZ, strLIZIZ2, strLIZIZ3, strLIZIZ4, strLIZIZ5, pairZQ2, numLJIIJJI, strLIZIZ7, strLIZIZ8, numLJIIJJI2);
            }
            Integer num = c0ovt.LJIIIZ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 2;
            }
            this.LLILZIL.getValue().setState(new AwS588S0100000_9(new AwS117S0101000_9(c0ovt, iIntValue, 1), (Function1<? super C291001Au<Boolean>, Unit>) 537));
            ((BulletinEditViewModel) this.LLILZLL.getValue()).xQ2(c0ovt);
            if (iIntValue != 1) {
                if (iIntValue == 2) {
                    this.LLILZIL.getValue().setState(new AwS588S0100000_9(C0OSF.FULL_SCREEN, 534));
                    return;
                }
                return;
            }
            ((BulletinEditViewModel) this.LLILZLL.getValue()).yQ2(true);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void showTemplatePost(C0OVY c0ovy) {
        String str;
        String str2;
        String str3;
        String str4;
        if (!C0OU6.LIZ() || !C1578630rBN.LJIIJ(this) || !m249do().OQ2(c0ovy.LIZ)) {
            return;
        }
        if (!this.LL) {
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
            String str5 = null;
            Object obj = null;
            String string = null;
            if (i == EnumC620430OVd.AWEME_POST.getPostType()) {
                Object obj2 = c0ovy.LIZJ.get("unique_key");
                if (obj2 instanceof String) {
                    obj = obj2;
                }
                lo(C2097908Jt.LIZJ(new Pair("unique_key", obj)), true);
                return;
            }
            if (i == EnumC620430OVd.CAMERA.getPostType()) {
                ko(true);
                return;
            }
            if (i == EnumC620430OVd.POLL.getPostType()) {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                Map<String, Object> map = c0ovy.LIZJ;
                c1227904rF.getClass();
                fo(C1227904rF.LJI(map), true);
                return;
            }
            String str6 = "";
            if (i == EnumC620430OVd.TEXT.getPostType()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(c0ovy.LIZLLL);
                linkedHashMap.putAll(c0ovy.LIZJ);
                BulletinEditViewModel bulletinEditViewModel = (BulletinEditViewModel) this.LLILZLL.getValue();
                C0OLV c0olvBo = bo();
                if (c0olvBo != null) {
                    str2 = c0olvBo.LL;
                } else {
                    str2 = null;
                }
                bulletinEditViewModel.LLILZLL = str2;
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "aweme://inbox/bulletin_board/post_text");
                C0OLV c0olvBo2 = bo();
                if (c0olvBo2 != null) {
                    str3 = c0olvBo2.LL;
                } else {
                    str3 = null;
                }
                smartRouteBuildRoute.withParam("bulletin_board_id", str3);
                C0OLV c0olvBo3 = bo();
                if (c0olvBo3 != null) {
                    str4 = c0olvBo3.LLILLJJLI;
                } else {
                    str4 = null;
                }
                smartRouteBuildRoute.withParam("previous_page", str4);
                Context context = getContext();
                if (context != null) {
                    string = context.getString(2131828120);
                }
                smartRouteBuildRoute.withParam("inspirational_content", string);
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if ((!a0.LJJJIL((CharSequence) entry2.getKey())) && (!a0.LJJJIL(entry2.getValue().toString()))) {
                        smartRouteBuildRoute.withParam((String) entry2.getKey(), entry2.getValue().toString());
                    }
                }
                smartRouteBuildRoute.open();
                C0OLV c0olvBo4 = bo();
                if (c0olvBo4 == null) {
                    return;
                }
                C0OPQ c0opq = C0OPQ.LIZ;
                String str7 = c0olvBo4.LL;
                Pair[] pairArr = new Pair[2];
                String str8 = c0olvBo4.LLILLJJLI;
                if (str8 != null) {
                    str6 = str8;
                }
                pairArr[0] = new Pair("previous_page", str6);
                pairArr[1] = new Pair("enter_method", "write");
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                c0opq.getClass();
                C0OPQ.LJIIJ(str7, mapLJIIIIZZ);
                return;
            }
            Uri.Builder builderBuildUpon = UriProtector.parse(String.valueOf(c0ovy.LIZJ.get("post_schema"))).buildUpon();
            C0OLV c0olvBo5 = bo();
            if (c0olvBo5 != null && (str = c0olvBo5.LLILLJJLI) != null) {
                str6 = str;
            }
            builderBuildUpon.appendQueryParameter("enter_from", str6).appendQueryParameter("bulletin_quota", String.valueOf(m249do().getState().LLJJIJIL)).appendQueryParameter("bulletin_board_id", String.valueOf(c0ovy.LIZ));
            for (Map.Entry<String, Object> entry3 : c0ovy.LIZJ.entrySet()) {
                String key = entry3.getKey();
                String string2 = entry3.getValue().toString();
                if ((!a0.LJJJIL(key)) && (!a0.LJJJIL(string2)) && !Intrinsics.LJFF(key, "post_schema")) {
                    builderBuildUpon.appendQueryParameter(key, string2);
                }
            }
            for (Map.Entry<String, Object> entry4 : c0ovy.LIZLLL.entrySet()) {
                String key2 = entry4.getKey();
                String string3 = entry4.getValue().toString();
                if ((!a0.LJJJIL(key2)) && (!a0.LJJJIL(string3))) {
                    builderBuildUpon.appendQueryParameter(key2, string3);
                }
            }
            if (c0ovy.LIZIZ == EnumC620430OVd.LIVE_EVENT.getPostType()) {
                Object obj3 = c0ovy.LIZJ.get("unique_key");
                if (obj3 instanceof String) {
                    str5 = (String) obj3;
                }
                builderBuildUpon.appendQueryParameter("bb_inspiration_card_key", str5);
            }
            SmartRouter.buildRoute(getContext(), builderBuildUpon.build().toString()).open();
            return;
        }
        ho(true);
    }

    public final void fo(String str, boolean z) {
        String str2;
        String str3;
        if (z) {
            str2 = "quick_vote";
        } else {
            str2 = "vote";
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C724240Sb0.LJI(this), "aweme://inbox/bulletin_board/post_poll");
        C0OLV c0olvBo = bo();
        String str4 = null;
        if (c0olvBo != null) {
            str3 = c0olvBo.LL;
        } else {
            str3 = null;
        }
        smartRouteBuildRoute.withParam("bulletin_board_id", str3);
        C0OLV c0olvBo2 = bo();
        if (c0olvBo2 != null) {
            str4 = c0olvBo2.LLILLJJLI;
        }
        smartRouteBuildRoute.withParam("previous_page", str4);
        smartRouteBuildRoute.withParam("enter_method", str2);
        if (str != null && (!a0.LJJJIL(str)) && C0OU6.LIZ()) {
            smartRouteBuildRoute.withParam("bulletin_template_poll_content", str);
        }
        smartRouteBuildRoute.open();
        if (z) {
            mo(str2);
        } else {
            oo(str2);
        }
        C0OPT.LIZ.getClass();
        C0OPT.LIZIZ();
    }

    public final void lo(Map map, boolean z) {
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
            mo("quick_post");
        } else {
            oo("post");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01fb A[PHI: r4
      0x01fb: PHI (r4v9 java.lang.String) = (r4v6 java.lang.String), (r4v10 java.lang.String) binds: [B:116:0x01f9, B:114:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ff A[PHI: r4
      0x01ff: PHI (r4v8 java.lang.String) = (r4v6 java.lang.String), (r4v9 java.lang.String) binds: [B:116:0x01f9, B:118:0x01fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012a A[PHI: r4
      0x012a: PHI (r4v17 java.lang.String) = (r4v14 java.lang.String), (r4v18 java.lang.String) binds: [B:65:0x0128, B:63:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e A[PHI: r4
      0x012e: PHI (r4v16 java.lang.String) = (r4v14 java.lang.String), (r4v17 java.lang.String) binds: [B:65:0x0128, B:67:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a8 A[PHI: r6
      0x01a8: PHI (r6v5 java.lang.String) = (r6v2 java.lang.String), (r6v6 java.lang.String) binds: [B:91:0x01a6, B:89:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ac A[PHI: r6
      0x01ac: PHI (r6v4 java.lang.String) = (r6v2 java.lang.String), (r6v5 java.lang.String) binds: [B:91:0x01a6, B:93:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.IBulletinQuickPublishAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Yl(int r10, java.lang.String r11, java.util.List r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinQuickPublishEventAssem.Yl(int, java.lang.String, java.util.List, boolean):void");
    }
}
