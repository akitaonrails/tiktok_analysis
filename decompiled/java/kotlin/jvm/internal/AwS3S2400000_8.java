package kotlin.jvm.internal;

import X.C09AY;
import X.C1388190mED;
import X.C1397660mTU;
import X.C19741112Lp;
import X.C19EG;
import X.C523280Kfe;
import X.C533800Kwc;
import X.C540290LGx;
import X.InterfaceC1419170n2B;
import X.InterfaceC1635410sex;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.templatecore.templatedata.MvThemeData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import pic.q;

/* JADX INFO: loaded from: classes9.dex */
public class AwS3S2400000_8 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS3S2400000_8 awS3S2400000_8, Object obj) {
        String str;
        C533800Kwc.LJIIIIZZ((String[]) awS3S2400000_8.l2, (C19EG) awS3S2400000_8.l3, true, awS3S2400000_8.s0);
        ((C1397660mTU) obj).LIZJ = true;
        C19741112Lp c19741112Lp = C19741112Lp.LIZ;
        C19EG c19eg = (C19EG) awS3S2400000_8.l3;
        c19741112Lp.getClass();
        C19741112Lp.LJIIIIZZ(c19eg);
        ((Function0) awS3S2400000_8.l4).invoke();
        C540290LGx.LIZ.getClass();
        C540290LGx.LIZJ(true);
        C523280Kfe c523280Kfe = C523280Kfe.LIZ;
        ShortVideoContext shortVideoContext = (ShortVideoContext) awS3S2400000_8.l5;
        if (shortVideoContext != null) {
            str = shortVideoContext.shootWay;
        } else {
            str = null;
        }
        C523280Kfe.LIZLLL(c523280Kfe, str, awS3S2400000_8.s1, "1");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS3S2400000_8 awS3S2400000_8, Object obj) {
        String str;
        C533800Kwc.LJIIIIZZ((String[]) awS3S2400000_8.l2, (C19EG) awS3S2400000_8.l3, true, awS3S2400000_8.s0);
        ((C1397660mTU) obj).LIZJ = false;
        C19741112Lp c19741112Lp = C19741112Lp.LIZ;
        C19EG c19eg = (C19EG) awS3S2400000_8.l3;
        c19741112Lp.getClass();
        C19741112Lp.LJIIIIZZ(c19eg);
        ((Function0) awS3S2400000_8.l4).invoke();
        C540290LGx.LIZ.getClass();
        C540290LGx.LIZJ(true);
        C523280Kfe c523280Kfe = C523280Kfe.LIZ;
        ShortVideoContext shortVideoContext = (ShortVideoContext) awS3S2400000_8.l5;
        if (shortVideoContext != null) {
            str = shortVideoContext.shootWay;
        } else {
            str = null;
        }
        C523280Kfe.LIZLLL(c523280Kfe, str, awS3S2400000_8.s1, "1");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS3S2400000_8 awS3S2400000_8, Object obj) {
        String str;
        ((C1397660mTU) obj).LIZJ = true;
        C533800Kwc.LJIIIIZZ((String[]) awS3S2400000_8.l2, (C19EG) awS3S2400000_8.l3, false, awS3S2400000_8.s0);
        ((Function0) awS3S2400000_8.l4).invoke();
        C540290LGx.LIZ.getClass();
        C540290LGx.LIZJ(false);
        C523280Kfe c523280Kfe = C523280Kfe.LIZ;
        ShortVideoContext shortVideoContext = (ShortVideoContext) awS3S2400000_8.l5;
        if (shortVideoContext != null) {
            str = shortVideoContext.shootWay;
        } else {
            str = null;
        }
        C523280Kfe.LIZLLL(c523280Kfe, str, awS3S2400000_8.s1, CardStruct.IStatusCode.DEFAULT);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0Mea] */
    public static final Object invoke$3(AwS3S2400000_8 awS3S2400000_8, Object obj) {
        InterfaceC1635410sex interfaceC1635410sexCreateMvEffectPlatform;
        final InterfaceC1419170n2B interfaceC1419170n2B = (InterfaceC1419170n2B) obj;
        if (interfaceC1419170n2B instanceof MvThemeData) {
            EffectService companion = EffectService.Companion.getInstance();
            if (companion != null) {
                interfaceC1635410sexCreateMvEffectPlatform = companion.createMvEffectPlatform((Context) awS3S2400000_8.l2);
            } else {
                interfaceC1635410sexCreateMvEffectPlatform = null;
            }
            ITemplateResourceService iTemplateResourceService = (ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class);
            String mvId = ((MvThemeData) interfaceC1419170n2B).getMvId();
            final StickerDownloadConfig stickerDownloadConfig = (StickerDownloadConfig) awS3S2400000_8.l3;
            final q qVar = (q) awS3S2400000_8.l4;
            final Context context = (Context) awS3S2400000_8.l2;
            final RecordConfig recordConfig = (RecordConfig) awS3S2400000_8.l5;
            final String str = awS3S2400000_8.s0;
            final String str2 = awS3S2400000_8.s1;
            iTemplateResourceService.LJII(interfaceC1635410sexCreateMvEffectPlatform, mvId, new IFetchEffectListener() { // from class: X.0Mea
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(Effect effect) {
                    ((MvThemeData) interfaceC1419170n2B).LJI(effect);
                    Function0<Unit> onSuccess = stickerDownloadConfig.getOnSuccess();
                    if (onSuccess != null) {
                        onSuccess.invoke();
                    }
                    qVar.LJFF(C1388190mED.LIZ(context), recordConfig, interfaceC1419170n2B, str, str2);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                    Function1<Integer, Unit> onFail = stickerDownloadConfig.getOnFail();
                    if (onFail != null) {
                        onFail.invoke(1);
                    }
                    q.LIZJ = false;
                }
            });
        } else {
            Function0<Unit> onSuccess = ((StickerDownloadConfig) awS3S2400000_8.l3).getOnSuccess();
            if (onSuccess != null) {
                onSuccess.invoke();
            }
            ((q) awS3S2400000_8.l4).LJFF(C1388190mED.LIZ((Context) awS3S2400000_8.l2), (RecordConfig) awS3S2400000_8.l5, interfaceC1419170n2B, awS3S2400000_8.s0, awS3S2400000_8.s1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S2400000_8(Context context, q qVar, RecordConfig recordConfig, StickerDownloadConfig stickerDownloadConfig, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = context;
        this.l3 = stickerDownloadConfig;
        this.l4 = qVar;
        this.l5 = recordConfig;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS3S2400000_8(String[] strArr, String[] strArr2, C19EG c19eg, String str, Function0<Unit> function0, ShortVideoContext shortVideoContext, String str2) {
        super(1);
        this.$t = str2;
        this.l2 = strArr;
        this.l3 = strArr2;
        this.s0 = c19eg;
        this.l4 = str;
        this.l5 = function0;
        this.s1 = shortVideoContext;
    }
}
