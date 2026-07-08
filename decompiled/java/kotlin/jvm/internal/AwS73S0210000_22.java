package kotlin.jvm.internal;

import X.AbstractC214814194y;
import X.C013C;
import X.C09AY;
import X.C0CHQ;
import X.C0ET4;
import X.C0LAB;
import X.C1402490mbH;
import X.C1422180n72;
import X.C1439300nYe;
import X.C1439740nZM;
import X.C1442270ndR;
import X.C1450490nqh;
import X.C1456190nzt;
import X.C1456770o0p;
import X.C1459640o5S;
import X.C1459720o5a;
import X.C1459730o5b;
import X.C1459920o5u;
import X.C1460600o70;
import X.C1460650o75;
import X.C19A3;
import X.C19EG;
import X.C19GS;
import X.C1DRF;
import X.C1DRG;
import X.C20684815ws;
import X.C21308518aB;
import X.C2188811AlT;
import X.C259800zU;
import X.C310640CFq;
import X.C559610Lx9;
import X.C786410Ut5;
import X.InterfaceC1439070nYH;
import X.InterfaceC1444130ngR;
import X.InterfaceC1455590nyv;
import X.InterfaceC2217461Bqa;
import X.InterfaceC524950KiL;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.StoryMultiImageParams;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.social.creation.edit.SocialVideoEditContainerScene;
import com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageChooseListViewModel;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import java.util.LinkedHashMap;
import jg5.AvS181S0000000_22;
import jg5.AvS540S0100000_8;
import jg5.AvS541S0100000_22;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS73S0210000_22 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS73S0210000_22 awS73S0210000_22, Object obj) {
        int iLIZIZ;
        C1442270ndR c1442270ndR = (C1442270ndR) obj;
        if (awS73S0210000_22.z2) {
            iLIZIZ = C310640CFq.LIZIZ(((VideoPublishEditModel) awS73S0210000_22.l0).videoFps(false));
        } else {
            iLIZIZ = 30;
        }
        c1442270ndR.LIZ.LJJIII(Integer.valueOf(iLIZIZ), "render_fps");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((InterfaceC1444130ngR) awS73S0210000_22.l1).LJFF());
        sbLIZ.append('x');
        sbLIZ.append(((InterfaceC1444130ngR) awS73S0210000_22.l1).LIZJ());
        c1442270ndR.LIZJ("render_resolution", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS73S0210000_22 awS73S0210000_22, Object obj) {
        float f;
        C1459730o5b c1459730o5b = (C1459730o5b) obj;
        final SmartImageView smartImageView = c1459730o5b.LIZ;
        int i = c1459730o5b.LIZJ;
        final TextView textView = c1459730o5b.LIZIZ;
        if (i == 0) {
            boolean z = awS73S0210000_22.z2;
            boolean zLJFF = Intrinsics.LJFF(((Text2ImageChooseListViewModel) ((C1459720o5a) awS73S0210000_22.l0).LLJILJILJ.getValue()).LLILZIL.getValue(), Boolean.TRUE);
            if (!z && !zLJFF) {
                f = 1.0f;
            } else {
                f = 0.3f;
            }
            C786410Ut5.u5(smartImageView, f);
            C786410Ut5.S4(f, textView);
            C013C c013c = (C013C) awS73S0210000_22.l1;
            if (!c013c.element) {
                c013c.element = true;
                LiveData liveDataDistinctUntilChanged = Transformations.distinctUntilChanged(((Text2ImageChooseListViewModel) ((C1459720o5a) awS73S0210000_22.l0).LLJILJILJ.getValue()).LLILZIL);
                C1459720o5a c1459720o5a = (C1459720o5a) awS73S0210000_22.l0;
                final boolean z2 = awS73S0210000_22.z2;
                liveDataDistinctUntilChanged.observe(c1459720o5a, new Observer() { // from class: X.0nz7
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj2) {
                        float f2;
                        boolean z3 = z2;
                        SmartImageView smartImageView2 = smartImageView;
                        TextView textView2 = textView;
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        C1455650nz1 c1455650nz1 = C1459720o5a.LLJILLL;
                        if (!z3 && !zBooleanValue) {
                            f2 = 1.0f;
                        } else {
                            f2 = 0.3f;
                        }
                        C786410Ut5.u5(smartImageView2, f2);
                        C786410Ut5.S4(f2, textView2);
                    }
                });
            }
            if (!awS73S0210000_22.z2) {
                InterfaceC1439070nYH publishService = C0CHQ.LIZ().getPublishService();
                Lifecycle lifecycle = ((C1459720o5a) awS73S0210000_22.l0).getLifecycle();
                C1460650o75 c1460650o75 = new C1460650o75(smartImageView, textView, c1459730o5b.LIZLLL, null, c1459730o5b.LJ);
                C1459720o5a c1459720o5a2 = (C1459720o5a) awS73S0210000_22.l0;
                publishService.LJJJJL(lifecycle, new C1460600o70(c1460650o75, (VideoPublishEditModel) c1459720o5a2.LLJIJIL.getValue(c1459720o5a2, C1459720o5a.LLJJ[0]), 2131846805, null));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS73S0210000_22 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS73S0210000_22.invoke$2(kotlin.jvm.internal.AwS73S0210000_22, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS73S0210000_22 awS73S0210000_22, Object obj) {
        C19GS c19gsRequireAppCompatActivity;
        C1DRF c1drf = (C1DRF) obj;
        if (awS73S0210000_22.z2) {
            c19gsRequireAppCompatActivity = ((SocialVideoEditContainerScene) awS73S0210000_22.l0).requireAppCompatActivity();
        } else {
            C19GS c19gsRequireAppCompatActivity2 = ((SocialVideoEditContainerScene) awS73S0210000_22.l0).requireAppCompatActivity();
            if ((c19gsRequireAppCompatActivity2 instanceof SAAActivity) && (c19gsRequireAppCompatActivity = (SAAActivity) c19gsRequireAppCompatActivity2) != null) {
                c1drf.LJFF(SAAActivity.class, null, new AvS541S0100000_22(c19gsRequireAppCompatActivity, 99));
            } else {
                c19gsRequireAppCompatActivity = ((SocialVideoEditContainerScene) awS73S0210000_22.l0).requireAppCompatActivity();
            }
        }
        c1drf.LJFF(C19GS.class, null, new AvS541S0100000_22(c19gsRequireAppCompatActivity, 86));
        c1drf.LJFF(C19EG.class, null, new AvS540S0100000_8(c19gsRequireAppCompatActivity, 159));
        c1drf.LJFF(Activity.class, null, new AvS540S0100000_8(c19gsRequireAppCompatActivity, 160));
        c1drf.LJFF(Context.class, null, new AvS540S0100000_8(c19gsRequireAppCompatActivity, 161));
        c1drf.LJFF(Context.class, "applicationContext", new AvS541S0100000_22(c19gsRequireAppCompatActivity, 100));
        C21308518aB c21308518aBLJFF = c1drf.LJFF(SocialVideoEditContainerScene.class, null, new AvS541S0100000_22((SocialVideoEditContainerScene) awS73S0210000_22.l0, 90));
        c21308518aBLJFF.LIZ(AbstractC214814194y.class);
        c21308518aBLJFF.LIZ(InterfaceC524950KiL.class);
        c1drf.LJFF(VideoPublishEditModel.class, null, new AvS541S0100000_22((SocialVideoEditContainerScene) awS73S0210000_22.l0, 92));
        c1drf.LJFF(C1439740nZM.class, null, new AvS541S0100000_22((SocialVideoEditContainerScene) awS73S0210000_22.l0, 94));
        c1drf.LJFF(Integer.class, "draft_to_Edit_from", new AvS541S0100000_22((SocialVideoEditContainerScene) awS73S0210000_22.l0, 102));
        c1drf.LJFF(InterfaceC1444130ngR.class, null, new AvS541S0100000_22((SocialVideoEditContainerScene) awS73S0210000_22.l0, 96));
        c1drf.LJFF(LifecycleOwner.class, null, new AvS541S0100000_22((SocialVideoEditContainerScene) awS73S0210000_22.l0, 97));
        c1drf.LJFF(InterfaceC1455590nyv.class, null, new AvS181S0000000_22(32));
        c1drf.LJFF(C1439300nYe.class, null, new AvS181S0000000_22(33));
        c1drf.LJFF(String.class, "sessionId", new AvS541S0100000_22((SocialVideoEditContainerScene) awS73S0210000_22.l0, 103));
        c1drf.LJFF(C1456190nzt.class, null, new AvS541S0100000_22((C1456190nzt) awS73S0210000_22.l1, 84));
        c1drf.LJFF(C1456770o0p.class, null, new AvS181S0000000_22(30));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS73S0210000_22 awS73S0210000_22, Object obj) {
        ShortVideoContext shortVideoContext = (ShortVideoContext) obj;
        String str = shortVideoContext.shootWay;
        String creationId = shortVideoContext.getCreationId();
        Long l = (Long) ((LinkedHashMap) ((C1422180n72) awS73S0210000_22.l0).LJ).get((TemplateCategoryData) awS73S0210000_22.l1);
        long jCurrentTimeMillis = -1;
        if (l != null && l.longValue() > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
        }
        boolean z = shortVideoContext.creativeModel.landingModel.defaultLandingCreateTab;
        TemplateCategoryData templateCategoryData = (TemplateCategoryData) awS73S0210000_22.l1;
        boolean z2 = awS73S0210000_22.z2;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", creationId);
        c0lab.LJ("shoot_way", str);
        c0lab.LIZIZ(jCurrentTimeMillis, "duration");
        c0lab.LJ("use_cache", C1402490mbH.LIZ(z2));
        if (templateCategoryData != null) {
            c0lab.LJ("tab_name", templateCategoryData.name);
            c0lab.LJ("category_key", templateCategoryData.key);
        }
        if (z) {
            c0lab.LJ("createtab_landing_type", "default");
        }
        C20684815ws.LJIILLIIL("template_tab_page_skeleton_dismiss", c0lab.LIZ);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS73S0210000_22 awS73S0210000_22, Object obj) {
        final C1DRG c1drg = (C1DRG) obj;
        long jUptimeMillis = SystemClock.uptimeMillis();
        final C19A3 c19a3 = (C19A3) awS73S0210000_22.l1;
        final boolean z = awS73S0210000_22.z2;
        C1450490nqh c1450490nqh = new C1450490nqh(c19a3, c1drg, z) { // from class: X.0nqi
            public static final int LLLF = C1450490nqh.LLL;

            @Override // X.C1450490nqh
            public void P6() {
                J6().G41(true);
            }

            private final void o7(SingleImageData singleImageData) {
                Pair<Integer, Integer> pair;
                if (!C2489309pD.LIZ()) {
                    return;
                }
                StoryMultiImageParams storyMultiImageParams = singleImageData.getEditImageInfo().getStoryMultiImageParams();
                if (storyMultiImageParams == null) {
                    storyMultiImageParams = new StoryMultiImageParams(null, null, null);
                    singleImageData.getEditImageInfo().setStoryMultiImageParams(storyMultiImageParams);
                }
                if (storyMultiImageParams.getBgColorStart() != null) {
                    return;
                }
                String path = singleImageData.getSrcImageInfo().getPath();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                options.inSampleSize = 4;
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(path, options);
                if (bitmapDecodeFile == null) {
                    return;
                }
                try {
                    C0L22.LIZJ(bitmapDecodeFile, path);
                    if (!bitmapDecodeFile.isRecycled()) {
                        bitmapDecodeFile.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeFile);
                    }
                    C0L23 c0l23LIZIZ = C0L22.LIZIZ(path);
                    if (c0l23LIZIZ != null && (pair = c0l23LIZIZ.LIZJ) != null) {
                        storyMultiImageParams.setBgColorStart(pair.getFirst());
                        storyMultiImageParams.setBgColorEnd(pair.getSecond());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!bitmapDecodeFile.isRecycled()) {
                        bitmapDecodeFile.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeFile);
                    }
                    throw th;
                }
            }

            @Override // X.C1450490nqh
            public void N6(SingleImageData singleImageData, C1450520nqk c1450520nqk) {
                StoryMultiImageParams storyMultiImageParams = singleImageData.getEditImageInfo().getStoryMultiImageParams();
                if (storyMultiImageParams != null) {
                    storyMultiImageParams.setCropScale(null);
                }
                singleImageData.getEditImageInfo().setNeedCompileNle(true);
                o7(singleImageData);
            }
        };
        ((C559610Lx9) awS73S0210000_22.l0).getClass();
        c1450490nqh.afterInit$als_release(jUptimeMillis);
        return c1450490nqh;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS73S0210000_22 awS73S0210000_22, Object obj) {
        C1459730o5b c1459730o5b = (C1459730o5b) obj;
        SmartImageView smartImageView = c1459730o5b.LIZ;
        int i = c1459730o5b.LIZJ;
        TextView textView = c1459730o5b.LIZIZ;
        if (i == 0) {
            if (awS73S0210000_22.z2) {
                C786410Ut5.u5(smartImageView, 0.5f);
                C786410Ut5.S4(0.5f, textView);
            } else {
                C1459640o5S c1459640o5S = (C1459640o5S) awS73S0210000_22.l0;
                C259800zU c259800zU = (C259800zU) awS73S0210000_22.l1;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1459640o5S.LLIZ;
                C0CHQ.LIZ().getPublishService().LJJJLIIL(c1459640o5S.LL, new AwS167S0400000_8(textView, smartImageView, c1459640o5S, c259800zU, 5));
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS73S0210000_22(C1422180n72 c1422180n72, TemplateCategoryData templateCategoryData, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1422180n72;
        this.l1 = templateCategoryData;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS73S0210000_22(C1459720o5a c1459720o5a, C013C c013c, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1459720o5a;
        this.l1 = c013c;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS73S0210000_22(C1459920o5u c1459920o5u, C1459920o5u c1459920o5u2, boolean z, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = c1459920o5u;
        this.z2 = c1459920o5u2;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS73S0210000_22(VideoPublishEditModel videoPublishEditModel, InterfaceC1444130ngR interfaceC1444130ngR, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = videoPublishEditModel;
        this.l1 = interfaceC1444130ngR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS73S0210000_22(boolean z, boolean z2, C1459640o5S c1459640o5S, C259800zU<ValueAnimator> c259800zU) {
        super(1);
        this.$t = c259800zU;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = c1459640o5S;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS73S0210000_22(boolean z, SocialVideoEditContainerScene socialVideoEditContainerScene, C1456190nzt c1456190nzt, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = socialVideoEditContainerScene;
        this.l1 = c1456190nzt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS73S0210000_22(C0ET4 c0et4, C559610Lx9 c559610Lx9, C19A3 c19a3, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c559610Lx9;
        this.l1 = c19a3;
        this.z2 = z;
    }
}
