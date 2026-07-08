package com.ss.android.ugc.aweme.im.messagelist;

import X.C019F;
import X.C01GW;
import X.C069P;
import X.C0I0B;
import X.C0I3J;
import X.C0I73;
import X.C0PEM;
import X.C0Z4K;
import X.C0Z4L;
import X.C127G;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1331920klS;
import X.C1332130kln;
import X.C13LE;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1649006cy;
import X.C1722406oo;
import X.C1954807lC;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C327350CsP;
import X.C418440Gaw;
import X.C438710HIf;
import X.C452501pT;
import X.C457780HxI;
import X.C723590SZx;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C892480Yzm;
import X.C892490Yzn;
import X.C893370Z2x;
import X.C898250ZLr;
import X.InterfaceC1647906cn;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS117S0200000_14;
import Y.ACListenerS50S0400000_14;
import Y.AObjectS67S0000000_14;
import Y.AObserverS178S0200000_14;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.im.chatroom.api.IMRecentActivityService;
import com.ss.android.ugc.aweme.im.common.experiment.RecentActivitySticker;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.api.IAwemeStatusViewModel;
import com.ss.android.ugc.aweme.im.saas.host.api.awemeservice.IMAwemeService;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMHostApiRelationService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes15.dex */
public final class RecentActivityCardUISlot extends ReusedUISlotAssem<RecentActivityCardUISlot> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 512));
    public final C01GW LLJLIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 514));
    public final C01GW LLJLILLLLZIIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 511));
    public final C01GW LLJLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 516));
    public final C01GW LLJLLIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 513));
    public final C01GW LLJLLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 510));
    public final AssemVMLazy LLJZ;
    public Aweme LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public SetSticker LLLFFI;
    public C127G LLLFZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RecentActivityCardUISlot.class, "availabilityViewModel", "getAvailabilityViewModel()Lcom/ss/android/ugc/aweme/im/messagelist/api/IAwemeStatusViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RecentActivityCardUISlot() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IAwemeStatusViewModel.class);
        this.LLJZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 497), AFwS248S0000000_14.get$arr$(133), null, true);
        this.LLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(135));
        this.LLLF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 515));
        this.LLLFF = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(134));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cgp;
    }

    public final void dismiss() {
        IMRecentActivityService.LIZ.getClass();
        C1649006cy.LIZ().LIZIZ().LIZLLL(sp().LL);
    }

    public final void op() {
        Video video;
        UrlModel cover;
        List<String> urlList;
        Integer numLIZJ;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        Paint paint = shapeDrawable.getPaint();
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.c7, LJJIJL().getContext());
        paint.setColor(numLIZJ2 != null ? numLIZJ2.intValue() : -16776961);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJI = new C1331920klS(C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8), C418440Gaw.LIZIZ(8));
        c1331750klB.LIZIZ = C418440Gaw.LIZIZ(Double.valueOf(0.5d));
        Context context = getContext();
        c1331750klB.LIZJ = (context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.a02, context)) == null) ? 0 : numLIZJ.intValue();
        C1331730kl9 c1331730kl9 = new C1331730kl9(c1331750klB);
        Aweme aweme = this.LLJZIJLIL;
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ((aweme == null || (video = aweme.getVideo()) == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null) ? null : C0I3J.LIZ(urlList)));
        c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LLJLIL.getValue());
        c1331670kl3LJIIIIZZ.LJJIIZI(shapeDrawable);
        c1331670kl3LJIIIIZZ.LJIL(shapeDrawable);
        c1331670kl3LJIIIIZZ.LJJI = c1331730kl9;
        C1332130kln.LJFF(c1331670kl3LJIIIIZZ, "recent_activity_cover", null, false, null, null, null, 62);
    }

    public final C457780HxI sp() {
        return (C457780HxI) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final InterfaceC1647906cn tp() {
        return (InterfaceC1647906cn) this.LLL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        tp().LIZ().LIZIZ();
        tp().dismiss();
        C1722406oo c1722406oo = (C1722406oo) this.LLLF.getValue();
        if (c1722406oo == null) {
            return;
        }
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJ = C069P.LIZ().LJ().LJ(String.valueOf(c1722406oo.creatorUserId), "");
        if (iMUserLJ == null || iMUserLJ.getFollowStatus() != 2) {
            dismiss();
        }
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLFZ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLFZ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IAwemeStatusViewModel.class, new AObjectS67S0000000_14(this, 19)}, defaultViewModelProviderFactory);
                    this.LLLFZ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Aweme awemeLLILZ;
        int iIntValue;
        int i;
        String nickName;
        String str;
        EventLiveData<FollowStatus> relationObservable;
        Integer numLIZJ;
        C1722406oo c1722406oo = (C1722406oo) this.LLLF.getValue();
        if (c1722406oo == null) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
            dismiss();
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C0Z4K(c1722406oo, this, null), 2);
        IMRecentActivityService.LIZ.getClass();
        C1649006cy.LIZ().LIZJ().LIZIZ(c1722406oo.activityType, C0I0B.LJFF.LIZIZ());
        IMAwemeService.LIZ.getClass();
        IMAwemeService iMAwemeServiceLIZ = C327350CsP.LIZ();
        if (iMAwemeServiceLIZ != null) {
            awemeLLILZ = iMAwemeServiceLIZ.LLILZ(String.valueOf(c1722406oo.awemeId));
        } else {
            awemeLLILZ = null;
        }
        this.LLJZIJLIL = awemeLLILZ;
        op();
        float f = C0I73.LIZ;
        View view2 = (View) this.LLJLLL.getValue();
        float[] fArr = new float[8];
        int i2 = 0;
        do {
            fArr[i2] = f;
            i2++;
        } while (i2 < 8);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        Paint paint = shapeDrawable.getPaint();
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        paint.setColor(iIntValue);
        view2.setBackground(shapeDrawable);
        int i3 = C892480Yzm.LIZ[c1722406oo.activityType.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                i = 2131831919;
            } else {
                throw new C1954807lC();
            }
        } else {
            i = 2131831918;
        }
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJ = C069P.LIZ().LJ().LJ(String.valueOf(c1722406oo.creatorUserId), "");
        TextView textView = (TextView) this.LLJLL.getValue();
        Context context2 = ((View) this.LLJLL.getValue()).getContext();
        Object[] objArr = new Object[1];
        if (iMUserLJ != null) {
            nickName = iMUserLJ.getNickName();
        } else {
            nickName = null;
        }
        objArr[0] = nickName;
        textView.setText(context2.getString(i, objArr));
        C786410Ut5.Q8((SmartImageView) this.LLJLIL.getValue(), new ACListenerS50S0400000_14(c1722406oo, this, view, iMUserLJ, 2));
        C786410Ut5.I7(new ACListenerS117S0200000_14(c1722406oo, this, 7), (View) this.LLJLILLLLZIIL.getValue());
        TextView textView2 = (TextView) this.LLJLLIL.getValue();
        Context context3 = ((View) this.LLJLLIL.getValue()).getContext();
        Object[] objArr2 = new Object[1];
        int i4 = C892490Yzn.LIZ[c1722406oo.activityType.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                RecentActivitySticker recentActivitySticker = C0Z4L.LIZ().repost;
                if (recentActivitySticker == null || (str = recentActivitySticker.emoji) == null) {
                    str = new RecentActivitySticker("❤️", 44538807299L, 44142529795L, 2, "", 7176841825176847366L).emoji;
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            RecentActivitySticker recentActivitySticker2 = C0Z4L.LIZ().post;
            if (recentActivitySticker2 == null || (str = recentActivitySticker2.emoji) == null) {
                str = new RecentActivitySticker("❤️", 44538807299L, 44142529795L, 2, "", 7176841825176847366L).emoji;
            }
        }
        objArr2[0] = str;
        textView2.setText(context3.getString(2131831922, objArr2));
        C786410Ut5.U8((C197039127h) this.LLJLLIL.getValue(), new ACListenerS117S0200000_14(c1722406oo, this, 8));
        ((C197039127h) this.LLJLLIL.getValue()).LJJJJL(new AwS591S0100000_12(this, 611));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C893370Z2x(c1722406oo, this, null), 3);
        IMHostApiRelationService.LIZ.getClass();
        IMHostApiRelationService iMHostApiRelationServiceLIZ = C898250ZLr.LIZ();
        if (iMHostApiRelationServiceLIZ != null && (relationObservable = iMHostApiRelationServiceLIZ.getRelationObservable()) != null) {
            relationObservable.subscribe(this, new AObserverS178S0200000_14(c1722406oo, this, 0));
        }
    }
}
