package com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import X.AbstractC1291220jho;
import X.AbstractC1320710kTN;
import X.AbstractC21673619ry;
import X.AbstractC528270Knh;
import X.AbstractC529520Kpi;
import X.AbstractViewOnClickListenerC1173120gdK;
import X.AnonymousClass0956;
import X.C01GW;
import X.C054G;
import X.C05YD;
import X.C093Y;
import X.C09AY;
import X.C09IC;
import X.C0AYB;
import X.C0H4W;
import X.C0HZQ;
import X.C0I0B;
import X.C0L4U;
import X.C0L5G;
import X.C0L90;
import X.C0LAB;
import X.C0P0T;
import X.C0PEM;
import X.C0VSJ;
import X.C1308910kAL;
import X.C1320810kTX;
import X.C1322200kVm;
import X.C1324630kZh;
import X.C1325700kbQ;
import X.C1329360khK;
import X.C1383370m6R;
import X.C13BV;
import X.C13DA;
import X.C13EO;
import X.C13LP;
import X.C1417720mzq;
import X.C1419810n3D;
import X.C1449600npG;
import X.C1458370o3P;
import X.C1458730o3z;
import X.C1697810uHb;
import X.C1710306mr;
import X.C19576911iZ;
import X.C197039127h;
import X.C1AF0;
import X.C1DRG;
import X.C201955140j;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2296808zG;
import X.C23203097h;
import X.C23250099c;
import X.C2471909mP;
import X.C2475309mx;
import X.C2495709qF;
import X.C272720AmU;
import X.C280530Az5;
import X.C289500BWi;
import X.C290470Ba1;
import X.C298040BmE;
import X.C298330Bmh;
import X.C371640Ehe;
import X.C418440Gaw;
import X.C504501xr;
import X.C522090Kdj;
import X.C522180Kds;
import X.C522700Kei;
import X.C522930Kf5;
import X.C523270Kfd;
import X.C523910Kgf;
import X.C523920Kgg;
import X.C524780Ki4;
import X.C525050KiV;
import X.C526850KlP;
import X.C526910KlV;
import X.C527340KmC;
import X.C527360KmE;
import X.C527570KmZ;
import X.C527950KnB;
import X.C528010KnH;
import X.C528030KnJ;
import X.C528040KnK;
import X.C528080KnO;
import X.C528090KnP;
import X.C528170KnX;
import X.C528230Knd;
import X.C529530Kpj;
import X.C529680Kpy;
import X.C529980KqS;
import X.C530280Kqw;
import X.C533730KwV;
import X.C533790Kwb;
import X.C538480L9y;
import X.C578540Mma;
import X.C578570Mmd;
import X.C579430Mo1;
import X.C580130Mp9;
import X.C580920MqQ;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2471609mM;
import X.InterfaceC522120Kdm;
import X.InterfaceC523480Kfy;
import X.InterfaceC524200Kh8;
import X.InterfaceC524880KiE;
import X.InterfaceC526830KlN;
import X.InterfaceC528020KnI;
import X.InterfaceC528100KnQ;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS143S0100000_8;
import Y.AObjectS241S0100000_8;
import Y.AObserverS212S0100000_8;
import Y.ARunnableS17S0400000_8;
import Y.ARunnableS3S0101100_8;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CameraSlotModel;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.creative.model.TemplateData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.effect.ApplyRecordEffectInfo;
import com.ss.android.ugc.aweme.creative.model.live.LiveRecordModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumNextButtonConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.builtin.AlbumDefaultBottomActionBarConfig;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class VideoImageMixedController implements InterfaceC522120Kdm, InterfaceC523480Kfy {
    public final ShortVideoContext LL;
    public final VideoPublishEditModel LLILLJJLI;
    public final InterfaceC524880KiE LLILLL;
    public final C523920Kgg LLILZ;
    public int LLILZIL;
    public final String LLILZLL;
    public final LifecycleOwner LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public final Function0<C528230Knd> LLJILJIL;
    public final Function1<Boolean, Unit> LLJILJILJ;
    public final Function1<Boolean, Unit> LLJILLL;
    public final String LLJJ;
    public final C1DRG LLJJI;
    public final boolean LLJJIII;
    public final boolean LLJJIJI;
    public final Function0<Unit> LLJJIJIIJIL;
    public final Function0<Unit> LLJJIJIL;
    public final Function0<Unit> LLJJJ;
    public final Function0<List<String>> LLJJJIL;
    public final boolean LLJJJJ;
    public C528030KnJ LLJJJJJIL;
    public AbstractC529520Kpi LLJJJJLIIL;
    public C528040KnK LLJJL;
    public ArrayList<TikTokMediaModel> LLJJLIIIJLLLLLLLZ;
    public final C2252321DDq LLJL;
    public String LLJLIL;
    public String LLJLILLLLZIIL;
    public String LLJLL;
    public String LLJLLIL;
    public String LLJLLL;
    public String LLJZ;
    public String LLJZIJLIL;
    public String LLL;
    public String LLLF;
    public Drawable LLLFF;
    public Drawable LLLFFI;
    public String LLLFZ;
    public InterfaceC528100KnQ LLLI;
    public InterfaceC528020KnI LLLII;
    public InterfaceC524200Kh8 LLLIIII;
    public Function1<? super ArrayList<TikTokMediaModel>, Unit> LLLIIIIL;
    public boolean LLLIIIL;
    public int LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public final CopyOnWriteArrayList<CutSameVideoImageExtraData> LLLILZJ;
    public boolean LLLILZLLLI;
    public AbstractC528270Knh LLLIZZ;
    public AbstractC528270Knh LLLJ;
    public AbstractC528270Knh LLLJIL;
    public AbstractC528270Knh LLLJL;
    public AbstractC528270Knh LLLL;
    public AbstractC528270Knh LLLLII;
    public int LLLLIIIILLL;
    public int LLLLIIL;
    public boolean LLLLIILL;
    public C09AY LLLLIILLL;
    public int LLLLIL;
    public int LLLLILI;
    public int LLLLJ;
    public List<String> LLLLJI;
    public int LLLLL;
    public int LLLLLIL;
    public boolean LLLLLILLIL;
    public ChooseMediaViewModel LLLLLJIL;
    public boolean LLLLLJLJLL;
    public boolean LLLLLL;
    public boolean LLLLLLIL;
    public boolean LLLLLLJ;
    public boolean LLLLLLL;
    public String LLLLLLLLL;
    public ARunnableS3S0101100_8 LLLLLLLLLL;
    public C0P0T LLLLLLLZIL;
    public final BPEAHandler LLLLLLZ;
    public ArrayList<TemplateSlot> LLLLLLZZ;
    public AlbumDefaultBottomActionBarConfig LLLLLZ;
    public String LLLLLZIL;
    public boolean LLLLLZL;
    public boolean LLLLZ;
    public boolean LLLLZI;
    public boolean LLLLZIL;
    public SafeHandler LLLLZLL;
    public C0P0T LLLLZLLIL;
    public AnonymousClass0956 LLLLZLLLI;
    public final C054G LLLZ;
    public CreativeDialogWrapper LLLZI;
    public boolean LLLZIIL;
    public final boolean LLLZIL;
    public final MutableLiveData<Boolean> LLLZL;
    public final LiveData<Boolean> LLLZLL;
    public final MutableLiveData<Boolean> LLLZLZ;
    public boolean LLLZZ;
    public final boolean LLLZZIL;
    public View LLZ;
    public String LLZIL;
    public boolean LLZILL;
    public boolean LLZL;
    public final C01GW LLZLI;

    public VideoImageMixedController() {
        throw null;
    }

    public final boolean LJJLIIIJLJLI() {
        return C093Y.LIZJ(10, 24, 29).contains(Integer.valueOf(this.LLLIIL));
    }

    @Override // X.InterfaceC522120Kdm
    public final View LIZLLL() {
        C528030KnJ c528030KnJ = this.LLJJJJJIL;
        if (c528030KnJ == null) {
            return null;
        }
        return c528030KnJ.getSureTextView();
    }

    @Override // X.InterfaceC522120Kdm
    public final ArrayList<TikTokMediaModel> LJ() {
        AbstractC529520Kpi abstractC529520Kpi = this.LLJJJJLIIL;
        return abstractC529520Kpi == null ? new ArrayList<>() : LJJJJJL(abstractC529520Kpi.LL);
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJFF() {
        AbstractC529520Kpi abstractC529520Kpi = this.LLJJJJLIIL;
        if (abstractC529520Kpi == null) {
            return;
        }
        abstractC529520Kpi.notifyDataSetChanged();
        ArrayList<TikTokMediaModel> arrayListLJIL = LJIL();
        ArrayList arrayList = new ArrayList();
        for (TikTokMediaModel tikTokMediaModel : arrayListLJIL) {
            if (!C528080KnO.LIZ(tikTokMediaModel)) {
                arrayList.add(tikTokMediaModel);
            }
        }
        if (arrayList.size() > 0) {
            this.LLJJLIIIJLLLLLLLZ.clear();
            this.LLJJLIIIJLLLLLLLZ.addAll(arrayList);
        }
        AbstractC528270Knh abstractC528270Knh = this.LLLIZZ;
        if (abstractC528270Knh != null) {
            abstractC528270Knh.LLLLLLJ();
        }
        AbstractC528270Knh abstractC528270Knh2 = this.LLLL;
        if (abstractC528270Knh2 != null) {
            abstractC528270Knh2.LLLLLLJ();
        }
        AbstractC528270Knh abstractC528270Knh3 = this.LLLJ;
        if (abstractC528270Knh3 != null) {
            abstractC528270Knh3.LLLLLLJ();
        }
        AbstractC528270Knh abstractC528270Knh4 = this.LLLJIL;
        if (abstractC528270Knh4 != null) {
            abstractC528270Knh4.LLLLLLJ();
        }
        AbstractC528270Knh abstractC528270Knh5 = this.LLLJL;
        if (abstractC528270Knh5 != null) {
            abstractC528270Knh5.LLLLLLJ();
        }
        LJLIIIL(this, true);
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIIIIZZ() {
        C528030KnJ c528030KnJ = this.LLJJJJJIL;
        if (c528030KnJ != null) {
            C538480L9y autoCutBtn = c528030KnJ.getAutoCutBtn();
            if (autoCutBtn != null) {
                autoCutBtn.setContentAlpha(0.34f);
            }
            C528030KnJ c528030KnJ2 = this.LLJJJJJIL;
            C527360KmE editorProBtn = (c528030KnJ2 != null ? c528030KnJ2 : null).getEditorProBtn();
            if (editorProBtn != null) {
                editorProBtn.setContentAlpha(0.34f);
            }
        }
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIIJ() {
        this.LLJJLIIIJLLLLLLLZ.clear();
    }

    @Override // X.InterfaceC522120Kdm
    public final C0HZQ LJIIJJI() {
        C528030KnJ c528030KnJ = this.LLJJJJJIL;
        if (c528030KnJ == null) {
            return null;
        }
        return c528030KnJ.getMultiSelectCheckBox();
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIIL() {
        C528030KnJ c528030KnJ = this.LLJJJJJIL;
        if (c528030KnJ != null) {
            C538480L9y autoCutBtn = c528030KnJ.getAutoCutBtn();
            if (autoCutBtn != null) {
                autoCutBtn.setContentAlpha(1.0f);
            }
            C528030KnJ c528030KnJ2 = this.LLJJJJJIL;
            C527360KmE editorProBtn = (c528030KnJ2 != null ? c528030KnJ2 : null).getEditorProBtn();
            if (editorProBtn != null) {
                editorProBtn.setContentAlpha(1.0f);
            }
        }
    }

    @Override // X.InterfaceC522120Kdm
    public final C05YD<Boolean> LJIILJJIL() {
        return C09IC.LIZIZ(this.LLJL);
    }

    @Override // X.InterfaceC522120Kdm
    public final View LJIIZILJ() {
        C528030KnJ c528030KnJ = this.LLJJJJJIL;
        if (c528030KnJ == null) {
            return null;
        }
        return c528030KnJ.getAIGenerateButton();
    }

    @Override // X.InterfaceC522120Kdm
    public final ArrayList<TikTokMediaModel> LJIL() {
        return this.LLJJJJLIIL == null ? new ArrayList<>() : LJJJJZI();
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJI() {
        C0P0T c0p0t = this.LLLLLLLZIL;
        if (c0p0t != null && c0p0t.isShowing()) {
            c0p0t.dismiss();
        }
        ARunnableS3S0101100_8 aRunnableS3S0101100_8 = this.LLLLLLLLLL;
        if (aRunnableS3S0101100_8 != null) {
            this.LLLLLLZ.removeCallbacks(aRunnableS3S0101100_8);
        }
    }

    @Override // X.InterfaceC522120Kdm
    public final int LJJIFFI() {
        AbstractC529520Kpi abstractC529520Kpi = this.LLJJJJLIIL;
        if (abstractC529520Kpi == null) {
            return -1;
        }
        return abstractC529520Kpi.LLLILZ();
    }

    @Override // X.InterfaceC522120Kdm
    public final boolean LJJIIZ() {
        ShortVideoContext shortVideoContext;
        C0HZQ c0hzqLJIIJJI;
        C0HZQ c0hzqLJJJLIIL;
        if (!this.LLLLZIL && (shortVideoContext = this.LL) != null) {
            C579430Mo1.LIZ.getClass();
            return C579430Mo1.LIZJ(shortVideoContext) && (c0hzqLJIIJJI = LJIIJJI()) != null && c0hzqLJIIJJI.isChecked() && (c0hzqLJJJLIIL = LJJJLIIL()) != null && c0hzqLJJJLIIL.isChecked();
        }
        return false;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIJ() {
        C528030KnJ c528030KnJ = this.LLJJJJJIL;
        if (c528030KnJ == null) {
            return;
        }
        if (c528030KnJ.LJIIJ() && this.LLJJLIIIJLLLLLLLZ.size() == 0) {
            return;
        }
        C528030KnJ c528030KnJ2 = this.LLJJJJJIL;
        if (c528030KnJ2 == null) {
            c528030KnJ2 = null;
        }
        c528030KnJ2.LJIJ(true);
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIJIIJI() {
        CreativeModel creativeModel;
        TemplateData templateData;
        CameraSlotModel cameraSlotModel;
        CreativeModel creativeModel2;
        CreativeModel creativeModel3;
        LJJJJJ();
        C528030KnJ c528030KnJ = this.LLJJJJJIL;
        if (c528030KnJ == null) {
            c528030KnJ = null;
        }
        if (c528030KnJ.getMediaSelectRecyclerView().getParent() == null) {
            return;
        }
        C528030KnJ c528030KnJ2 = this.LLJJJJJIL;
        if (c528030KnJ2 == null) {
            c528030KnJ2 = null;
        }
        TextView sureTextView = c528030KnJ2.getSureTextView();
        if (sureTextView == null) {
            return;
        }
        int i = this.LLILZIL;
        if (i == 45) {
            InterfaceC524200Kh8 interfaceC524200Kh8 = this.LLLIIII;
            if (interfaceC524200Kh8 != null) {
                interfaceC524200Kh8.LIZ(LJJJJZI());
                return;
            }
            return;
        }
        if (i == 58 || this.LLLLZI) {
            if (this.LLLLLZL) {
                C528030KnJ c528030KnJ3 = this.LLJJJJJIL;
                if (c528030KnJ3 == null) {
                    c528030KnJ3 = null;
                }
                NavigationScene navigationSceneLIZ = C528090KnP.LIZ(c528030KnJ3);
                if (navigationSceneLIZ != null && C523910Kgf.LIZIZ(navigationSceneLIZ, C526910KlV.class)) {
                    C528030KnJ c528030KnJ4 = this.LLJJJJJIL;
                    NavigationScene navigationSceneLIZ2 = C528090KnP.LIZ(c528030KnJ4 != null ? c528030KnJ4 : null);
                    if (navigationSceneLIZ2 != null) {
                        navigationSceneLIZ2.LLLLLL();
                        return;
                    }
                    return;
                }
            }
            Function1<? super ArrayList<TikTokMediaModel>, Unit> function1 = this.LLLIIIIL;
            if (function1 != null) {
                function1.invoke(LJJJJZI());
                return;
            }
            return;
        }
        ShortVideoContext shortVideoContext = this.LL;
        if (shortVideoContext != null && (creativeModel3 = shortVideoContext.creativeModel) != null) {
            creativeModel3.autoCutModel = new AutoCutModel(null, null, null, null, 0, 0, false, false, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, 0, null, false, null, 0, 0, null, false, false, null, null, -1, 7, null);
        }
        ShortVideoContext shortVideoContext2 = this.LL;
        if (shortVideoContext2 != null && (creativeModel2 = shortVideoContext2.creativeModel) != null) {
            creativeModel2.liveRecordModel = new LiveRecordModel(new ArrayList());
        }
        C528030KnJ c528030KnJ5 = this.LLJJJJJIL;
        if (c528030KnJ5 == null) {
            c528030KnJ5 = null;
        }
        NavigationScene navigationSceneLIZ3 = C528090KnP.LIZ(c528030KnJ5);
        Boolean boolValueOf = navigationSceneLIZ3 != null ? Boolean.valueOf(C523910Kgf.LIZIZ(navigationSceneLIZ3, C526910KlV.class)) : null;
        ShortVideoContext shortVideoContext3 = this.LL;
        if (shortVideoContext3 != null && (creativeModel = shortVideoContext3.creativeModel) != null && (templateData = creativeModel.templateData) != null && (cameraSlotModel = templateData.getCameraSlotModel()) != null) {
            cameraSlotModel.setFromShotClick(true);
        }
        ArrayList<TikTokMediaModel> arrayListLJIL = LJIL();
        ArrayList arrayList = new ArrayList();
        for (TikTokMediaModel tikTokMediaModel : arrayListLJIL) {
            if (!C528080KnO.LIZ(tikTokMediaModel)) {
                arrayList.add(tikTokMediaModel);
            }
        }
        if (arrayList.size() > 0) {
            this.LLJJLIIIJLLLLLLLZ.clear();
            this.LLJJLIIIJLLLLLLLZ.addAll(arrayList);
        }
        LJJIIJZLJL(sureTextView, false, Intrinsics.LJFF(boolValueOf, Boolean.TRUE), false, false, false, false);
    }

    public final void LJJJ() {
        for (TikTokMediaModel tikTokMediaModel : this.LLJJLIIIJLLLLLLLZ) {
            if (C2471909mP.LJJIII(tikTokMediaModel.LJFF(), false, 4)) {
                tikTokMediaModel.duration = 3000L;
            }
        }
    }

    public final void LJJJI() {
        LivePhotoInfo livePhotoInfo;
        for (TikTokMediaModel tikTokMediaModel : this.LLJJLIIIJLLLLLLLZ) {
            if (C2471909mP.LJJIII(tikTokMediaModel.LJFF(), false, 4)) {
                tikTokMediaModel.duration = 3000L;
                C578570Mmd.LIZ.getClass();
                if (C578570Mmd.LIZ() && tikTokMediaModel.LJIIJJI() && (livePhotoInfo = tikTokMediaModel.livePhotoInfo) != null) {
                    livePhotoInfo.setVideoDuration(VEUtils.getVideoFileInfo(livePhotoInfo.getVideoPath()) != null ? r0.duration : 0L);
                }
                if (!((Boolean) C280530Az5.LIZ.getValue()).booleanValue()) {
                    int i = tikTokMediaModel.width;
                    double d = i;
                    int i2 = tikTokMediaModel.height;
                    double d2 = i2;
                    double d3 = d2 * 2.4d;
                    if (d <= d3 && d2 <= d * 2.4d) {
                        i = 720;
                    }
                    tikTokMediaModel.width = i;
                    double d4 = i;
                    if (d4 <= d3 && d2 <= d4 * 2.4d) {
                        i2 = 1280;
                    }
                    tikTokMediaModel.height = i2;
                }
            }
        }
    }

    public final void LJJJJI() {
        SafeHandler safeHandler = this.LLLLZLL;
        if (safeHandler != null) {
            safeHandler.removeCallbacksAndMessages(null);
        }
        CreativeDialogWrapper creativeDialogWrapper = this.LLLZI;
        if (creativeDialogWrapper != null) {
            creativeDialogWrapper.dismiss();
        }
    }

    public final void LJJJJJ() {
        if (!((Boolean) this.LLZLI.getValue()).booleanValue() || this.LLZL) {
            C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("not call ensureHeavyInit, ab close or done(");
            sbLIZ.append(this.LLZL);
            sbLIZ.append(')');
            C201955140j.LIZJ(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!this.LLZILL) {
            C1AF0.LIZJ("lazilyInit must be called before ensureHeavyInit");
        }
        if (this.LLZ == null || this.LLZIL == null) {
            return;
        }
        View view = this.LLZ;
        if (view == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        String str = this.LLZIL;
        if (str == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        LJJJLZIJ(view, str);
        this.LLZ = null;
        this.LLZIL = null;
    }

    public final C1417720mzq LJJJJLI() {
        return new C1417720mzq(0, 0, this.LLJILJIL.invoke().LJI, this.LLJILJIL.invoke().LJII, 3);
    }

    public final int LJJJJLL() {
        int size = (this.LLLLL - this.LLJJLIIIJLLLLLLLZ.size()) - this.LLLLJI.size();
        if (size < 0) {
            return 0;
        }
        return size;
    }

    public final C0HZQ LJJJLIIL() {
        C528030KnJ c528030KnJ = this.LLJJJJJIL;
        if (c528030KnJ == null) {
            return null;
        }
        return c528030KnJ.getLayoutSwitchCheckBox();
    }

    public final void LJJJZ() {
        TextView textView;
        if (this.LLILLL == null) {
            return;
        }
        C528030KnJ c528030KnJ = this.LLJJJJJIL;
        if (c528030KnJ == null) {
            c528030KnJ = null;
        }
        if (c528030KnJ.LLJI == null) {
            ViewStub viewStub = (ViewStub) c528030KnJ.findViewById(R.id.view_stub_mixed_clear_last_selection);
            if (viewStub != null) {
                C786410Ut5.LJLLLL(viewStub);
            }
            View viewFindViewById = c528030KnJ.findViewById(R.id.e0i);
            c528030KnJ.LLJI = viewFindViewById;
            if (viewFindViewById != null && (textView = (TextView) viewFindViewById.findViewById(R.id.e0n)) != null) {
                textView.setSelected(true);
            }
        }
        C528030KnJ c528030KnJ2 = this.LLJJJJJIL;
        (c528030KnJ2 != null ? c528030KnJ2 : null).setClearSelectionClickListener(new ACListenerS143S0100000_8(this, 74));
        this.LLILLL.fL2().LIZ(this.LLIZ, new AObjectS241S0100000_8(this, 25));
    }

    public final void LJJL() {
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        ShortVideoContext shortVideoContext = this.LL;
        if (shortVideoContext == null || (creativeModel = shortVideoContext.creativeModel) == null || (pUgcTemplateData = creativeModel.pugcTemplateData) == null || !pUgcTemplateData.isFromCreateTemplate || this.LLILZIL != 0) {
            return;
        }
        C528030KnJ c528030KnJ = this.LLJJJJJIL;
        if (c528030KnJ == null) {
            c528030KnJ = null;
        }
        if (c528030KnJ.LLJIJIL == null) {
            ViewStub viewStub = (ViewStub) c528030KnJ.findViewById(R.id.view_stub_mixed_grid_btn);
            if (viewStub != null) {
                C786410Ut5.LJLLLL(viewStub);
            }
            c528030KnJ.LLJIJIL = c528030KnJ.findViewById(R.id.oi_);
            c528030KnJ.LLJILJIL = (TuxTextView) c528030KnJ.findViewById(R.id.oi8);
            View view = c528030KnJ.LLJIJIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
        }
        C528030KnJ c528030KnJ2 = this.LLJJJJJIL;
        (c528030KnJ2 != null ? c528030KnJ2 : null).setCollageClickListener(new ACListenerS143S0100000_8(this, 75));
    }

    public final void LJJLI() {
        ShortVideoContext shortVideoContext;
        if (this.LLJIJIL && (shortVideoContext = this.LL) != null) {
            C579430Mo1.LIZ.getClass();
            if (C579430Mo1.LIZJ(shortVideoContext)) {
                C528030KnJ c528030KnJ = this.LLJJJJJIL;
                if (c528030KnJ == null) {
                    c528030KnJ = null;
                }
                if (c528030KnJ.LLIZ == null) {
                    ViewStub viewStub = (ViewStub) c528030KnJ.findViewById(R.id.view_stub_mixed_layout_switch);
                    if (viewStub != null) {
                        C786410Ut5.LJLLLL(viewStub);
                    }
                    c528030KnJ.LLIZ = c528030KnJ.findViewById(R.id.oia);
                    c528030KnJ.LLJ = (TuxTextView) c528030KnJ.findViewById(R.id.mg5);
                    c528030KnJ.LLIZLLLIL = (C0HZQ) c528030KnJ.findViewById(R.id.mg4);
                }
                C528030KnJ c528030KnJ2 = this.LLJJJJJIL;
                if (c528030KnJ2 == null) {
                    c528030KnJ2 = null;
                }
                c528030KnJ2.setLayoutSwitchClickListener(new ACListenerS143S0100000_8(this, 71));
                C528030KnJ c528030KnJ3 = this.LLJJJJJIL;
                C0HZQ layoutSwitchCheckBox = (c528030KnJ3 != null ? c528030KnJ3 : null).getLayoutSwitchCheckBox();
                if (layoutSwitchCheckBox != null) {
                    C786410Ut5.D7(layoutSwitchCheckBox, new C580920MqQ(this, 2));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v54, types: [REQUEST, X.0kbR] */
    public final void LJJLIIIIJ() {
        ApplyRecordEffectInfo applyRecordEffectInfoLIZLLL;
        Effect effect;
        UrlModel iconUrl;
        List<String> urlList;
        ApplyRecordEffectInfo applyRecordEffectInfoLIZLLL2;
        TuxIconView tuxIconView;
        ViewGroup.LayoutParams layoutParams;
        CreativeModel creativeModel;
        RecordEffectModel recordEffectModel;
        ApplyRecordEffectInfo applyRecordEffectInfo;
        Effect effect2;
        ShortVideoContext shortVideoContext = this.LL;
        if (shortVideoContext == null || !d4.LJJIFFI(shortVideoContext)) {
            return;
        }
        ShortVideoContext shortVideoContext2 = this.LL;
        if (shortVideoContext2 == null || (creativeModel = shortVideoContext2.creativeModel) == null || (recordEffectModel = creativeModel.recordEffectModel) == null || (applyRecordEffectInfo = recordEffectModel.applyRecordEffectInfo) == null || (effect2 = applyRecordEffectInfo.curEffect) == null || !C1449600npG.LJIIIIZZ(effect2)) {
            final C528030KnJ c528030KnJ = this.LLJJJJJIL;
            if (c528030KnJ == null) {
                c528030KnJ = null;
            }
            final ShortVideoContext shortVideoContext3 = this.LL;
            final C1DRG c1drg = this.LLJJI;
            final ACListenerS143S0100000_8 aCListenerS143S0100000_8 = new ACListenerS143S0100000_8(this, 72);
            if (c528030KnJ.LLJILJILJ == null) {
                ViewStub viewStub = (ViewStub) c528030KnJ.findViewById(R.id.view_stub_remove_effect_bar);
                if (viewStub != null) {
                    C786410Ut5.LJLLLL(viewStub);
                }
                boolean zLIZIZ = C0H4W.LIZIZ(c528030KnJ.getContext());
                View viewFindViewById = c528030KnJ.findViewById(R.id.t5z);
                c528030KnJ.LLJILJILJ = viewFindViewById;
                if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
                    View view = c528030KnJ.LLJILJILJ;
                    if (view != null) {
                        C786410Ut5.W5(view, layoutParams);
                    }
                }
                if (zLIZIZ && (tuxIconView = (TuxIconView) c528030KnJ.findViewById(R.id.jww)) != null) {
                    C786410Ut5.Fb(tuxIconView, -15.0f);
                }
                c528030KnJ.LLJILLL = (SmartImageView) c528030KnJ.findViewById(R.id.lfj);
                c528030KnJ.LLJJ = (C371640Ehe) c528030KnJ.findViewById(R.id.f742lip);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, c528030KnJ.getContext());
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    C371640Ehe c371640Ehe = c528030KnJ.LLJJ;
                    if (c371640Ehe != null) {
                        c371640Ehe.setColor(iIntValue);
                    }
                }
                C197039127h c197039127h = (C197039127h) c528030KnJ.findViewById(R.id.tv_remove);
                c528030KnJ.LLJJI = c197039127h;
                if (c197039127h != null) {
                    c197039127h.setMinWidth(0);
                }
                c528030KnJ.LLJJIII = (TuxTextView) c528030KnJ.findViewById(R.id.tv_select_photo);
                int i = (shortVideoContext3 == null || (applyRecordEffectInfoLIZLLL2 = shortVideoContext3.LIZLLL()) == null) ? 1 : applyRecordEffectInfoLIZLLL2.photoSelectMaxCount;
                TuxTextView tuxTextView = c528030KnJ.LLJJIII;
                if (tuxTextView != null) {
                    tuxTextView.setText(i > 1 ? C1710306mr.LIZIZ(2131833501, Integer.valueOf(i)) : C1383370m6R.LJIIJ(2131833503));
                }
                if (shortVideoContext3 != null && (applyRecordEffectInfoLIZLLL = shortVideoContext3.LIZLLL()) != null && (effect = applyRecordEffectInfoLIZLLL.curEffect) != null && (iconUrl = effect.getIconUrl()) != null && (urlList = iconUrl.getUrlList()) != null && (!urlList.isEmpty())) {
                    ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                    imageDecodeOptionsBuilder.LJFF = true;
                    C1329360khK c1329360khK = new C1329360khK(imageDecodeOptionsBuilder);
                    C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse((String) C13LP.LJJJJZI(urlList)));
                    c1325700kbQLIZLLL.LJFF = c1329360khK;
                    c1325700kbQLIZLLL.LIZJ = new C1324630kZh(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(63.25d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(63.25d))));
                    final float dimension = c528030KnJ.getContext().getResources().getDimension(R.dimen.b5);
                    final float fLIZIZ = C418440Gaw.LIZIZ(2);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1b, c528030KnJ.getContext());
                    final int iIntValue2 = numLIZJ2 != null ? numLIZJ2.intValue() : 0;
                    final float f = zLIZIZ ? 8.0f : -8.0f;
                    c1325700kbQLIZLLL.LJIILIIL = new AbstractC1291220jho(dimension, fLIZIZ, f, iIntValue2) { // from class: X.0GVq
                        public final float LIZ;
                        public final float LIZIZ;
                        public final int LIZJ;
                        public final float LIZLLL;

                        @Override // X.AbstractC1291220jho
                        public final void process(Bitmap bitmap, Bitmap bitmap2) {
                            Canvas canvas = new Canvas(bitmap);
                            Paint paint = new Paint();
                            paint.setAntiAlias(true);
                            paint.setFilterBitmap(true);
                            int width = bitmap.getWidth();
                            double d = width;
                            float f2 = 2;
                            double dAbs = (d / (Math.abs(Math.cos(((double) this.LIZLLL) * 1.0d)) + Math.abs(Math.sin(((double) this.LIZLLL) * 1.0d)))) - ((double) (this.LIZIZ * f2));
                            double d2 = dAbs / d;
                            canvas.save();
                            float f3 = width / 2.0f;
                            canvas.rotate(this.LIZLLL, f3, f3);
                            float f4 = ((float) (d - dAbs)) / f2;
                            float f5 = this.LIZIZ;
                            float f6 = f4 - (f5 / f2);
                            float f7 = (((float) (d + dAbs)) / f2) + (f5 / f2);
                            RectF rectF = new RectF(f6, f6, f7, f7);
                            Path path = new Path();
                            float f8 = this.LIZ;
                            path.addRoundRect(rectF, f8, f8, Path.Direction.CW);
                            canvas.save();
                            canvas.clipPath(path);
                            Matrix matrix = new Matrix();
                            float f9 = (float) d2;
                            matrix.setScale(f9, f9);
                            matrix.postTranslate(f4, f4);
                            canvas.drawBitmap(bitmap2, matrix, paint);
                            canvas.restore();
                            Paint paint2 = new Paint();
                            paint2.setAntiAlias(true);
                            paint2.setStyle(Paint.Style.STROKE);
                            paint2.setColor(this.LIZJ);
                            paint2.setStrokeWidth(this.LIZIZ);
                            float f10 = this.LIZ;
                            canvas.drawRoundRect(rectF, f10, f10, paint2);
                            canvas.restore();
                        }

                        {
                            this.LIZ = dimension;
                            this.LIZIZ = fLIZIZ;
                            this.LIZJ = iIntValue2;
                            this.LIZLLL = f;
                        }
                    };
                    ?? LIZ = c1325700kbQLIZLLL.LIZ();
                    C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                    c1320810kTXLIZJ.LIZLLL = LIZ;
                    c1320810kTXLIZJ.LJIIJJI = false;
                    SmartImageView smartImageView = c528030KnJ.LLJILLL;
                    c1320810kTXLIZJ.LJIILJJIL = smartImageView != null ? smartImageView.getController() : null;
                    AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
                    SmartImageView smartImageView2 = c528030KnJ.LLJILLL;
                    if (smartImageView2 != null) {
                        smartImageView2.setController(abstractC1320710kTNLIZ);
                    }
                }
                C197039127h c197039127h2 = c528030KnJ.LLJJI;
                if (c197039127h2 != null) {
                    C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0KnW
                        @Override // X.AbstractViewOnClickListenerC1173120gdK
                        public final void LIZ(View view2) {
                            View view3 = c528030KnJ.LLJILJILJ;
                            if (view3 != null) {
                                view3.animate().alpha(0.0f).setDuration(150L).withEndAction(new ARunnableS17S0400000_8(c1drg, c528030KnJ, shortVideoContext3, aCListenerS143S0100000_8, 4)).start();
                            }
                        }
                    }, c197039127h2);
                }
                C197039127h c197039127h3 = c528030KnJ.LLJJI;
                if (c197039127h3 != null) {
                    c197039127h3.setTuxFont(52);
                }
                c528030KnJ.LJIJ(false);
            }
            C528170KnX.LIZ.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", "album_panel");
            C20684815ws.LJIILLIIL("ttcrt_remove_button_show", c0lab.LIZ);
        }
    }

    public final boolean LJJLIIIJ() {
        int i = this.LLLIIL;
        return i == 25 || i == 49 || i == 58;
    }

    public final boolean LJJLIIIJILLIZJL() {
        return this.LLLIIL == 29 && C527950KnB.LIZ() == 0;
    }

    public final boolean LJJLIIIJJIZ() {
        return this.LLLIIL == 10;
    }

    public final boolean LJJLIIIJL() {
        return this.LLLIIL == 1;
    }

    public final boolean LJJLIIIJLLLLLLLZ() {
        return this.LLLIIL == 36;
    }

    public final boolean LJJLIIJ() {
        ShortVideoContext shortVideoContext;
        VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
        return (videoPublishEditModel != null && videoPublishEditModel.creativeModel.imageEffectTemplateData.isTemplateFromAnchor) || ((shortVideoContext = this.LL) != null && shortVideoContext.LJJIJIIJIL()) || this.LLJ;
    }

    public final boolean LJJLIL() {
        return this.LLLIIL == 20;
    }

    public final boolean LJJLJ() {
        return this.LLLIIL == 24;
    }

    public final void LJJZ() {
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        ShortVideoContext shortVideoContext = this.LL;
        if (shortVideoContext == null || (creativeModel = shortVideoContext.creativeModel) == null || (pUgcTemplateData = creativeModel.pugcTemplateData) == null || !pUgcTemplateData.isFromCreateTemplate) {
            return;
        }
        int size = this.LLJJLIIIJLLLLLLLZ.size();
        boolean z = 2 <= size && size < 13;
        C528030KnJ c528030KnJ = this.LLJJJJJIL;
        if (c528030KnJ == null) {
            c528030KnJ = null;
        }
        c528030KnJ.LJIJJ(z);
    }

    public final void LJJZZIII() {
        boolean z;
        boolean z2 = false;
        if (this.LLJJLIIIJLLLLLLLZ.size() > C578540Mma.LIZ().maxUploadGridCount) {
            z = false;
        } else {
            z = true;
            C530280Kqw c530280Kqw = new C530280Kqw();
            Iterator<TikTokMediaModel> it2 = this.LLJJLIIIJLLLLLLLZ.iterator();
            while (it2.hasNext()) {
                if (!c530280Kqw.LIZIZ(it2.next())) {
                    break;
                }
            }
        }
        z2 = z;
        C528030KnJ c528030KnJ = this.LLJJJJJIL;
        if (c528030KnJ == null) {
            c528030KnJ = null;
        }
        c528030KnJ.setLayoutSwitchEnableStatus(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x022d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x038e A[EDGE_INSN: B:393:0x038e->B:295:0x038e BREAK  A[LOOP:0: B:289:0x0376->B:394:0x0376]] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:398:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:399:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089 A[PHI: r0
      0x0089: PHI (r0v220 java.lang.String) = (r0v217 java.lang.String), (r0v226 java.lang.String) binds: [B:40:0x0086, B:25:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJL() {
        /*
            Method dump skipped, instruction units count: 1325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController.LJL():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLI() {
        /*
            r2 = this;
            X.1DDq r1 = r2.LLJL
            boolean r0 = r2.LJJLIIIJJIZ()
            if (r0 != 0) goto L2c
            boolean r0 = r2.LJJLIL()
            if (r0 != 0) goto L2c
            boolean r0 = r2.LJJLJ()
            if (r0 != 0) goto L2c
            boolean r0 = r2.LJJLIIIJILLIZJL()
            if (r0 != 0) goto L2c
            boolean r0 = r2.LJJLIIIJLLLLLLLZ()
            if (r0 != 0) goto L2c
            boolean r0 = r2.LJJLIIIJ()
            if (r0 == 0) goto L42
            boolean r0 = X.C290470Ba1.LIZ()
            if (r0 == 0) goto L42
        L2c:
            X.0Kpi r0 = r2.LLJJJJLIIL
            if (r0 != 0) goto L31
            r0 = 0
        L31:
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r0 = r0.LL
            int r0 = r0.size()
            if (r0 <= 0) goto L4b
        L39:
            r0 = 1
        L3a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.setValue(r0)
            return
        L42:
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r0 = r2.LLJJLIIIJLLLLLLLZ
            int r0 = r0.size()
            if (r0 <= 0) goto L4b
            goto L39
        L4b:
            r0 = 0
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController.LJLI():void");
    }

    public final void LJLIL() {
        int i = 1;
        for (TikTokMediaModel tikTokMediaModel : this.LLJJLIIIJLLLLLLLZ) {
            tikTokMediaModel.selectIndex = i;
            if (this.LLLLLL) {
                tikTokMediaModel.mediaIndex = i - 1;
            }
            i++;
        }
    }

    public final void LJLJL() {
        if (this.LLLILZJ.isEmpty()) {
            return;
        }
        int i = 0;
        for (CutSameVideoImageExtraData cutSameVideoImageExtraData : this.LLLILZJ) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            CutSameVideoImageExtraData cutSameVideoImageExtraData2 = cutSameVideoImageExtraData;
            AbstractC529520Kpi abstractC529520Kpi = this.LLJJJJLIIL;
            if (abstractC529520Kpi == null) {
                abstractC529520Kpi = null;
            }
            if (!abstractC529520Kpi.LL.isEmpty()) {
                AbstractC529520Kpi abstractC529520Kpi2 = this.LLJJJJLIIL;
                if (abstractC529520Kpi2 == null) {
                    abstractC529520Kpi2 = null;
                }
                if (i < abstractC529520Kpi2.LL.size()) {
                    AbstractC529520Kpi abstractC529520Kpi3 = this.LLJJJJLIIL;
                    MediaModel mediaModel = (MediaModel) ListProtector.get((abstractC529520Kpi3 != null ? abstractC529520Kpi3 : null).LL, i);
                    if (LJJLIL()) {
                        mediaModel.startTime = 0;
                        mediaModel.endTime = (int) cutSameVideoImageExtraData2.extraDuration;
                    } else if (LJJLJ() && !((Boolean) C0AYB.LIZ.getValue()).booleanValue()) {
                        int i3 = mediaModel.startTime;
                        if (i3 < 0) {
                            i3 = 0;
                        }
                        mediaModel.startTime = i3;
                        int i4 = mediaModel.endTime;
                        int i5 = (int) cutSameVideoImageExtraData2.extraDuration;
                        if (i4 < i5) {
                            i4 = i5;
                        }
                        mediaModel.endTime = i4;
                    }
                    if (mediaModel.LJIIJ()) {
                        mediaModel.duration = 3000L;
                        mediaModel.width = 720;
                        mediaModel.height = 1280;
                    } else {
                        long j = mediaModel.duration;
                        long j2 = (int) j;
                        long j3 = cutSameVideoImageExtraData2.extraDuration;
                        if (j2 < j3 && ((int) j3) != 0) {
                            mediaModel.speed = ((j * 1.0f) / j3) * 1.0f;
                        }
                    }
                }
            }
            i = i2;
        }
    }

    @Override // X.InterfaceC522120Kdm
    public final void onPause() {
        C528030KnJ c528030KnJ = this.LLJJJJJIL;
        if (c528030KnJ == null) {
            return;
        }
        C538480L9y autoCutBtn = c528030KnJ.getAutoCutBtn();
        if (autoCutBtn != null) {
            autoCutBtn.LIZ();
        }
        C0P0T c0p0t = this.LLLLZLLIL;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        SafeHandler safeHandler = this.LLLLZLL;
        if (safeHandler != null) {
            safeHandler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.InterfaceC522120Kdm
    public final CutSameVideoImageExtraData LJIJI() {
        LJJJJJ();
        AbstractC529520Kpi abstractC529520Kpi = this.LLJJJJLIIL;
        if (abstractC529520Kpi == null) {
            abstractC529520Kpi = null;
        }
        return abstractC529520Kpi.LLLJIL();
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIL() {
        LJJJJJ();
        C528030KnJ c528030KnJ = this.LLJJJJJIL;
        if (c528030KnJ == null) {
            c528030KnJ = null;
        }
        C197039127h c197039127h = c528030KnJ.LLJJIJIL;
        if (c197039127h != null) {
            c197039127h.performClick();
        }
    }

    public final Integer LJJJJZ() {
        CopyOnWriteArrayList<CutSameVideoImageExtraData> copyOnWriteArrayList;
        CopyOnWriteArrayList<CutSameVideoImageExtraData> copyOnWriteArrayList2;
        CutSameVideoImageExtraData cutSameVideoImageExtraData;
        if (LJJLJ()) {
            AbstractC529520Kpi abstractC529520Kpi = this.LLJJJJLIIL;
            if (abstractC529520Kpi == null) {
                abstractC529520Kpi = null;
            }
            int iLLLILZ = abstractC529520Kpi.LLLILZ();
            int i = 0;
            if (iLLLILZ >= 0 && (copyOnWriteArrayList = this.LLLILZJ) != null && iLLLILZ < copyOnWriteArrayList.size() && (copyOnWriteArrayList2 = this.LLLILZJ) != null && (cutSameVideoImageExtraData = copyOnWriteArrayList2.get(iLLLILZ)) != null && cutSameVideoImageExtraData.materialType != null) {
                String str = cutSameVideoImageExtraData.materialType;
                if (Intrinsics.LJFF(str, "video")) {
                    i = 2;
                } else if (Intrinsics.LJFF(str, "image")) {
                    i = 1;
                }
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    public final ArrayList<TikTokMediaModel> LJJJJZI() {
        if (!LJJLIIIJJIZ() && !LJJLIL() && !LJJLJ() && !LJJLIIIJILLIZJL() && !LJJLIIIJLLLLLLLZ() && (!LJJLIIIJ() || !C290470Ba1.LIZ())) {
            return this.LLJJLIIIJLLLLLLLZ;
        }
        AbstractC529520Kpi abstractC529520Kpi = this.LLJJJJLIIL;
        if (abstractC529520Kpi == null) {
            abstractC529520Kpi = null;
        }
        return abstractC529520Kpi.LL;
    }

    public final void LJLIIL() {
        LJJI();
        LJL();
        LJLI();
        LJJLL(true);
        LJJZZIII();
        LJJZ();
        if (LJJLIIIJJIZ()) {
            C528030KnJ c528030KnJ = this.LLJJJJJIL;
            if (c528030KnJ == null) {
                c528030KnJ = null;
            }
            AbstractC529520Kpi abstractC529520Kpi = this.LLJJJJLIIL;
            if (abstractC529520Kpi == null) {
                abstractC529520Kpi = null;
            }
            c528030KnJ.LIZJ(abstractC529520Kpi.LLLILZ() + 1);
        }
        if (LJJLIL() || LJJLJ() || LJJLIIIJILLIZJL() || LJJLIIIJLLLLLLLZ()) {
            C528030KnJ c528030KnJ2 = this.LLJJJJJIL;
            if (c528030KnJ2 == null) {
                c528030KnJ2 = null;
            }
            AbstractC529520Kpi abstractC529520Kpi2 = this.LLJJJJLIIL;
            c528030KnJ2.LIZJ((abstractC529520Kpi2 != null ? abstractC529520Kpi2 : null).LLLILZ() + 1);
        }
    }

    @Override // X.InterfaceC522120Kdm
    public final List<TikTokMediaModel> LIZJ() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public static ArrayList LJJJJJL(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            MediaModel mediaModel = (MediaModel) it2.next();
            if (mediaModel != null && (!TextUtils.isEmpty(mediaModel.LJFF()) || !TextUtils.isEmpty(mediaModel.thumbnail))) {
                arrayList2.add(mediaModel);
            }
        }
        return arrayList2;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LIZIZ(C0L90 c0l90) {
        View viewLIZLLL;
        LJJJJJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scenario=");
        sbLIZ.append(c0l90);
        sbLIZ.append(' ');
        sbLIZ.append(LJJJJ(this.LLJJLIIIJLLLLLLLZ));
        C2188811AlT.LIZIZ(sbLIZ);
        if (c0l90 == C0L90.SELECTION_RESTORE && this.LLJJJJLIIL != null) {
            InterfaceC524880KiE interfaceC524880KiE = this.LLILLL;
            if (interfaceC524880KiE != null) {
                interfaceC524880KiE.bm2();
            }
            AbstractC529520Kpi abstractC529520Kpi = this.LLJJJJLIIL;
            if (abstractC529520Kpi == null) {
                abstractC529520Kpi = null;
            }
            abstractC529520Kpi.LLLI(this.LLJJLIIIJLLLLLLLZ);
            LJLIIIL(this, true);
            return;
        }
        if (c0l90 != C0L90.PRIVACY_ALBUM_SELECTION || (viewLIZLLL = LIZLLL()) == null) {
            return;
        }
        LJJIIJZLJL(viewLIZLLL, false, false, false, false, false, true);
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJII(C522090Kdj c522090Kdj) {
        this.LLLI = c522090Kdj.LIZ;
        this.LLLII = c522090Kdj.LIZIZ;
        this.LLLIIII = c522090Kdj.LIZJ;
        this.LLLIIIIL = c522090Kdj.LIZLLL;
        this.LLLIIIL = c522090Kdj.LJ;
        this.LLLIIL = c522090Kdj.LJFF;
        this.LLLIILIL = c522090Kdj.LJI;
        this.LLLIL = c522090Kdj.LJII;
        this.LLLILZ = c522090Kdj.LJIIIIZZ;
        this.LLLILZLLLI = c522090Kdj.LJIIJ;
        this.LLLIZZ = c522090Kdj.LJIIJJI;
        this.LLLL = c522090Kdj.LJIILL;
        this.LLLLII = c522090Kdj.LJIILLIIL;
        this.LLLJ = c522090Kdj.LJIIL;
        this.LLLJIL = c522090Kdj.LJIILIIL;
        this.LLLJL = c522090Kdj.LJIILJJIL;
        this.LLLLIIL = c522090Kdj.LJIJI;
        this.LLLLIIIILLL = c522090Kdj.LJIJJ;
        this.LLLLIL = c522090Kdj.LJJIIJZLJL;
        this.LLLLILI = c522090Kdj.LJJIIZ;
        this.LLLLJ = c522090Kdj.LJIIIZ;
        this.LLLFZ = c522090Kdj.LJIIZILJ;
        this.LLLLJI = c522090Kdj.LJJ;
        this.LLLILZJ.clear();
        this.LLLILZJ.addAll(c522090Kdj.LJJI);
        LJIILIIL(c522090Kdj.LJIJJLI);
        this.LLLLLIL = c522090Kdj.LJIL;
        this.LLLLLJIL = c522090Kdj.LJJIFFI;
        this.LLLLLJLJLL = c522090Kdj.LJJII;
        this.LLLLLLIL = c522090Kdj.LJJIII;
        this.LLILZIL = c522090Kdj.LJJIIJ;
        this.LLLLLLJ = c522090Kdj.LJJIIZI;
        this.LLLLLLLLL = c522090Kdj.LJJIJ;
        this.LLLLLLZZ = c522090Kdj.LJJIJIIJI;
        this.LLLLLZ = c522090Kdj.LJJIJIIJIL;
        this.LLLLLZIL = c522090Kdj.LJIJ;
        this.LLLLLZL = c522090Kdj.LJJIJIL;
        this.LLLLZ = c522090Kdj.LJJIJL;
        this.LLLLZI = c522090Kdj.LJJIJLIJ;
    }

    @Override // X.InterfaceC522120Kdm
    public final View LJIIIZ(TikTokMediaModel tikTokMediaModel) {
        int iIndexOf;
        View viewFindViewByPosition;
        if (tikTokMediaModel == null || this.LLJJJJLIIL == null || (iIndexOf = LJIL().indexOf(tikTokMediaModel)) < 0) {
            return null;
        }
        C528030KnJ c528030KnJ = this.LLJJJJJIL;
        if (c528030KnJ == null) {
            c528030KnJ = null;
        }
        RecyclerView.LayoutManager layoutManager = c528030KnJ.getMediaSelectRecyclerView().getLayoutManager();
        if (layoutManager == null || (viewFindViewByPosition = layoutManager.findViewByPosition(iIndexOf)) == null) {
            return null;
        }
        return viewFindViewByPosition.findViewById(R.id.video_cover);
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIILIIL(int i) {
        ShortVideoContext shortVideoContext;
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        int i2 = this.LLLIIL;
        if (i2 != 10 && i2 != 20 && i2 != 24 && i2 != 29 && i2 != 18 && i2 != 27 && i2 != 25 && i2 != 49 && i2 != 58 && i2 != 26 && i2 != 36 && i2 != 38 && i2 != 39 && i2 != 37 && i2 != 54 && i2 != 60 && i2 != 68 && !LJJIIZ() && (((shortVideoContext = this.LL) == null || !d4.LJJIFFI(shortVideoContext)) && this.LLILZIL != 66)) {
            ShortVideoContext shortVideoContext2 = this.LL;
            if (shortVideoContext2 != null && (creativeModel = shortVideoContext2.creativeModel) != null && (pUgcTemplateData = creativeModel.pugcTemplateData) != null && pUgcTemplateData.isFromCreateTemplate && C289500BWi.LIZ()) {
                C533730KwV.LIZ.getClass();
                i = C533730KwV.LJIIIZ();
            } else {
                C533730KwV.LIZ.getClass();
                i = C533730KwV.LJII();
            }
        }
        this.LLLLL = i;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIJ(boolean z) {
        C528030KnJ c528030KnJ = this.LLJJJJJIL;
        if (c528030KnJ == null) {
            return;
        }
        if (z) {
            View view = c528030KnJ.LLJJJJLIIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View view2 = c528030KnJ.LLJJL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
                return;
            }
            return;
        }
        View view3 = c528030KnJ.LLJJL;
        if (view3 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view3);
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIJJ(TikTokMediaModel tikTokMediaModel) {
        C528040KnK c528040KnK = this.LLJJL;
        if (c528040KnK != null) {
            c528040KnK.LIZIZ(tikTokMediaModel);
        }
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJII(boolean z) {
        C528030KnJ c528030KnJ = null;
        if (z) {
            LJJJJJ();
            C528030KnJ c528030KnJ2 = this.LLJJJJJIL;
            if (c528030KnJ2 != null) {
                c528030KnJ = c528030KnJ2;
            }
            C786410Ut5.K0(c528030KnJ, 0);
            return;
        }
        C528030KnJ c528030KnJ3 = this.LLJJJJJIL;
        if (c528030KnJ3 == null) {
            return;
        }
        C786410Ut5.K0(c528030KnJ3, 8);
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIII(Function0<Unit> function0) {
        if (!this.LLJJLIIIJLLLLLLLZ.isEmpty()) {
            this.LLJJLIIIJLLLLLLLZ.clear();
            AbstractC529520Kpi abstractC529520Kpi = this.LLJJJJLIIL;
            C528030KnJ c528030KnJ = null;
            if (abstractC529520Kpi == null) {
                abstractC529520Kpi = null;
            }
            abstractC529520Kpi.LLLLILI(C13BV.INSTANCE);
            function0.invoke();
            C528030KnJ c528030KnJ2 = this.LLJJJJJIL;
            if (c528030KnJ2 != null) {
                c528030KnJ = c528030KnJ2;
            }
            c528030KnJ.LJIL(false);
            LJJJIL(false);
            LJL();
            LJLI();
            LJJLL(true);
            LJJZZIII();
            LJJZ();
            LJJZZI(new C526850KlP(false));
        }
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIIJ(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C528030KnJ c528030KnJ = this.LLJJJJJIL;
        if (c528030KnJ == null) {
            return;
        }
        if (z) {
            C197039127h c197039127h = c528030KnJ.LLJJIJI;
            if (c197039127h != null) {
                C786410Ut5.LLLLLLJ(c197039127h, 0);
            }
        } else {
            C197039127h c197039127h2 = c528030KnJ.LLJJIJI;
            if (c197039127h2 != null) {
                C786410Ut5.LLLLLLJ(c197039127h2, 8);
            }
        }
        C528030KnJ c528030KnJ2 = null;
        if (z) {
            if (this.LLJJJJLIIL != null) {
                LJL();
            }
        } else {
            C528030KnJ c528030KnJ3 = this.LLJJJJJIL;
            if (c528030KnJ3 == null) {
                c528030KnJ3 = null;
            }
            TuxIconView tuxIconView = c528030KnJ3.LLJJIJIIJIL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
            C538480L9y c538480L9y = c528030KnJ3.LLJL;
            if (c538480L9y != null) {
                layoutParams = c538480L9y.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginEnd(0);
                C538480L9y c538480L9y2 = c528030KnJ3.LLJL;
                if (c538480L9y2 != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c538480L9y2);
                    c538480L9y2.setLayoutParams(marginLayoutParams);
                }
            }
        }
        this.LLJJLIIIJLLLLLLLZ.clear();
        AbstractC529520Kpi abstractC529520Kpi = this.LLJJJJLIIL;
        if (abstractC529520Kpi != null) {
            abstractC529520Kpi.LL.clear();
            AbstractC529520Kpi abstractC529520Kpi2 = this.LLJJJJLIIL;
            if (abstractC529520Kpi2 == null) {
                abstractC529520Kpi2 = null;
            }
            abstractC529520Kpi2.notifyDataSetChanged();
            C528030KnJ c528030KnJ4 = this.LLJJJJJIL;
            if (c528030KnJ4 == null) {
                c528030KnJ4 = null;
            }
            c528030KnJ4.LJIL(false);
            C528030KnJ c528030KnJ5 = this.LLJJJJJIL;
            if (c528030KnJ5 == null) {
                c528030KnJ5 = null;
            }
            TextView sureTextView = c528030KnJ5.getSureTextView();
            if (sureTextView != null) {
                String string = this.LLLLLZIL;
                if (string == null) {
                    C528030KnJ c528030KnJ6 = this.LLJJJJJIL;
                    if (c528030KnJ6 == null) {
                        c528030KnJ6 = null;
                    }
                    string = c528030KnJ6.getContext().getString(R.string.m6n);
                }
                sureTextView.setText(string);
            }
            LJJJIL(false);
            LJJLL(true);
            C528030KnJ c528030KnJ7 = this.LLJJJJJIL;
            if (c528030KnJ7 != null) {
                c528030KnJ2 = c528030KnJ7;
            }
            c528030KnJ2.LJIJJ(false);
        }
        this.LLLZL.setValue(Boolean.valueOf(LJJIIZ()));
        if (!z) {
            LJJZZI(new C526850KlP(false));
        }
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIIZI(Map<String, LivePhotoInfo> map) {
        LJJJJJ();
        AbstractC529520Kpi abstractC529520Kpi = this.LLJJJJLIIL;
        if (abstractC529520Kpi == null) {
            abstractC529520Kpi = null;
        }
        abstractC529520Kpi.LLJI = map;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIJIIJIL(boolean z) {
        this.LLLLLL = z;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIJL(List<? extends TikTokMediaModel> list) {
        AbstractC529520Kpi abstractC529520Kpi;
        Iterator<? extends TikTokMediaModel> it2 = list.iterator();
        while (true) {
            abstractC529520Kpi = null;
            if (!it2.hasNext()) {
                break;
            }
            TikTokMediaModel next = it2.next();
            if (next.LJIIJJI()) {
                C525050KiV.LIZIZ(next, this.LLJJLIIIJLLLLLLLZ);
                AbstractC529520Kpi abstractC529520Kpi2 = this.LLJJJJLIIL;
                if (abstractC529520Kpi2 != null) {
                    C525050KiV.LIZIZ(next, abstractC529520Kpi2.LL);
                }
            }
        }
        boolean z = false;
        if (!list.isEmpty()) {
            Iterator<? extends TikTokMediaModel> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                } else if (it3.next().LJIIJJI()) {
                    z = true;
                    break;
                }
            }
        }
        if (this.LLJJJJLIIL != null) {
            if (C529980KqS.LIZJ(this.LLILZIL) || z) {
                AbstractC529520Kpi abstractC529520Kpi3 = this.LLJJJJLIIL;
                if (abstractC529520Kpi3 != null) {
                    abstractC529520Kpi = abstractC529520Kpi3;
                }
                abstractC529520Kpi.LLLLIIL(list);
            }
        }
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIJLIJ(int i) {
        int iLLLLLJLJLL;
        C529530Kpj c529530Kpj;
        int i2;
        AbstractC529520Kpi abstractC529520Kpi = this.LLJJJJLIIL;
        C528030KnJ c528030KnJ = null;
        if (abstractC529520Kpi == null) {
            abstractC529520Kpi = null;
        }
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) ListProtector.get(abstractC529520Kpi.LL, i);
        AbstractC529520Kpi abstractC529520Kpi2 = this.LLJJJJLIIL;
        if (abstractC529520Kpi2 == null) {
            abstractC529520Kpi2 = null;
        }
        abstractC529520Kpi2.LLLLLIL(tikTokMediaModel);
        if (LJJLJ() || 29 == (i2 = this.LLILZIL) || 6 == i2) {
            C528030KnJ c528030KnJ2 = this.LLJJJJJIL;
            if (c528030KnJ2 == null) {
                c528030KnJ2 = null;
            }
            AbstractC21673619ry adapter = c528030KnJ2.getMediaSelectRecyclerView().getAdapter();
            if ((adapter instanceof C529530Kpj) && (c529530Kpj = (C529530Kpj) adapter) != null) {
                c529530Kpj.LLJILJILJ = i;
                iLLLLLJLJLL = c529530Kpj.LLLLLJLJLL();
                c529530Kpj.LLJILJILJ = iLLLLLJLJLL;
            } else {
                iLLLLLJLJLL = i;
            }
            if (iLLLLLJLJLL > 4) {
                C528030KnJ c528030KnJ3 = this.LLJJJJJIL;
                if (c528030KnJ3 != null) {
                    c528030KnJ = c528030KnJ3;
                }
                c528030KnJ.LIZJ(i);
                return;
            }
            C528030KnJ c528030KnJ4 = this.LLJJJJJIL;
            if (c528030KnJ4 != null) {
                c528030KnJ = c528030KnJ4;
            }
            c528030KnJ.LIZLLL(i);
        }
    }

    public final void LJJJIL(boolean z) {
        Integer numLIZJ;
        AlbumDefaultBottomActionBarConfig albumDefaultBottomActionBarConfig;
        AlbumNextButtonConfig albumNextButtonConfigO7;
        int iIntValue;
        Integer numLIZJ2;
        Drawable drawable;
        Drawable drawable2;
        C197039127h c197039127h;
        Integer numValueOf;
        Integer numLIZJ3;
        AlbumDefaultBottomActionBarConfig albumDefaultBottomActionBarConfig2;
        AlbumNextButtonConfig albumNextButtonConfigO72;
        Drawable drawable3;
        int iIntValue2;
        Integer numLIZJ4;
        this.LLLLLILLIL = z;
        C528030KnJ c528030KnJ = this.LLJJJJJIL;
        Integer num = null;
        if (c528030KnJ == null) {
            c528030KnJ = null;
        }
        int i = R.attr.a0p;
        int iIntValue3 = -1;
        if (z) {
            C197039127h c197039127h2 = c528030KnJ.LLJJIJIL;
            if (c197039127h2 != null) {
                c197039127h2.setEnabled(true);
            }
            C197039127h c197039127h3 = c528030KnJ.LLJJJ;
            if (c197039127h3 != null) {
                c197039127h3.setEnabled(true);
            }
            VideoImageMixedInitParam videoImageMixedInitParam = c528030KnJ.LLILLL;
            if (videoImageMixedInitParam != null && C522930Kf5.LIZIZ(videoImageMixedInitParam.chooseScene)) {
                C197039127h c197039127h4 = c528030KnJ.LLJJIJI;
                if (c197039127h4 != null) {
                    Context context = c528030KnJ.getContext();
                    if (context != null && (numLIZJ4 = C1308910kAL.LIZJ(R.attr.z_, context)) != null) {
                        iIntValue2 = numLIZJ4.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    c197039127h4.setTextColor(iIntValue2);
                }
            } else {
                VideoImageMixedInitParam videoImageMixedInitParam2 = c528030KnJ.LLILLL;
                if (videoImageMixedInitParam2 != null && (albumDefaultBottomActionBarConfig2 = videoImageMixedInitParam2.openApiConfig) != null && (albumNextButtonConfigO72 = albumDefaultBottomActionBarConfig2.O7()) != null) {
                    i = albumNextButtonConfigO72.nextBtnTitleColor;
                }
                C197039127h c197039127h5 = c528030KnJ.LLJJIJI;
                if (c197039127h5 != null) {
                    Context context2 = c528030KnJ.getContext();
                    if (context2 != null && (numLIZJ3 = C1308910kAL.LIZJ(i, context2)) != null) {
                        iIntValue3 = numLIZJ3.intValue();
                    }
                    c197039127h5.setTextColor(iIntValue3);
                }
            }
            C197039127h c197039127h6 = c528030KnJ.LLJJIJI;
            if (c197039127h6 != null) {
                VideoImageMixedInitParam videoImageMixedInitParam3 = c528030KnJ.LLILLL;
                if (videoImageMixedInitParam3 != null) {
                    drawable3 = videoImageMixedInitParam3.clickableDrawable;
                } else {
                    drawable3 = null;
                }
                c197039127h6.setBackground(drawable3);
            }
            c528030KnJ.LJIIIIZZ();
            C197039127h c197039127h7 = c528030KnJ.LLJJIJI;
            if (c197039127h7 != null) {
                C786410Ut5.w5(c197039127h7, 1.0f);
            }
        } else {
            C197039127h c197039127h8 = c528030KnJ.LLJJIJIL;
            if (c197039127h8 != null) {
                c197039127h8.setEnabled(false);
            }
            VideoImageMixedInitParam videoImageMixedInitParam4 = c528030KnJ.LLILLL;
            if (videoImageMixedInitParam4 != null && videoImageMixedInitParam4.isUgcTemplate()) {
                C197039127h c197039127h9 = c528030KnJ.LLJJIJI;
                if (c197039127h9 != null) {
                    VideoImageMixedInitParam videoImageMixedInitParam5 = c528030KnJ.LLILLL;
                    if (videoImageMixedInitParam5 != null) {
                        drawable2 = videoImageMixedInitParam5.clickableDrawable;
                    } else {
                        drawable2 = null;
                    }
                    c197039127h9.setBackground(drawable2);
                }
                C197039127h c197039127h10 = c528030KnJ.LLJJIJI;
                if (c197039127h10 != null) {
                    c197039127h10.setTextColor(-1);
                }
                c528030KnJ.LJIIIIZZ();
                C197039127h c197039127h11 = c528030KnJ.LLJJIJI;
                if (c197039127h11 != null) {
                    C786410Ut5.w5(c197039127h11, 0.34f);
                }
            } else {
                C197039127h c197039127h12 = c528030KnJ.LLJJIJI;
                if (c197039127h12 != null) {
                    VideoImageMixedInitParam videoImageMixedInitParam6 = c528030KnJ.LLILLL;
                    if (videoImageMixedInitParam6 != null) {
                        drawable = videoImageMixedInitParam6.unClickableDrawable;
                    } else {
                        drawable = null;
                    }
                    c197039127h12.setBackground(drawable);
                }
                VideoImageMixedInitParam videoImageMixedInitParam7 = c528030KnJ.LLILLL;
                if (videoImageMixedInitParam7 != null && C522930Kf5.LIZIZ(videoImageMixedInitParam7.chooseScene)) {
                    C197039127h c197039127h13 = c528030KnJ.LLJJIJI;
                    if (c197039127h13 != null) {
                        Context context3 = c528030KnJ.getContext();
                        if (context3 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.z_, context3)) != null) {
                            iIntValue = numLIZJ2.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        c197039127h13.setTextColor(iIntValue);
                    }
                } else {
                    VideoImageMixedInitParam videoImageMixedInitParam8 = c528030KnJ.LLILLL;
                    if (videoImageMixedInitParam8 != null && (albumDefaultBottomActionBarConfig = videoImageMixedInitParam8.openApiConfig) != null && (albumNextButtonConfigO7 = albumDefaultBottomActionBarConfig.O7()) != null) {
                        i = albumNextButtonConfigO7.nextBtnTitleColor;
                    }
                    C197039127h c197039127h14 = c528030KnJ.LLJJIJI;
                    if (c197039127h14 != null) {
                        Context context4 = c528030KnJ.getContext();
                        if (context4 != null && (numLIZJ = C1308910kAL.LIZJ(i, context4)) != null) {
                            iIntValue3 = numLIZJ.intValue();
                        }
                        c197039127h14.setTextColor(iIntValue3);
                    }
                }
                c528030KnJ.LJIIIIZZ();
                C197039127h c197039127h15 = c528030KnJ.LLJJIJI;
                if (c197039127h15 != null) {
                    C786410Ut5.w5(c197039127h15, 0.5f);
                }
            }
        }
        VideoImageMixedInitParam videoImageMixedInitParam9 = c528030KnJ.LLILLL;
        if (videoImageMixedInitParam9 != null && videoImageMixedInitParam9.chooseScene == 57) {
            C197039127h c197039127h16 = c528030KnJ.LLJJJ;
            if (c197039127h16 != null) {
                c197039127h16.setEnabled(z);
                return;
            }
            return;
        }
        if (!c528030KnJ.LJIIIZ() || (c197039127h = c528030KnJ.LLJJJ) == null) {
            return;
        }
        RecyclerView recyclerView = c528030KnJ.LLILZIL;
        if (recyclerView == null) {
            recyclerView = null;
        }
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            numValueOf = Integer.valueOf(adapter.getItemCount());
        } else {
            numValueOf = null;
        }
        VideoImageMixedInitParam videoImageMixedInitParam10 = c528030KnJ.LLILLL;
        if (videoImageMixedInitParam10 != null) {
            num = videoImageMixedInitParam10.maxSelectCount;
        }
        c197039127h.setEnabled(Intrinsics.LJFF(numValueOf, num));
    }

    public final String LJJJJ(List<? extends TikTokMediaModel> list) {
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LL(list, 5), null, null, null, 0, null, AFwS239S0000000_8.get$arr$(114), 31);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("count=");
        sbLIZ.append(list.size());
        sbLIZ.append(", sample=[");
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJJJLL(TikTokMediaModel tikTokMediaModel) {
        boolean z;
        if (this.LLJJJJLIIL == null) {
            return;
        }
        if (this.LLJJLIIIJLLLLLLLZ.contains(tikTokMediaModel)) {
            if (tikTokMediaModel.copiedFromModel != null) {
                r1.copiedCount--;
            } else {
                tikTokMediaModel.copiedCount--;
            }
        }
        AbstractC529520Kpi abstractC529520Kpi = this.LLJJJJLIIL;
        if (abstractC529520Kpi == null) {
            abstractC529520Kpi = null;
        }
        abstractC529520Kpi.LLLIL(tikTokMediaModel);
        this.LLJJLIIIJLLLLLLLZ.remove(tikTokMediaModel);
        if (LJJLJ() && (tikTokMediaModel.startTime != 0 || tikTokMediaModel.endTime != 0)) {
            tikTokMediaModel.startTime = 0;
            tikTokMediaModel.endTime = 0;
            ChooseMediaViewModel chooseMediaViewModel = this.LLLLLJIL;
            if (chooseMediaViewModel != null) {
                Iterator<TikTokMediaModel> it2 = chooseMediaViewModel.LLIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    TikTokMediaModel next = it2.next();
                    if (Intrinsics.LJFF(((MediaModel) next).id, ((MediaModel) tikTokMediaModel).id)) {
                        next.startTime = tikTokMediaModel.startTime;
                        next.endTime = tikTokMediaModel.endTime;
                        break;
                    }
                }
                Iterator<TikTokMediaModel> it3 = chooseMediaViewModel.LLILZLL.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    TikTokMediaModel next2 = it3.next();
                    if (Intrinsics.LJFF(((MediaModel) next2).id, ((MediaModel) tikTokMediaModel).id)) {
                        next2.startTime = tikTokMediaModel.startTime;
                        next2.endTime = tikTokMediaModel.endTime;
                        break;
                    }
                }
            }
        }
        C1458370o3P.LIZ.getClass();
        C1458730o3z c1458730o3zLIZJ = C1458370o3P.LIZJ(tikTokMediaModel, null);
        ShortVideoContext shortVideoContext = this.LL;
        if (this.LLILZIL == 0) {
            z = true;
        } else {
            z = false;
        }
        C1458370o3P.LJJIIJ(c1458730o3zLIZJ, false, shortVideoContext, z, false);
        ChooseMediaViewModel chooseMediaViewModel2 = this.LLLLLJIL;
        if (chooseMediaViewModel2 != null) {
            chooseMediaViewModel2.tR2(tikTokMediaModel);
        }
        LJLIL();
    }

    public final boolean LJJLIIIJJI(List<? extends TikTokMediaModel> list) {
        if (C580130Mp9.LIZ(list)) {
            return false;
        }
        C578570Mmd.LIZ.getClass();
        if (C578570Mmd.LIZ() && list != null && !list.isEmpty() && list.size() == 1 && ((MediaModel) ListProtector.get(list, 0)).LJIIJJI()) {
            return true;
        }
        C0HZQ c0hzqLJJJLIIL = LJJJLIIL();
        if (c0hzqLJJJLIIL != null && c0hzqLJJJLIIL.isChecked() && list != null) {
            if (!list.isEmpty()) {
                Iterator<? extends TikTokMediaModel> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (!it2.next().LJIIJJI()) {
                    }
                }
            }
            return true;
        }
        for (TikTokMediaModel tikTokMediaModel : list) {
            if (tikTokMediaModel.LJIILJJIL() && !C522700Kei.LIZ(tikTokMediaModel)) {
                return true;
            }
        }
        return false;
    }

    public final void LJJLL(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        boolean z5;
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        CreativeModel creativeModel2;
        PUgcTemplateData pUgcTemplateData2;
        ShortVideoContext shortVideoContext = this.LL;
        if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null && (pUgcTemplateData2 = creativeModel2.pugcTemplateData) != null && pUgcTemplateData2.isFromCreateTemplate) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zLIZJ = C0L4U.LIZJ(shortVideoContext, z2, this.LLILZIL);
        int i = this.LLILZIL;
        int size = this.LLJJLIIIJLLLLLLLZ.size();
        if (C0L4U.LIZJ(this.LL, z2, i) && size >= 1 && zLIZJ) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList<TikTokMediaModel> arrayList = this.LLJJLIIIJLLLLLLLZ;
        ArrayList arrayList2 = new ArrayList();
        for (TikTokMediaModel tikTokMediaModel : arrayList) {
            if (tikTokMediaModel.LJIIJ()) {
                arrayList2.add(tikTokMediaModel);
            }
        }
        if (arrayList2.size() == arrayList.size()) {
            z4 = true;
        } else {
            z4 = false;
        }
        C528030KnJ c528030KnJ = null;
        if ((z4 || this.LLLZIIL) && z3) {
            C1419810n3D.LIZJ(null);
            C528030KnJ c528030KnJ2 = this.LLJJJJJIL;
            if (c528030KnJ2 == null) {
                c528030KnJ2 = null;
            }
            C528030KnJ.LJIJI(c528030KnJ2, true);
            C528030KnJ c528030KnJ3 = this.LLJJJJJIL;
            if (c528030KnJ3 == null) {
                c528030KnJ3 = null;
            }
            c528030KnJ3.LJIJJLI(false, z, this.LL);
            C528030KnJ c528030KnJ4 = this.LLJJJJJIL;
            if (c528030KnJ4 == null) {
                c528030KnJ4 = null;
            }
            c528030KnJ4.LJJ();
            C528030KnJ c528030KnJ5 = this.LLJJJJJIL;
            if (c528030KnJ5 != null) {
                c528030KnJ = c528030KnJ5;
            }
            C0L4U.LJFF(c528030KnJ.getContext());
            return;
        }
        C527340KmC c527340KmC = C527340KmC.LIZ;
        ShortVideoContext shortVideoContext2 = this.LL;
        if (shortVideoContext2 != null) {
            str = shortVideoContext2.shootWay;
        } else {
            str = null;
        }
        c527340KmC.getClass();
        boolean zLIZJ2 = C527340KmC.LIZJ(str, z2);
        int i2 = this.LLILZIL;
        int size2 = this.LLJJLIIIJLLLLLLLZ.size();
        if (C527340KmC.LIZIZ(i2, zLIZJ2) && size2 >= 1) {
            if (!z3) {
                if (z4) {
                    C0L4U c0l4u = C0L4U.LIZ;
                    int i3 = this.LLILZIL;
                    ShortVideoContext shortVideoContext3 = this.LL;
                    if (shortVideoContext3 != null && (creativeModel = shortVideoContext3.creativeModel) != null && (pUgcTemplateData = creativeModel.pugcTemplateData) != null && pUgcTemplateData.isFromCreateTemplate) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    c0l4u.getClass();
                    if (C0L4U.LJI(shortVideoContext3, z5, i3)) {
                        C528030KnJ c528030KnJ6 = this.LLJJJJJIL;
                        if (c528030KnJ6 != null) {
                            c528030KnJ = c528030KnJ6;
                        }
                        c528030KnJ.LJJIFFI(true);
                        return;
                    }
                    C528030KnJ c528030KnJ7 = this.LLJJJJJIL;
                    if (c528030KnJ7 != null) {
                        c528030KnJ = c528030KnJ7;
                    }
                    c528030KnJ.LJIJJLI(false, z, this.LL);
                    return;
                }
                C528030KnJ c528030KnJ8 = this.LLJJJJJIL;
                if (c528030KnJ8 != null) {
                    c528030KnJ = c528030KnJ8;
                }
                c528030KnJ.LJIJJLI(true, z, this.LL);
                return;
            }
            C528030KnJ c528030KnJ9 = this.LLJJJJJIL;
            if (c528030KnJ9 == null) {
                c528030KnJ9 = null;
            }
            c528030KnJ9.LJIJJLI(true, z, this.LL);
            C528030KnJ c528030KnJ10 = this.LLJJJJJIL;
            if (c528030KnJ10 != null) {
                c528030KnJ = c528030KnJ10;
            }
            C538480L9y autoCutBtn = c528030KnJ.getAutoCutBtn();
            if (autoCutBtn == null) {
                return;
            }
            autoCutBtn.LIZJ();
            return;
        }
        if (C527340KmC.LIZIZ(this.LLILZIL, zLIZJ2)) {
            C528030KnJ c528030KnJ11 = this.LLJJJJJIL;
            if (c528030KnJ11 == null) {
                c528030KnJ11 = null;
            }
            c528030KnJ11.LJIJJLI(false, z, this.LL);
            C528030KnJ c528030KnJ12 = this.LLJJJJJIL;
            if (c528030KnJ12 == null) {
                c528030KnJ12 = null;
            }
            c528030KnJ12.LJJIFFI(false);
        }
        if (!zLIZJ) {
            return;
        }
        if (z3) {
            C1419810n3D.LIZJ(null);
            C528030KnJ c528030KnJ13 = this.LLJJJJJIL;
            if (c528030KnJ13 == null) {
                c528030KnJ13 = null;
            }
            C0L4U.LJFF(c528030KnJ13.getContext());
        }
        C528030KnJ c528030KnJ14 = this.LLJJJJJIL;
        if (c528030KnJ14 != null) {
            c528030KnJ = c528030KnJ14;
        }
        C528030KnJ.LJIJI(c528030KnJ, z3);
    }

    public final void LJJZZI(InterfaceC526830KlN interfaceC526830KlN) {
        InterfaceC524880KiE interfaceC524880KiE = this.LLILLL;
        if (interfaceC524880KiE != null) {
            interfaceC524880KiE.Mt0(interfaceC526830KlN, this.LLJJLIIIJLLLLLLLZ);
        }
    }

    public final void LJLJI(boolean z) {
        if (this.LLLLZIL == z) {
            return;
        }
        this.LLLLZIL = z;
        this.LLLZL.setValue(Boolean.valueOf(LJJIIZ()));
    }

    public final void LJLJJI(Activity activity) {
        if (!activity.isFinishing()) {
            CreativeDialogWrapper creativeDialogWrapper = this.LLLZI;
            if (creativeDialogWrapper != null && creativeDialogWrapper.isShowing()) {
                return;
            }
            C19576911iZ c19576911iZ = C19576911iZ.LIZ;
            CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
            creativeLoadingDialogBuilder.showProgress(false);
            creativeLoadingDialogBuilder.backCanCancel(false);
            creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S);
            creativeLoadingDialogBuilder.loadingMessage(activity.getString(R.string.txr));
            creativeLoadingDialogBuilder.clickCancelListener(new AwS587S0100000_8(this, 253));
            CreativeDialogWrapper creativeDialogWrapper2 = (CreativeDialogWrapper) c19576911iZ.createLoadingDialog(activity, 1026, creativeLoadingDialogBuilder);
            this.LLLZI = creativeDialogWrapper2;
            creativeDialogWrapper2.show();
        }
    }

    @Override // X.InterfaceC523480Kfy
    public final void LLJLL(TikTokMediaModel tikTokMediaModel) {
        if (!tikTokMediaModel.LJIIJJI()) {
            return;
        }
        C525050KiV.LIZIZ(tikTokMediaModel, this.LLJJLIIIJLLLLLLLZ);
        AbstractC529520Kpi abstractC529520Kpi = this.LLJJJJLIIL;
        if (abstractC529520Kpi != null) {
            C525050KiV.LIZIZ(tikTokMediaModel, abstractC529520Kpi.LL);
            AbstractC529520Kpi abstractC529520Kpi2 = this.LLJJJJLIIL;
            if (abstractC529520Kpi2 == null) {
                abstractC529520Kpi2 = null;
            }
            int iLLLJL = abstractC529520Kpi2.LLLJL(tikTokMediaModel);
            if (iLLLJL != -1) {
                abstractC529520Kpi2.notifyItemChanged(iLLLJL, new Object());
            }
        }
    }

    @Override // X.InterfaceC522120Kdm
    public final void oe(int i) {
        RecyclerView.LayoutManager layoutManager;
        C528030KnJ c528030KnJ = this.LLJJJJJIL;
        if (c528030KnJ != null && (layoutManager = c528030KnJ.getMediaSelectRecyclerView().getLayoutManager()) != null && layoutManager.findViewByPosition(i) == null && (layoutManager instanceof LinearLayoutManager)) {
            ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, 0);
        }
    }

    public static void LJJIZ(C0LAB c0lab, C528010KnH c528010KnH) {
        if (c528010KnH != null) {
            c0lab.LIZ(c528010KnH.LIZ, "ai_alive_cnt");
            c0lab.LIZ(c528010KnH.LIZIZ, "ai_self_cnt");
            c0lab.LIZ(c528010KnH.LIZJ, "offline_effect_cnt");
            c0lab.LIZ(c528010KnH.LIZ + c528010KnH.LIZIZ + c528010KnH.LIZJ, "ai_image_tab_cnt");
        }
    }

    public static void LJLIIIL(VideoImageMixedController videoImageMixedController, boolean z) {
        AbstractC529520Kpi abstractC529520Kpi;
        videoImageMixedController.LJLIL();
        if (C0L90.AUTO_PICK_AGENT != null) {
            videoImageMixedController.LJL();
        }
        videoImageMixedController.LJLI();
        videoImageMixedController.LJJZZIII();
        videoImageMixedController.LJJZ();
        videoImageMixedController.LJJLL(z);
        AbstractC529520Kpi abstractC529520Kpi2 = videoImageMixedController.LLJJJJLIIL;
        C528030KnJ c528030KnJ = null;
        if (abstractC529520Kpi2 == null) {
            abstractC529520Kpi2 = null;
        }
        int iLLLILZ = abstractC529520Kpi2.LLLILZ();
        if (videoImageMixedController.LJJLIIIJLLLLLLLZ()) {
            C528030KnJ c528030KnJ2 = videoImageMixedController.LLJJJJJIL;
            if (c528030KnJ2 != null) {
                c528030KnJ = c528030KnJ2;
            }
            c528030KnJ.LIZLLL(iLLLILZ);
            return;
        }
        AbstractC529520Kpi abstractC529520Kpi3 = videoImageMixedController.LLJJJJLIIL;
        if (abstractC529520Kpi3 == null) {
            abstractC529520Kpi = null;
        } else {
            abstractC529520Kpi = abstractC529520Kpi3;
        }
        if (!(abstractC529520Kpi instanceof C529530Kpj)) {
            if (abstractC529520Kpi3 == null) {
                abstractC529520Kpi3 = null;
            }
            if (!(abstractC529520Kpi3 instanceof C529680Kpy)) {
                C528030KnJ c528030KnJ3 = videoImageMixedController.LLJJJJJIL;
                if (c528030KnJ3 != null) {
                    c528030KnJ = c528030KnJ3;
                }
                c528030KnJ.LIZJ(iLLLILZ + 1);
                return;
            }
        }
        if (iLLLILZ < 0) {
            return;
        }
        C528030KnJ c528030KnJ4 = videoImageMixedController.LLJJJJJIL;
        if (c528030KnJ4 != null) {
            c528030KnJ = c528030KnJ4;
        }
        c528030KnJ.LIZJ(iLLLILZ + 1);
    }

    @Override // X.InterfaceC522120Kdm
    public final void LIZ(int i, int i2) {
        if (this.LLJJJJLIIL == null) {
            return;
        }
        LJLJJL(i, i2, true);
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJI(LifecycleOwner lifecycleOwner, AObserverS212S0100000_8 aObserverS212S0100000_8) {
        this.LLLZLL.observe(lifecycleOwner, aObserverS212S0100000_8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03e3  */
    /* JADX WARN: Type inference failed for: r4v76, types: [X.0KnN] */
    @Override // X.InterfaceC522120Kdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(android.view.View r41, boolean r42) {
        /*
            Method dump skipped, instruction units count: 2212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController.LJIILL(android.view.View, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    @Override // X.InterfaceC522120Kdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(androidx.lifecycle.LifecycleOwner r4, Y.AObserverS212S0100000_8 r5) {
        /*
            r3 = this;
            X.0KnJ r0 = r3.LLJJJJJIL
            if (r0 == 0) goto L18
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r2 = r3.LLLZLZ
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.LL
            if (r0 == 0) goto L1e
            boolean r1 = com.ss.android.ugc.aweme.shortvideo.d4.LJJIFFI(r0)
            r0 = 1
            if (r1 != r0) goto L1e
        L11:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.setValue(r0)
        L18:
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r3.LLLZLZ
            r0.observe(r4, r5)
            return
        L1e:
            r0 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController.LJIJJLI(androidx.lifecycle.LifecycleOwner, Y.AObserverS212S0100000_8):void");
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJ(View view, String str) {
        if (((Boolean) this.LLZLI.getValue()).booleanValue()) {
            this.LLZ = view;
            if (str == null) {
                str = "";
            }
            this.LLZIL = str;
            this.LLZILL = true;
            return;
        }
        LJJJLZIJ(view, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    @Override // X.InterfaceC522120Kdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJIJIL(int r10, int r11) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController.LJJIJIL(int, int):int");
    }

    public final void LJJJJL(TikTokMediaModel tikTokMediaModel, List<String> list) {
        String str;
        String creationId;
        String str2;
        CreativeFlowData creativeFlowData;
        EditorProModel editorProModel;
        if (this.LLJJJJJIL != null) {
            ShortVideoContext shortVideoContext = this.LL;
            if (shortVideoContext != null && (creativeFlowData = shortVideoContext.creativeFlowData) != null && (editorProModel = creativeFlowData.getEditorProModel()) != null) {
                editorProModel.setFromEditorProEntranceInAlbum(false);
            }
            ArrayList<TikTokMediaModel> arrayList = new ArrayList<>();
            if (tikTokMediaModel != null) {
                arrayList.add(tikTokMediaModel);
            } else {
                arrayList = LJJJJZI();
            }
            InterfaceC528020KnI interfaceC528020KnI = this.LLLII;
            if (interfaceC528020KnI != null) {
                interfaceC528020KnI.LIZIZ(arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            for (TikTokMediaModel tikTokMediaModel2 : arrayList) {
                if (tikTokMediaModel2.LJIIJ()) {
                    arrayList2.add(tikTokMediaModel2);
                }
            }
            int size = arrayList2.size();
            if (arrayList.size() == 1 && ((MediaModel) C13LP.LJJJJZI(arrayList)).LJIIJJI()) {
                str = "live";
            } else if (arrayList.size() != size) {
                str = "video";
            } else if (d4.LJIILJJIL(this.LL)) {
                str = "now";
            } else {
                str = "slideshow";
            }
            C0LAB c0lab = new C0LAB();
            ShortVideoContext shortVideoContext2 = this.LL;
            String str3 = null;
            if (shortVideoContext2 != null) {
                creationId = shortVideoContext2.getCreationId();
            } else {
                creationId = null;
            }
            c0lab.LJ("creation_id", creationId);
            c0lab.LJ("content_type", str);
            c0lab.LJ("upload_tab_name", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
            ShortVideoContext shortVideoContext3 = this.LL;
            if (shortVideoContext3 != null) {
                str2 = shortVideoContext3.enterFrom;
            } else {
                str2 = null;
            }
            c0lab.LJ("content_source", str2);
            ShortVideoContext shortVideoContext4 = this.LL;
            if (shortVideoContext4 != null) {
                str3 = shortVideoContext4.shootWay;
            }
            c0lab.LJ("shoot_way", str3);
            C0L5G c0l5g = C0L5G.LIZ;
            ShortVideoContext shortVideoContext5 = this.LL;
            c0l5g.getClass();
            C0L5G.LIZJ(c0lab, shortVideoContext5);
            C523270Kfd.LIZ(c0lab, this.LL, arrayList, this.LLILZ);
            C527570KmZ c527570KmZ = C527570KmZ.LIZ;
            ShortVideoContext shortVideoContext6 = this.LL;
            c527570KmZ.getClass();
            C527570KmZ.LIZ(c0lab, shortVideoContext6, arrayList);
            C20684815ws.LJIILLIIL("upload_content_next", c0lab.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLZIJ(android.view.View r40, java.lang.String r41) {
        /*
            Method dump skipped, instruction units count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController.LJJJLZIJ(android.view.View, java.lang.String):void");
    }

    public final void LJLILLLLZI(ArrayList<TikTokMediaModel> arrayList, Function1<? super ArrayList<TikTokMediaModel>, Unit> function1) {
        AnonymousClass0956 anonymousClass0956 = this.LLLLZLLLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLLZLLLI = null;
        this.LLIZ.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController$manageImageDownSampleJob$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    VideoImageMixedController videoImageMixedController = this.LL;
                    AnonymousClass0956 anonymousClass09562 = videoImageMixedController.LLLLZLLLI;
                    if (anonymousClass09562 != null) {
                        anonymousClass09562.LIZIZ(null);
                    }
                    videoImageMixedController.LLLLZLLLI = null;
                }
            }
        });
        this.LLLLZLLLI = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C504501xr(arrayList, this, Collections.synchronizedList(new ArrayList()), function1, null), 3);
    }

    public final void LJLJJLL(boolean z, boolean z2) {
        List<TikTokMediaModel> c13eo;
        if (z2) {
            c13eo = new C13EO(this.LLJJLIIIJLLLLLLLZ);
        } else {
            c13eo = this.LLJJLIIIJLLLLLLLZ;
        }
        C1458370o3P.LIZ.getClass();
        C1458370o3P.LJJIFFI(false);
        while (true) {
            int i = 1;
            if (!c13eo.isEmpty()) {
                TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJJZI(c13eo);
                for (TikTokMediaModel tikTokMediaModel2 : c13eo) {
                    if (this.LLLLLJLJLL) {
                        if (Intrinsics.LJFF(tikTokMediaModel.LJFF(), tikTokMediaModel2.LJFF()) && TextUtils.equals(tikTokMediaModel.LJIILLIIL(), tikTokMediaModel2.LJIILLIIL())) {
                            tikTokMediaModel2.selectIndex = -1;
                        } else {
                            tikTokMediaModel2.selectIndex = i;
                            i++;
                        }
                    } else if (Intrinsics.LJFF(tikTokMediaModel.LJFF(), tikTokMediaModel2.LJFF())) {
                        tikTokMediaModel2.selectIndex = -1;
                    } else {
                        tikTokMediaModel2.selectIndex = i;
                        i++;
                    }
                }
                LJJJLL(tikTokMediaModel);
                AbstractC528270Knh abstractC528270Knh = this.LLLIZZ;
                if (abstractC528270Knh != null) {
                    abstractC528270Knh.LLLZIL(tikTokMediaModel);
                }
                AbstractC528270Knh abstractC528270Knh2 = this.LLLL;
                if (abstractC528270Knh2 != null) {
                    abstractC528270Knh2.LLLZIL(tikTokMediaModel);
                }
                AbstractC528270Knh abstractC528270Knh3 = this.LLLJ;
                if (abstractC528270Knh3 != null) {
                    abstractC528270Knh3.LLLZIL(tikTokMediaModel);
                }
                AbstractC528270Knh abstractC528270Knh4 = this.LLLJIL;
                if (abstractC528270Knh4 != null) {
                    abstractC528270Knh4.LLLZIL(tikTokMediaModel);
                }
                AbstractC528270Knh abstractC528270Knh5 = this.LLLJL;
                if (abstractC528270Knh5 != null) {
                    abstractC528270Knh5.LLLZIL(tikTokMediaModel);
                }
                AbstractC528270Knh abstractC528270Knh6 = this.LLLLII;
                if (abstractC528270Knh6 != null) {
                    abstractC528270Knh6.LLLZIL(tikTokMediaModel);
                }
                AbstractC528270Knh abstractC528270Knh7 = this.LLLIZZ;
                if (abstractC528270Knh7 != null) {
                    abstractC528270Knh7.LLLLLLJ();
                }
                AbstractC528270Knh abstractC528270Knh8 = this.LLLL;
                if (abstractC528270Knh8 != null) {
                    abstractC528270Knh8.LLLLLLJ();
                }
                AbstractC528270Knh abstractC528270Knh9 = this.LLLLII;
                if (abstractC528270Knh9 != null) {
                    abstractC528270Knh9.LLLLLLJ();
                }
                AbstractC528270Knh abstractC528270Knh10 = this.LLLJ;
                if (abstractC528270Knh10 != null) {
                    abstractC528270Knh10.LLLLLLJ();
                }
                AbstractC528270Knh abstractC528270Knh11 = this.LLLJIL;
                if (abstractC528270Knh11 != null) {
                    abstractC528270Knh11.LLLLLLJ();
                }
                AbstractC528270Knh abstractC528270Knh12 = this.LLLJL;
                if (abstractC528270Knh12 != null) {
                    abstractC528270Knh12.LLLLLLJ();
                }
                InterfaceC528100KnQ interfaceC528100KnQ = this.LLLI;
                if (interfaceC528100KnQ != null) {
                    interfaceC528100KnQ.LIZIZ(tikTokMediaModel);
                }
            } else {
                LJLIIL();
                LJJZZI(new C526850KlP(z));
                return;
            }
        }
    }

    public final void LJJLJLI(final View view, final ArrayList<TikTokMediaModel> arrayList, boolean z) {
        String str;
        Function1<? super ArrayList<TikTokMediaModel>, Unit> function1;
        ShortVideoContext shortVideoContext;
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        String str2;
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoImageMixedController#nextStep, isSupportEditAfterChoose = ");
        sbLIZ.append(this.LLLIIIL);
        sbLIZ.append(", isEnableClick = ");
        sbLIZ.append(this.LLLLLILLIL);
        C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
        boolean zLIZ = C298040BmE.LIZ();
        for (TikTokMediaModel tikTokMediaModel : arrayList) {
            if (tikTokMediaModel.LJIILJJIL()) {
                if (zLIZ) {
                    HashMap mapLIZ = C23203097h.LIZ(tikTokMediaModel.LJFF());
                    if (mapLIZ != null && (str2 = (String) mapLIZ.get("live_info")) != null) {
                        tikTokMediaModel.liveInfo = str2;
                    }
                } else {
                    String str3 = TEVideoUtils.getMetaData(tikTokMediaModel.LJFF()).get("live_info");
                    if (str3 != null) {
                        tikTokMediaModel.liveInfo = str3;
                    }
                }
            }
        }
        ShortVideoContext shortVideoContext2 = this.LL;
        if (shortVideoContext2 != null) {
            str = shortVideoContext2.enterFrom;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "chat") && (shortVideoContext = this.LL) != null && (creativeModel = shortVideoContext.creativeModel) != null && (creativeInitialModel = creativeModel.initialModel) != null && (dMCameraModel = creativeInitialModel.dmCameraModel) != null && !dMCameraModel.enterFromDM) {
            String str4 = shortVideoContext.enterFrom;
            if (str4 == null) {
                str4 = "";
            }
            int size = arrayList.size();
            C0I0B.LJFF.LIZIZ();
            C13DA c13da = new C13DA();
            if (Intrinsics.LJFF("chat_album", "video_detail_camera_icon")) {
                c13da.put("enter_from", "video_detail_page");
            } else {
                c13da.put("enter_from", str4);
            }
            c13da.put("enter_dm", "chat_album");
            c13da.put("current_content_nums", String.valueOf(size));
            C20684815ws.LJIILLIIL("dm_album_send", c13da.build());
        }
        if (!this.LLLIIIL && (function1 = this.LLLIIIIL) != null) {
            function1.invoke(arrayList);
            return;
        }
        C524780Ki4.LIZ.start("av_video_edit", "click onNext btn");
        if (!arrayList.isEmpty()) {
            if (!arrayList.isEmpty()) {
                Iterator<TikTokMediaModel> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (!(!it2.next().LJIILJJIL())) {
                        break;
                    }
                }
                C524780Ki4.LIZ.start("av_image_edit", "click onNext btn");
            } else {
                C524780Ki4.LIZ.start("av_image_edit", "click onNext btn");
            }
        }
        if (C298330Bmh.LIZ()) {
            C524780Ki4.LIZ.start("av_video_editor_init", "click onNext btn");
        }
        if (!this.LLLLLILLIL && !z) {
            InterfaceC528020KnI interfaceC528020KnI = this.LLLII;
            if (interfaceC528020KnI != null) {
                interfaceC528020KnI.LIZLLL(arrayList, false);
                return;
            }
            return;
        }
        if (!LJJLIIIJJIZ() && !LJJLIIIJL()) {
            if (this.LLLIIL == 37) {
                LJLILLLLZI(arrayList, new AwS587S0100000_8(this, 251));
                return;
            }
            if (LJJLIL()) {
                this.LLJJLIIIJLLLLLLLZ = LJJJJJL(this.LLJJLIIIJLLLLLLLZ);
                LJLJL();
            }
            if (LJJLJ()) {
                LJLJL();
            }
            if (LJJLIIIJILLIZJL()) {
                this.LLJJLIIIJLLLLLLLZ = LJJJJJL(this.LLJJLIIIJLLLLLLLZ);
            }
            if (!LJJLIIIJJI(this.LLJJLIIIJLLLLLLLZ)) {
                InterfaceC528020KnI interfaceC528020KnI2 = this.LLLII;
                if (interfaceC528020KnI2 != null) {
                    interfaceC528020KnI2.LIZLLL(arrayList, true);
                    return;
                }
                return;
            }
            if (C2495709qF.LIZ() && !this.LLLILZLLLI) {
                if (((Boolean) C272720AmU.LIZ.getValue()).booleanValue()) {
                    LJLILLLLZI(arrayList, new AwS587S0100000_8(this, 252));
                    return;
                }
                InterfaceC528020KnI interfaceC528020KnI3 = this.LLLII;
                if (interfaceC528020KnI3 == null) {
                    return;
                }
                interfaceC528020KnI3.LIZLLL(arrayList, true);
                return;
            }
            C533730KwV c533730KwV = C533730KwV.LIZ;
            ArrayList<TikTokMediaModel> arrayList2 = this.LLJJLIIIJLLLLLLLZ;
            InterfaceC2471609mM interfaceC2471609mM = new InterfaceC2471609mM() { // from class: X.0KnL
                @Override // X.InterfaceC2471609mM
                public final void LIZ(boolean z2) {
                    if (z2) {
                        if (this.LIZ.LLJJLIIIJLLLLLLLZ.size() <= 1 && !this.LIZ.LLLILZLLLI) {
                            if (C2495709qF.LIZ()) {
                                InterfaceC528020KnI interfaceC528020KnI4 = this.LIZ.LLLII;
                                if (interfaceC528020KnI4 != null) {
                                    interfaceC528020KnI4.LIZLLL(arrayList, true);
                                    return;
                                }
                                return;
                            }
                            View view2 = view;
                            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                            creativeToastBuilder.messageRes(2131857936);
                            creativeToastBuilder.isTuxToastLegacy(true);
                            C1390380mHk.LIZLLL(view2, 3047, creativeToastBuilder);
                            return;
                        }
                        View view3 = view;
                        CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                        creativeToastBuilder2.messageRes(2131857934);
                        creativeToastBuilder2.isTuxToastLegacy(true);
                        C1390380mHk.LIZLLL(view3, 3047, creativeToastBuilder2);
                        return;
                    }
                    InterfaceC528020KnI interfaceC528020KnI5 = this.LIZ.LLLII;
                    if (interfaceC528020KnI5 == null) {
                        return;
                    }
                    interfaceC528020KnI5.LIZLLL(arrayList, true);
                }
            };
            c533730KwV.getClass();
            C533730KwV.LIZ(arrayList2, interfaceC2471609mM);
            return;
        }
        if (((Boolean) C272720AmU.LIZ.getValue()).booleanValue()) {
            LJLILLLLZI(arrayList, new AwS587S0100000_8(this, 250));
            return;
        }
        InterfaceC528020KnI interfaceC528020KnI4 = this.LLLII;
        if (interfaceC528020KnI4 == null) {
            return;
        }
        interfaceC528020KnI4.LIZLLL(arrayList, true);
    }

    public final void LJLJJL(int i, int i2, boolean z) {
        boolean z2;
        boolean z3;
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        if (i >= 0 && i < this.LLJJLIIIJLLLLLLLZ.size()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i2 >= 0 && i2 < this.LLJJLIIIJLLLLLLLZ.size()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && z3) {
            ShortVideoContext shortVideoContext = this.LL;
            if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (musicBuzModel = creativeModel.musicBuzModel) != null) {
                musicBuzModel.disableAudioDrive = true;
            }
            MediaModel mediaModel = (MediaModel) ListProtector.remove(this.LLJJLIIIJLLLLLLLZ, i);
            ListProtector.add(this.LLJJLIIIJLLLLLLLZ, i2, mediaModel);
            LJLIL();
            AbstractC528270Knh abstractC528270Knh = this.LLLIZZ;
            if (abstractC528270Knh != null) {
                abstractC528270Knh.LLLLZLLLI();
            }
            AbstractC528270Knh abstractC528270Knh2 = this.LLLL;
            if (abstractC528270Knh2 != null) {
                abstractC528270Knh2.LLLLZLLLI();
            }
            AbstractC528270Knh abstractC528270Knh3 = this.LLLLII;
            if (abstractC528270Knh3 != null) {
                abstractC528270Knh3.LLLLZLLLI();
            }
            AbstractC528270Knh abstractC528270Knh4 = this.LLLJIL;
            if (abstractC528270Knh4 != null) {
                abstractC528270Knh4.LLLLZLLLI();
            }
            AbstractC528270Knh abstractC528270Knh5 = this.LLLJ;
            if (abstractC528270Knh5 != null) {
                abstractC528270Knh5.LLLLZLLLI();
            }
            AbstractC528270Knh abstractC528270Knh6 = this.LLLJL;
            if (abstractC528270Knh6 != null) {
                abstractC528270Knh6.LLLLZLLLI();
            }
            InterfaceC528100KnQ interfaceC528100KnQ = this.LLLI;
            if (interfaceC528100KnQ != null) {
                interfaceC528100KnQ.LIZ(i, i2);
            }
            C522180Kds c522180Kds = C522180Kds.LIZ;
            boolean zLJIILJJIL = mediaModel.LJIILJJIL();
            boolean zLJJLIIJ = LJJLIIJ();
            c522180Kds.getClass();
            C0LAB c0labLIZ = C522180Kds.LIZ(zLJIILJJIL);
            c0labLIZ.LIZ(zLJJLIIJ ? 1 : 0, "if_photo_prop");
            c0labLIZ.LJ("edit_way", "press");
            c0labLIZ.LIZ(0, "is_pic_frame_single_pic_edit");
            C20684815ws.LJIILLIIL("edit_clips_order", c0labLIZ.LIZ);
            LJJZZI(new InterfaceC526830KlN() { // from class: X.0KlO
            });
        }
        if (z) {
            AbstractC529520Kpi abstractC529520Kpi = this.LLJJJJLIIL;
            if (abstractC529520Kpi == null) {
                abstractC529520Kpi = null;
            }
            abstractC529520Kpi.LLLLL(i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJJJIZL(VideoImageMixedController videoImageMixedController, TikTokMediaModel tikTokMediaModel, int i, int i2) {
        CreativeInfo creativeInfo;
        C533730KwV c533730KwV = C533730KwV.LIZ;
        ShortVideoContext shortVideoContext = videoImageMixedController.LL;
        if (shortVideoContext == null || (creativeInfo = shortVideoContext.creativeInfo) == null) {
            creativeInfo = new CreativeInfo(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }
        c533730KwV.getClass();
        String strLJFF = C533730KwV.LJFF(creativeInfo);
        Bitmap bitmapLJI = C2475309mx.LJI(i, i2, C2475309mx.LIZIZ(tikTokMediaModel.LJFF()), 1, tikTokMediaModel.LJFF());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJFF);
        c533730KwV.getClass();
        sbLIZ.append(C533730KwV.LJIIIIZZ(".png"));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (C2475309mx.LJFF(100, Bitmap.CompressFormat.PNG, bitmapLJI, new C0VSJ(strLIZIZ))) {
            tikTokMediaModel.LJIILL(strLIZIZ);
            tikTokMediaModel.width = i;
            tikTokMediaModel.height = i2;
            tikTokMediaModel.isResized = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0164  */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.09AY, kotlin.jvm.functions.Function0] */
    @Override // X.InterfaceC522120Kdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIILLIIL(final com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel r28, boolean r29, boolean r30, X.C0L90 r31) {
        /*
            Method dump skipped, instruction units count: 1081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController.LJIILLIIL(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel, boolean, boolean, X.0L90):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01d8 A[PHI: r2
      0x01d8: PHI (r2v74 java.lang.String) = (r2v70 java.lang.String), (r2v79 java.lang.String), (r2v86 java.lang.String) binds: [B:99:0x01ef, B:81:0x01a4, B:90:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC522120Kdm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(android.view.View r75, boolean r76, boolean r77, boolean r78, boolean r79, boolean r80, boolean r81) {
        /*
            Method dump skipped, instruction units count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController.LJJIIJZLJL(android.view.View, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoImageMixedController(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r9, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10, X.InterfaceC524880KiE r11, X.C523920Kgg r12, int r13, java.lang.String r14, androidx.lifecycle.LifecycleOwner r15, boolean r16, boolean r17, boolean r18, boolean r19, X.C525330Kix r20, kotlin.jvm.internal.AwS587S0100000_8 r21, kotlin.jvm.internal.AwS587S0100000_8 r22, java.lang.String r23, X.C1DRG r24, boolean r25, boolean r26, kotlin.jvm.internal.AwS552S0100000_8 r27, X.C528190KnZ r28, X.C525300Kiu r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController.<init>(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0KiE, X.0Kgg, int, java.lang.String, androidx.lifecycle.LifecycleOwner, boolean, boolean, boolean, boolean, X.0Kix, kotlin.jvm.internal.AwS587S0100000_8, kotlin.jvm.internal.AwS587S0100000_8, java.lang.String, X.1DRG, boolean, boolean, kotlin.jvm.internal.AwS552S0100000_8, X.0KnZ, X.0Kiu, boolean):void");
    }
}
