package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C00GU;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0QSJ;
import X.C127G;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C438710HIf;
import X.C452080Ho6;
import X.C452501pT;
import X.C687700QyG;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1334290kpH;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import Y.ACListenerS144S0100000_9;
import Y.AObjectS384S0100000_9;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollVoteDetailListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class BulletinPollVoteDetailContentCell extends PowerCell<C00GU> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final AssemVMLazy LL;
    public C127G LLILLJJLI;
    public InterfaceC665370Q7z LLILLL;
    public C0QSJ LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinPollVoteDetailContentCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinPollVoteDetailListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class});
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a7t;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    public BulletinPollVoteDetailContentCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinPollVoteDetailListViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2560);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(191);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2571), awS577S0100000_33, AFwS224S0000000_33.get$arr$(358), new AwS577S0100000_33((C03K6) this, 2546), new AwS577S0100000_33((C03K6) this, 2548), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2550), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2552), null, new AwS577S0100000_33((C03K6) this, 2553));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 2547);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2549);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 2551);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 98));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 2554);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 2555);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 2556);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 2557);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 2558);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2559), awS577S0100000_33, AFwS224S0000000_33.get$arr$(359), new AwS577S0100000_33((C03K6) this, 2561), new AwS577S0100000_33((C03K6) this, 2562), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 2563), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 2564), null, new AwS577S0100000_33((C03K6) this, 2565));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 2566), awS577S0100000_33, AFwS224S0000000_33.get$arr$(360), new AwS577S0100000_33((C03K6) this, 2567), new AwS577S0100000_33((C03K6) this, 2568), new AwS577S0100000_33((C03K6) this, 2569), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 2570));
        }
        this.LL = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLILLJJLI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLILLJJLI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{BulletinPollVoteDetailListViewModel.class, new AObjectS384S0100000_9(this, 3)}, defaultViewModelProviderFactory);
                    this.LLILLJJLI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) this.itemView.findViewById(R.id.d35);
        if (smartAvatarImageView != null) {
            C786410Ut5.G9(smartAvatarImageView, new ACListenerS144S0100000_9(this, 55));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C00GU c00gu = (C00GU) interfaceC1891350zJl;
        super.onBindItemView(c00gu);
        UrlModel avatarThumb = c00gu.LL.getAvatarThumb();
        if (avatarThumb != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
            c1331670kl3LJIIIIZZ.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.d35));
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            TextView textView = (TextView) this.itemView.findViewById(R.id.d36);
            String nickname = c00gu.LL.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            textView.setText(nickname);
        }
    }
}
