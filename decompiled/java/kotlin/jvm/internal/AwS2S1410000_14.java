package kotlin.jvm.internal;

import X.AbstractC885540Yoa;
import X.C09AY;
import X.C0Y8T;
import X.C0Z2V;
import X.C1360890lWB;
import X.C1389910mGz;
import X.C13LP;
import X.C15438062q;
import X.C19212010Ec;
import X.C20642515q3;
import X.C418440Gaw;
import X.C814420VxA;
import X.C877320YbK;
import X.C877540Ybg;
import X.C877600Ybm;
import X.C878550YdJ;
import X.C878590YdN;
import X.C878630YdR;
import X.C878650YdT;
import X.C879540Yeu;
import X.C880690Ygl;
import X.C885310YoD;
import X.C885670Yon;
import X.C885760Yow;
import X.EnumC885270Yo9;
import X.InterfaceC1491305sd;
import X.InterfaceC878540YdI;
import X.InterfaceC879010Ye3;
import android.app.Activity;
import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public class AwS2S1410000_14 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public boolean z5;

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

    public static final Object invoke$0(AwS2S1410000_14 awS2S1410000_14) {
        String string;
        C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
        boolean zContains = c19212010Ec.LJIIIIZZ().contains(FilterTabType.SECONDARY);
        if (zContains) {
            string = C20642515q3.LJ(2131755198, ((List) awS2S1410000_14.l1).size(), ((Activity) awS2S1410000_14.l2).getString(c19212010Ec.LJI()));
        } else if (((List) awS2S1410000_14.l1).size() > 1) {
            string = C20642515q3.LJ(2131755209, ((List) awS2S1410000_14.l1).size(), String.valueOf(((List) awS2S1410000_14.l1).size()));
        } else {
            string = ((Activity) awS2S1410000_14.l2).getString(2131837253);
        }
        C1389910mGz c1389910mGz = new C1389910mGz((Activity) awS2S1410000_14.l2);
        c1389910mGz.LJI(R.style.y0);
        c1389910mGz.LJIIJ(string);
        c1389910mGz.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight((Activity) awS2S1410000_14.l2));
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LIZIZ = 0;
        c1360890lWB.LIZLLL = 3;
        if (zContains) {
            c1389910mGz.LIZ.LJ = new C885670Yon((Activity) awS2S1410000_14.l2, c1389910mGz, (C885760Yow) awS2S1410000_14.l3, (List) awS2S1410000_14.l1, awS2S1410000_14.z5, (List) awS2S1410000_14.l4, awS2S1410000_14.s0);
        }
        c1389910mGz.LJIIJJI();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S1410000_14 awS2S1410000_14) {
        C878630YdR c878630YdR;
        List list = (List) awS2S1410000_14.l1;
        C878590YdN c878590YdN = (C878590YdN) awS2S1410000_14.l2;
        ArrayList<C0Y8T> arrayList = new ArrayList();
        for (Object obj : list) {
            c878590YdN.getClass();
            C0Z2V.LIZ.getClass();
            if (C0Z2V.LJI((C0Y8T) obj)) {
                arrayList.add(obj);
            }
        }
        C878590YdN c878590YdN2 = (C878590YdN) awS2S1410000_14.l2;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (C0Y8T c0y8t : arrayList) {
            c878590YdN2.getClass();
            arrayList2.add(C878590YdN.LJIIJ(c0y8t));
        }
        C878590YdN c878590YdN3 = (C878590YdN) awS2S1410000_14.l2;
        C877540Ybg c877540Ybg = (C877540Ybg) awS2S1410000_14.l3;
        c878590YdN3.getClass();
        List<? extends C879540Yeu<?>> listLJLIL = C13LP.LJLIL(C13LP.LJJJJLI(C878590YdN.LIZ(c877540Ybg).values()), arrayList2);
        Objects.toString(((C877540Ybg) awS2S1410000_14.l3).LIZ);
        List list2 = (List) awS2S1410000_14.l1;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C0Y8T) it2.next()).getConversationId());
        }
        arrayList3.toString();
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            InterfaceC1491305sd interfaceC1491305sd = ((C879540Yeu) it3.next()).LIZIZ;
            String conversationId = null;
            if ((interfaceC1491305sd instanceof C878630YdR) && (c878630YdR = (C878630YdR) interfaceC1491305sd) != null) {
                conversationId = c878630YdR.getConversationId();
            }
            arrayList4.add(conversationId);
        }
        arrayList4.toString();
        if (Intrinsics.LJFF(awS2S1410000_14.s0, "MessageRequestListDataSource:batch_update_refresh") && !awS2S1410000_14.z5 && C880690Ygl.LIZIZ(((C877540Ybg) awS2S1410000_14.l3).LIZ.LLILLL)) {
            C878590YdN.LJ = new C878650YdT(((List) awS2S1410000_14.l1).size(), arrayList2.size());
        }
        CopyOnWriteArrayList<InterfaceC878540YdI> copyOnWriteArrayList = ((C878590YdN) awS2S1410000_14.l2).LJIILL().get((C877540Ybg) awS2S1410000_14.l3);
        if (copyOnWriteArrayList != null) {
            C877540Ybg c877540Ybg2 = (C877540Ybg) awS2S1410000_14.l3;
            boolean z = awS2S1410000_14.z5;
            C877600Ybm c877600Ybm = (C877600Ybm) awS2S1410000_14.l4;
            String str = awS2S1410000_14.s0;
            Iterator<InterfaceC878540YdI> it4 = copyOnWriteArrayList.iterator();
            while (it4.hasNext()) {
                it4.next().LIZLLL(c877540Ybg2.LIZ, listLJLIL, listLJLIL, new C878550YdJ(z, c877600Ybm, 4), false, true, str);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object invoke$2(AwS2S1410000_14 awS2S1410000_14) {
        C877320YbK c877320YbK = C877320YbK.LIZ;
        Activity activity = (Activity) awS2S1410000_14.l1;
        String str = awS2S1410000_14.s0;
        List list = (List) awS2S1410000_14.l2;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((SetConversationSettingInfoResponseBody) it2.next()).setting_info.conversation_id);
        }
        c877320YbK.LIZLLL(activity, (EnumC885270Yo9) awS2S1410000_14.l4, (InterfaceC879010Ye3) awS2S1410000_14.l3, str, arrayList, null, awS2S1410000_14.z5, false);
        C885310YoD c885310YoD = C885310YoD.LIZ;
        String str2 = awS2S1410000_14.s0;
        String batchActionTypeMobValue = ((EnumC885270Yo9) awS2S1410000_14.l4).getBatchActionTypeMobValue();
        C877320YbK c877320YbK2 = C877320YbK.LIZ;
        InterfaceC879010Ye3 interfaceC879010Ye3 = (InterfaceC879010Ye3) awS2S1410000_14.l3;
        c877320YbK2.getClass();
        c885310YoD.LJ(((List) awS2S1410000_14.l2).size(), str2, "toast_retry", batchActionTypeMobValue, C877320YbK.LJIIJ(interfaceC879010Ye3));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS2S1410000_14 awS2S1410000_14) {
        C877320YbK c877320YbK = C877320YbK.LIZ;
        Activity activity = (Activity) awS2S1410000_14.l1;
        String str = awS2S1410000_14.s0;
        List list = (List) awS2S1410000_14.l2;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((SetConversationSettingInfoResponseBody) it2.next()).setting_info.conversation_id);
        }
        C877320YbK.LJ(64, activity, (EnumC885270Yo9) awS2S1410000_14.l4, c877320YbK, (InterfaceC879010Ye3) awS2S1410000_14.l3, str, arrayList, null, awS2S1410000_14.z5, true);
        C885310YoD c885310YoD = C885310YoD.LIZ;
        String str2 = awS2S1410000_14.s0;
        String batchActionTypeMobValue = ((EnumC885270Yo9) awS2S1410000_14.l4).getBatchActionTypeMobValue();
        C877320YbK c877320YbK2 = C877320YbK.LIZ;
        InterfaceC879010Ye3 interfaceC879010Ye3 = (InterfaceC879010Ye3) awS2S1410000_14.l3;
        c877320YbK2.getClass();
        c885310YoD.LJ(((List) awS2S1410000_14.l2).size(), str2, "toast_retry", batchActionTypeMobValue, C877320YbK.LJIIJ(interfaceC879010Ye3));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S1410000_14(Activity activity, Activity activity2, String str, List<SetConversationSettingInfoResponseBody> list, InterfaceC879010Ye3 interfaceC879010Ye3, EnumC885270Yo9 enumC885270Yo9, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l1 = activity;
        this.s0 = activity2;
        this.l2 = str;
        this.l3 = list;
        this.l4 = interfaceC879010Ye3;
        this.z5 = enumC885270Yo9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S1410000_14(List list, List<C0Y8T> list2, C878590YdN c878590YdN, C877540Ybg c877540Ybg, String str, boolean z, C877600Ybm c877600Ybm) {
        super(0);
        this.$t = c877600Ybm;
        this.l1 = list;
        this.l2 = list2;
        this.l3 = c878590YdN;
        this.s0 = c877540Ybg;
        this.z5 = str;
        this.l4 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S1410000_14(List list, List<String> list2, Activity activity, C885760Yow c885760Yow, boolean z, List<? extends AbstractC885540Yoa<?>> list3, String str) {
        super(0);
        this.$t = str;
        this.l1 = list;
        this.l2 = list2;
        this.l3 = activity;
        this.z5 = c885760Yow;
        this.l4 = z;
        this.s0 = list3;
    }
}
