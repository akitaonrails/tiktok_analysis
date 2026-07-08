package detailpage.ui;

import X.C019F;
import X.C0QSJ;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1618140sD6;
import X.C1637806bA;
import X.C1856290yPD;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C461720I8s;
import X.C673150Qan;
import X.C687700QyG;
import X.C723830SaL;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C737910Sx3;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC1618150sD7;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC687730QyJ;
import X.InterfaceC712990Rxx;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.assem.common.AppBarOffsetListenerAbility;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.fragment.ChatDetailPageScope;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel;
import com.zhiliaoapp.musically.R;
import detailpage.ui.DetailMediaGridSharedCollectionsPageCellAssem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class DetailMediaGridSharedCollectionsPageCellAssem extends ReusedUISlotAssem<DetailMediaGridSharedCollectionsPageCellAssem> implements InterfaceC712990Rxx<C1856290yPD>, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public Integer LLJLIL;
    public final C1618140sD6 LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DetailMediaGridSharedCollectionsPageCellAssem.class, "mediaGridVM", "getMediaGridVM()Lcom/ss/android/ugc/aweme/im/sdk/chatdetail/redesign/detailpage/viewmodel/MediaGridViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0sD6] */
    public DetailMediaGridSharedCollectionsPageCellAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MediaGridViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1629), null, AFwS264S0000000_24.get$arr$(550));
        this.LLJLILLLLZIIL = new InterfaceC1618150sD7() { // from class: X.0sD6
            @Override // X.InterfaceC1618160sD8
            public final void LIZ(int i) {
                DetailMediaGridSharedCollectionsPageCellAssem detailMediaGridSharedCollectionsPageCellAssem = this.LIZ;
                View view = detailMediaGridSharedCollectionsPageCellAssem.LLJL;
                if (view != null) {
                    if (detailMediaGridSharedCollectionsPageCellAssem.LLJLIL == null) {
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        detailMediaGridSharedCollectionsPageCellAssem.LLJLIL = Integer.valueOf(iArr[1] - i);
                    }
                    Integer num = detailMediaGridSharedCollectionsPageCellAssem.LLJLIL;
                    if (num != null) {
                        if (num.intValue() + i + ((int) (60 * view.getResources().getDisplayMetrics().density)) + ((int) (((double) view.getHeight()) * 0.15d)) < view.getResources().getDisplayMetrics().heightPixels / 2) {
                            C786410Ut5.ed(view, r0 - r5);
                        } else {
                            C786410Ut5.ed(view, 0.0f);
                        }
                    }
                }
            }
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.co2;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatDetailPageScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatDetailPageScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatDetailPageScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final MediaGridViewModel op() {
        return (MediaGridViewModel) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJLL[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        AppBarOffsetListenerAbility appBarOffsetListenerAbility;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (appBarOffsetListenerAbility = (AppBarOffsetListenerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), AppBarOffsetListenerAbility.class, null)) != null) {
            appBarOffsetListenerAbility.SA0(this.LLJLILLLLZIIL);
        }
        this.LLJL = null;
        this.LLJLIL = null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        AppBarOffsetListenerAbility appBarOffsetListenerAbility;
        C723830SaL.LIZ(this, null, new AwS390S0200000_24(C461720I8s.LIZLLL(), this, 60));
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (appBarOffsetListenerAbility = (AppBarOffsetListenerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), AppBarOffsetListenerAbility.class, null)) != null) {
            appBarOffsetListenerAbility.Ik1(this.LLJLILLLLZIIL);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1856290yPD c1856290yPD) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void rr(C1856290yPD c1856290yPD) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1856290yPD c1856290yPD) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
