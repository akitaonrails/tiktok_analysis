package kotlin.jvm.internal;

import X.C013C;
import X.C05P0;
import X.C05P1;
import X.C09AY;
import X.C1389890mGx;
import X.C1576570r83;
import X.C20303114cP;
import X.C20506215Lw;
import X.C259800zU;
import X.C630930Oot;
import X.C631620Oq0;
import X.C631640Oq2;
import X.C631830OqL;
import X.C632090Oql;
import X.C632210Oqx;
import X.C737910Sx3;
import X.EnumC1563010qmB;
import X.EnumC631610Opz;
import X.InterfaceC2217461Bqa;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.assem.list.cell.compose.MusicCellCollectIconViewModelCompose;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS71S0500000_9 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS71S0500000_9 awS71S0500000_9) {
        int i;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C20303114cP.LIZ;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && !((Boolean) ((C05P1) awS71S0500000_9.l0).getValue()).booleanValue()) {
            i = 1;
        } else {
            i = 0;
        }
        if (i2 >= 26 && !(!((Boolean) ((C05P1) awS71S0500000_9.l1).getValue()).booleanValue())) {
            i++;
        }
        if (((Boolean) ((C05P1) awS71S0500000_9.l2).getValue()).booleanValue()) {
            i++;
        }
        if (((Boolean) ((C05P1) awS71S0500000_9.l3).getValue()).booleanValue()) {
            i++;
        }
        if (!(!((Boolean) ((C05P1) awS71S0500000_9.l4).getValue()).booleanValue())) {
            i++;
        }
        return Integer.valueOf(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[PHI: r1
      0x0065: PHI (r1v24 java.lang.String) = (r1v12 java.lang.String), (r1v25 java.lang.String) binds: [B:19:0x0063, B:17:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[PHI: r1
      0x007b: PHI (r1v22 java.lang.String) = (r1v14 java.lang.String), (r1v23 java.lang.String) binds: [B:26:0x0079, B:24:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[PHI: r1
      0x0081: PHI (r1v21 java.lang.String) = (r1v14 java.lang.String), (r1v22 java.lang.String) binds: [B:26:0x0079, B:28:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$1(kotlin.jvm.internal.AwS71S0500000_9 r9) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS71S0500000_9.invoke$1(kotlin.jvm.internal.AwS71S0500000_9):java.lang.Object");
    }

    public static final Object invoke$2(AwS71S0500000_9 awS71S0500000_9) {
        Runnable runnable;
        C013C c013c = (C013C) awS71S0500000_9.l0;
        if (!c013c.element) {
            c013c.element = true;
            Handler handler = (Handler) awS71S0500000_9.l1;
            T t = ((C259800zU) awS71S0500000_9.l2).element;
            if (t == 0) {
                runnable = null;
            } else {
                runnable = (Runnable) t;
            }
            handler.removeCallbacks(runnable);
            MusicShootAssem musicShootAssem = (MusicShootAssem) awS71S0500000_9.l3;
            if (musicShootAssem.LLILZ) {
                musicShootAssem.lp().setEnabled(true);
                ((Function0) awS71S0500000_9.l4).invoke();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS71S0500000_9 awS71S0500000_9) {
        boolean z;
        C632090Oql c632090Oql = (C632090Oql) ((C05P0) awS71S0500000_9.l0).getValue();
        int iIntValue = ((Number) ((C05P1) awS71S0500000_9.l1).getValue()).intValue();
        C631640Oq2 c631640Oq2 = (C631640Oq2) awS71S0500000_9.l2;
        Context context = (Context) awS71S0500000_9.l3;
        MusicPlayViewModel musicPlayViewModel = (MusicPlayViewModel) awS71S0500000_9.l4;
        if (C1576570r83.LIZ(c632090Oql.getMusicModel().getPinnedVideoStatus()) == EnumC1563010qmB.HAS_PINNED) {
            z = true;
        } else {
            z = false;
        }
        C632210Oqx.LIZ.getClass();
        User userLIZJ = C632210Oqx.LIZJ();
        if (userLIZJ != null && userLIZJ.isAccuratePrivateAccount()) {
            Activity activityLIZIZ = C737910Sx3.LIZIZ(context);
            if (activityLIZIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZIZ);
                c1389890mGx.LJIIIZ(2131834511);
                c1389890mGx.LJIIJJI();
            }
        } else {
            if (z) {
                musicPlayViewModel.xQ2(c632090Oql, iIntValue, true, null);
            } else {
                MusicModel musicModel = c632090Oql.getMusicModel();
                musicPlayViewModel.getClass();
                MusicPlayViewModel.wQ2(musicModel);
            }
            C631830OqL.LIZJ(c631640Oq2, c632090Oql, "plus");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS71S0500000_9 awS71S0500000_9) {
        boolean z;
        C632090Oql c632090Oql = (C632090Oql) ((C05P0) awS71S0500000_9.l0).getValue();
        int iIntValue = ((Number) ((C05P1) awS71S0500000_9.l1).getValue()).intValue();
        Context context = (Context) awS71S0500000_9.l2;
        MusicPlayViewModel musicPlayViewModel = (MusicPlayViewModel) awS71S0500000_9.l3;
        MusicCellCollectIconViewModelCompose musicCellCollectIconViewModelCompose = (MusicCellCollectIconViewModelCompose) awS71S0500000_9.l4;
        boolean z2 = true;
        if (!((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJIJJ(c632090Oql.getMusicModel(), context, true)) {
            z2 = false;
        } else {
            MusicModel musicModel = c632090Oql.getMusicModel();
            String previousPage = musicPlayViewModel.getPreviousPage();
            if (c632090Oql.getMusicItemModel().pinStatus == EnumC631610Opz.PINNED) {
                z = true;
            } else {
                z = false;
            }
            musicCellCollectIconViewModelCompose.getClass();
            musicCellCollectIconViewModelCompose.setState(new C631620Oq0(musicModel, musicCellCollectIconViewModelCompose, previousPage, iIntValue, z));
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS71S0500000_9(C013C c013c, BPEAHandler bPEAHandler, C259800zU c259800zU, MusicShootAssem musicShootAssem, C20506215Lw c20506215Lw, int i) {
        super(0);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = bPEAHandler;
        this.l2 = c259800zU;
        this.l3 = musicShootAssem;
        this.l4 = c20506215Lw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS71S0500000_9(C05P0 c05p0, C05P0 c05p02, C631640Oq2 c631640Oq2, Context context, MusicPlayViewModel musicPlayViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c05p0;
        this.l1 = c05p02;
        this.l2 = c631640Oq2;
        this.l3 = context;
        this.l4 = musicPlayViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS71S0500000_9(C05P0 c05p0, C05P0 c05p02, Context context, MusicPlayViewModel musicPlayViewModel, MusicCellCollectIconViewModelCompose musicCellCollectIconViewModelCompose, int i) {
        super(0);
        this.$t = i;
        this.l0 = c05p0;
        this.l1 = c05p02;
        this.l2 = context;
        this.l3 = musicPlayViewModel;
        this.l4 = musicCellCollectIconViewModelCompose;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS71S0500000_9(C05P1 c05p1, C05P1<Boolean> c05p12, C05P1<Boolean> c05p13, C05P1<Boolean> c05p14, C05P1<Boolean> c05p15, C05P1<Boolean> c05p16) {
        super(0);
        this.$t = c05p16;
        this.l0 = c05p1;
        this.l1 = c05p12;
        this.l2 = c05p13;
        this.l3 = c05p14;
        this.l4 = c05p15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS71S0500000_9(List list, List<? extends MusicOwnerInfo> list2, MusicOwnerInfo musicOwnerInfo, Music music, C630930Oot c630930Oot, FragmentManager fragmentManager) {
        super(0);
        this.$t = fragmentManager;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = musicOwnerInfo;
        this.l3 = music;
        this.l4 = c630930Oot;
    }
}
