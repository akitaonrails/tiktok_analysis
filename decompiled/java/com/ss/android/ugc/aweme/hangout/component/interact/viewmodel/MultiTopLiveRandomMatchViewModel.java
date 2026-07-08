package com.ss.android.ugc.aweme.hangout.component.interact.viewmodel;

import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C09IC;
import X.C09YA;
import X.C0CW2;
import X.C0J60;
import X.C0J65;
import X.C0J66;
import X.C13IQ;
import X.C13LE;
import X.C19719912Dl;
import X.C1BNE;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C23250099c;
import X.C481490IuR;
import X.C481500IuS;
import X.C481510IuT;
import X.C481530IuV;
import X.C481620Iue;
import X.C481640Iug;
import X.C481660Iui;
import X.C481670Iuj;
import X.C481940IvA;
import X.C482240Ive;
import X.C486300J5g;
import X.C486320J5i;
import X.C486330J5j;
import X.C486370J5n;
import X.C490801ve;
import X.InterfaceC0148002o;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchGuestCancelReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendedRoom;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiTopLiveRoomMatchConfigSetting;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageResponse;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hangout.component.interact.model.MultiTopLiveRoomMatchScene;
import com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveRandomMatchViewModel;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS125S0110000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiTopLiveRandomMatchViewModel extends AssemViewModel<C490801ve> {
    public final C2252321DDq LL;
    public final AnonymousClass0951 LLILLJJLI;
    public final MutableLiveData<List<RecommendedRoom>> LLILLL;
    public final MutableLiveData LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final double LLIZ;
    public final double LLIZLLLIL;
    public AnonymousClass0956 LLJ;
    public final C09YA LLJI;
    public final C481530IuV LLJIJIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C490801ve(null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void vQ2() {
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(MultiTopLiveRoomMatchScene.class));
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(MultiTopLiveRoomMatchScene.class));
                    obj = obj2;
                    if (obj2 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MultiTopLiveRoomMatchScene.class);
                        C0J66<?, ?> c486370J5n = Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class)) ? new C486370J5n() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class)) ? new C0J60() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class)) ? new C486330J5j() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class)) ? new C486320J5i() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class)) ? new C486300J5g() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class)) ? new C481940IvA() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class)) ? new C481660Iui() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class)) ? new C482240Ive() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class)) ? new C481640Iug() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class)) ? new MultiTopLiveRoomMatchScene() : null;
                        map.put(C13LE.LIZ(MultiTopLiveRoomMatchScene.class), c486370J5n);
                        obj = c486370J5n;
                        if (c486370J5n != null) {
                            C0J65.LL.LJI(c486370J5n);
                            obj = c486370J5n;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C0J66 c0j66 = (C0J66) (obj instanceof MultiTopLiveRoomMatchScene ? obj : null);
        if (c0j66 != null) {
            c0j66.LIZ(this.LLJIJIL, Collections.singletonList("linkmic_notify"));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void yQ2() {
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(MultiTopLiveRoomMatchScene.class));
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(MultiTopLiveRoomMatchScene.class));
                    obj = obj2;
                    if (obj2 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MultiTopLiveRoomMatchScene.class);
                        C0J66<?, ?> c486370J5n = Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class)) ? new C486370J5n() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class)) ? new C0J60() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class)) ? new C486330J5j() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class)) ? new C486320J5i() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class)) ? new C486300J5g() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class)) ? new C481940IvA() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class)) ? new C481660Iui() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class)) ? new C482240Ive() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class)) ? new C481640Iug() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class)) ? new MultiTopLiveRoomMatchScene() : null;
                        map.put(C13LE.LIZ(MultiTopLiveRoomMatchScene.class), c486370J5n);
                        obj = c486370J5n;
                        if (c486370J5n != null) {
                            C0J65.LL.LJI(c486370J5n);
                            obj = c486370J5n;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C0J66 c0j66 = (C0J66) (obj instanceof MultiTopLiveRoomMatchScene ? obj : null);
        if (c0j66 != null) {
            c0j66.LJII(this.LLJIJIL);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0IuV] */
    public MultiTopLiveRandomMatchViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C481620Iue.LIZ);
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = C09IC.LIZIZ(c2252321DDqLIZ);
        MutableLiveData<List<RecommendedRoom>> mutableLiveData = new MutableLiveData<>();
        this.LLILLL = mutableLiveData;
        this.LLILZ = mutableLiveData;
        this.LLIZ = MultiTopLiveRoomMatchConfigSetting.getRoomMatchTimeoutDuration();
        this.LLIZLLLIL = MultiTopLiveRoomMatchConfigSetting.getFetchMatchRoomInterval();
        this.LLJI = new C09YA(this, AFwS193S0000000_7.get$arr$(129));
        this.LLJIJIL = new C0CW2<MultiTopLiveRoomMatchScene.DownLinkRoomMatchData>() { // from class: X.0IuV
            @Override // X.C0CW2
            public final void LJII(BaseDownlinkData baseDownlinkData, UplinkMessageResponse uplinkMessageResponse, AwS125S0110000_7 awS125S0110000_7) {
                MultiTopLiveRoomMatchScene.DownLinkRoomMatchData downLinkRoomMatchData = (MultiTopLiveRoomMatchScene.DownLinkRoomMatchData) baseDownlinkData;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleSignal roomMatchSuccess , message= ");
                sbLIZ.append(downLinkRoomMatchData);
                C20441214yg.LIZIZ("MultiTopLiveRandomMatchVM", C2188811AlT.LIZIZ(sbLIZ));
                MultiTopLiveRandomMatchViewModel multiTopLiveRandomMatchViewModel = this.LL;
                multiTopLiveRandomMatchViewModel.LLILZIL = true;
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(multiTopLiveRandomMatchViewModel), null, null, new C481520IuU(this.LL, downLinkRoomMatchData, null), 3);
            }
        };
    }

    public final void wQ2(RandomMatchGuestCancelReq randomMatchGuestCancelReq) {
        if (this.LLILZIL || this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelRandomMatch begin, param= ");
        sbLIZ.append(randomMatchGuestCancelReq);
        C20441214yg.LIZIZ("MultiTopLiveRandomMatchVM", C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C481510IuT(this, randomMatchGuestCancelReq, null), 3);
    }

    public final void xQ2(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release source:");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiTopLiveRandomMatchVM", C2188811AlT.LIZIZ(sbLIZ));
        yQ2();
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJ = null;
        this.LLILZIL = false;
    }

    public final void AQ2(long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startRandomMatch begin, moduleName= ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiTopLiveRandomMatchVM", C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C481500IuS(this, str, j, null), 3);
    }

    public final void zQ2(long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startGetRandomMatchStatePollingJob begin, moduleName= ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiTopLiveRandomMatchVM", C2188811AlT.LIZIZ(sbLIZ));
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C481490IuR(this, str, j, null), 3);
    }
}
