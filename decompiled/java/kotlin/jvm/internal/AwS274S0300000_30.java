package kotlin.jvm.internal;

import X.AbstractC20085213iM;
import X.C05P0;
import X.C05P1;
import X.C08RK;
import X.C09AY;
import X.C1289540jf6;
import X.C1388190mED;
import X.C13M6;
import X.C13MA;
import X.C13MX;
import X.C13R3;
import X.C13SB;
import X.C13SS;
import X.C13V8;
import X.C13WM;
import X.C13YA;
import X.C13YD;
import X.C14XB;
import X.C14XC;
import X.C14XN;
import X.C1633850scR;
import X.C1662010tLr;
import X.C1677660tl6;
import X.C1683130ttv;
import X.C1697810uHb;
import X.C1862330yYx;
import X.C189200o6;
import X.C19968013Aw;
import X.C19997813Mi;
import X.C19998313Mn;
import X.C19998713Mr;
import X.C20063313ep;
import X.C20087713il;
import X.C20087913in;
import X.C20184013yI;
import X.C20184113yJ;
import X.C20184413yM;
import X.C20269814Sy;
import X.C2188811AlT;
import X.C259800zU;
import X.C718360SFu;
import X.EnumC19355810o0;
import X.InterfaceC1567440qtK;
import X.InterfaceC1692950u9l;
import X.InterfaceC1693840uBC;
import X.InterfaceC20041513bJ;
import X.InterfaceC20063613es;
import X.InterfaceC20088013io;
import X.InterfaceC20184613yO;
import X.InterfaceC20236714Gf;
import X.ViewOnAttachStateChangeListenerC20306914d1;
import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.media.ImageReader;
import android.util.LruCache;
import android.util.Size;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.pipo.component.nativecamera.NativeCameraPictureTakingFragment;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.setting.serverpush.compose.unlogin.PushSettingsUnLoginVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.startup.processor.tako.TakoDisclaimerDialogProcessor;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.DiffEffect;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import lth.o;
import org.json.JSONException;
import p2.j1;

/* JADX INFO: loaded from: classes31.dex */
public class AwS274S0300000_30 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS274S0300000_30 awS274S0300000_30) {
        ((AbstractC20085213iM) awS274S0300000_30.l0).removeOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC20306914d1) awS274S0300000_30.l1);
        AbstractC20085213iM abstractC20085213iM = (AbstractC20085213iM) awS274S0300000_30.l0;
        C20087713il.LIZIZ(abstractC20085213iM).LIZ.remove((InterfaceC20088013io) awS274S0300000_30.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS274S0300000_30 awS274S0300000_30) {
        try {
            if (((NativeCameraPictureTakingFragment) awS274S0300000_30.l0).getResources().getConfiguration().orientation == 2) {
                C1289540jf6 c1289540jf6 = (C1289540jf6) awS274S0300000_30.l1;
                int width = ((Size) awS274S0300000_30.l2).getWidth();
                int height = ((Size) awS274S0300000_30.l2).getHeight();
                c1289540jf6.getClass();
                if (width > 0 && height > 0) {
                    c1289540jf6.LL = width;
                    c1289540jf6.LLILLJJLI = height;
                    c1289540jf6.requestLayout();
                }
                ((NativeCameraPictureTakingFragment) awS274S0300000_30.l0).LLJILJILJ = ImageReader.newInstance(((Size) awS274S0300000_30.l2).getWidth(), ((Size) awS274S0300000_30.l2).getHeight(), 256, 1);
            } else {
                C1289540jf6 c1289540jf62 = (C1289540jf6) awS274S0300000_30.l1;
                int height2 = ((Size) awS274S0300000_30.l2).getHeight();
                int width2 = ((Size) awS274S0300000_30.l2).getWidth();
                c1289540jf62.getClass();
                if (height2 > 0 && width2 > 0) {
                    c1289540jf62.LL = height2;
                    c1289540jf62.LLILLJJLI = width2;
                    c1289540jf62.requestLayout();
                }
                ((NativeCameraPictureTakingFragment) awS274S0300000_30.l0).LLJILJILJ = ImageReader.newInstance(((Size) awS274S0300000_30.l2).getWidth(), ((Size) awS274S0300000_30.l2).getHeight(), 256, 1);
            }
            SurfaceTexture surfaceTexture = ((C1289540jf6) awS274S0300000_30.l1).getSurfaceTexture();
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(((Size) awS274S0300000_30.l2).getWidth(), ((Size) awS274S0300000_30.l2).getHeight());
            }
            NativeCameraPictureTakingFragment nativeCameraPictureTakingFragment = (NativeCameraPictureTakingFragment) awS274S0300000_30.l0;
            SurfaceTexture surfaceTexture2 = ((C1289540jf6) awS274S0300000_30.l1).getSurfaceTexture();
            Surface surface = null;
            if (surfaceTexture2 != null) {
                Size size = (Size) awS274S0300000_30.l2;
                surfaceTexture2.setDefaultBufferSize(size.getWidth(), size.getHeight());
            } else {
                surfaceTexture2 = null;
            }
            nativeCameraPictureTakingFragment.LLJJ = new Surface(surfaceTexture2);
            NativeCameraPictureTakingFragment nativeCameraPictureTakingFragment2 = (NativeCameraPictureTakingFragment) awS274S0300000_30.l0;
            CameraDevice cameraDevice = nativeCameraPictureTakingFragment2.LLJI;
            if (cameraDevice != null) {
                Surface[] surfaceArr = new Surface[2];
                surfaceArr[0] = nativeCameraPictureTakingFragment2.LLJJ;
                ImageReader imageReader = nativeCameraPictureTakingFragment2.LLJILJILJ;
                if (imageReader != null) {
                    surface = imageReader.getSurface();
                }
                surfaceArr[1] = surface;
                List<Surface> listLJIIJJI = C1697810uHb.LJIIJJI(surfaceArr);
                NativeCameraPictureTakingFragment nativeCameraPictureTakingFragment3 = (NativeCameraPictureTakingFragment) awS274S0300000_30.l0;
                cameraDevice.createCaptureSession(listLJIIJJI, nativeCameraPictureTakingFragment3.LLJZ, nativeCameraPictureTakingFragment3.LLJ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            NativeCameraPictureTakingFragment nativeCameraPictureTakingFragment4 = (NativeCameraPictureTakingFragment) awS274S0300000_30.l0;
            e.getMessage();
            nativeCameraPictureTakingFragment4.ZR(e);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS274S0300000_30 awS274S0300000_30) {
        ((C20184413yM) awS274S0300000_30.l0).getClass();
        C20184113yJ c20184113yJLIZ = ((C20184413yM) awS274S0300000_30.l0).LIZ((AwemeDraft) awS274S0300000_30.l1, EnumC19355810o0.SAVE, C20184413yM.LIZIZ());
        C20184413yM c20184413yM = (C20184413yM) awS274S0300000_30.l0;
        c20184413yM.LIZLLL.put(((AwemeDraft) awS274S0300000_30.l1).LIZ(), c20184113yJLIZ);
        InterfaceC20184613yO interfaceC20184613yO = (InterfaceC20184613yO) awS274S0300000_30.l2;
        if (interfaceC20184613yO != null) {
            interfaceC20184613yO.LIZ(c20184113yJLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS274S0300000_30 awS274S0300000_30) {
        C1683130ttv c1683130ttvLLJJI;
        C20063313ep c20063313ep = (C20063313ep) awS274S0300000_30.l0;
        C13YD c13yd = c20063313ep.LLJJIJIIJIL;
        while (true) {
            C19968013Aw<C13YA> c19968013Aw = c13yd.LIZ;
            int i = c19968013Aw.LLILLL;
            if (i == 0) {
                break;
            }
            C1683130ttv c1683130ttvInvoke = c19968013Aw.LL[i - 1].LIZ.invoke();
            if (c1683130ttvInvoke != null && !c20063313ep.LLJJIII(c20063313ep.LLJJJJ, c1683130ttvInvoke)) {
                break;
            }
            C19968013Aw<C13YA> c19968013Aw2 = c13yd.LIZ;
            InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c19968013Aw2.LJIILIIL(c19968013Aw2.LLILLL - 1).LIZIZ;
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC20236714Gf.resumeWith(unit);
        }
        C20063313ep c20063313ep2 = (C20063313ep) awS274S0300000_30.l0;
        if (c20063313ep2.LLJJJ && (c1683130ttvLLJJI = c20063313ep2.LLJJI()) != null) {
            C20063313ep c20063313ep3 = (C20063313ep) awS274S0300000_30.l0;
            if (c20063313ep3.LLJJIII(c20063313ep3.LLJJJJ, c1683130ttvLLJJI)) {
                ((C20063313ep) awS274S0300000_30.l0).LLJJJ = false;
            }
        }
        ((C1677660tl6) awS274S0300000_30.l1).LJ = C20063313ep.LLJJ((C20063313ep) awS274S0300000_30.l0, (InterfaceC20063613es) awS274S0300000_30.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS274S0300000_30 awS274S0300000_30) {
        C05P0 c05p0 = (C05P0) awS274S0300000_30.l0;
        LruCache<String, Float> lruCache = C14XN.LLJJJIL;
        c05p0.setValue(0L);
        ((C05P0) awS274S0300000_30.l1).setValue("");
        ((C05P0) awS274S0300000_30.l2).setValue(-1);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS274S0300000_30 awS274S0300000_30) {
        C13V8.LJ.LIZ(o.LIZ).LIZ();
        Function1 function1 = (Function1) awS274S0300000_30.l0;
        if (function1 == null) {
            ((IAVEffectService.IAVEffectReadyCallback) awS274S0300000_30.l1).finish(C1633850scR.LIZ((Context) awS274S0300000_30.l2, null));
        } else {
            ((IAVEffectService.IAVEffectReadyCallback) awS274S0300000_30.l1).finish(C1633850scR.LIZ((Context) awS274S0300000_30.l2, new AwS609S0100000_30(function1, (Function1<? super EffectPlatformBuilder, Unit>) 234)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS274S0300000_30 awS274S0300000_30) {
        Object value = ((C05P1) awS274S0300000_30.l0).getValue();
        C05P1 c05p1 = (C05P1) awS274S0300000_30.l1;
        final InterfaceC20041513bJ interfaceC20041513bJ = (InterfaceC20041513bJ) awS274S0300000_30.l2;
        return ((InterfaceC1693840uBC) value).LIZ(new InterfaceC1567440qtK() { // from class: X.13bI
            @Override // X.InterfaceC1567440qtK
            public final boolean LIZ(Object obj) {
                return interfaceC20041513bJ.LIZ(obj);
            }
        }, c05p1.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:267:0x0431  */
    /* JADX WARN: Type inference failed for: r0v85, types: [X.14T2] */
    /* JADX WARN: Type inference failed for: r0v86, types: [X.14T1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$15(kotlin.jvm.internal.AwS274S0300000_30 r39) {
        /*
            Method dump skipped, instruction units count: 1147
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS274S0300000_30.invoke$15(kotlin.jvm.internal.AwS274S0300000_30):java.lang.Object");
    }

    public static final Object invoke$16(AwS274S0300000_30 awS274S0300000_30) {
        C13MA c13ma = (C13MA) awS274S0300000_30.l0;
        if (c13ma != null) {
            c13ma.onFail((String[]) awS274S0300000_30.l1, new C1662010tLr((Exception) awS274S0300000_30.l2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS274S0300000_30 awS274S0300000_30) {
        C1683130ttv c1683130ttvLLJJ = C13WM.LLJJ((C13WM) awS274S0300000_30.l0, (InterfaceC1692950u9l) awS274S0300000_30.l1, (Function0) awS274S0300000_30.l2);
        if (c1683130ttvLLJJ != null) {
            return ((C13WM) awS274S0300000_30.l0).LLJJ.LJJJJLI(c1683130ttvLLJJ);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$18(AwS274S0300000_30 awS274S0300000_30) {
        T t;
        ((StringBuilder) ((C259800zU) awS274S0300000_30.l0).element).append("begin download baseDir");
        C259800zU c259800zU = (C259800zU) awS274S0300000_30.l1;
        final C19997813Mi c19997813Mi = (C19997813Mi) awS274S0300000_30.l2;
        DiffEffect diffEffect = c19997813Mi.LJFF;
        String str = null;
        if (diffEffect == null) {
            diffEffect = null;
        }
        final String uri = diffEffect.getBase_url().getUri();
        if (uri == null) {
            C19998313Mn c19998313Mn = new C19998313Mn();
            C1662010tLr c1662010tLr = new C1662010tLr(10023);
            c1662010tLr.LIZIZ = "Diff task is illegal";
            c19998313Mn.LIZ = c1662010tLr;
            t = c19998313Mn;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c19997813Mi.LIZLLL.getName());
            sbLIZ.append("-Base");
            C19998713Mr.LIZIZ(uri, C2188811AlT.LIZIZ(sbLIZ));
            C13M6 c13m6 = new C13M6() { // from class: X.13MW
                @Override // X.C13M6
                public final String LIZ(C20008713Qn c20008713Qn, long j, C13N3 c13n3) {
                    String str2 = c19997813Mi.LJIIIIZZ;
                    if (str2 == null) {
                        str2 = null;
                    }
                    String strLJIIJJI = C20012413Ry.LJIIJJI(str2);
                    if (strLJIIJJI == null) {
                        return null;
                    }
                    InterfaceC20004513Ox interfaceC20004513OxLIZ = C19996613Lw.LIZ(strLJIIJJI);
                    if (interfaceC20004513OxLIZ instanceof C13MX) {
                        return ((C13MX) interfaceC20004513OxLIZ).LJIL(c19997813Mi.LIZLLL, c20008713Qn, uri, j, false, null);
                    }
                    Regex regex = C13SG.LJJ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(uri);
                    sbLIZ2.append(".zip");
                    String strLIZJ = C13SJ.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                    if (interfaceC20004513OxLIZ != null) {
                        interfaceC20004513OxLIZ.LJII(strLIZJ, c20008713Qn, c19997813Mi.LIZLLL.getPanel());
                    }
                    String str3 = c19997813Mi.LJIIIIZZ;
                    if (str3 == null) {
                        return null;
                    }
                    return str3;
                }
            };
            DiffEffect diffEffect2 = c19997813Mi.LJFF;
            if (diffEffect2 == null) {
                diffEffect2 = null;
            }
            List listLIZJ = C19997813Mi.LIZJ(diffEffect2.getBase_url());
            StringBuffer stringBuffer = new StringBuffer();
            C19998313Mn c19998313MnLIZ = c19997813Mi.LIZ(listLIZJ, c13m6, false, 1, stringBuffer);
            if (c19998313MnLIZ.LIZ == null && !c19997813Mi.LIZLLL()) {
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[DiffEffect][Flow][Check baseFile failed before merge.][");
                sbLIZ2.append(c19997813Mi.LIZLLL.getName());
                sbLIZ2.append("] baseFile not exist");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                c13ss.getClass();
                C13SS.LIZIZ("JKL", strLIZIZ, null);
                C1662010tLr c1662010tLr2 = new C1662010tLr(10023);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("check base file before merge. failed path: ");
                String str2 = c19997813Mi.LJIIIZ;
                if (str2 == null) {
                    str2 = null;
                }
                sbLIZ3.append(str2);
                sbLIZ3.append(" | progressInfo: ");
                sbLIZ3.append((Object) stringBuffer);
                sbLIZ3.append(" | dir exist: ");
                String str3 = c19997813Mi.LJIIIZ;
                if (str3 == null) {
                    str3 = null;
                }
                sbLIZ3.append(C13SB.LJ(str3));
                c1662010tLr2.LIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                c19998313MnLIZ.LIZ = c1662010tLr2;
            }
            if (((Boolean) c19997813Mi.LJIILIIL.getValue()).booleanValue()) {
                String str4 = c19997813Mi.LJIIIZ;
                if (str4 != null) {
                    str = str4;
                }
                C08RK.LIZ(str);
            } else {
                C13MX c13mx = c19997813Mi.LJIIJ;
                if (c13mx == null) {
                    c13mx = null;
                }
                Effect effect = c19997813Mi.LIZLLL;
                String str5 = c19997813Mi.LJIIIZ;
                if (str5 != null) {
                    str = str5;
                }
                c13mx.getClass();
                C13MX.LJIJI(effect, str);
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(c19997813Mi.LIZLLL.getName());
            sbLIZ4.append("-Base");
            C19998713Mr.LIZ(uri, C2188811AlT.LIZIZ(sbLIZ4));
            t = c19998313MnLIZ;
        }
        c259800zU.element = t;
        C19997813Mi c19997813Mi2 = (C19997813Mi) awS274S0300000_30.l2;
        c19997813Mi2.LJIIJJI.LIZ(new AwS574S0100000_30(c19997813Mi2, 426));
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS274S0300000_30 awS274S0300000_30) {
        C13MA c13ma = (C13MA) awS274S0300000_30.l0;
        if (c13ma != null) {
            c13ma.onSuccess((Effect) awS274S0300000_30.l1);
        }
        C13R3 c13r3 = (C13R3) awS274S0300000_30.l2;
        c13r3.LIZ.LJJJIL.LIZJ(c13r3.LIZJ);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS274S0300000_30 awS274S0300000_30) {
        ((PushSettingsUnLoginVM) awS274S0300000_30.l0).yQ2(new C14XC((Context) awS274S0300000_30.l1, "other_channel", ((C14XB) awS274S0300000_30.l2).LLILLL));
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS274S0300000_30 awS274S0300000_30) {
        C13MA c13ma = (C13MA) awS274S0300000_30.l0;
        if (c13ma != null) {
            c13ma.onFail(((C13R3) awS274S0300000_30.l1).LIZIZ, (C1662010tLr) awS274S0300000_30.l2);
        }
        C13R3 c13r3 = (C13R3) awS274S0300000_30.l1;
        c13r3.LIZ.LJJJIL.LIZJ(c13r3.LIZJ);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS274S0300000_30 awS274S0300000_30) {
        ((PushSettingsUnLoginVM) awS274S0300000_30.l0).yQ2(new C14XC((Context) awS274S0300000_30.l1, "recommend_video_push", ((C14XB) awS274S0300000_30.l2).LLILLJJLI));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS274S0300000_30 awS274S0300000_30) throws JSONException {
        Activity activityLIZ;
        Context context = (Context) awS274S0300000_30.l0;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            activityLIZ.onBackPressed();
        }
        C1862330yYx.LJJJZ(C1862330yYx.LIZ, ((TakoEnterParams) awS274S0300000_30.l1).getCommonParams(), "click_back");
        ((TakoDisclaimerDialogProcessor) awS274S0300000_30.l2).LL = false;
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS274S0300000_30 awS274S0300000_30) throws JSONException {
        Activity activityLIZ;
        Context context = (Context) awS274S0300000_30.l0;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            activityLIZ.onBackPressed();
        }
        C1862330yYx.LJJJZ(C1862330yYx.LIZ, ((TakoEnterParams) awS274S0300000_30.l1).getCommonParams(), "click_back");
        ((TakoDisclaimerDialogProcessor) awS274S0300000_30.l2).LL = false;
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS274S0300000_30 awS274S0300000_30) throws JSONException {
        Activity activityLIZ;
        Context context = (Context) awS274S0300000_30.l0;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            activityLIZ.onBackPressed();
        }
        C1862330yYx.LJJJZ(C1862330yYx.LIZ, ((TakoEnterParams) awS274S0300000_30.l1).getCommonParams(), "click_back");
        ((TakoDisclaimerDialogProcessor) awS274S0300000_30.l2).LL = false;
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS274S0300000_30 awS274S0300000_30) {
        ((C20184413yM) awS274S0300000_30.l0).getClass();
        C20184113yJ c20184113yJLIZ = ((C20184413yM) awS274S0300000_30.l0).LIZ((AwemeDraft) awS274S0300000_30.l1, EnumC19355810o0.RESTORE, C20184413yM.LIZIZ());
        ((C20184413yM) awS274S0300000_30.l0).LIZIZ.getClass();
        C20184013yI.LIZLLL(c20184113yJLIZ);
        InterfaceC20184613yO interfaceC20184613yO = (InterfaceC20184613yO) awS274S0300000_30.l2;
        if (interfaceC20184613yO != null) {
            interfaceC20184613yO.LIZ(c20184113yJLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS274S0300000_30 awS274S0300000_30) {
        ((C20184413yM) awS274S0300000_30.l0).getClass();
        C20184113yJ c20184113yJLIZ = ((C20184413yM) awS274S0300000_30.l0).LIZ((AwemeDraft) awS274S0300000_30.l1, EnumC19355810o0.SAVE, C20184413yM.LIZIZ());
        ((C20184413yM) awS274S0300000_30.l0).LIZIZ.getClass();
        C20184013yI.LIZLLL(c20184113yJLIZ);
        InterfaceC20184613yO interfaceC20184613yO = (InterfaceC20184613yO) awS274S0300000_30.l2;
        if (interfaceC20184613yO != null) {
            interfaceC20184613yO.LIZ(c20184113yJLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS274S0300000_30 awS274S0300000_30) {
        ((C20184413yM) awS274S0300000_30.l0).getClass();
        C20184113yJ c20184113yJLIZ = ((C20184413yM) awS274S0300000_30.l0).LIZ((AwemeDraft) awS274S0300000_30.l1, EnumC19355810o0.RESTORE, C20184413yM.LIZIZ());
        C20184413yM c20184413yM = (C20184413yM) awS274S0300000_30.l0;
        c20184413yM.LIZLLL.put(((AwemeDraft) awS274S0300000_30.l1).LIZ(), c20184113yJLIZ);
        InterfaceC20184613yO interfaceC20184613yO = (InterfaceC20184613yO) awS274S0300000_30.l2;
        if (interfaceC20184613yO != null) {
            interfaceC20184613yO.LIZ(c20184113yJLIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS274S0300000_30(C259800zU c259800zU, C259800zU<StringBuilder> c259800zU2, C259800zU<C19998313Mn> c259800zU3, C19997813Mi c19997813Mi) {
        super(0);
        this.$t = c19997813Mi;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c259800zU3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS274S0300000_30(C05P0 c05p0, C05P0<Long> c05p02, C05P0<String> c05p03, C05P0<Integer> c05p04) {
        super(0);
        this.$t = c05p04;
        this.l0 = c05p0;
        this.l1 = c05p02;
        this.l2 = c05p03;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS274S0300000_30(C05P1 c05p1, C05P1<? extends InterfaceC1693840uBC<Object, Object>> c05p12, C05P1<Object> c05p13, InterfaceC20041513bJ interfaceC20041513bJ) {
        super(0);
        this.$t = interfaceC20041513bJ;
        this.l0 = c05p1;
        this.l1 = c05p12;
        this.l2 = c05p13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS274S0300000_30(C718360SFu c718360SFu, C718360SFu c718360SFu2, C20269814Sy c20269814Sy, List<String> list) {
        super(0);
        this.$t = list;
        this.l0 = c718360SFu;
        this.l1 = c718360SFu2;
        this.l2 = c20269814Sy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS274S0300000_30(C13MA c13ma, C13MA<Effect> c13ma2, C13R3 c13r3, C1662010tLr c1662010tLr) {
        super(0);
        this.$t = c1662010tLr;
        this.l0 = c13ma;
        this.l1 = c13ma2;
        this.l2 = c13r3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS274S0300000_30(C13MA c13ma, C13MA<Effect> c13ma2, Effect effect, C13R3 c13r3) {
        super(0);
        this.$t = c13r3;
        this.l0 = c13ma;
        this.l1 = c13ma2;
        this.l2 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS274S0300000_30(C13MA c13ma, C13MA<String[]> c13ma2, String[] strArr, Exception exc) {
        super(0);
        this.$t = exc;
        this.l0 = c13ma;
        this.l1 = c13ma2;
        this.l2 = strArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS274S0300000_30(C13WM c13wm, j1 j1Var, AwS426S0200000_25 awS426S0200000_25, int i) {
        super(0);
        this.$t = i;
        this.l0 = c13wm;
        this.l1 = j1Var;
        this.l2 = awS426S0200000_25;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS274S0300000_30(C20063313ep c20063313ep, C1677660tl6 c1677660tl6, InterfaceC20063613es interfaceC20063613es, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20063313ep;
        this.l1 = c1677660tl6;
        this.l2 = interfaceC20063613es;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS274S0300000_30(AbstractC20085213iM abstractC20085213iM, ViewOnAttachStateChangeListenerC20306914d1 viewOnAttachStateChangeListenerC20306914d1, C20087913in c20087913in, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC20085213iM;
        this.l1 = viewOnAttachStateChangeListenerC20306914d1;
        this.l2 = c20087913in;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS274S0300000_30(C20184413yM c20184413yM, AwemeDraft awemeDraft, InterfaceC20184613yO interfaceC20184613yO, int i) {
        super(0);
        this.$t = i;
        this.l0 = c20184413yM;
        this.l1 = awemeDraft;
        this.l2 = interfaceC20184613yO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS274S0300000_30(Context context, IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.l0 = function1;
        this.l1 = iAVEffectReadyCallback;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS274S0300000_30(Context context, TakoEnterParams takoEnterParams, TakoDisclaimerDialogProcessor takoDisclaimerDialogProcessor, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = takoEnterParams;
        this.l2 = takoDisclaimerDialogProcessor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS274S0300000_30(NativeCameraPictureTakingFragment nativeCameraPictureTakingFragment, C1289540jf6 c1289540jf6, Size size, int i) {
        super(0);
        this.$t = i;
        this.l0 = nativeCameraPictureTakingFragment;
        this.l1 = c1289540jf6;
        this.l2 = size;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS274S0300000_30(PushSettingsUnLoginVM pushSettingsUnLoginVM, Context context, C14XB c14xb, int i) {
        super(0);
        this.$t = i;
        this.l0 = pushSettingsUnLoginVM;
        this.l1 = context;
        this.l2 = c14xb;
    }
}
