package kotlin.jvm.internal;

import X.C09AY;
import X.C0L3U;
import X.C0MJ9;
import X.C13LP;
import X.C1416200mxO;
import X.C1416830myP;
import X.C1417030myj;
import X.C1417330mzD;
import X.C1444780nhU;
import X.C2188811AlT;
import X.C259800zU;
import X.C365090ETb;
import X.C559520Lx0;
import X.C813610Vvr;
import X.InterfaceC1416820myO;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.ies.nle.editor_jni.NLELokiResourceProtocol;
import com.bytedance.ies.nle.editor_jni.NLEResourceCallback;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.scheduler.PublishBroadcastReceiver;
import com.ss.android.ugc.aweme.scheduler.PublishService;
import com.ss.android.ugc.aweme.shortvideo.autocut.AutoCutProcessViewModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AwS85S1300000_22 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS85S1300000_22 awS85S1300000_22) {
        PublishService publishService = (PublishService) awS85S1300000_22.l1;
        String str = awS85S1300000_22.s0;
        Bitmap bitmapLIZIZ = PublishService.LIZIZ((Bitmap) awS85S1300000_22.l2, (PublishModel) awS85S1300000_22.l3);
        publishService.getClass();
        Intent intent = new Intent(publishService, (Class<?>) PublishBroadcastReceiver.class);
        intent.putExtra("creation_id", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("putExtra creationId:");
        sbLIZ.append(str);
        C1444780nhU.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        new Intent(publishService, (Class<?>) PublishBroadcastReceiver.class).putExtra("DEBUG_MSG", "MSG_SUCCESS");
        C813610Vvr c813610VvrLIZJ = PublishService.LIZJ(publishService, publishService, publishService.getString(2131857962), publishService.getString(2131857963), bitmapLIZIZ);
        c813610VvrLIZJ.LJI = PendingIntent.getBroadcast(publishService, 6, intent, 67108864);
        C365090ETb.LIZIZ();
        c813610VvrLIZJ.LJII(16, true);
        return c813610VvrLIZJ.LIZIZ();
    }

    public static final Object invoke$1(AwS85S1300000_22 awS85S1300000_22) {
        List<AutoCutThemeData> listK4;
        AutoCutProcessViewModel autoCutProcessViewModel;
        if (C559520Lx0.LIZ()) {
            listK4 = ((C1417330mzD) awS85S1300000_22.l1).K4((List) awS85S1300000_22.l2);
        } else {
            listK4 = (List) awS85S1300000_22.l2;
        }
        List<AutoCutThemeData> list = ((AutoCutModel) awS85S1300000_22.l3).templateList;
        ArrayList<AutoCutThemeData> arrayList = new ArrayList();
        for (AutoCutThemeData autoCutThemeData : list) {
            if (autoCutThemeData.LIZIZ() == C0MJ9.MIX_EDITING) {
                arrayList.add(autoCutThemeData);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (AutoCutThemeData autoCutThemeData2 : arrayList) {
            String str = autoCutThemeData2.templateId;
            if ((str != null && str.length() > 0) || (str = autoCutThemeData2.musicId) != null) {
                arrayList2.add(str);
            }
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (AutoCutThemeData autoCutThemeData3 : listK4) {
            AutoCutThemeData autoCutThemeData4 = autoCutThemeData3;
            String str2 = autoCutThemeData4.templateId;
            if (str2 == null || str2.length() <= 0) {
                str2 = autoCutThemeData4.musicId;
            }
            if (!C13LP.LJJJJ(str2, setLLIIJI)) {
                arrayList3.add(autoCutThemeData3);
            }
        }
        ((AutoCutModel) awS85S1300000_22.l3).templateList = new ArrayList(C13LP.LJLIL(arrayList3, arrayList));
        AutoCutModel autoCutModel = (AutoCutModel) awS85S1300000_22.l3;
        autoCutModel.taskId = awS85S1300000_22.s0;
        C1417330mzD c1417330mzD = (C1417330mzD) awS85S1300000_22.l1;
        s sVar = s.LIZ;
        sVar.getClass();
        c1417330mzD.d = s.LJJIFFI(autoCutModel);
        if (C1417030myj.LIZ()) {
            sVar.LJJJIL(((C1417330mzD) awS85S1300000_22.l1).d);
            sVar.LJJJI(false);
        } else {
            ViewModelProvider viewModelProviderLIZ = C0L3U.LIZ(((C1417330mzD) awS85S1300000_22.l1).getActivity());
            if (viewModelProviderLIZ != null && (autoCutProcessViewModel = (AutoCutProcessViewModel) viewModelProviderLIZ.get(AutoCutProcessViewModel.class)) != null) {
                autoCutProcessViewModel.vQ2(((C1417330mzD) awS85S1300000_22.l1).d);
                autoCutProcessViewModel.LLILLJJLI.setValue(Boolean.FALSE);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS85S1300000_22 awS85S1300000_22) {
        String unzipPath;
        if (!((C1416200mxO) awS85S1300000_22.l1).LIZJ.containsKey(((NLELokiResourceProtocol) awS85S1300000_22.l2).getEffectId())) {
            ((C1416200mxO) awS85S1300000_22.l1).LIZ(((NLELokiResourceProtocol) awS85S1300000_22.l2).getEffectId());
        }
        NLEResourceCallback nLEResourceCallback = (NLEResourceCallback) awS85S1300000_22.l3;
        if (nLEResourceCallback != null) {
            String str = awS85S1300000_22.s0;
            Effect effect = (Effect) ((LinkedHashMap) ((C1416200mxO) awS85S1300000_22.l1).LIZIZ).get(((NLELokiResourceProtocol) awS85S1300000_22.l2).getEffectId());
            if (effect == null || (unzipPath = effect.getUnzipPath()) == null) {
                unzipPath = "";
            }
            nLEResourceCallback.onSuccess(str, unzipPath, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS85S1300000_22 awS85S1300000_22) {
        C1416830myP c1416830myP = C1416830myP.LIZ;
        AVMusic aVMusic = (AVMusic) awS85S1300000_22.l1;
        String str = awS85S1300000_22.s0;
        InterfaceC1416820myO interfaceC1416820myO = (InterfaceC1416820myO) awS85S1300000_22.l2;
        Runnable runnable = (Runnable) ((C259800zU) awS85S1300000_22.l3).element;
        c1416830myP.getClass();
        C1416830myP.LIZIZ(aVMusic, interfaceC1416820myO, runnable, str);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS85S1300000_22(C1417330mzD c1417330mzD, C1417330mzD c1417330mzD2, List<AutoCutThemeData> list, AutoCutModel autoCutModel, String str) {
        super(0);
        this.$t = str;
        this.l1 = c1417330mzD;
        this.l2 = c1417330mzD2;
        this.l3 = list;
        this.s0 = autoCutModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS85S1300000_22(NLELokiResourceProtocol nLELokiResourceProtocol, NLEResourceCallback nLEResourceCallback, C1416200mxO c1416200mxO, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1416200mxO;
        this.l2 = nLELokiResourceProtocol;
        this.l3 = nLEResourceCallback;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS85S1300000_22(AVMusic aVMusic, AVMusic aVMusic2, String str, InterfaceC1416820myO interfaceC1416820myO, C259800zU<Runnable> c259800zU) {
        super(0);
        this.$t = c259800zU;
        this.l1 = aVMusic;
        this.s0 = aVMusic2;
        this.l2 = str;
        this.l3 = interfaceC1416820myO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS85S1300000_22(PublishService publishService, String str, Bitmap bitmap, PublishModel publishModel, int i) {
        super(0);
        this.$t = i;
        this.l1 = publishService;
        this.s0 = str;
        this.l2 = bitmap;
        this.l3 = publishModel;
    }
}
