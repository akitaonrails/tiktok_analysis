package kotlin.jvm.internal;

import X.C01TT;
import X.C094D;
import X.C096G;
import X.C096H;
import X.C09AY;
import X.C1408210mkV;
import X.C1413230msb;
import X.C1417330mzD;
import X.C1417710mzp;
import X.C1417950n0D;
import X.C1419950n3R;
import X.C1420000n3W;
import X.C1428330nGx;
import X.C1428470nHB;
import X.C1431480nM2;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.EnumC1419960n3S;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.smartmovie.jni.Meta;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.social.sendtodm.SendToDMComponent;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public class AwS457S0200000_22 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS457S0200000_22(C1417330mzD c1417330mzD, AutoCutModel autoCutModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1417330mzD;
        this.l1 = autoCutModel;
    }

    public static final Object invoke$0(AwS457S0200000_22 awS457S0200000_22, Object obj, Object obj2) {
        Function0 function0;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        if (!zBooleanValue2 && (function0 = (Function0) awS457S0200000_22.l0) != null) {
            function0.invoke();
        }
        ((C1428330nGx) awS457S0200000_22.l1).LLJJJJ.jn(zBooleanValue, zBooleanValue2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS457S0200000_22 awS457S0200000_22, Object obj, Object obj2) {
        Function0 function0;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        if (!zBooleanValue2 && (function0 = (Function0) awS457S0200000_22.l0) != null) {
            function0.invoke();
        }
        ((C1428330nGx) awS457S0200000_22.l1).LLJJJJ.jn(zBooleanValue, zBooleanValue2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS457S0200000_22 awS457S0200000_22, Object obj, Object obj2) {
        C01TT.LIZLLL(new AwS85S1300000_22((C1417330mzD) awS457S0200000_22.l0, (C1417330mzD) obj, (List<AutoCutThemeData>) awS457S0200000_22.l1, (AutoCutModel) obj2, (String) 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS457S0200000_22 awS457S0200000_22, Object obj, Object obj2) {
        ((SendToDMComponent) awS457S0200000_22.l0).m3().creativeModel.editSaveLocalModel.forceSaveToVideo = false;
        C1413230msb c1413230msb = new C1413230msb((Context) awS457S0200000_22.l1, ((SendToDMComponent) awS457S0200000_22.l0).m3(), "dm", new AwS566S0100000_22((SendToDMComponent) awS457S0200000_22.l0, 388));
        C1408210mkV c1408210mkV = new C1408210mkV((View) obj2, c1413230msb);
        c1413230msb.LIZJ(new AwS388S0200000_22((TuxSheet) obj, c1408210mkV, 52));
        c1408210mkV.LIZ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", ((SendToDMComponent) awS457S0200000_22.l0).m3().getCreationId());
        c2344009Gk.LJIIIIZZ("enter_from", "video_edit_page");
        c2344009Gk.LJIIIIZZ("shoot_way", ((SendToDMComponent) awS457S0200000_22.l0).m3().mShootWay);
        c2344009Gk.LJIIIIZZ("content_source", C1428470nHB.LJIILIIL(((SendToDMComponent) awS457S0200000_22.l0).m3()));
        c2344009Gk.LJIIIIZZ("content_type", C1428470nHB.LJIILL(((SendToDMComponent) awS457S0200000_22.l0).m3()));
        c2344009Gk.LJIIIIZZ("shoot_tab_name", C1428470nHB.LJJIIZI(((SendToDMComponent) awS457S0200000_22.l0).m3()));
        c2344009Gk.LIZJ(((SendToDMComponent) awS457S0200000_22.l0).m3().creativeModel.commonMobModel.originVideoCount, "video_cnt");
        c2344009Gk.LIZJ(((SendToDMComponent) awS457S0200000_22.l0).m3().creativeModel.commonMobModel.originPhotoCount, "pic_cnt");
        c2344009Gk.LJIIIIZZ("entrance_type", "dm");
        c2344009Gk.LIZJ(1, "is_save_format_option");
        c2344009Gk.LIZJ(1, "is_choose_photo_option");
        c2344009Gk.LJIIIIZZ("action_type", "click_entrance");
        C20684815ws.LJIILLIIL("save_local_photo_selection", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS457S0200000_22 awS457S0200000_22, Object obj, Object obj2) {
        ((Number) obj).intValue();
        AbstractImageUploader.ImageUploadInfo imageUploadInfo = (AbstractImageUploader.ImageUploadInfo) obj2;
        ((AbstractImageUploader) awS457S0200000_22.l1).LIZJ();
        ((CopyOnWriteArrayList) ((C1431480nM2) awS457S0200000_22.l0).LLJJIJIIJIL).remove((AbstractImageUploader) awS457S0200000_22.l1);
        C1431480nM2 c1431480nM2 = (C1431480nM2) awS457S0200000_22.l0;
        if (c1431480nM2.LLJJJ) {
            if (((CopyOnWriteArrayList) c1431480nM2.LLJJIJIIJIL).size() == 0) {
                C1431480nM2 c1431480nM22 = (C1431480nM2) awS457S0200000_22.l0;
                c1431480nM22.LJIJ(imageUploadInfo, c1431480nM22.LLJJIII);
            }
        } else {
            c1431480nM2.LJIJ(imageUploadInfo, c1431480nM2.LLJJIII);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS457S0200000_22 awS457S0200000_22, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        String str = (String) obj2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutTemplateUtils AutoCutCompressMetaTask startCompressMeta: compressMeta onFailure code=");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", msg=");
        sbLIZ.append(str);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        AtomicBoolean atomicBoolean = (AtomicBoolean) awS457S0200000_22.l0;
        C094D c094d = (C094D) awS457S0200000_22.l1;
        if (str == null) {
            str = "";
        }
        C1417950n0D.LJ(atomicBoolean, c094d, new C096G(iIntValue, "", str, new HashMap()));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS457S0200000_22 awS457S0200000_22, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        String str = (String) obj2;
        if (((C1419950n3R) awS457S0200000_22.l0).LIZJ != EnumC1419960n3S.CANCELED) {
            ((C1419950n3R) awS457S0200000_22.l0).LIZJ = EnumC1419960n3S.FAILED;
            C1419950n3R c1419950n3R = (C1419950n3R) awS457S0200000_22.l0;
            C1420000n3W c1420000n3W = c1419950n3R.LJFF;
            c1420000n3W.LIZIZ = iIntValue;
            c1420000n3W.LIZJ = str;
            Function2<? super Integer, ? super String, Unit> function2 = c1419950n3R.LJ;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(iIntValue), str);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS457S0200000_22 awS457S0200000_22, Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        String str = (String) obj2;
        if (((C1419950n3R) awS457S0200000_22.l0).LIZJ != EnumC1419960n3S.CANCELED) {
            ((C1419950n3R) awS457S0200000_22.l0).LIZJ = EnumC1419960n3S.FAILED;
            C1419950n3R c1419950n3R = (C1419950n3R) awS457S0200000_22.l0;
            C1420000n3W c1420000n3W = c1419950n3R.LJFF;
            c1420000n3W.LIZIZ = iIntValue;
            c1420000n3W.LIZJ = str;
            Function2<? super Integer, ? super String, Unit> function2 = c1419950n3R.LJ;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(iIntValue), str);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS457S0200000_22(C1419950n3R c1419950n3R, Meta meta, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1419950n3R;
        this.l1 = meta;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS457S0200000_22(C1431480nM2 c1431480nM2, AbstractImageUploader abstractImageUploader, int i) {
        super(2);
        this.$t = i;
        this.l0 = c1431480nM2;
        this.l1 = abstractImageUploader;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS457S0200000_22(SendToDMComponent sendToDMComponent, Context context, int i) {
        super(2);
        this.$t = i;
        this.l0 = sendToDMComponent;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS457S0200000_22(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C094D<? super C096H> c094d) {
        super(2);
        this.$t = c094d;
        this.l0 = atomicBoolean;
        this.l1 = atomicBoolean2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS457S0200000_22(Function0 function0, Function0<Unit> function02, C1428330nGx c1428330nGx) {
        super(2);
        this.$t = c1428330nGx;
        this.l0 = function0;
        this.l1 = function02;
    }
}
