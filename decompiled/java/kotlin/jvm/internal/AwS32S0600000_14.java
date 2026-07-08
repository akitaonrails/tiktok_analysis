package kotlin.jvm.internal;

import X.C09AY;
import X.C0PEM;
import X.C0Y8T;
import X.C0YMW;
import X.C0YTK;
import X.C0YTZ;
import X.C0ZL0;
import X.C0ZQI;
import X.C0ZQO;
import X.C1516540pZE;
import X.C19EG;
import X.C23250099c;
import X.C867980Y3g;
import X.C869590Y9l;
import X.C900720ZVe;
import X.EnumC868530Y5j;
import X.InterfaceC497601wk;
import X.InterfaceC550020Lhg;
import X.InterfaceC889250YuZ;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.actionbar.SocialActionBarDataFetchAssem;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public class AwS32S0600000_14 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS32S0600000_14 awS32S0600000_14, Object obj) {
        ((InterfaceC889250YuZ) awS32S0600000_14.l0).show();
        ((C0ZQI) awS32S0600000_14.l1).LJ(C0ZL0.PHOTO2STICKER, null);
        C23250099c.LIZLLL((InterfaceC497601wk) awS32S0600000_14.l2, C0PEM.LIZJ, null, new C0ZQO((C869590Y9l) awS32S0600000_14.l3, (InterfaceC889250YuZ) awS32S0600000_14.l0, (Activity) awS32S0600000_14.l4, (Photo2StickerViewModel) awS32S0600000_14.l5, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS32S0600000_14 awS32S0600000_14, Object obj) {
        C900720ZVe c900720ZVe = (C900720ZVe) awS32S0600000_14.l0;
        Fragment fragment = (Fragment) awS32S0600000_14.l1;
        C869590Y9l c869590Y9l = (C869590Y9l) awS32S0600000_14.l2;
        SessionInfo sessionInfo = (SessionInfo) awS32S0600000_14.l3;
        View view = (View) awS32S0600000_14.l4;
        PictureCardTemplate pictureCardTemplate = (PictureCardTemplate) awS32S0600000_14.l5;
        c900720ZVe.getClass();
        C900720ZVe.LJIILJJIL(view, fragment, c869590Y9l, sessionInfo, pictureCardTemplate);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS32S0600000_14 awS32S0600000_14, Object obj) {
        C867980Y3g c867980Y3g = (C867980Y3g) obj;
        EnumC868530Y5j enumC868530Y5j = (EnumC868530Y5j) awS32S0600000_14.l0;
        if (enumC868530Y5j != null) {
            c867980Y3g.LJIIIZ = enumC868530Y5j;
        }
        Boolean bool = (Boolean) awS32S0600000_14.l1;
        if (bool != null) {
            c867980Y3g.LJII = bool;
        }
        Boolean bool2 = (Boolean) awS32S0600000_14.l2;
        if (bool2 != null) {
            c867980Y3g.LJI = bool2;
        }
        List list = (List) awS32S0600000_14.l3;
        if (list != null && !list.isEmpty()) {
            List<String> list2 = (List) awS32S0600000_14.l3;
            c867980Y3g.getClass();
            C1516540pZE.LIZ(list2);
            c867980Y3g.LJIIJJI = list2;
        }
        List list3 = (List) awS32S0600000_14.l4;
        if (list3 != null && !list3.isEmpty()) {
            List<String> list4 = (List) awS32S0600000_14.l4;
            c867980Y3g.getClass();
            C1516540pZE.LIZ(list4);
            c867980Y3g.LJIIJ = list4;
        }
        Integer num = (Integer) awS32S0600000_14.l5;
        if (num != null) {
            c867980Y3g.LJIIL = num;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS32S0600000_14 awS32S0600000_14, Object obj) {
        Long lValueOf;
        InterfaceC550020Lhg interfaceC550020Lhg = (InterfaceC550020Lhg) awS32S0600000_14.l0;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope((SocialActionBarDataFetchAssem) awS32S0600000_14.l1);
        Context context = (Context) awS32S0600000_14.l2;
        String conversationId = ((SocialActionBarDataFetchAssem) awS32S0600000_14.l1).mo().getConversationId();
        C0Y8T c0y8t = (C0Y8T) awS32S0600000_14.l3;
        if (c0y8t != null) {
            lValueOf = Long.valueOf(c0y8t.getConversationShortId());
        } else {
            lValueOf = null;
        }
        interfaceC550020Lhg.LJII(lifecycleScope, context, conversationId, String.valueOf(lValueOf), ((SocialActionBarDataFetchAssem) awS32S0600000_14.l1).mo().isGroupChat(), ((User) awS32S0600000_14.l4).getUid(), (List) awS32S0600000_14.l5);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS32S0600000_14 awS32S0600000_14, Object obj) {
        C0YTK c0ytkLIZJ = ((C0YTZ) awS32S0600000_14.l0).LIZJ();
        if (c0ytkLIZJ != null) {
            c0ytkLIZJ.LJ((C0Y8T) awS32S0600000_14.l1, (C869590Y9l) awS32S0600000_14.l2);
        }
        List list = (List) awS32S0600000_14.l3;
        if (obj == null) {
            obj = (C869590Y9l) awS32S0600000_14.l2;
        }
        list.add(obj);
        ((C0YTZ) awS32S0600000_14.l0).LIZIZ((C0Y8T) awS32S0600000_14.l1, (List) awS32S0600000_14.l4, (List) awS32S0600000_14.l3, (Map) awS32S0600000_14.l5);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS32S0600000_14 awS32S0600000_14, Object obj) {
        C0YMW c0ymw = (C0YMW) obj;
        C0YTK c0ytkLIZJ = ((C0YTZ) awS32S0600000_14.l0).LIZJ();
        if (c0ytkLIZJ != null) {
            c0ytkLIZJ.LJII((C0Y8T) awS32S0600000_14.l1, (C869590Y9l) awS32S0600000_14.l2, c0ymw);
        }
        Map map = (Map) awS32S0600000_14.l3;
        C869590Y9l c869590Y9l = (C869590Y9l) awS32S0600000_14.l2;
        if (c0ymw == null) {
            c0ymw = C0YMW.newBuilder().LIZ;
            c0ymw.statusMsg = "Unknown error";
        }
        map.put(c869590Y9l, c0ymw);
        ((C0YTZ) awS32S0600000_14.l0).LIZIZ((C0Y8T) awS32S0600000_14.l1, (List) awS32S0600000_14.l4, (List) awS32S0600000_14.l5, (Map) awS32S0600000_14.l3);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS32S0600000_14(X.C0YTZ r3, X.C0YTZ r4, X.C0Y8T r5, X.C869590Y9l r6, java.util.List<X.C869590Y9l> r7, java.util.List<X.C869590Y9l> r8, java.util.Map<X.C869590Y9l, X.C0YMW> r9) {
        /*
            r2 = this;
            r2.$t = r9
            int r9 = 4 - r9
            if (r9 == 0) goto L18
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r1.l3 = r8
            r1.l4 = r6
            r1.l5 = r7
            r0 = 1
        L14:
            r1.<init>(r0)
            return
        L18:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r1.l3 = r6
            r1.l4 = r7
            r1.l5 = r8
            r0 = 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS32S0600000_14.<init>(X.0YTZ, X.0Y8T, X.0Y9l, java.util.List, java.util.List, java.util.Map, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS32S0600000_14(InterfaceC550020Lhg interfaceC550020Lhg, InterfaceC550020Lhg interfaceC550020Lhg2, SocialActionBarDataFetchAssem socialActionBarDataFetchAssem, Context context, C0Y8T c0y8t, User user, List<String> list) {
        super(1);
        this.$t = list;
        this.l0 = interfaceC550020Lhg;
        this.l1 = interfaceC550020Lhg2;
        this.l2 = socialActionBarDataFetchAssem;
        this.l3 = context;
        this.l4 = c0y8t;
        this.l5 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS32S0600000_14(EnumC868530Y5j enumC868530Y5j, EnumC868530Y5j enumC868530Y5j2, Boolean bool, Boolean bool2, List<String> list, List<String> list2, Integer num) {
        super(1);
        this.$t = num;
        this.l0 = enumC868530Y5j;
        this.l1 = enumC868530Y5j2;
        this.l2 = bool;
        this.l3 = bool2;
        this.l4 = list;
        this.l5 = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S0600000_14(C900720ZVe c900720ZVe, Fragment fragment, C869590Y9l c869590Y9l, SessionInfo sessionInfo, View view, PictureCardTemplate pictureCardTemplate, int i) {
        super(1);
        this.$t = i;
        this.l0 = c900720ZVe;
        this.l1 = fragment;
        this.l2 = c869590Y9l;
        this.l3 = sessionInfo;
        this.l4 = view;
        this.l5 = pictureCardTemplate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S0600000_14(C19EG c19eg, C869590Y9l c869590Y9l, InterfaceC889250YuZ interfaceC889250YuZ, C0ZQI c0zqi, Photo2StickerViewModel photo2StickerViewModel, LifecycleCoroutineScope lifecycleCoroutineScope, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC889250YuZ;
        this.l1 = c0zqi;
        this.l2 = lifecycleCoroutineScope;
        this.l3 = c869590Y9l;
        this.l4 = c19eg;
        this.l5 = photo2StickerViewModel;
    }
}
