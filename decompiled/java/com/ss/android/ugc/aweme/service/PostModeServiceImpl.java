package com.ss.android.ugc.aweme.service;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C03H5;
import X.C03IT;
import X.C04RU;
import X.C04WC;
import X.C07CO;
import X.C07TO;
import X.C0AGA;
import X.C0AU1;
import X.C0B1X;
import X.C0BXH;
import X.C0M3E;
import X.C0M3F;
import X.C0M3K;
import X.C0PEM;
import X.C0R1J;
import X.C0RF0;
import X.C0RJ7;
import X.C0RQ9;
import X.C0S5R;
import X.C0S5S;
import X.C0SAE;
import X.C0SFT;
import X.C0SKM;
import X.C0SKN;
import X.C0SKO;
import X.C0SKP;
import X.C0SL3;
import X.C0SM2;
import X.C0SMT;
import X.C0SMY;
import X.C0SNG;
import X.C0SNJ;
import X.C0SNK;
import X.C0SNY;
import X.C0SOK;
import X.C0SP9;
import X.C0SPP;
import X.C0SQK;
import X.C0SQQ;
import X.C0ST8;
import X.C0SZL;
import X.C1078304Jp;
import X.C10EU;
import X.C120B;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1335190kqj;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C14LC;
import X.C19252910Tv;
import X.C1954807lC;
import X.C19647311tv;
import X.C19715312Br;
import X.C19EG;
import X.C20737116Cr;
import X.C21662819qE;
import X.C21662919qF;
import X.C2176121AEo;
import X.C2188811AlT;
import X.C2280911EPp;
import X.C2296808zG;
import X.C23250099c;
import X.C2344809Gs;
import X.C2506509rz;
import X.C256700yz;
import X.C277620AuO;
import X.C277810Auh;
import X.C281440B1i;
import X.C281460B1k;
import X.C292410Bd9;
import X.C294780Bgy;
import X.C294960BhG;
import X.C299470BoX;
import X.C300940Bqu;
import X.C304280BwI;
import X.C310590CFl;
import X.C317480CcU;
import X.C317790Ccz;
import X.C324510Cnp;
import X.C446250Heh;
import X.C452501pT;
import X.C582980Mtk;
import X.C587790N3p;
import X.C718780SHk;
import X.C720110SMn;
import X.C720210SMx;
import X.C720330SNj;
import X.C720360SNm;
import X.C720390SNp;
import X.C720400SNq;
import X.C721190SQr;
import X.C721220SQu;
import X.C721640SSk;
import X.C823050WQl;
import X.EnumC1334360kpO;
import X.EnumC1781440wSU;
import X.EnumC308670C8b;
import X.EnumC671230QUn;
import X.EnumC714850S2h;
import X.EnumC720100SMm;
import X.InterfaceC1331910klR;
import X.InterfaceC1685420txc;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC21663219qI;
import X.InterfaceC469401sC;
import X.InterfaceC661560PxC;
import X.InterfaceC720540SOe;
import X.RunnableC720040SMg;
import Y.ARunnableS3S1000000_6;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.editpost.ClientText;
import com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell;
import com.ss.android.ugc.aweme.feed.model.AdCarouselColorInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.interceptor.ExploreFeedRouterInterceptor;
import com.ss.android.ugc.aweme.livephoto.component.PhotoFeedLivePhotoComponent;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicHighPrecisionDuration;
import com.ss.android.ugc.aweme.performance.preload.PostModeTaskPreloadComponent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity;
import com.ss.android.ugc.aweme.ui.feed.cell.AddToPlaylistPreviewPhotoViewHolder;
import com.ss.android.ugc.aweme.ui.feed.cell.FeedPhotosViewHolder;
import com.ss.android.ugc.aweme.ui.feed.collection.FriendsDetailPhotoViewHolder;
import com.ss.android.ugc.aweme.ui.feed.collection.FriendsDetailRepostPhotoViewHolder;
import com.ss.android.ugc.aweme.ui.feed.collection.PhotoSlideComponentInCollection;
import com.ss.android.ugc.aweme.ui.feed.collection.PhotoTapInterceptComponent;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.BottomPhotosDotIndicatorAssem;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoModeTagAssemTriggerForGenreTagContainer;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoModeTagAssemTriggerForVideoTagContainer;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoModeVideoTagTrigger;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoCellGradualComponent;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoModePanelControlShadowAssem;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.TabletsPhotosDotIndicatorAssem;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.TopPhotosDotIndicatorAssem;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailRootFragment;
import com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo;
import com.ss.android.ugc.aweme.ui.util.PhotoModeIconAssem;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes12.dex */
public final class PostModeServiceImpl implements IPostModeService {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public String LIZIZ = "";
    public final C01GW LIZJ = C452501pT.LIZIZ(new C324510Cnp());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1078304Jp());
    public final C01GW LJ = C452501pT.LIZIZ(new C0SNK());

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final int LIZ() {
        return 43;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<?> LJIIL() {
        return C13LE.LIZ(FeedPhotoModeTagAssemTriggerForVideoTagContainer.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJIILLIIL() {
        return C13LE.LIZ(PhotoSlideComponentInCollection.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<? extends AbstractC738140SxQ> LJJIJIIJIL() {
        return C13LE.LIZ(PostModeTaskPreloadComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<?> LJJJ() {
        return C13LE.LIZ(FeedPhotoModeTagAssemTriggerForGenreTagContainer.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJJJJLL() {
        return C13LE.LIZ(PhotoModeIconAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LJJL() {
        return C13LE.LIZ(FeedPhotoModeVideoTagTrigger.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<? extends ReusedUIContentAssem<?>> LJJLIIIJLLLLLLLZ() {
        return C13LE.LIZ(PhotoTapInterceptComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LJJLJ() {
        return C13LE.LIZ(PhotoModePanelControlShadowAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LJJZZIII() {
        return C13LE.LIZ(PhotoFeedLivePhotoComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LIZIZ() {
        return ((Number) C277810Auh.LIZ.getValue()).intValue() == 2;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final IInterceptor LIZJ() {
        return new ExploreFeedRouterInterceptor();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LIZLLL() {
        return ((Boolean) C0AU1.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final InterfaceC720540SOe LJII() {
        return new InterfaceC720540SOe() { // from class: X.0SND
            @Override // X.InterfaceC720540SOe
            public final C0SOW LIZ(Context context) {
                return new C0SOW(context, null, 0);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJIILJJIL() {
        this.LIZ.set(true);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final ReusedUIContentAssem<? extends C03H5> LJJII() {
        return new PhotoCellGradualComponent();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJIJIIJI() {
        return this.LIZ.get();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final IPhotoModeExtraService LJJIL() {
        return (IPhotoModeExtraService) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final float LJJJJ() {
        return (float) ((Number) C310590CFl.LIZIZ.getValue()).doubleValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Integer LJJJJZI() {
        String str = (String) C2506509rz.LIZ.getValue();
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -730098288:
                return str.equals("photoMode_fyp_anchor1") ? 2131839815 : null;
            case -730098287:
                return str.equals("photoMode_fyp_anchor2") ? 2131839816 : null;
            case -730098286:
                return str.equals("photoMode_fyp_anchor3") ? 2131839817 : null;
            default:
                return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJLIIIJILLIZJL() {
        return ((Boolean) C0AGA.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C0SAE LJLIIIL() {
        return (C0SAE) this.LJ.getValue();
    }

    public final Map<String, LruCache<String, C0SNJ>> LJLILLLLZI() {
        return (Map) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJIILL() {
        Iterator<LruCache<String, C0SNJ>> it2 = LJLILLLLZI().values().iterator();
        while (it2.hasNext()) {
            it2.next().evictAll();
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIJ() {
        return C294960BhG.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIJJLI() {
        return C281460B1k.LIZ() && !C19252910Tv.LIZIZ.LIZLLL().block().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJ() {
        return C304280BwI.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJIJL() {
        return C07CO.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJLIIIJ() {
        return C0B1X.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJLIIIJL() {
        return SystemClock.elapsedRealtime() - C0SNY.LIZ < 65000;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean showEngagementCount() {
        return ComplianceServiceProvider.LJIIJJI().showEngagementCount();
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final IPhotoModeLogUtil LJJJLZIJ() {
        return C0SQK.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final String LJJLIIJ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Object LJFF(Object obj) {
        return new FriendsDetailRepostPhotoViewHolder((C0RF0) obj);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJI(String str) {
        C720400SNq.LIZ.getClass();
        String strLIZ = C720400SNq.LIZ(str);
        if (strLIZ == null || C720400SNq.LJ.LIZIZ(strLIZ) == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJIIIZ(Context context) {
        C0SNY.LIZ(context, "homepage_explore", true);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C0M3E LJIIJJI(ViewGroup viewGroup) {
        TuxIconView tuxIconView;
        if (viewGroup != null && (tuxIconView = (TuxIconView) viewGroup.findViewById(R.id.qcw)) != null) {
            C01GW c01gw = C277810Auh.LIZ;
            if (((Number) c01gw.getValue()).intValue() != 1 && ((Number) c01gw.getValue()).intValue() != 2) {
                return new C0M3E() { // from class: X.0SN8
                    @Override // X.C0M3E
                    public final void LIZ(View view) {
                    }

                    @Override // X.C0M3E
                    public final void LIZJ(String str) {
                    }

                    @Override // X.C0M3E
                    public final void LIZLLL(String str) {
                    }

                    @Override // X.C0M3E
                    public final void LJFF(C0M0M c0m0m) {
                    }

                    @Override // X.C0M3E
                    public final void LIZIZ(boolean z) {
                        if (z) {
                            C0M3C.NOT_POST_MODE.getValue();
                        } else {
                            C0M3C.NOT_POST_MODE.getValue();
                        }
                    }

                    @Override // X.C0M3E
                    public final void LJ(Aweme aweme) {
                        boolean z;
                        if (!AwemeExtKt.isPhotoMode(aweme) && !C0NC0.LIZ(aweme)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        LIZIZ(z);
                    }
                };
            }
            return new C720390SNp(viewGroup, tuxIconView);
        }
        throw new Resources.NotFoundException("Container does not contain photo mode icon");
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Object LJIIZILJ(Object obj) {
        return new AddToPlaylistPreviewPhotoViewHolder((C0RF0) obj);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final String LJIL(String str) {
        return C446250Heh.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Object LJJIIJ(Object obj) {
        Fragment fragment;
        C19EG activity;
        C0RF0 c0rf0 = (C0RF0) obj;
        if (((Number) C04RU.LIZ.getValue()).intValue() == 1 && (fragment = c0rf0.LIZJ) != null && (activity = fragment.getActivity()) != null) {
            C0SM2.LIZ.getClass();
            C0SM2.LIZ(0L, activity);
        }
        return new FeedPhotosViewHolder(c0rf0);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJIIJZLJL(Aweme aweme) {
        if (aweme != null && C582980Mtk.LIZIZ(aweme) && !AwemeExtKt.isAdTraffic(aweme) && !C14LC.LJIIIZ) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJIIZI(Fragment fragment) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        if (!LJJ()) {
            return false;
        }
        Fragment fragment2 = null;
        if (fragment != null) {
            Context context = fragment.getContext();
            if (context != null) {
                componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
            } else {
                componentCallbacks2LJFF = null;
            }
            if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                while (true) {
                    if (fragment instanceof InterfaceC214902198i) {
                        fragment2 = fragment;
                        break;
                    }
                    fragment = fragment.getParentFragment();
                    if (fragment == null) {
                        break;
                    }
                }
            }
        }
        if (!(fragment2 instanceof PostModeDetailRootFragment)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final int LJJIJIL(Aweme aweme) {
        Float durationPrecision;
        Music music;
        MusicHighPrecisionDuration durationHighPrecision;
        if (aweme != null) {
            Music music2 = aweme.getMusic();
            if (music2 != null && (durationHighPrecision = music2.getDurationHighPrecision()) != null) {
                durationPrecision = durationHighPrecision.getDurationPrecision();
            } else {
                durationPrecision = null;
            }
            if (durationPrecision != null) {
                durationPrecision.floatValue();
                return (int) (durationPrecision.floatValue() * LSPassThroughRecordSizeConfig.DEFAULT);
            }
            if (aweme != null && (music = aweme.getMusic()) != null) {
                return music.getDuration() * LSPassThroughRecordSizeConfig.DEFAULT;
            }
            return 0;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0RAf] */
    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Object LJJIJLIJ(Object obj) {
        return new FriendsDetailPhotoViewHolder((C0RF0) obj, new C0SZL<BasePostViewCell, VideoItemParams>() { // from class: X.0RAf
            @Override // X.C0SZL
            public final String LIZLLL(VideoItemParams videoItemParams) {
                String aid = videoItemParams.getAweme().getAid();
                if (aid == null) {
                    return "";
                }
                return aid;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJIZ(Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        Map<String, Object> postExtraMap;
        if (aweme != null && AwemeExtKt.isPhotoMode(aweme) && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (postExtraMap = photoModeImageInfo.getPostExtraMap()) != null && Intrinsics.LJFF(postExtraMap.get("photo_cover_shrink"), Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJJIL(String str) {
        this.LIZIZ = str;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJJJJ(String str) {
        C823050WQl.LIZJ().execute(new ARunnableS3S1000000_6(str, 0));
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJJJLIIL(C0RQ9 c0rq9) {
        Class cls;
        int i = C0RJ7.LIZ[c0rq9.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    cls = TopPhotosDotIndicatorAssem.class;
                } else {
                    throw new C1954807lC();
                }
            } else {
                cls = BottomPhotosDotIndicatorAssem.class;
            }
        } else {
            cls = TabletsPhotosDotIndicatorAssem.class;
        }
        return C13LE.LIZ(cls);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJJZ(Activity activity) {
        C19EG c19eg;
        if (!(activity instanceof PostModeDetailActivity)) {
            InterfaceC214902198i interfaceC214902198iLJIILLIIL = null;
            if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null) {
                interfaceC214902198iLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19eg);
            }
            if (!(interfaceC214902198iLJIILLIIL instanceof PostModeDetailRootFragment)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJLIIIJJIZ(Aweme aweme) {
        if (aweme != null && C582980Mtk.LIZIZ(aweme) && LJIJJLI() && !AwemeExtKt.isAdTraffic(aweme)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final int LJJLIIIJLJLI(boolean z) {
        if (C14LC.LJIIIZ) {
            return 51;
        }
        return 41;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJLL(Aweme aweme) {
        if (aweme != null) {
            User author = aweme.getAuthor();
            if ((author == null || ((!C300940Bqu.LIZ() && !C299470BoX.LIZ()) || C10EU.LJIILLIIL(author))) && !C720360SNm.LJIIL(aweme) && C582980Mtk.LIZIZ(aweme) && ((Boolean) C277620AuO.LIZ.getValue()).booleanValue() && !AwemeBizExtKt.getReplaceRecTagByRepost(aweme)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Pair<Bitmap.Config, Map<String, Object>> LJJZZI(UrlModel urlModel) {
        return C2176121AEo.LIZ(urlModel);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJLIL(C19EG c19eg) {
        C0SM2.LIZ.getClass();
        C0SM2.LIZ(0L, c19eg);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIILIIL(Aweme aweme, String str) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        if (!AwemeExtKt.isPhotoMode(aweme) || AwemeExtKt.isAdTraffic(aweme) || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || imageList.size() <= 1 || !C07TO.LIZIZ(str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJJI(Aweme aweme, String str) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        AdCarouselColorInfo carouselColorInfo;
        int i = PhotoModePanelControlShadowAssem.LLLF;
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if ((c19252910Tv.LIZLLL().LJIJI().LLFF().LIZJ() && !c19252910Tv.LIZLLL().LJIJI().LLFF().LIZ()) || !AwemeExtKt.isPhotoMode(aweme) || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || imageList.size() < 1 || C0SP9.LJ(aweme) || (C292410Bd9.LIZ && Intrinsics.LJFF(str, "create_playlist"))) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if ((awemeRawAd == null || (carouselColorInfo = awemeRawAd.getCarouselColorInfo()) == null || carouselColorInfo.getShowPageControlShadow() != 1) && AwemeExtKt.isAdTraffic(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Object LJJLIL(Aweme aweme, Object obj) throws JSONException {
        C721190SQr.LIZ.getClass();
        if (aweme != null && AwemeExtKt.isPhotoMode(aweme)) {
            int iLIZ = C721220SQu.LIZ(aweme);
            int iLIZIZ = C721220SQu.LIZIZ(aweme);
            C721190SQr.LJIIIIZZ(obj, "live_pic_cnt", Integer.valueOf(iLIZ));
            C721190SQr.LJIIIIZZ(obj, "loop_livephoto_show_cnt", Integer.valueOf(iLIZIZ));
            C721190SQr.LJIIIIZZ(obj, "live_livephoto_show_cnt", Integer.valueOf(iLIZ - iLIZIZ));
        }
        return obj;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C0M3F LJJLJLI(ViewGroup viewGroup, boolean z) {
        TuxIconView tuxIconView;
        if (viewGroup != null && (tuxIconView = (TuxIconView) viewGroup.findViewById(R.id.g6z)) != null) {
            if (z) {
                return new C0M3K(viewGroup, tuxIconView);
            }
            return new C0M3F() { // from class: X.0M3J
                @Override // X.C0M3F
                public final void LIZ(View view) {
                }

                @Override // X.C0M3F
                public final void LIZJ(String str) {
                }

                @Override // X.C0M3F
                public final void LIZLLL(String str) {
                }

                @Override // X.C0M3F
                public final boolean LJ() {
                    return false;
                }

                @Override // X.C0M3F
                public final void LJFF(C0M0J c0m0j) {
                    if (c0m0j == null) {
                        C0M3B.NOT_FROM_TARGET_MODE.getValue();
                    } else {
                        C0M3B.NOT_FROM_TARGET_MODE.getValue();
                    }
                }
            };
        }
        throw new Resources.NotFoundException("Container does not contain photo mode icon");
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJLI(EnumC1334360kpO enumC1334360kpO, String str) {
        C720400SNq.LIZ.getClass();
        C720400SNq.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final long LJ(String str, String str2, String str3) {
        LruCache<String, C0SNJ> lruCache;
        C0SNJ c0snj;
        C0SNJ c0snj2;
        if (LJLILLLLZI().keySet().contains(str2)) {
            LruCache<String, C0SNJ> lruCache2 = LJLILLLLZI().get(str2);
            if (lruCache2 == null || (c0snj2 = lruCache2.get(str3)) == null) {
                return 0L;
            }
            return c0snj2.LIZIZ;
        }
        if (!LJLILLLLZI().keySet().contains(str) || (lruCache = LJLILLLLZI().get(str)) == null || (c0snj = lruCache.get(str3)) == null) {
            return 0L;
        }
        return c0snj.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJIIIIZZ(Aweme aweme, String str, boolean z) {
        if (C0SKN.LJ(aweme, str, z) && (C0SKM.LJI() || C0SKM.LJFF())) {
            return true;
        }
        if (aweme == null || !C582980Mtk.LIZIZ(aweme) || AwemeExtKt.isAdTraffic(aweme) || !C0SKP.LIZIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJJJI(String str, String str2, String str3) {
        LruCache<String, C0SNJ> lruCache;
        C0SNJ c0snj;
        C0SNJ c0snj2;
        if (LJLILLLLZI().keySet().contains(str2)) {
            LruCache<String, C0SNJ> lruCache2 = LJLILLLLZI().get(str2);
            if (lruCache2 == null || (c0snj2 = lruCache2.get(str3)) == null) {
                return false;
            }
            return c0snj2.LIZJ;
        }
        if (!LJLILLLLZI().keySet().contains(str) || (lruCache = LJLILLLLZI().get(str)) == null || (c0snj = lruCache.get(str3)) == null) {
            return false;
        }
        return c0snj.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Integer LJJJJIZL(String str, String str2, String str3) {
        LruCache<String, C0SNJ> lruCache;
        C0SNJ c0snj;
        C0SNJ c0snj2;
        if (LJLILLLLZI().keySet().contains(str2)) {
            LruCache<String, C0SNJ> lruCache2 = LJLILLLLZI().get(str2);
            if (lruCache2 == null || (c0snj2 = lruCache2.get(str3)) == null) {
                return null;
            }
            return Integer.valueOf(c0snj2.LIZ);
        }
        if (!LJLILLLLZI().keySet().contains(str) || (lruCache = LJLILLLLZI().get(str)) == null || (c0snj = lruCache.get(str3)) == null) {
            return null;
        }
        return Integer.valueOf(c0snj.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJLIIIIJ(Aweme aweme, int i, final InterfaceC1685420txc<? super Bitmap, ? super Throwable, ? super String, ? super Integer, ? super Integer, Unit> interfaceC1685420txc) {
        Integer numValueOf;
        Integer numValueOf2;
        UrlModel urlModel;
        List<String> urlList;
        final String str;
        Bitmap.Config config;
        UrlModel urlModel2;
        List<String> urlList2;
        UrlModel urlModel3;
        UrlModel urlModel4;
        C0SMT.LIZ.getClass();
        if (C2280911EPp.LIZ()) {
            C0ST8.LIZLLL(aweme, EnumC720100SMm.COLD_PRELOAD, i);
        }
        String str2 = null;
        boolean zLJIIIZ = C0SQQ.LIZ.LJIIIZ(i, aweme, null);
        C2344809Gs.LIZLLL(4, "PhotoModeBitrate", "aweme photo at init single true");
        PhotoModeImage photoModeImageLJIILIIL = C720360SNm.LJIILIIL(aweme, i, true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("coldBootPreloadToBitmapByIndex get imageInfo w*h: ");
        if (photoModeImageLJIILIIL != null && (urlModel4 = photoModeImageLJIILIIL.urlModel) != null) {
            numValueOf = Integer.valueOf(urlModel4.getWidth());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" * ");
        if (photoModeImageLJIILIIL != null && (urlModel3 = photoModeImageLJIILIIL.urlModel) != null) {
            numValueOf2 = Integer.valueOf(urlModel3.getHeight());
        } else {
            numValueOf2 = null;
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(", url: ");
        if (photoModeImageLJIILIIL != null && (urlModel2 = photoModeImageLJIILIIL.urlModel) != null && (urlList2 = urlModel2.getUrlList()) != null) {
            str2 = (String) C13LP.LJJJLL(urlList2);
        }
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (zLJIIIZ) {
            if (photoModeImageLJIILIIL != null) {
                urlModel = photoModeImageLJIILIIL.translatedUrlModel;
            } else {
                return;
            }
        } else if (photoModeImageLJIILIIL == null) {
            return;
        } else {
            urlModel = photoModeImageLJIILIIL.urlModel;
        }
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null) {
            if (C0SNG.LIZ().enable && C0SNG.LIZ().coldBootPriority && !AwemeExtKt.isAdTraffic(aweme)) {
                C720400SNq.LIZ.getClass();
                C720400SNq.LIZIZ(str);
            }
            final int width = urlModel.getWidth();
            final int height = urlModel.getHeight();
            if (!C720360SNm.LJI(aweme) && !AwemeExtKt.isAdTraffic(aweme)) {
                config = Bitmap.Config.RGB_565;
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlModel.getUrlList()));
            c1331670kl3LJIIJ.LJIL = config;
            c1331670kl3LJIIJ.LIZLLL("photomode-preload");
            c1331670kl3LJIIJ.LJJIII = EnumC1334360kpO.IMMEDIATE;
            c1331670kl3LJIIJ.LJJIIJZLJL = new Executor() { // from class: X.0SNI
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            };
            C01GW c01gw = C04WC.LIZ;
            if (((Number) c01gw.getValue()).intValue() == 1 || ((Number) c01gw.getValue()).intValue() == 3) {
                c1331670kl3LJIIJ.LJJLIIIJJIZ = true;
            }
            if (C1335190kqj.LIZIZ() && (AwemeBizOptExtKt.getAwemeCacheType(aweme) == 1 || C256700yz.LIZ("homepage_hot"))) {
                c1331670kl3LJIIJ.LJJIIZ = EnumC714850S2h.CUSTOM;
                c1331670kl3LJIIJ.LJJJJJ = "photomode_image_cache_v2";
            }
            c1331670kl3LJIIJ.LJJIIJ(new InterfaceC1331910klR() { // from class: X.0Ck2
                @Override // X.InterfaceC1331910klR
                public final void onCanceled() {
                }

                @Override // X.InterfaceC1331910klR
                public final void onProgress(float f) {
                }

                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    InterfaceC1685420txc<Bitmap, Throwable, String, Integer, Integer, Unit> interfaceC1685420txc2 = interfaceC1685420txc;
                    if (interfaceC1685420txc2 != null) {
                        interfaceC1685420txc2.invoke(bitmap, null, str, Integer.valueOf(width), Integer.valueOf(height));
                    }
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    InterfaceC1685420txc<Bitmap, Throwable, String, Integer, Integer, Unit> interfaceC1685420txc2 = interfaceC1685420txc;
                    if (interfaceC1685420txc2 != null) {
                        interfaceC1685420txc2.invoke(null, th, str, Integer.valueOf(width), Integer.valueOf(height));
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJLIIL(Aweme aweme, String str, boolean z) {
        if (C582980Mtk.LIZIZ(aweme) && !AwemeExtKt.isAdTraffic(aweme) && C0SKP.LIZIZ()) {
            if (!C0SOK.LIZ().enableLandOpt || !C20737116Cr.LIZJ()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJIIJ(final int i, final Context context, final String str, final List list) {
        if (context == null) {
            return;
        }
        C823050WQl.LJ().schedule(new Runnable() { // from class: X.0SPM
            public final void LIZ() {
                List<Aweme> list2;
                if (C0SNF.LIZIZ && Intrinsics.LJFF(str, "general_search") && (list2 = list) != null) {
                    for (Aweme aweme : list2) {
                        if (AwemeExtKt.isPhotoMode(aweme)) {
                            C720300SNg.LIZIZ(aweme);
                        }
                    }
                }
                C0SPQ c0spq = new C0SPN() { // from class: X.0SPQ
                    @Override // X.C0SPN
                    public final int LIZ() {
                        return C0SPR.LIZ().detailVerticalCount / 2;
                    }
                };
                c0spq.LIZIZ(str, context, list, i, 0, 0);
                String str2 = str;
                Context context2 = context;
                List<Aweme> list3 = list;
                int i2 = i;
                if (list3 != null && !list3.isEmpty() && i2 > 1 && C0SPR.LIZ().enable) {
                    int i3 = C0SPR.LIZ().detailVerticalCount / 2;
                    if (i3 < 1) {
                        i3 = 1;
                    }
                    int i4 = i2 - 2;
                    int size = list3.size() - 1;
                    if (i4 > size) {
                        i4 = size;
                    }
                    int i5 = (i4 - i3) + 1;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    c0spq.LIZLLL(str2, context2, list3, C13LZ.LJIIIZ(i4, i5), new IntRange(0, 0));
                    Aweme aweme2 = (Aweme) C13LP.LJJJLZIJ(i2, list3);
                    if (aweme2 != null) {
                        aweme2.getAid();
                    }
                }
                c0spq.LJ((i - (C0SPR.LIZ().detailVerticalCount / 2)) - 2, i + c0spq.LIZ() + 2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PostModeServiceImpl@fee5.preloadNextPrevPhotoPosts$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PostModeServiceImpl@fee5.preloadNextPrevPhotoPosts$1");
            }
        }, 3000L, TimeUnit.MILLISECONDS);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJJJL(final int i, final Context context, final String str, final List list) {
        if (context == null) {
            return;
        }
        C823050WQl.LJ().schedule(new Runnable() { // from class: X.0SMr
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PostModeServiceImpl@fee5.preloadNextPhotoPosts$1");
                try {
                    C0SPP.LIZIZ.LIZIZ(str, context, list, i, 0, 0);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PostModeServiceImpl@fee5.preloadNextPhotoPosts$1");
            }
        }, 3000L, TimeUnit.MILLISECONDS);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJJJZ(String str, Aweme aweme, int i, Function2<? super Bitmap, ? super Throwable, Unit> function2) {
        C0SMT.LIZ.getClass();
        C0SMT.LIZJ(str, aweme, i, function2, false);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJZ(Activity activity, int i, Object obj, Object obj2) {
        Integer num;
        FeedItemList feedItemList;
        List<Aweme> items;
        List<Aweme> items2;
        Iterator<Aweme> it2;
        long j;
        C0R1J c0r1j;
        C0SM2.LIZ.getClass();
        if (activity != null && ((Number) C0BXH.LIZ.getValue()).intValue() != 3 && (activity instanceof BaseActivity)) {
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (obj2 instanceof FeedItemList) {
                feedItemList = (FeedItemList) obj2;
            } else {
                feedItemList = null;
            }
            SoftReference<C0R1J> softReference = C0SM2.LIZLLL;
            if (softReference != null && (c0r1j = softReference.get()) != null && c0r1j.LIZ(R.layout.e_h)) {
                return;
            }
            boolean z = C0SM2.LIZIZ;
            C0SM2.LIZIZ = false;
            if (feedItemList == null || (items = feedItemList.getItems()) == null || items.isEmpty() || feedItemList == null || (items2 = feedItemList.getItems()) == null || (it2 = items2.iterator()) == null) {
                return;
            }
            int iIntValue = 0;
            while (true) {
                if (it2.hasNext()) {
                    Aweme next = it2.next();
                    if (next != null && AwemeExtKt.isPhotoMode(next)) {
                        break;
                    } else {
                        iIntValue++;
                    }
                } else {
                    iIntValue = -1;
                    break;
                }
            }
            if (i == 1 && iIntValue <= 1 && ((Number) C0BXH.LIZ.getValue()).intValue() != 2) {
                return;
            }
            C01GW c01gw = C0BXH.LIZ;
            if (((Number) c01gw.getValue()).intValue() == 2 && iIntValue == -1) {
                return;
            }
            if (num != null && i != 1) {
                iIntValue += num.intValue();
            }
            if (((Number) c01gw.getValue()).intValue() != 2 || (z && iIntValue != 0 && iIntValue != 1 && iIntValue > 1)) {
                j = 3000;
            } else {
                j = 0;
            }
            C0SM2.LIZ(j, activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJIFFI(Context context, String str, Aweme aweme, IntRange intRange, EnumC1334360kpO enumC1334360kpO) {
        if (context == null || aweme == null) {
            return;
        }
        C0SPP.LIZIZ.getClass();
        C823050WQl.LIZLLL().execute(new RunnableC720040SMg(context, enumC1334360kpO, aweme, str, null, intRange));
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJIJ(Context context, Aweme aweme, int i, EnumC1334360kpO enumC1334360kpO, C587790N3p c587790N3p) {
        C0SMT.LIZ.getClass();
        C0SMT.LIZ("homepage_hot", context, aweme, i, enumC1334360kpO, null, c587790N3p, true, true);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final boolean LJJJJLI(boolean z, boolean z2, Float f, int i, int i2) {
        if (C0SKN.LIZLLL(i, i2, f, "publish_preview", false, true, z, z2, false) && C0SKM.LJFF()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJLIIIJJI(int i, String str, long j, String str2, String str3, boolean z) {
        LruCache<String, C0SNJ> lruCache;
        if (LJLILLLLZI().keySet().contains(str3)) {
            LruCache<String, C0SNJ> lruCache2 = LJLILLLLZI().get(str3);
            if (lruCache2 != null) {
                lruCache2.put(str2, new C0SNJ(i, j, z));
                return;
            }
            return;
        }
        if (!LJLILLLLZI().keySet().contains(str) || (lruCache = LJLILLLLZI().get(str)) == null) {
            return;
        }
        lruCache.put(str2, new C0SNJ(i, j, z));
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final InterfaceC661560PxC LJIJJ(ViewGroup viewGroup, String str, EnumC671230QUn enumC671230QUn, Function1<? super String, Unit> function1, boolean z, EnumC1781440wSU enumC1781440wSU, InterfaceC21663219qI interfaceC21663219qI) {
        if (viewGroup == null) {
            return null;
        }
        if (z) {
            return new C21662919qF(viewGroup, str, enumC671230QUn, function1, enumC1781440wSU);
        }
        return new C21662819qE(viewGroup, str, enumC671230QUn, function1, enumC1781440wSU, interfaceC21663219qI);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJIIZ(String str, Context context, Aweme aweme, int i, EnumC1334360kpO enumC1334360kpO, Function1<? super InterfaceC469401sC, Unit> function1, Function2<? super File, ? super Throwable, Unit> function2) {
        C0SMT.LIZ.getClass();
        C0SMT.LIZ(str, context, aweme, i, enumC1334360kpO, function1, function2, false, false);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final C19647311tv LJJJLL(Context context, FeedContentLayoutInfo feedContentLayoutInfo, int i, int i2, int i3, int i4, boolean z) {
        C0SL3 c0sl3LJFF = C0SMY.LJFF(feedContentLayoutInfo, i, i2, i3, i4, 0, 0, null);
        return new C19647311tv(c0sl3LJFF.LIZ, c0sl3LJFF.LIZIZ, c0sl3LJFF.LJII, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f6  */
    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(final X.C19EG r34, final com.ss.android.ugc.aweme.feed.model.VideoItemParams r35, final com.ss.android.ugc.aweme.model.PostModeDetailParams r36, java.lang.String r37, android.graphics.Bitmap r38, com.ss.android.ugc.aweme.model.SlidesImageLoadParams r39, androidx.fragment.app.Fragment r40, final kotlin.jvm.functions.Function1 r41) {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.PostModeServiceImpl.LJIJI(X.19EG, com.ss.android.ugc.aweme.feed.model.VideoItemParams, com.ss.android.ugc.aweme.model.PostModeDetailParams, java.lang.String, android.graphics.Bitmap, com.ss.android.ugc.aweme.model.SlidesImageLoadParams, androidx.fragment.app.Fragment, kotlin.jvm.functions.Function1):void");
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final FeedContentLayoutInfo LJJJJJL(Context context, C120B c120b, String str, ClientText clientText, boolean z, Float f, int i, C19715312Br c19715312Br) {
        return new C718780SHk(context).LIZJ(context, c120b, str, clientText, z, f, i, c19715312Br, false, false, null);
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final void LJJI(int i, Context context, String str, String str2, String str3, String str4, String str5, String str6, List list, AwS572S0100000_28 awS572S0100000_28) {
        List listSubList = list;
        if (!listSubList.isEmpty()) {
            C317480CcU.LIZ.getClass();
            if (listSubList.size() > 35) {
                listSubList = listSubList.subList(0, 35);
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C317790Ccz(i, listSubList, context, str3, str4, "click_inbox_notice", str, str2, str5, str6, awS572S0100000_28, null), 3);
            return;
        }
        awS572S0100000_28.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C19647311tv LJJLI(android.content.Context r32, com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo r33, int r34, int r35, int r36, int r37, android.view.View r38, X.C720060SMi r39, int r40, boolean r41, X.InterfaceC710220RtU r42) {
        /*
            r31 = this;
            java.lang.String r6 = X.C718780SHk.LJIIZILJ
            if (r6 != 0) goto Lc
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r6 = r0.toString()
        Lc:
            r9 = 0
            r3 = r42
            r1 = r37
            r2 = r36
            r0 = r33
            if (r3 == 0) goto L25
            r3.LIZ(r2, r1)
            r4 = r38
            r3.LJJI(r4, r9, r9, r9)
            com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo r23 = r3.LJII(r6, r0, r9, r9)
            if (r23 != 0) goto L27
        L25:
            r23 = r0
        L27:
            r5 = r39
            java.util.List<com.ss.android.ugc.aweme.feed.model.PhotoModeImage> r3 = r5.LIZ
            int r3 = r3.size()
            r4 = 1
            if (r3 <= r4) goto Lb2
            r7 = 1
        L33:
            r8 = r40
            if (r8 < 0) goto L48
            java.util.List<com.ss.android.ugc.aweme.feed.model.PhotoModeImage> r3 = r5.LIZ
            int r3 = r3.size()
            int r3 = r3 - r4
            if (r8 > r3) goto L48
            java.util.List<com.ss.android.ugc.aweme.feed.model.PhotoModeImage> r3 = r5.LIZ
            java.lang.Object r9 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r8)
            com.ss.android.ugc.aweme.feed.model.PhotoModeImage r9 = (com.ss.android.ugc.aweme.feed.model.PhotoModeImage) r9
        L48:
            X.0SMx r3 = X.C0SMY.LIZ
            android.app.Activity r4 = X.C1388190mED.LIZ(r32)
            if (r4 == 0) goto Laf
            r3 = 2131395160(0x7f0a8258, float:1.8411025E38)
            android.view.View r4 = r4.findViewById(r3)
            if (r4 == 0) goto Laf
            int r3 = r4.getHeight()
            if (r3 == 0) goto Laa
            int r28 = r4.getHeight()
        L63:
            int r29 = X.C497820Jfg.LIZJ(r32)
            java.util.List<com.ss.android.ugc.aweme.feed.model.PhotoModeImage> r10 = r5.LIZ
            com.ss.android.ugc.aweme.feed.model.PhotoModeImage r11 = r5.LIZIZ
            com.ss.android.ugc.aweme.feed.model.PhotoModeImage r12 = r5.LIZJ
            java.lang.String r17 = "publish_preview"
            r18 = 0
            r19 = 1
            int r14 = r0.titleLines
            int r15 = r0.descriptionLines
            java.lang.Float r0 = r12.aspectRatio
            r13 = r41
            r20 = r7
            r21 = r13
            r22 = r18
            r16 = r0
            boolean r14 = X.C0SKN.LIZLLL(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.0SN0 r5 = new X.0SN0
            java.lang.String r15 = "publish_preview"
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r25 = r35
            r24 = r34
            r26 = r2
            r27 = r1
            r30 = r5
            X.0SL3 r0 = X.C0SMY.LJFF(r23, r24, r25, r26, r27, r28, r29, r30)
            X.11tv r4 = new X.11tv
            android.widget.ImageView$ScaleType r3 = r0.LIZ
            float r2 = r0.LIZIZ
            float r1 = r0.LJII
            float r0 = r0.LJIIIIZZ
            r4.<init>(r3, r2, r1, r0)
            return r4
        Laa:
            int r28 = r4.getMeasuredHeight()
            goto L63
        Laf:
            r28 = 0
            goto L63
        Lb2:
            r7 = 0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.PostModeServiceImpl.LJJLI(android.content.Context, com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo, int, int, int, int, android.view.View, X.0SMi, int, boolean, X.0RtU):X.11tv");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020d A[PHI: r22
      0x020d: PHI (r22v1 boolean) = (r22v0 boolean), (r22v3 boolean) binds: [B:75:0x020a, B:54:0x01b5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair LJJIII(android.content.Context r32, X.C120B r33, java.lang.String r34, com.ss.android.ugc.aweme.editpost.ClientText r35, boolean r36, boolean r37, java.lang.Float r38, java.lang.Float r39, int r40, X.C19715412Bs r41, X.C720060SMi r42, X.C19714112Bf r43) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.PostModeServiceImpl.LJJIII(android.content.Context, X.120B, java.lang.String, com.ss.android.ugc.aweme.editpost.ClientText, boolean, boolean, java.lang.Float, java.lang.Float, int, X.12Bs, X.0SMi, X.12Bf):kotlin.Pair");
    }

    @Override // com.ss.android.ugc.aweme.service.IPostModeService
    public final Pair LJL(Context context, Aweme aweme, C0S5R c0s5r, C0S5S c0s5s, boolean z, boolean z2, boolean z3, int i, int i2, boolean z4, InteractAreaCommonAbility interactAreaCommonAbility, BottomBarPriorityAbility bottomBarPriorityAbility, String str, boolean z5) {
        String title;
        InteractAreaCommonAbility interactAreaCommonAbility2 = interactAreaCommonAbility;
        int i3 = 1;
        BottomBarPriorityAbility bottomBarPriorityAbility2 = null;
        int iLIZ = 0;
        if (!C281440B1i.LIZ() || (aweme != null && AwemeExtKt.isAdTraffic(aweme))) {
            if (context != null && aweme != null) {
                PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo != null && (title = photoModeImageInfo.getTitle()) != null && !a0.LJJJIL(title)) {
                    iLIZ = C720330SNj.LIZ(context, title);
                }
                EnumC308670C8b enumC308670C8bLIZIZ = C720330SNj.LIZIZ(context, aweme, c0s5r, c0s5s);
                Integer numValueOf = Integer.valueOf(iLIZ);
                int lineCount = enumC308670C8bLIZIZ.getLineCount() - iLIZ;
                if (lineCount >= 1) {
                    i3 = lineCount;
                }
                return new Pair(numValueOf, Integer.valueOf(i3));
            }
            return new Pair(0, Integer.valueOf(EnumC308670C8b.CASE_DEFAULT.getLineCount()));
        }
        C0SFT c0sft = new C0SFT(context, aweme, z2, z, z3);
        C721640SSk.LIZ.getClass();
        int iLJII = i2 - C721640SSk.LJII(context);
        C720210SMx c720210SMx = C0SMY.LIZ;
        C720110SMn c720110SMnLIZ = C0SKO.LIZ(aweme, str, z5);
        if (!(interactAreaCommonAbility2 instanceof InteractAreaCommonAbility)) {
            interactAreaCommonAbility2 = null;
        }
        if (bottomBarPriorityAbility instanceof BottomBarPriorityAbility) {
            bottomBarPriorityAbility2 = bottomBarPriorityAbility;
        }
        FeedContentLayoutInfo feedContentLayoutInfoLIZIZ = C0SMY.LIZIZ(context, c720110SMnLIZ, c0s5s, c0s5r, iLJII, c0sft, z4, false, interactAreaCommonAbility2, bottomBarPriorityAbility2);
        return new Pair(Integer.valueOf(feedContentLayoutInfoLIZIZ.titleLines), Integer.valueOf(feedContentLayoutInfoLIZIZ.descriptionLines));
    }
}
