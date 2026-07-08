package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget;

import X.C01GW;
import X.C0B8G;
import X.C0BI0;
import X.C0RD4;
import X.C0RGB;
import X.C0RGC;
import X.C0SCU;
import X.C1209650haF;
import X.C1238304sv;
import X.C13BV;
import X.C13LP;
import X.C1403940mdc;
import X.C14EU;
import X.C1554610qYd;
import X.C1609960rzu;
import X.C161F;
import X.C161N;
import X.C1697810uHb;
import X.C194349111v;
import X.C19595011lU;
import X.C19595311lX;
import X.C19632711rZ;
import X.C19EG;
import X.C1A5L;
import X.C1AF0;
import X.C2097608Jq;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C273310AnR;
import X.C2796016k;
import X.C452501pT;
import X.C690990R8n;
import X.C705930RmZ;
import X.C786410Ut5;
import X.InterfaceC0241006d;
import X.InterfaceC1282004zy;
import X.InterfaceC19579211iw;
import X.InterfaceC19582111jP;
import X.InterfaceC19588111kN;
import X.InterfaceC19594611lQ;
import X.InterfaceC19595111lV;
import X.InterfaceC19595211lW;
import X.InterfaceC19601711mZ;
import X.InterfaceC19632811ra;
import X.InterfaceC386401eo;
import X.InterfaceC665370Q7z;
import X.ViewOnTouchListenerC19594111lL;
import Y.ACListenerS163S0100000_29;
import Y.AComparatorS30S0000000_11;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.cla.et.ETParamsProvider;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.WikipediaExtra;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.ss.android.ugc.aweme.feed.spi.ICommonFeedCustomLogic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.property.AddMusicStickerConfig;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.TextStruct;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public final class InteractStickerWidget extends AbsInteractStickerWidget implements Observer<C0RD4>, InterfaceC19595211lW, InterfaceC19632811ra {
    public C705930RmZ LLJ;
    public C194349111v LLJI;
    public InterfaceC386401eo LLJIJIL;
    public ViewOnTouchListenerC19594111lL LLJILJIL;
    public List<? extends InteractStickerStruct> LLJILJILJ;
    public List<? extends InteractStickerStruct> LLJILLL;
    public InteractStickerViewModel LLJJ;
    public C19632711rZ LLJJIII;
    public boolean LLJJIJIIJIL;
    public InterfaceC665370Q7z LLJJJ;
    public Aweme LLJJJJJIL;
    public List<C19595011lU> LLJJI = new ArrayList();
    public HashMap<String, String> LLJJIJI = new HashMap<>();
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new C0RGC(this));
    public String LLJJJIL = "FEED";
    public final Map<Integer, Integer> LLJJJJ = C2097608Jq.LJIIIIZZ(new Pair(8, 1), new Pair(9, 1), new Pair(22, 1), new Pair(6, 2), new Pair(23, 2), new Pair(17, 3), new Pair(4, 3), new Pair(7, 3), new Pair(10, 4), new Pair(3, 5), new Pair(101, 5), new Pair(106, 5), new Pair(100, 5), new Pair(111, 5), new Pair(19, 6), new Pair(88, 7), new Pair(42, 7), new Pair(114, 7));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new C0RGB());
    public final StickerParamsProvider LLJJL = new StickerParamsProvider();

    /* JADX INFO: loaded from: classes32.dex */
    public final class StickerParamsProvider implements ETParamsProvider<C2796016k> {
        @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
        /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
        public final C2796016k Mb0() {
            String string;
            Object obj;
            Aweme aweme = InteractStickerWidget.this.LLJJJJJIL;
            List listLIZJ = C161F.LIZJ(InteractStickerWidget.this.LLJJJJJIL, aweme != null ? aweme.getInteractStickerStructs() : null);
            Map<String, Object> mapLJJIIJZLJL = ((ITranslationService) ServiceManager.get().getService(ITranslationService.class)).LJJIIJZLJL(InteractStickerWidget.this.LLJJI);
            int iIntValue = ((Number) (listLIZJ.size() > 0 ? ListProtector.get(listLIZJ, 0) : 0)).intValue();
            int i = iIntValue != 0 ? 1 : 0;
            int iIntValue2 = ((Number) (1 < listLIZJ.size() ? ListProtector.get(listLIZJ, 1) : 0)).intValue();
            int iIntValue3 = ((Number) (2 < listLIZJ.size() ? ListProtector.get(listLIZJ, 2) : 0)).intValue();
            Integer numValueOf = Integer.valueOf(C0SCU.LIZ().LLIIII(InteractStickerWidget.this.LLJJJJJIL, false) ? 1 : 0);
            Integer numValueOf2 = Integer.valueOf(C161N.LIZIZ.LJJJJL(InteractStickerWidget.this.LLJJJJJIL, null) ? 1 : 0);
            String strLIZIZ = C161F.LIZIZ(InteractStickerWidget.this.LLJJJJJIL);
            if (mapLJJIIJZLJL == null || (obj = mapLJJIIJZLJL.get("background_reduced_cnt")) == null || (string = obj.toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            return new C2796016k(i, iIntValue, iIntValue2, iIntValue3, numValueOf, numValueOf2, strLIZIZ, string);
        }

        @Override // com.ss.android.tracker.event.EventParamsProtocol
        public final InterfaceC1282004zy getParam() {
            if (lt2(C2796016k.class)) {
                return Mb0();
            }
            return null;
        }

        public StickerParamsProvider() {
        }

        @Override // com.ss.android.ugc.aweme.cla.et.ETParamsProvider
        public final boolean lt2(Class<? extends InterfaceC0241006d> cls) {
            if (!Intrinsics.LJFF(cls, C2796016k.class)) {
                return false;
            }
            int i = C0BI0.LIZ;
            if (i != 2 && i != 0) {
                return false;
            }
            return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final int LJIIJ() {
        return R.layout.ibe;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIIL(int i, int i2, Intent intent) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget, com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.C0R55
    public final void LIZ() {
        Iterator it2 = ((ArrayList) this.LLJJI).iterator();
        while (it2.hasNext()) {
            InterfaceC19594611lQ interfaceC19594611lQ = ((C19595011lU) it2.next()).LIZJ;
            interfaceC19594611lQ.getStickerType();
            interfaceC19594611lQ.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget
    public final InteractStickerViewModel LJIILLIIL() {
        if (this.LLJJ == null) {
            InteractStickerViewModel interactStickerViewModel = new InteractStickerViewModel();
            this.LLJJ = interactStickerViewModel;
            interactStickerViewModel.LLILLL = this;
        }
        return this.LLJJ;
    }

    @Override // X.C0R55
    public final void onDestroyView() {
        Iterator<C19595011lU> it2 = this.LLJJI.iterator();
        while (it2.hasNext()) {
            InterfaceC19594611lQ interfaceC19594611lQ = it2.next().LIZJ;
            interfaceC19594611lQ.LJIIJJI(interfaceC19594611lQ.getStickerType());
        }
    }

    @Override // X.C0R55
    public final void LIZIZ() {
        ((ITranslationService) ServiceManager.get().getService(ITranslationService.class)).LJJIJLIJ(this.LLJJI, this.LLJJIJIIJIL, this.LLJIJIL);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        if (this.LLILZ == null) {
            LJIILLIIL().vQ2("interact_sticker_data", this, false);
            LJIILLIIL().vQ2("interact_sticker_video_data", this, false);
            LJIILLIIL().vQ2("interact_sticker_aweme_data", this, false);
            LJIILLIIL().vQ2("interact_sticker_clear_data", this, false);
            LJIILLIIL().vQ2("interact_sticker_update_intro_layout_y", this, true);
            LJIILLIIL().vQ2("viewholder_select_status_changed", this, true);
            LJIILLIIL().vQ2("interact_text_translate_data", this, true);
            LJIILLIIL().vQ2("interact_text_translate_status", this, true);
            LJIILLIIL().vQ2("interact_sticker_delegate_single_tap", this, true);
            return;
        }
        C1AF0.LIZJ("interact_sticker_widget_without_data_center");
        this.LLILZ.yQ2("interact_sticker_data", this, false);
        this.LLILZ.yQ2("interact_sticker_video_data", this, false);
        this.LLILZ.yQ2("interact_sticker_aweme_data", this, false);
        this.LLILZ.yQ2("interact_sticker_clear_data", this, false);
        this.LLILZ.yQ2("interact_sticker_update_intro_layout_y", this, true);
        this.LLILZ.yQ2("viewholder_select_status_changed", this, true);
        this.LLILZ.yQ2("interact_text_translate_data", this, true);
        this.LLILZ.yQ2("interact_text_translate_status", this, true);
        this.LLILZ.yQ2("interact_sticker_delegate_single_tap", this, true);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        super.onPause();
        Iterator<C19595011lU> it2 = this.LLJJI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ.onPause();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        super.onResume();
        Iterator<C19595011lU> it2 = this.LLJJI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ.onResume();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onStop() {
        super.onStop();
        ((InterfaceC19601711mZ) this.LLJJIJIL.getValue()).LIZ();
    }

    @Override // X.InterfaceC19632811ra
    public final C19632711rZ LJ() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC19632811ra
    public final void LIZLLL(C19632711rZ c19632711rZ) {
        this.LLJJIII = c19632711rZ;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIILIIL(View view) {
        C194349111v c194349111v;
        EventBus.LIZLLL().LJIJJ(this);
        if (view != null) {
            c194349111v = (C194349111v) view.findViewById(R.id.tqy);
        } else {
            c194349111v = null;
        }
        this.LLJI = c194349111v;
        if (c194349111v != null) {
            c194349111v.setLayoutDirection(0);
        }
        ViewOnTouchListenerC19594111lL viewOnTouchListenerC19594111lL = new ViewOnTouchListenerC19594111lL((C19EG) LJIIIZ(), this.LLJJI, this.LLJ, this.LLJIJIL, this);
        this.LLJILJIL = viewOnTouchListenerC19594111lL;
        C194349111v c194349111v2 = this.LLJI;
        if (c194349111v2 != null) {
            c194349111v2.setOnTouchListener(viewOnTouchListenerC19594111lL);
        }
        C2271391DvN.LIZ(this.LLJI, (C1A5L) C2271381DvM.LJJJJZ.getValue());
        DataCenter dataCenter = this.LLILZ;
        if (dataCenter != null) {
            this.LLJ = (C705930RmZ) dataCenter.get("interact_sticker_data");
            this.LLJILJILJ = (List) this.LLILZ.get("interact_sticker_aweme_data");
            this.LLJILLL = (List) this.LLILZ.get("interact_sticker_video_data");
        } else {
            this.LLJ = (C705930RmZ) LJIILLIIL().get("interact_sticker_data");
            this.LLJILJILJ = (List) LJIILLIIL().get("interact_sticker_aweme_data");
            this.LLJILLL = (List) LJIILLIIL().get("interact_sticker_video_data");
        }
        LJIJJLI(this.LLJ);
        LJIL(this.LLJILJILJ, this.LLJILLL);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget
    public final void LJIILL(float f) {
        for (C19595011lU c19595011lU : (ArrayList) this.LLJJI) {
            if (c19595011lU.LIZIZ.getType() == 88) {
                c19595011lU.LIZJ.LJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget
    public final void LJIIZILJ(Aweme aweme) {
        this.LLJJJJJIL = aweme;
    }

    public final void LJIJJLI(C705930RmZ c705930RmZ) {
        boolean z;
        C690990R8n c690990R8nLIZ;
        float f;
        if (c705930RmZ != null) {
            InterfaceC19582111jP interfaceC19582111jP = c705930RmZ.LJIIL;
            if (interfaceC19582111jP != null) {
                c690990R8nLIZ = interfaceC19582111jP.LIZ();
            } else {
                c690990R8nLIZ = null;
            }
            float f2 = 0.0f;
            if (c705930RmZ != null) {
                if (c690990R8nLIZ != null) {
                    f = c690990R8nLIZ.LIZ;
                } else {
                    f = 0.0f;
                }
                c705930RmZ.LIZ = f;
                if (c690990R8nLIZ != null) {
                    f2 = c690990R8nLIZ.LIZIZ;
                }
                c705930RmZ.LIZIZ = f2;
            }
        }
        C194349111v c194349111v = this.LLJI;
        if (c194349111v != null) {
            if (c705930RmZ != null) {
                z = c705930RmZ.LJIIJJI;
            } else {
                z = true;
            }
            c194349111v.setNeedConsumeEvent(z);
        }
        ViewOnTouchListenerC19594111lL viewOnTouchListenerC19594111lL = this.LLJILJIL;
        if (viewOnTouchListenerC19594111lL != null) {
            viewOnTouchListenerC19594111lL.LLILLJJLI = c705930RmZ;
        }
        if (c705930RmZ != null) {
            for (C19595011lU c19595011lU : (ArrayList) this.LLJJI) {
                c19595011lU.LIZJ.LIZLLL(c705930RmZ);
                View view = c19595011lU.LIZ;
                if (view != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    layoutParams.leftMargin = 0;
                    layoutParams.topMargin = 0;
                    C786410Ut5.W5(view, layoutParams);
                }
            }
        }
    }

    public final int LJJ(int i) {
        for (Map.Entry<Integer, Integer> entry : this.LLJJJJ.entrySet()) {
            if (entry.getKey().intValue() == i) {
                return entry.getValue().intValue();
            }
        }
        return 0;
    }

    public final void LJJI(boolean z) {
        try {
            ((ITranslationService) ServiceManager.get().getService(ITranslationService.class)).LJJJLL(this.LLJJI, z, this.LLJIJIL, this.LLJJIJI);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "notifyInteractTextTranslateView error");
        }
    }

    public final void LJJIFFI(InterfaceC665370Q7z interfaceC665370Q7z) {
        C1554610qYd.LIZJ(interfaceC665370Q7z, ETParamsProvider.class, C1697810uHb.LJIILJJIL(this.LLJJL));
        this.LLJJJ = interfaceC665370Q7z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x001c  */
    /* JADX WARN: Type inference failed for: r28v0, types: [com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onChanged(X.C0RD4 r29) {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.onChanged(java.lang.Object):void");
    }

    @C14EU
    public final void onDissmissInteractWindow(C1209650haF c1209650haF) {
        int i = c1209650haF.LIZ;
        for (C19595011lU c19595011lU : (ArrayList) this.LLJJI) {
            if (c19595011lU.LIZJ.LIZJ() != i) {
                InterfaceC19594611lQ interfaceC19594611lQ = c19595011lU.LIZJ;
                interfaceC19594611lQ.getStickerType();
                interfaceC19594611lQ.LIZ();
            }
        }
    }

    @Override // X.InterfaceC19595211lW
    public final void LJI(final MotionEvent motionEvent, long j) {
        float x;
        List<C19595011lU> list = this.LLJJI;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (!C19595311lX.LIZ(((C19595011lU) obj).LIZIZ, this.LLJJJJJIL, "tap")) {
                arrayList.add(obj);
            }
        }
        for (final C19595011lU c19595011lU : C13LP.LJLJJLL(arrayList)) {
            InterfaceC19594611lQ interfaceC19594611lQ = c19595011lU.LIZJ;
            int stickerType = interfaceC19594611lQ.getStickerType();
            float y = 0.0f;
            if (motionEvent != null) {
                x = motionEvent.getX();
                y = motionEvent.getY();
            } else {
                x = 0.0f;
            }
            if (interfaceC19594611lQ.LJIIIZ(j, stickerType, x, y, new InterfaceC19579211iw() { // from class: X.11lN
                @Override // X.InterfaceC19579211iw
                public final void LIZ(boolean z) {
                    InterfaceC19595111lV interfaceC19595111lV;
                    InterfaceC19595111lV interfaceC19595111lV2;
                    C705930RmZ c705930RmZ = this.LIZ.LLJ;
                    if (c705930RmZ != null && (interfaceC19595111lV2 = c705930RmZ.LJIILIIL) != null) {
                        c19595011lU.LIZJ.getStickerType();
                        InterfaceC19594611lQ interfaceC19594611lQ2 = c19595011lU.LIZJ;
                        interfaceC19594611lQ2.getStickerType();
                        interfaceC19594611lQ2.getView();
                        MotionEvent motionEvent2 = motionEvent;
                        if (motionEvent2 != null) {
                            motionEvent2.getX();
                        }
                        MotionEvent motionEvent3 = motionEvent;
                        if (motionEvent3 != null) {
                            motionEvent3.getY();
                        }
                        c19595011lU.LIZJ.LJIIJ();
                        interfaceC19595111lV2.LIZIZ(z);
                    }
                    C705930RmZ c705930RmZ2 = this.LIZ.LLJ;
                    if (c705930RmZ2 != null && (interfaceC19595111lV = c705930RmZ2.LJIILIIL) != null) {
                        interfaceC19595111lV.LIZ(c19595011lU.LIZJ.getStickerType(), true);
                    }
                }
            })) {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d8, code lost:
    
        r2.LIZJ.LJIIIIZZ(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01dd, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r12, X.InterfaceC19588111kN r13) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget.LJIJ(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct, X.11kN):void");
    }

    public final void LJIL(List<? extends InteractStickerStruct> list, List<? extends InteractStickerStruct> list2) {
        List listLJLLLL;
        InterfaceC19582111jP interfaceC19582111jP;
        final Aweme aweme;
        final Aweme aweme2;
        final Aweme aweme3;
        final Aweme aweme4;
        final Aweme aweme5;
        ArrayList arrayList = new ArrayList();
        List listLJLLLL2 = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (InteractStickerStruct interactStickerStruct : list) {
                if (interactStickerStruct.getType() == 5) {
                    arrayList2.add(interactStickerStruct);
                }
            }
            listLJLLLL = C13LP.LJLLLL(new AComparatorS30S0000000_11(1), arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (InteractStickerStruct interactStickerStruct2 : list) {
                if (interactStickerStruct2.getType() != 5) {
                    arrayList3.add(interactStickerStruct2);
                }
            }
            listLJLLLL2 = C13LP.LJLLLL(new Comparator() { // from class: X.0RuA
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return C20085613iQ.LIZIZ(Integer.valueOf(this.LL.LJJ(((InteractStickerStruct) t).getType())), Integer.valueOf(this.LL.LJJ(((InteractStickerStruct) t2).getType())));
                }
            }, arrayList3);
        } else {
            listLJLLLL = null;
        }
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        arrayList.addAll(list2);
        if (listLJLLLL == null) {
            listLJLLLL = C13BV.INSTANCE;
        }
        arrayList.addAll(listLJLLLL);
        if (listLJLLLL2 == null) {
            listLJLLLL2 = C13BV.INSTANCE;
        }
        arrayList.addAll(listLJLLLL2);
        ICommonFeedCustomLogic iCommonFeedCustomLogic = (ICommonFeedCustomLogic) PluggableExtentionKt.pluggableSpi$default(ICommonFeedCustomLogic.class, false, false, false, 14, null);
        if (iCommonFeedCustomLogic != null) {
            iCommonFeedCustomLogic.LJI();
        }
        List<InteractStickerStruct> listLJLJJLL = arrayList;
        if (C273310AnR.LIZ()) {
            listLJLJJLL = C13LP.LJLJJLL(arrayList);
        }
        for (final InteractStickerStruct interactStickerStruct3 : listLJLJJLL) {
            int type = interactStickerStruct3.getType();
            if (type != 2) {
                if (type != 5) {
                    if (type != 7) {
                        if (type != 22) {
                            if (type != 100) {
                                if (type != 101) {
                                    switch (type) {
                                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                            LJIJ(interactStickerStruct3, new InterfaceC19588111kN() { // from class: X.11kJ
                                                @Override // X.InterfaceC19588111kN
                                                public final InterfaceC19594611lQ LIZ() {
                                                    Aweme aweme6;
                                                    InteractStickerWidget interactStickerWidget = this.LIZ;
                                                    C194349111v c194349111v = interactStickerWidget.LLJI;
                                                    if (c194349111v == null || (aweme6 = interactStickerWidget.LLJJJJJIL) == null) {
                                                        return null;
                                                    }
                                                    Context context = interactStickerWidget.LL;
                                                    C705930RmZ c705930RmZ = interactStickerWidget.LLJ;
                                                    InteractStickerStruct interactStickerStruct4 = interactStickerStruct3;
                                                    if (c705930RmZ != null) {
                                                        InterfaceC19582111jP interfaceC19582111jP2 = c705930RmZ.LJIIL;
                                                        C690990R8n c690990R8nLIZ = interfaceC19582111jP2 != null ? interfaceC19582111jP2.LIZ() : null;
                                                        if (c705930RmZ != null) {
                                                            c705930RmZ.LIZ = c690990R8nLIZ != null ? c690990R8nLIZ.LIZ : 0.0f;
                                                            c705930RmZ.LIZIZ = c690990R8nLIZ != null ? c690990R8nLIZ.LIZIZ : 0.0f;
                                                        }
                                                    }
                                                    return new C19579911j3(interactStickerStruct4.getType(), context, c194349111v, interactStickerStruct4, c705930RmZ, aweme6);
                                                }
                                            });
                                            break;
                                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                            LJIJ(interactStickerStruct3, new InterfaceC19588111kN() { // from class: X.11kM
                                                @Override // X.InterfaceC19588111kN
                                                public final InterfaceC19594611lQ LIZ() {
                                                    InteractStickerWidget interactStickerWidget = this.LIZ;
                                                    C194349111v c194349111v = interactStickerWidget.LLJI;
                                                    if (c194349111v == null) {
                                                        return null;
                                                    }
                                                    return ((ITranslationService) ServiceManager.get().getService(ITranslationService.class)).LJFF(interactStickerWidget.LL, interactStickerWidget.LLJ, interactStickerStruct3, c194349111v, interactStickerWidget.LLJIJIL);
                                                }
                                            });
                                            break;
                                        case 19:
                                            final C194349111v c194349111v = this.LLJI;
                                            if (c194349111v != null && (aweme3 = this.LLJJJJJIL) != null && (!C1238304sv.LIZ() || !C1609960rzu.LJ(aweme3))) {
                                                LJIJ(interactStickerStruct3, new InterfaceC19588111kN() { // from class: X.11kO
                                                    @Override // X.InterfaceC19588111kN
                                                    public final InterfaceC19594611lQ LIZ() {
                                                        InteractStickerWidget interactStickerWidget = this.LIZ;
                                                        Context context = interactStickerWidget.LL;
                                                        C705930RmZ c705930RmZ = interactStickerWidget.LLJ;
                                                        InteractStickerStruct interactStickerStruct4 = interactStickerStruct3;
                                                        return new C19595911ld(interactStickerStruct4.getType(), context, c194349111v, interactStickerStruct4, c705930RmZ, aweme3, interactStickerWidget.LLJJJ);
                                                    }
                                                });
                                            }
                                            break;
                                        default:
                                            switch (type) {
                                                case 40:
                                                    final C194349111v c194349111v2 = this.LLJI;
                                                    if (c194349111v2 != null && (aweme = this.LLJJJJJIL) != null) {
                                                        LJIJ(interactStickerStruct3, new InterfaceC19588111kN() { // from class: X.11kL
                                                            @Override // X.InterfaceC19588111kN
                                                            public final InterfaceC19594611lQ LIZ() {
                                                                InteractStickerWidget interactStickerWidget = this.LIZ;
                                                                Context context = interactStickerWidget.LL;
                                                                C705930RmZ c705930RmZ = interactStickerWidget.LLJ;
                                                                InteractStickerStruct interactStickerStruct4 = interactStickerStruct3;
                                                                return new C19584111jj(interactStickerStruct4.getType(), context, c194349111v2, interactStickerStruct4, c705930RmZ, aweme);
                                                            }
                                                        });
                                                    }
                                                    break;
                                                case 41:
                                                    final C194349111v c194349111v3 = this.LLJI;
                                                    if (c194349111v3 != null && (aweme2 = this.LLJJJJJIL) != null) {
                                                        LJIJ(interactStickerStruct3, new InterfaceC19588111kN() { // from class: X.11kK
                                                            @Override // X.InterfaceC19588111kN
                                                            public final InterfaceC19594611lQ LIZ() {
                                                                InteractStickerWidget interactStickerWidget = this.LIZ;
                                                                Context context = interactStickerWidget.LL;
                                                                C705930RmZ c705930RmZ = interactStickerWidget.LLJ;
                                                                InteractStickerStruct interactStickerStruct4 = interactStickerStruct3;
                                                                return new C19584211jk(interactStickerStruct4.getType(), context, c194349111v3, interactStickerStruct4, c705930RmZ, aweme2);
                                                            }
                                                        });
                                                    }
                                                    break;
                                                case 42:
                                                    if (((AddMusicStickerConfig) C1403940mdc.LIZIZ.getValue()).consumptionMusicStickerEnabled && !(!((Boolean) C0B8G.LIZ.getValue()).booleanValue()) && interactStickerStruct3.getMusicStickerStruct() != null && interactStickerStruct3.getMusicStickerStruct().stickerStyle != 0) {
                                                        LJIJ(interactStickerStruct3, new InterfaceC19588111kN() { // from class: X.11kI
                                                            @Override // X.InterfaceC19588111kN
                                                            public final InterfaceC19594611lQ LIZ() {
                                                                InteractStickerWidget interactStickerWidget = this.LIZ;
                                                                C194349111v c194349111v4 = interactStickerWidget.LLJI;
                                                                if (c194349111v4 == null) {
                                                                    return null;
                                                                }
                                                                Context context = interactStickerWidget.LL;
                                                                C705930RmZ c705930RmZ = interactStickerWidget.LLJ;
                                                                InteractStickerStruct interactStickerStruct4 = interactStickerStruct3;
                                                                Aweme aweme6 = interactStickerWidget.LLJJJJJIL;
                                                                if (c705930RmZ != null) {
                                                                    InterfaceC19582111jP interfaceC19582111jP2 = c705930RmZ.LJIIL;
                                                                    C690990R8n c690990R8nLIZ = interfaceC19582111jP2 != null ? interfaceC19582111jP2.LIZ() : null;
                                                                    if (c705930RmZ != null) {
                                                                        c705930RmZ.LIZ = c690990R8nLIZ != null ? c690990R8nLIZ.LIZ : 0.0f;
                                                                        c705930RmZ.LIZIZ = c690990R8nLIZ != null ? c690990R8nLIZ.LIZIZ : 0.0f;
                                                                    }
                                                                }
                                                                return new C19581611jK(interactStickerStruct4.getType(), context, c194349111v4, interactStickerStruct4, c705930RmZ, aweme6);
                                                            }
                                                        });
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    final C194349111v c194349111v4 = this.LLJI;
                                    if (c194349111v4 != null && (aweme4 = this.LLJJJJJIL) != null) {
                                        LJIJ(interactStickerStruct3, new InterfaceC19588111kN() { // from class: X.11lM
                                            @Override // X.InterfaceC19588111kN
                                            public final InterfaceC19594611lQ LIZ() {
                                                IVideoCellAbility iVideoCellAbility;
                                                IVideoCellAbility iVideoCellAbility2;
                                                InteractStickerWidget interactStickerWidget = this.LIZ;
                                                Context context = interactStickerWidget.LL;
                                                C705930RmZ c705930RmZ = interactStickerWidget.LLJ;
                                                InteractStickerStruct interactStickerStruct4 = interactStickerStruct3;
                                                C194349111v c194349111v5 = c194349111v4;
                                                Aweme aweme6 = aweme4;
                                                InterfaceC665370Q7z interfaceC665370Q7z = interactStickerWidget.LLJJJ;
                                                InterfaceC19601711mZ interfaceC19601711mZ = (InterfaceC19601711mZ) interactStickerWidget.LLJJIJIL.getValue();
                                                int type2 = interactStickerStruct4.getType();
                                                Fragment fragment = null;
                                                boolean zLJJIIJZLJL = C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL((interfaceC665370Q7z == null || (iVideoCellAbility2 = (IVideoCellAbility) C1558520qew.LIZ(interfaceC665370Q7z, IVideoCellAbility.class, null)) == null) ? null : iVideoCellAbility2.getFragment());
                                                if (interfaceC665370Q7z != null && (iVideoCellAbility = (IVideoCellAbility) C1558520qew.LIZ(interfaceC665370Q7z, IVideoCellAbility.class, null)) != null) {
                                                    fragment = iVideoCellAbility.getFragment();
                                                }
                                                return new C19601311mV(type2, context, c194349111v5, interactStickerStruct4, c705930RmZ, aweme6, interfaceC665370Q7z, interfaceC19601711mZ, zLJJIIJZLJL, C1389300mG0.LJIIJ(fragment));
                                            }
                                        });
                                    }
                                }
                            } else {
                                final C194349111v c194349111v5 = this.LLJI;
                                if (c194349111v5 != null && (aweme5 = this.LLJJJJJIL) != null && interactStickerStruct3.getInteractiveEmojiStickerStruct() != null) {
                                    LJIJ(interactStickerStruct3, new InterfaceC19588111kN() { // from class: X.11lO
                                        @Override // X.InterfaceC19588111kN
                                        public final InterfaceC19594611lQ LIZ() {
                                            InteractStickerWidget interactStickerWidget = this.LIZ;
                                            Context context = interactStickerWidget.LL;
                                            C705930RmZ c705930RmZ = interactStickerWidget.LLJ;
                                            InteractStickerStruct interactStickerStruct4 = interactStickerStruct3;
                                            return new C19600811mQ(interactStickerStruct4.getType(), context, c194349111v5, interactStickerStruct4, c705930RmZ, aweme5, (InterfaceC19601711mZ) interactStickerWidget.LLJJIJIL.getValue());
                                        }
                                    });
                                }
                            }
                        } else {
                            LJIJ(interactStickerStruct3, new InterfaceC19588111kN() { // from class: X.11kF
                                @Override // X.InterfaceC19588111kN
                                public final InterfaceC19594611lQ LIZ() {
                                    C705930RmZ c705930RmZ = this.LIZ.LLJ;
                                    if (c705930RmZ == null) {
                                        return null;
                                    }
                                    C690990R8n c690990R8nLIZ = c705930RmZ.LJIIL.LIZ();
                                    c705930RmZ.LIZ = c690990R8nLIZ.LIZ;
                                    c705930RmZ.LIZIZ = c690990R8nLIZ.LIZIZ;
                                    int type2 = interactStickerStruct3.getType();
                                    InteractStickerWidget interactStickerWidget = this.LIZ;
                                    Context context = interactStickerWidget.LL;
                                    C194349111v c194349111v6 = interactStickerWidget.LLJI;
                                    if (c194349111v6 != null) {
                                        return new C19582211jQ(type2, context, c194349111v6, interactStickerStruct3, c705930RmZ, interactStickerWidget.LLJIJIL);
                                    }
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            });
                        }
                    } else {
                        LJIJ(interactStickerStruct3, new InterfaceC19588111kN() { // from class: X.11kG
                            @Override // X.InterfaceC19588111kN
                            public final InterfaceC19594611lQ LIZ() {
                                C705930RmZ c705930RmZ = this.LIZ.LLJ;
                                if (c705930RmZ == null) {
                                    return null;
                                }
                                C690990R8n c690990R8nLIZ = c705930RmZ.LJIIL.LIZ();
                                c705930RmZ.LIZ = c690990R8nLIZ.LIZ;
                                c705930RmZ.LIZIZ = c690990R8nLIZ.LIZIZ;
                                int type2 = interactStickerStruct3.getType();
                                InteractStickerWidget interactStickerWidget = this.LIZ;
                                Context context = interactStickerWidget.LL;
                                C194349111v c194349111v6 = interactStickerWidget.LLJI;
                                if (c194349111v6 != null) {
                                    return new AbstractC19586911kB(type2, context, c194349111v6, interactStickerStruct3, c705930RmZ, interactStickerWidget.LLJIJIL) { // from class: X.11j2
                                        public final InterfaceC386401eo LJIIIZ;
                                        public View LJIIJ;
                                        public final C19579711j1 LJIIJJI;
                                        public final String LJIIL;
                                        public final String LJIILIIL;

                                        @Override // X.InterfaceC19594811lS
                                        public final void LIZIZ() {
                                        }

                                        @Override // X.InterfaceC19594911lT
                                        public final boolean LJI(float f, float f2, int i, long j) {
                                            return false;
                                        }

                                        @Override // X.InterfaceC19594811lS
                                        public final void LJJIII() {
                                        }

                                        @Override // X.InterfaceC19594611lQ
                                        public final int getStickerType() {
                                            return 7;
                                        }

                                        @Override // X.AbstractC19586911kB
                                        public final View LJIILL() {
                                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                                            LinearLayout linearLayout = new LinearLayout(this.LIZ);
                                            C786410Ut5.d6(linearLayout, layoutParams);
                                            linearLayout.setOrientation(0);
                                            TuxTextView tuxTextView = new TuxTextView(this.LIZ, null, 6, 0);
                                            tuxTextView.setTextColor(C960203pA.LIZ(R.attr.bx, this.LIZ));
                                            tuxTextView.setTuxFont(62);
                                            C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
                                            tuxTextView.setMaxLines(1);
                                            tuxTextView.setGravity(16);
                                            tuxTextView.setText(this.LIZ.getString(2131821958));
                                            TuxIconView tuxIconView = new TuxIconView(this.LIZ, null, 0, 6, null);
                                            C419910GdJ c419910GdJ = new C419910GdJ();
                                            c419910GdJ.LIZ = R.raw.icon_chevron_right_fill_ltr;
                                            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                                            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                            tuxIconView.setTuxIcon(c419910GdJ);
                                            linearLayout.addView(tuxTextView);
                                            linearLayout.addView(tuxIconView);
                                            return linearLayout;
                                        }

                                        @Override // X.AbstractC19586911kB
                                        public final void LJIJ() {
                                            C0R60 c0r60;
                                            C0R60 c0r602;
                                            C0R60 c0r603;
                                            C2344009Gk c2344009Gk = new C2344009Gk();
                                            C705930RmZ c705930RmZ2 = this.LIZJ;
                                            String str = null;
                                            c2344009Gk.LJIIIIZZ("group_id", (c705930RmZ2 == null || (c0r603 = c705930RmZ2.LJIIZILJ) == null) ? null : c0r603.LIZLLL);
                                            C705930RmZ c705930RmZ3 = this.LIZJ;
                                            c2344009Gk.LJIIIIZZ("author_id", (c705930RmZ3 == null || (c0r602 = c705930RmZ3.LJIIZILJ) == null) ? null : c0r602.LIZJ);
                                            C705930RmZ c705930RmZ4 = this.LIZJ;
                                            if (c705930RmZ4 != null && (c0r60 = c705930RmZ4.LJIIZILJ) != null) {
                                                str = c0r60.LIZ;
                                            }
                                            c2344009Gk.LJIIIIZZ("enter_from", str);
                                            c2344009Gk.LJIIIIZZ("question_id", this.LJIIL);
                                            c2344009Gk.LJIIIIZZ("sticker_type", "question");
                                            c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                                            C20684815ws.LJIILLIIL("sticker_click", c2344009Gk.LIZ);
                                        }

                                        @Override // X.AbstractC19586911kB
                                        public final void LJIJI() {
                                            C0R60 c0r60;
                                            C0R60 c0r602;
                                            C0R60 c0r603;
                                            C2344009Gk c2344009Gk = new C2344009Gk();
                                            C705930RmZ c705930RmZ2 = this.LIZJ;
                                            String str = null;
                                            c2344009Gk.LJIIIIZZ("group_id", (c705930RmZ2 == null || (c0r603 = c705930RmZ2.LJIIZILJ) == null) ? null : c0r603.LIZLLL);
                                            C705930RmZ c705930RmZ3 = this.LIZJ;
                                            c2344009Gk.LJIIIIZZ("author_id", (c705930RmZ3 == null || (c0r602 = c705930RmZ3.LJIIZILJ) == null) ? null : c0r602.LIZJ);
                                            C705930RmZ c705930RmZ4 = this.LIZJ;
                                            if (c705930RmZ4 != null && (c0r60 = c705930RmZ4.LJIIZILJ) != null) {
                                                str = c0r60.LIZ;
                                            }
                                            c2344009Gk.LJIIIIZZ("enter_from", str);
                                            c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                                            c2344009Gk.LJIIIIZZ("question_id", this.LJIIL);
                                            c2344009Gk.LJIIIIZZ("question_user_id", this.LJIILIIL);
                                            C20684815ws.LJIILLIIL("click_question_bubble", c2344009Gk.LIZ);
                                        }

                                        @Override // X.InterfaceC19594811lS
                                        public final View getView() {
                                            if (!C19580611jA.LJI(this.LIZ)) {
                                                if (this.LJIIJ == null) {
                                                    this.LJIIJ = new FrameLayout(this.LIZ);
                                                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                                                    View view = this.LJIIJ;
                                                    if (view != null) {
                                                        C786410Ut5.W5(view, layoutParams);
                                                    }
                                                }
                                                return this.LJIIJ;
                                            }
                                            if (this.LJIIJ == null) {
                                                this.LJIIJ = new View(this.LIZ) { // from class: X.0GRY
                                                    public float[] LL;
                                                    public final Paint LLILLJJLI = new Paint();
                                                    public final Path LLILLL = new Path();

                                                    public final Path getPath() {
                                                        return this.LLILLL;
                                                    }

                                                    public final float[] getPoints() {
                                                        return this.LL;
                                                    }

                                                    @Override // android.view.View
                                                    public final void onDraw(Canvas canvas) {
                                                        super.onDraw(canvas);
                                                        if (C19580611jA.LJI(getContext()) && this.LL != null) {
                                                            this.LLILLL.reset();
                                                            Path path = this.LLILLL;
                                                            float[] fArr = this.LL;
                                                            path.moveTo(fArr[0], fArr[1]);
                                                            Path path2 = this.LLILLL;
                                                            float[] fArr2 = this.LL;
                                                            path2.lineTo(fArr2[2], fArr2[3]);
                                                            Path path3 = this.LLILLL;
                                                            float[] fArr3 = this.LL;
                                                            path3.lineTo(fArr3[6], fArr3[7]);
                                                            Path path4 = this.LLILLL;
                                                            float[] fArr4 = this.LL;
                                                            path4.lineTo(fArr4[4], fArr4[5]);
                                                            this.LLILLL.close();
                                                            canvas.drawPath(this.LLILLL, this.LLILLJJLI);
                                                        }
                                                    }

                                                    public final void setPoints(float[] fArr) {
                                                        this.LL = fArr;
                                                    }
                                                };
                                                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                                                View view2 = this.LJIIJ;
                                                if (view2 == null) {
                                                    "Required value was null.".toString();
                                                    throw new IllegalArgumentException("Required value was null.");
                                                }
                                                C786410Ut5.W5(view2, layoutParams2);
                                                ((C0GRY) this.LJIIJ).setPoints(this.LJIIJJI.LJFF);
                                                View view3 = this.LJIIJ;
                                                if (view3 == null) {
                                                    "Required value was null.".toString();
                                                    throw new IllegalArgumentException("Required value was null.");
                                                }
                                                view3.postInvalidate();
                                            }
                                            return this.LJIIJ;
                                        }

                                        @Override // X.AbstractC19586911kB, X.InterfaceC19594911lT
                                        public final void LIZLLL(C705930RmZ c705930RmZ2) {
                                            this.LIZJ = c705930RmZ2;
                                            this.LJIIJJI.LIZLLL = c705930RmZ2;
                                        }

                                        @Override // X.AbstractC19586911kB
                                        public final int LJIILLIIL(C451220Hmi c451220Hmi) {
                                            String strLJIILJJIL;
                                            int i;
                                            I18nManagerServiceApi i18nManagerServiceApiLIZ;
                                            C705930RmZ c705930RmZ2 = this.LIZJ;
                                            if (c705930RmZ2 != null && c705930RmZ2.LJIJ != null) {
                                                I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
                                                if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (strLJIILJJIL = i18nManagerServiceApiLIZ.LJIILJJIL(c451220Hmi.LIZ)) == null) {
                                                    strLJIILJJIL = "";
                                                }
                                                C450840Hm6 c450840Hm6 = new C450840Hm6();
                                                if (TextUtils.equals(strLJIILJJIL, "ar")) {
                                                    i = R.drawable.c48;
                                                } else {
                                                    i = R.drawable.c47;
                                                }
                                                c450840Hm6.LIZ = i;
                                                c450840Hm6.LIZLLL = c451220Hmi.LIZ.getString(2131821958);
                                                c450840Hm6.LJFF = new ACListenerS163S0100000_29(this, 193);
                                                c451220Hmi.LIZIZ(c450840Hm6);
                                                return 1;
                                            }
                                            return 0;
                                        }

                                        @Override // X.InterfaceC19594911lT
                                        public final boolean LJIIIZ(long j, int i, float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
                                            return this.LJIIJJI.LJIIIZ(j, i, f, f2, interfaceC19579211iw);
                                        }

                                        /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
                                        {
                                            /*
                                                r10 = this;
                                                r7 = r14
                                                r5 = r12
                                                r8 = r15
                                                r6 = r10
                                                r6.<init>(r5, r13, r7, r8)
                                                r9 = r16
                                                r6.LJIIIZ = r9
                                                X.11j1 r4 = new X.11j1
                                                r4.<init>(r5, r6, r7, r8, r9)
                                                r6.LJIIJJI = r4
                                                com.ss.android.ugc.aweme.feed.model.VideoReplyStruct r5 = r8.LJIJ
                                                r3 = 0
                                                if (r5 == 0) goto L61
                                                long r1 = r5.getAwemeId()
                                                int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                                                if (r0 == 0) goto L5e
                                                if (r5 == 0) goto L61
                                                r5.getAwemeId()
                                            L25:
                                                long r1 = r5.getCommentId()
                                            L29:
                                                int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                                                java.lang.String r2 = ""
                                                if (r0 == 0) goto L5c
                                                if (r5 == 0) goto L5a
                                                long r0 = r5.getCommentId()
                                                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                                            L39:
                                                java.lang.String r0 = java.lang.String.valueOf(r0)
                                            L3d:
                                                r6.LJIIL = r0
                                                java.lang.String r1 = r8.LJIJI
                                                if (r1 != 0) goto L47
                                                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                                            L47:
                                                java.lang.Long r0 = java.lang.Long.valueOf(r3)
                                                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                                                if (r0 != 0) goto L57
                                                java.lang.String r0 = r8.LJIJI
                                                java.lang.String r2 = java.lang.String.valueOf(r0)
                                            L57:
                                                r6.LJIILIIL = r2
                                                return
                                            L5a:
                                                r0 = 0
                                                goto L39
                                            L5c:
                                                r0 = r2
                                                goto L3d
                                            L5e:
                                                if (r5 == 0) goto L61
                                                goto L25
                                            L61:
                                                r1 = 0
                                                goto L29
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: X.C19579811j2.<init>(int, android.content.Context, X.111v, com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct, X.0RmZ, X.01eo):void");
                                        }
                                    };
                                }
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        });
                    }
                } else {
                    LJIJ(interactStickerStruct3, new InterfaceC19588111kN() { // from class: X.11kH
                        @Override // X.InterfaceC19588111kN
                        public final InterfaceC19594611lQ LIZ() {
                            InteractStickerWidget interactStickerWidget = this.LIZ;
                            Context context = interactStickerWidget.LL;
                            C705930RmZ c705930RmZ = interactStickerWidget.LLJ;
                            InteractStickerStruct interactStickerStruct4 = interactStickerStruct3;
                            C194349111v c194349111v6 = interactStickerWidget.LLJI;
                            if (c194349111v6 == null) {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            if (c705930RmZ != null) {
                                InterfaceC19582111jP interfaceC19582111jP2 = c705930RmZ.LJIIL;
                                C690990R8n c690990R8nLIZ = interfaceC19582111jP2 != null ? interfaceC19582111jP2.LIZ() : null;
                                if (c705930RmZ != null) {
                                    c705930RmZ.LIZ = c690990R8nLIZ != null ? c690990R8nLIZ.LIZ : 0.0f;
                                    c705930RmZ.LIZIZ = c690990R8nLIZ != null ? c690990R8nLIZ.LIZIZ : 0.0f;
                                }
                            }
                            return new AbstractC19586911kB(interactStickerStruct4.getType(), context, c194349111v6, interactStickerStruct4, c705930RmZ) { // from class: X.11it
                                public final C19579111iv LJIIIZ;
                                public final C01GW LJIIJ;
                                public DialogC194307110f LJIIJJI;

                                @Override // X.InterfaceC19594811lS
                                public final void LIZIZ() {
                                }

                                @Override // X.InterfaceC19594811lS
                                public final void LJJIII() {
                                }

                                @Override // X.InterfaceC19594611lQ
                                public final int getStickerType() {
                                    return 5;
                                }

                                @Override // X.AbstractC19586911kB
                                public final View LJIILL() {
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                                    LinearLayout linearLayout = new LinearLayout(this.LIZ);
                                    C786410Ut5.d6(linearLayout, layoutParams);
                                    linearLayout.setOrientation(0);
                                    TuxTextView tuxTextView = new TuxTextView(this.LIZ, null, 6, 0);
                                    tuxTextView.setTextColor(C960203pA.LIZ(R.attr.ee, this.LIZ));
                                    tuxTextView.setTuxFont(62);
                                    C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
                                    tuxTextView.setMaxLines(1);
                                    tuxTextView.setGravity(16);
                                    tuxTextView.setText(this.LIZ.getString(2131835577));
                                    TuxIconView tuxIconView = new TuxIconView(this.LIZ, null, 0, 6, null);
                                    C419910GdJ c419910GdJ = new C419910GdJ();
                                    c419910GdJ.LIZ = R.raw.icon_chevron_right_fill_ltr;
                                    c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                                    tuxIconView.setTuxIcon(c419910GdJ);
                                    linearLayout.addView(tuxTextView);
                                    linearLayout.addView(tuxIconView);
                                    return linearLayout;
                                }

                                @Override // X.AbstractC19586911kB
                                public final void LJIJ() {
                                    String str;
                                    C0R60 c0r60;
                                    C0R60 c0r602;
                                    C0R60 c0r603;
                                    LogPbBean logPbBean = new LogPbBean();
                                    C705930RmZ c705930RmZ2 = this.LIZJ;
                                    if (c705930RmZ2 == null || (str = c705930RmZ2.LJIIJ) == null) {
                                        str = "";
                                    }
                                    logPbBean.setImprId(str);
                                    C2344009Gk c2344009Gk = new C2344009Gk();
                                    C705930RmZ c705930RmZ3 = this.LIZJ;
                                    String str2 = null;
                                    c2344009Gk.LJIIIIZZ("enter_from", (c705930RmZ3 == null || (c0r603 = c705930RmZ3.LJIIZILJ) == null) ? null : c0r603.LIZ);
                                    C705930RmZ c705930RmZ4 = this.LIZJ;
                                    c2344009Gk.LJIIIIZZ("group_id", (c705930RmZ4 == null || (c0r602 = c705930RmZ4.LJIIZILJ) == null) ? null : c0r602.LIZLLL);
                                    C705930RmZ c705930RmZ5 = this.LIZJ;
                                    if (c705930RmZ5 != null && (c0r60 = c705930RmZ5.LJIIZILJ) != null) {
                                        str2 = c0r60.LIZJ;
                                    }
                                    c2344009Gk.LJIIIIZZ("author_id", str2);
                                    c2344009Gk.LJIIIIZZ("sticker_type", "wiki");
                                    c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZ(logPbBean));
                                    C20684815ws.LJIILLIIL("sticker_click", c2344009Gk.LIZ);
                                }

                                @Override // X.AbstractC19586911kB
                                public final void LJIJI() {
                                    String str;
                                    String str2;
                                    String str3;
                                    String str4;
                                    C19578911it c19578911it;
                                    String str5;
                                    String str6;
                                    String str7;
                                    C0R60 c0r60;
                                    String str8;
                                    C0R60 c0r602;
                                    C0R60 c0r603;
                                    String str9;
                                    String str10;
                                    C0R60 c0r604;
                                    String str11;
                                    C0R60 c0r605;
                                    C0R60 c0r606;
                                    C0R60 c0r607;
                                    C0R60 c0r608;
                                    C0R60 c0r609;
                                    C19579111iv c19579111iv = this.LJIIIZ;
                                    if (c19579111iv.LJ.getValue() == null || ((TextStruct) c19579111iv.LJ.getValue()).getAnchors().isEmpty()) {
                                        return;
                                    }
                                    LogPbBean logPbBean = new LogPbBean();
                                    C705930RmZ c705930RmZ2 = c19579111iv.LIZLLL;
                                    String str12 = "";
                                    if (c705930RmZ2 == null || (str = c705930RmZ2.LJIIJ) == null) {
                                        str = "";
                                    }
                                    logPbBean.setImprId(str);
                                    C2344009Gk c2344009Gk = new C2344009Gk();
                                    C705930RmZ c705930RmZ3 = c19579111iv.LIZLLL;
                                    if (c705930RmZ3 == null || (c0r609 = c705930RmZ3.LJIIZILJ) == null || (str2 = c0r609.LIZLLL) == null) {
                                        str2 = "";
                                    }
                                    c2344009Gk.LJIIIIZZ("group_id", str2);
                                    C705930RmZ c705930RmZ4 = c19579111iv.LIZLLL;
                                    if (c705930RmZ4 == null || (c0r608 = c705930RmZ4.LJIIZILJ) == null || (str3 = c0r608.LIZJ) == null) {
                                        str3 = "";
                                    }
                                    c2344009Gk.LJIIIIZZ("author_id", str3);
                                    C705930RmZ c705930RmZ5 = c19579111iv.LIZLLL;
                                    if (c705930RmZ5 == null || (c0r607 = c705930RmZ5.LJIIZILJ) == null || (str4 = c0r607.LIZ) == null) {
                                        str4 = "";
                                    }
                                    c2344009Gk.LJIIIIZZ("enter_from", str4);
                                    c2344009Gk.LJIIIIZZ("sticker_type", "wiki");
                                    c2344009Gk.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZ(logPbBean));
                                    C20684815ws.LJIILLIIL("sticker_toast_click", c2344009Gk.LIZ);
                                    List<CreateAnchorInfo> anchors = ((TextStruct) c19579111iv.LJ.getValue()).getAnchors();
                                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(anchors, 10));
                                    for (CreateAnchorInfo createAnchorInfo : anchors) {
                                        WikipediaExtra wikipediaExtra = (WikipediaExtra) GsonProtectorUtils.fromJson(new Gson(), createAnchorInfo.getContent(), WikipediaExtra.class);
                                        WikipediaInfo wikipediaInfo = new WikipediaInfo();
                                        wikipediaInfo.setKeyword(createAnchorInfo.getKeyword());
                                        wikipediaInfo.setLang(createAnchorInfo.getLanguage());
                                        wikipediaInfo.setExtra(wikipediaExtra);
                                        wikipediaInfo.setAnchorId(createAnchorInfo.getThirdId());
                                        arrayList4.add(wikipediaInfo);
                                    }
                                    List<WikipediaInfo> listLJJJJI = C13LP.LJJJJI(arrayList4);
                                    if (listLJJJJI.size() == 1) {
                                        IAnchorBusinessOutBridgeService iAnchorBusinessOutBridgeService = (IAnchorBusinessOutBridgeService) PluggableExtentionKt.pluggableSpi$default(IAnchorBusinessOutBridgeService.class, false, false, false, 14, null);
                                        if (iAnchorBusinessOutBridgeService != null) {
                                            iAnchorBusinessOutBridgeService.LIZIZ(c19579111iv.LIZ, (WikipediaInfo) ListProtector.get(listLJJJJI, 0), c19579111iv.LJIILIIL(), C2097608Jq.LJ());
                                        }
                                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                                        C705930RmZ c705930RmZ6 = c19579111iv.LIZLLL;
                                        if (c705930RmZ6 == null || (c0r606 = c705930RmZ6.LJIIZILJ) == null || (str9 = c0r606.LIZ) == null) {
                                            str9 = "";
                                        }
                                        c2344009Gk2.LJIIIIZZ("enter_from", str9);
                                        c2344009Gk2.LJIIIIZZ("language", ((WikipediaInfo) ListProtector.get(listLJJJJI, 0)).getLang());
                                        c2344009Gk2.LJIIIIZZ("wiki_entry", ((WikipediaInfo) ListProtector.get(listLJJJJI, 0)).getKeyword());
                                        C705930RmZ c705930RmZ7 = c19579111iv.LIZLLL;
                                        if (c705930RmZ7 == null || (c0r605 = c705930RmZ7.LJIIZILJ) == null || (str10 = c0r605.LIZJ) == null) {
                                            str10 = "";
                                        }
                                        c2344009Gk2.LJIIIIZZ("author_id", str10);
                                        C705930RmZ c705930RmZ8 = c19579111iv.LIZLLL;
                                        if (c705930RmZ8 != null && (c0r604 = c705930RmZ8.LJIIZILJ) != null && (str11 = c0r604.LIZLLL) != null) {
                                            str12 = str11;
                                        }
                                        c2344009Gk2.LJIIIIZZ("group_id", str12);
                                        C20684815ws.LJIILLIIL("enter_wiki_detail", c2344009Gk2.LIZ);
                                        return;
                                    }
                                    AbstractC19586911kB abstractC19586911kB = c19579111iv.LIZIZ;
                                    if (!(abstractC19586911kB instanceof C19578911it) || (c19578911it = (C19578911it) abstractC19586911kB) == null) {
                                        return;
                                    }
                                    Map<String, String> mapLJIILIIL = c19579111iv.LJIILIIL();
                                    if (c19578911it.LJIIJJI == null) {
                                        c19578911it.LJIIJJI = new DialogC194307110f(c19578911it.LIZ, listLJJJJI, mapLJIILIIL, new AwS608S0100000_29(c19578911it, 865), new AwS573S0100000_29(c19578911it, 1122));
                                    }
                                    DialogC194307110f dialogC194307110f = c19578911it.LJIIJJI;
                                    if (dialogC194307110f != null) {
                                        dialogC194307110f.show();
                                        C785410UrT.LIZIZ(dialogC194307110f);
                                        PopupMonitorServiceImpl.LIZ.getClass();
                                        PopupMonitorServiceImpl.LJJJ(dialogC194307110f);
                                        C816490W1f.LIZ(dialogC194307110f);
                                    }
                                    StringBuilder sb = new StringBuilder("");
                                    StringBuilder sb2 = new StringBuilder("");
                                    for (WikipediaInfo wikipediaInfo2 : listLJJJJI) {
                                        sb.append("wiki,");
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(wikipediaInfo2.getKeyword());
                                        sbLIZ.append(',');
                                        sb2.append(C2188811AlT.LIZIZ(sbLIZ));
                                    }
                                    LogPbBean logPbBean2 = new LogPbBean();
                                    C705930RmZ c705930RmZ9 = c19578911it.LIZJ;
                                    if (c705930RmZ9 == null || (str5 = c705930RmZ9.LJIIJ) == null) {
                                        str5 = "";
                                    }
                                    logPbBean2.setImprId(str5);
                                    C2344009Gk c2344009Gk3 = new C2344009Gk();
                                    C705930RmZ c705930RmZ10 = c19578911it.LIZJ;
                                    if (c705930RmZ10 == null || (c0r603 = c705930RmZ10.LJIIZILJ) == null || (str6 = c0r603.LIZ) == null) {
                                        str6 = "";
                                    }
                                    c2344009Gk3.LJIIIIZZ("enter_from", str6);
                                    C705930RmZ c705930RmZ11 = c19578911it.LIZJ;
                                    if (c705930RmZ11 == null || (c0r602 = c705930RmZ11.LJIIZILJ) == null || (str7 = c0r602.LIZLLL) == null) {
                                        str7 = "";
                                    }
                                    c2344009Gk3.LJIIIIZZ("group_id", str7);
                                    c2344009Gk3.LJIIIIZZ("log_pb", C584850Mwl.LIZ.LIZ(logPbBean2));
                                    C705930RmZ c705930RmZ12 = c19578911it.LIZJ;
                                    if (c705930RmZ12 != null && (c0r60 = c705930RmZ12.LJIIZILJ) != null && (str8 = c0r60.LIZJ) != null) {
                                        str12 = str8;
                                    }
                                    c2344009Gk3.LJIIIIZZ("author_id", str12);
                                    c2344009Gk3.LJIIIIZZ("sticker_type", "wiki");
                                    c2344009Gk3.LJIIIIZZ("anchor_types", sb.toString());
                                    c2344009Gk3.LJIIIIZZ("anchor_names", sb2.toString());
                                    C20684815ws.LJIILLIIL("anchor_multiple_show", c2344009Gk3.LIZ);
                                }

                                @Override // X.InterfaceC19594811lS
                                public final View getView() {
                                    return (View) this.LJIIJ.getValue();
                                }

                                @Override // X.AbstractC19586911kB, X.InterfaceC19594911lT
                                public final void LIZLLL(C705930RmZ c705930RmZ2) {
                                    this.LIZJ = c705930RmZ2;
                                    this.LJIIIZ.LIZLLL = c705930RmZ2;
                                }

                                @Override // X.InterfaceC19594911lT
                                public final boolean LJI(float f, float f2, int i, long j) {
                                    return this.LJIIIZ.LJI(f, f2, i, j);
                                }

                                {
                                    super(context, c194349111v6, interactStickerStruct4, c705930RmZ);
                                    this.LJIIIZ = new C19579111iv(context, this, interactStickerStruct4, c705930RmZ);
                                    this.LJIIJ = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1574));
                                }

                                @Override // X.InterfaceC19594911lT
                                public final boolean LJIIIZ(long j, int i, float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
                                    return this.LJIIIZ.LJIIIZ(j, i, f, f2, interfaceC19579211iw);
                                }
                            };
                        }
                    });
                }
            } else {
                final C194349111v c194349111v6 = this.LLJI;
                if (c194349111v6 != null) {
                    LJIJ(interactStickerStruct3, new InterfaceC19588111kN() { // from class: X.11kE
                        @Override // X.InterfaceC19588111kN
                        public final InterfaceC19594611lQ LIZ() {
                            BusinessExtraData businessExtraData;
                            InteractStickerWidget interactStickerWidget = this.LIZ;
                            Context context = interactStickerWidget.LL;
                            C705930RmZ c705930RmZ = interactStickerWidget.LLJ;
                            InteractStickerStruct interactStickerStruct4 = interactStickerStruct3;
                            C194349111v c194349111v7 = c194349111v6;
                            InterfaceC386401eo interfaceC386401eo = interactStickerWidget.LLJIJIL;
                            Aweme aweme6 = interactStickerWidget.LLJJJJJIL;
                            if (c705930RmZ != null) {
                                InterfaceC19582111jP interfaceC19582111jP2 = c705930RmZ.LJIIL;
                                C690990R8n c690990R8nLIZ = interfaceC19582111jP2 != null ? interfaceC19582111jP2.LIZ() : null;
                                if (c705930RmZ != null) {
                                    c705930RmZ.LIZ = c690990R8nLIZ != null ? c690990R8nLIZ.LIZ : 0.0f;
                                    c705930RmZ.LIZIZ = c690990R8nLIZ != null ? c690990R8nLIZ.LIZIZ : 0.0f;
                                }
                            }
                            try {
                                businessExtraData = (BusinessExtraData) C7740030o.LIZ().getGson().LJII(JSONObjectProtectorUtils.getString(new JSONObject(interactStickerStruct4.getAttr()), "interaction_extra"), BusinessExtraData.class);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                businessExtraData = null;
                            }
                            return new C19579311ix(interactStickerStruct4.getType(), context, c194349111v7, interactStickerStruct4, c705930RmZ, interfaceC386401eo, businessExtraData, aweme6);
                        }
                    });
                }
            }
        }
        ViewOnTouchListenerC19594111lL viewOnTouchListenerC19594111lL = this.LLJILJIL;
        if (viewOnTouchListenerC19594111lL != null) {
            viewOnTouchListenerC19594111lL.LL = this.LLJJI;
        }
        C705930RmZ c705930RmZ = this.LLJ;
        if (c705930RmZ != null && (interfaceC19582111jP = c705930RmZ.LJIIL) != null) {
            interfaceC19582111jP.LIZ();
        }
        Iterator it2 = ((ArrayList) this.LLJJI).iterator();
        while (it2.hasNext()) {
            View view = ((C19595011lU) it2.next()).LIZ;
            if (view != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                layoutParams.leftMargin = 0;
                layoutParams.topMargin = 0;
                C786410Ut5.W5(view, layoutParams);
            }
        }
    }

    @Override // X.InterfaceC19595211lW
    public final void LJII(long j, int i, MotionEvent motionEvent) {
        float x;
        InterfaceC19595111lV interfaceC19595111lV;
        List<C19595011lU> list = this.LLJJI;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (!C19595311lX.LIZ(((C19595011lU) obj).LIZIZ, this.LLJJJJJIL, "tap")) {
                arrayList.add(obj);
            }
        }
        for (C19595011lU c19595011lU : C13LP.LJLJJLL(arrayList)) {
            InterfaceC19594611lQ interfaceC19594611lQ = c19595011lU.LIZJ;
            float y = 0.0f;
            if (motionEvent != null) {
                x = motionEvent.getX();
                y = motionEvent.getY();
            } else {
                x = 0.0f;
            }
            if (interfaceC19594611lQ.LJI(x, y, i, j) && c19595011lU.LIZJ.LJII()) {
                C705930RmZ c705930RmZ = this.LLJ;
                if (c705930RmZ != null && (interfaceC19595111lV = c705930RmZ.LJIILIIL) != null) {
                    interfaceC19595111lV.handleDoubleClick(motionEvent);
                    return;
                }
                return;
            }
        }
        LJI(motionEvent, j);
    }

    public final void LJIJI(int i, View view, InteractStickerStruct interactStickerStruct, InterfaceC19594611lQ interfaceC19594611lQ, boolean z) {
        if (i >= 0 && i < ((ArrayList) this.LLJJI).size() && z) {
            try {
                ((ArrayList) this.LLJJI).remove(i);
                C194349111v c194349111v = this.LLJI;
                if (c194349111v != null) {
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(c194349111v, null);
                    c194349111v.removeViewAt(i);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        ListProtector.add(this.LLJJI, i, new C19595011lU(view, interactStickerStruct, interfaceC19594611lQ));
        C194349111v c194349111v2 = this.LLJI;
        if (c194349111v2 != null) {
            c194349111v2.addView(view, i);
        }
    }
}
