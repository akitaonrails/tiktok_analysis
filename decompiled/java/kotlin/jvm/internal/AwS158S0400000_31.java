package kotlin.jvm.internal;

import X.AbstractC20384214pU;
import X.AbstractC20598115it;
import X.C013C;
import X.C01GW;
import X.C05P0;
import X.C09AY;
import X.C0IK5;
import X.C13LP;
import X.C13LQ;
import X.C16G0;
import X.C16GX;
import X.C1839820xye;
import X.C20361214lm;
import X.C20684815ws;
import X.C20700215zM;
import X.C20700315zN;
import X.C20700915zT;
import X.C20747416Gq;
import X.C2344009Gk;
import X.C294270Bg9;
import X.C634930OvL;
import X.InterfaceC20354714kj;
import X.RunnableC514801zW;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import com.bytedance.android.live.effect.playentity.SoundEffectsEntity;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.visualsearch.components.widget.PhotoSearchAppbarLayout$Behavior;
import com.ss.android.ugc.trill.setting.DoNotTranslateSettingPage;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes32.dex */
public class AwS158S0400000_31 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS158S0400000_31 awS158S0400000_31) {
        PlayEntityUtilKt.LIZJ((SoundEffectsEntity) awS158S0400000_31.l0, "", (C20361214lm) awS158S0400000_31.l1, (InterfaceC20354714kj) awS158S0400000_31.l2, ((C013C) awS158S0400000_31.l3).element);
        ((C013C) awS158S0400000_31.l3).element = false;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS158S0400000_31 awS158S0400000_31) {
        AsyncAVService asyncAVService = (AsyncAVService) awS158S0400000_31.l0;
        C634930OvL c634930OvL = (C634930OvL) awS158S0400000_31.l1;
        RecordConfig.Builder builder = (RecordConfig.Builder) awS158S0400000_31.l2;
        asyncAVService.uiService().recordService().startRecord(c634930OvL.LIZ, builder.build(), (MusicModel) awS158S0400000_31.l3, true);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS158S0400000_31 awS158S0400000_31) {
        Function0<Boolean> function0 = ((C20747416Gq) ((C16GX) awS158S0400000_31.l0)).LLJJIJIIJIL;
        boolean zOnTouchEvent = true;
        if (function0 == null || !function0.invoke().booleanValue()) {
            zOnTouchEvent = super/*com.google.android.material.appbar.HeaderBehavior*/.onTouchEvent((C16G0) awS158S0400000_31.l2, (C16GX) awS158S0400000_31.l0, (MotionEvent) awS158S0400000_31.l3);
        }
        return Boolean.valueOf(zOnTouchEvent);
    }

    public static final Object invoke$3(AwS158S0400000_31 awS158S0400000_31) {
        String[] strArrFindRemovedLanguages;
        String strLJJJ;
        C20700215zM c20700215zMLJIIIIZZ = C1839820xye.LIZ().LJIIIIZZ();
        Integer numValueOf = null;
        if (C294270Bg9.LIZ()) {
            c20700215zMLJIIIIZZ.getClass();
            String[] strArrLIZ = C20700315zN.LIZ();
            if (strArrLIZ != null) {
                strArrFindRemovedLanguages = c20700215zMLJIIIIZZ.findRemovedLanguages(strArrLIZ, (String[]) AwS460S0200000_25.LIZ$0((C05P0) awS158S0400000_31.l1).toArray(new String[0]));
            } else {
                strArrFindRemovedLanguages = null;
            }
            c20700215zMLJIIIIZZ.clearDefaultDNTLangsAndSetHasUserManuallyModifiedDNTs();
        } else {
            strArrFindRemovedLanguages = null;
        }
        c20700215zMLJIIIIZZ.setSelectedDoNotTranslateLanguageCodes((String[]) AwS460S0200000_25.LIZ$0((C05P0) awS158S0400000_31.l1).toArray(new String[0]));
        ((C20700915zT) ((C01GW) awS158S0400000_31.l2).getValue()).LIZ((String[]) AwS460S0200000_25.LIZ$0((C05P0) awS158S0400000_31.l1).toArray(new String[0]));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("user_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUid());
        c2344009Gk.LJIIIIZZ("enter_from", (String) ((DoNotTranslateSettingPage) awS158S0400000_31.l0).LLJIJIL.getValue());
        c2344009Gk.LJIIIIZZ("enter_method", "translation_setting");
        c2344009Gk.LJIIIIZZ("not_translate_langs", C13LP.LJJLIIIJ(AwS460S0200000_25.LIZ$0((C05P0) awS158S0400000_31.l1), ",", null, null, 0, null, null, 62));
        c2344009Gk.LJIIIIZZ("prev_not_translate_langs", C13LP.LJJLIIIJ((Iterable) ((C05P0) awS158S0400000_31.l3).getValue(), ",", null, null, 0, null, null, 62));
        if (strArrFindRemovedLanguages != null) {
            strLJJJ = C13LQ.LJJJ(strArrFindRemovedLanguages, ",", null, null, null, 62);
        } else {
            strLJJJ = null;
        }
        c2344009Gk.LJIIIIZZ("unselect_default_langs", strLJJJ);
        DoNotTranslateSettingPage doNotTranslateSettingPage = (DoNotTranslateSettingPage) awS158S0400000_31.l0;
        Bundle arguments = doNotTranslateSettingPage.getArguments();
        if (arguments != null && arguments.containsKey("aweme_type")) {
            Bundle arguments2 = doNotTranslateSettingPage.getArguments();
            if (arguments2 != null) {
                numValueOf = Integer.valueOf(arguments2.getInt("aweme_type"));
            }
            c2344009Gk.LJ(numValueOf, "aweme_type");
        }
        C20684815ws.LJIILLIIL("save_not_translate_langs", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS158S0400000_31 awS158S0400000_31) {
        AbstractC20384214pU.LJJ((AbstractC20384214pU) awS158S0400000_31.l0, (Playbook) awS158S0400000_31.l1, "fillUpPlaybookDetail", false, (Map) awS158S0400000_31.l2, 20);
        C0IK5.LIZIZ(null, new RunnableC514801zW((Function0) awS158S0400000_31.l3, (Function0<Unit>) 124));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS158S0400000_31 awS158S0400000_31) {
        if (((RecordConfig) awS158S0400000_31.l0).getReshootConfig().getEnableReshoot()) {
            ((AbstractC20598115it) awS158S0400000_31.l1).LIZJ((Context) awS158S0400000_31.l2, (Intent) awS158S0400000_31.l3, ((RecordConfig) awS158S0400000_31.l0).getKeepChallenges(), ((RecordConfig) awS158S0400000_31.l0).getReshootConfig());
        } else {
            ((AbstractC20598115it) awS158S0400000_31.l1).LIZIZ((Context) awS158S0400000_31.l2, (Intent) awS158S0400000_31.l3, ((RecordConfig) awS158S0400000_31.l0).getKeepChallenges());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS158S0400000_31(AbstractC20384214pU abstractC20384214pU, Playbook playbook, Map map, AwS575S0100000_31 awS575S0100000_31, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC20384214pU;
        this.l1 = playbook;
        this.l2 = map;
        this.l3 = awS575S0100000_31;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS158S0400000_31(MotionEvent motionEvent, C16G0 c16g0, C16GX c16gx, PhotoSearchAppbarLayout$Behavior photoSearchAppbarLayout$Behavior, int i) {
        super(0);
        this.$t = i;
        this.l0 = c16gx;
        this.l1 = photoSearchAppbarLayout$Behavior;
        this.l2 = c16g0;
        this.l3 = motionEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS158S0400000_31(SoundEffectsEntity soundEffectsEntity, C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, C013C c013c, int i) {
        super(0);
        this.$t = i;
        this.l0 = soundEffectsEntity;
        this.l1 = c20361214lm;
        this.l2 = interfaceC20354714kj;
        this.l3 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS158S0400000_31(AsyncAVService asyncAVService, C634930OvL c634930OvL, RecordConfig.Builder builder, MusicModel musicModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = asyncAVService;
        this.l1 = c634930OvL;
        this.l2 = builder;
        this.l3 = musicModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS158S0400000_31(RecordConfig recordConfig, AbstractC20598115it abstractC20598115it, Context context, Intent intent, int i) {
        super(0);
        this.$t = i;
        this.l0 = recordConfig;
        this.l1 = abstractC20598115it;
        this.l2 = context;
        this.l3 = intent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS158S0400000_31(DoNotTranslateSettingPage doNotTranslateSettingPage, DoNotTranslateSettingPage doNotTranslateSettingPage2, C05P0<List<String>> c05p0, C01GW<C20700915zT> c01gw, C05P0<List<String>> c05p02) {
        super(0);
        this.$t = c05p02;
        this.l0 = doNotTranslateSettingPage;
        this.l1 = doNotTranslateSettingPage2;
        this.l2 = c05p0;
        this.l3 = c01gw;
    }
}
