package com.ss.android.ugc.aweme.toplive.cell;

import X.AbstractC482420Ivw;
import X.C03H8;
import X.C1308910kAL;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C1819620xS4;
import X.C21146717pB;
import X.C2188811AlT;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C436180H8m;
import X.C481820Iuy;
import X.C482300Ivk;
import X.C482390Ivt;
import X.C482620IwG;
import X.C497740JfY;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.ViewOnClickListenerC512201z6;
import Y.ACListenerS111S0200000_7;
import Y.ARunnableS76S0200000_7;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ab.ToplivePageLoadAdvanceSetting;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;
import webcast.api.feed.ToplivePageItem;

/* JADX INFO: loaded from: classes8.dex */
public final class HangoutSectionUserHostRoomCell extends ToplivePagePowerCell<C482390Ivt> implements C03H8 {
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxIconView LLILZ;
    public C1324720kZq LLILZIL;
    public C1324720kZq LLILZLL;

    public HangoutSectionUserHostRoomCell() {
        super(true);
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.toplive.cell.ToplivePagePowerCell
    public final void L5() {
        String str;
        String str2;
        ToplivePageItem toplivePageItem;
        C481820Iuy c481820Iuy = C481820Iuy.LIZ;
        C482300Ivk.LIZ.getClass();
        ToplivePageItem toplivePageItem2 = C482300Ivk.LIZJ;
        AbstractC482420Ivw abstractC482420Ivw = (AbstractC482420Ivw) getItem();
        ToplivePageItem toplivePageItem3 = abstractC482420Ivw != null ? abstractC482420Ivw.LL : null;
        AbstractC482420Ivw abstractC482420Ivw2 = (AbstractC482420Ivw) getItem();
        if (abstractC482420Ivw2 == null || (str = abstractC482420Ivw2.LLILLL) == null) {
            str = "";
        }
        AbstractC482420Ivw abstractC482420Ivw3 = (AbstractC482420Ivw) getItem();
        if (abstractC482420Ivw3 == null || (str2 = abstractC482420Ivw3.LLILLJJLI) == null) {
            str2 = "hangout";
        }
        c481820Iuy.getClass();
        C481820Iuy.LIZLLL(toplivePageItem2, toplivePageItem3, str, str2);
        AbstractC482420Ivw abstractC482420Ivw4 = (AbstractC482420Ivw) getItem();
        if (abstractC482420Ivw4 == null || (toplivePageItem = abstractC482420Ivw4.LL) == null) {
            return;
        }
        Room room = toplivePageItem.room;
        String str3 = toplivePageItem.enterMethod;
        AbstractC482420Ivw abstractC482420Ivw5 = (AbstractC482420Ivw) getItem();
        C481820Iuy.LJ(room, str3, abstractC482420Ivw5 != null ? abstractC482420Ivw5.LLILLL : null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        if (view != null) {
            this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.user_host_title);
            this.LLILLL = (TuxTextView) view.findViewById(R.id.user_host_sub_title);
            this.LLILZ = (TuxIconView) view.findViewById(R.id.user_host_info);
            this.LLILZIL = (C1324720kZq) view.findViewById(R.id.ldm);
            C1324720kZq c1324720kZq = (C1324720kZq) view.findViewById(R.id.ldu);
            this.LLILZLL = c1324720kZq;
            float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(10.5d));
            if (c1324720kZq != null) {
                if (C426750GoL.LIZLLL(c1324720kZq.getContext())) {
                    C786410Ut5.Jc(c1324720kZq, -fLIZIZ);
                } else {
                    C786410Ut5.Jc(c1324720kZq, fLIZIZ);
                }
            }
        }
    }

    public final void N5(C482390Ivt c482390Ivt) {
        String string;
        int iIntValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        ToplivePageItem toplivePageItem = c482390Ivt.LL;
        if (toplivePageItem != null) {
            string = Integer.valueOf(toplivePageItem.matchDegree).toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        sbLIZ.append('%');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String strLJIJJ = C497740JfY.LJIJJ(2131856821, strLIZIZ);
        int iLJJJ = a0.LJJJ(strLJIJJ, strLIZIZ, 0, false, 6);
        int length = -1;
        if (iLJJJ != -1) {
            length = iLJJJ + strLIZIZ.length();
        }
        SpannableString spannableString = new SpannableString(strLJIJJ);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.f3, this.itemView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), iLJJJ, length, 33);
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(spannableString);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (ToplivePageLoadAdvanceSetting.LIZ().enableLayoutPreload) {
            return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.dic, viewGroup, false);
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dic, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        UrlModel avatarThumb;
        List<String> urlList;
        User owner;
        ImageModel avatarThumb2;
        int color;
        C482390Ivt c482390Ivt = (C482390Ivt) interfaceC1891350zJl;
        super.onBindItemView(c482390Ivt, list);
        try {
            if (ToplivePageLoadAdvanceSetting.LIZ().enableLayoutOpt) {
                TuxTextView tuxTextView = this.LLILLJJLI;
                if (tuxTextView != null) {
                    HandlerHook.viewPost(tuxTextView, new ARunnableS76S0200000_7(this, c482390Ivt, 70));
                }
            } else {
                N5(c482390Ivt);
            }
            if (C482620IwG.LIZ(this.itemView.getContext())) {
                color = Color.parseColor(c482390Ivt.LL.darkBgColor);
            } else {
                color = Color.parseColor(c482390Ivt.LL.lightBgColor);
            }
            View view = this.itemView;
            if (view != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = Integer.valueOf(color);
                c384050F3z.LJIIIIZZ = Float.valueOf(C436180H8m.LIZ(16.0f, view.getContext()));
                c384050F3z.LJIIJJI = Float.valueOf(C436180H8m.LIZ(16.0f, view.getContext()));
                c384050F3z.LJIIJ = Float.valueOf(C436180H8m.LIZ(16.0f, view.getContext()));
                c384050F3z.LJIIIZ = Float.valueOf(C436180H8m.LIZ(16.0f, view.getContext()));
                view.setBackground(c384050F3z.LIZ(view.getContext()));
            }
            C1324720kZq c1324720kZq = this.LLILZIL;
            if (c1324720kZq != null) {
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                c384050F3z2.LIZ = Integer.valueOf(color);
                c1324720kZq.setBackground(c384050F3z2.LIZ(c1324720kZq.getContext()));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(C497740JfY.LJIJI(2131856819));
        }
        TuxIconView tuxIconView = this.LLILZ;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ViewOnClickListenerC512201z6(this, 57));
        }
        View view2 = this.itemView;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS111S0200000_7(c482390Ivt, this, 68), view2);
        }
        Room room = c482390Ivt.LL.room;
        if (room != null && (owner = room.getOwner()) != null && (avatarThumb2 = owner.getAvatarThumb()) != null) {
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(avatarThumb2);
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJJI(this.LLILZIL);
        }
        AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
        if (accountUserServiceLJIIJ != null && (avatarThumb = accountUserServiceLJIIJ.getCurUser().getAvatarThumb()) != null && (urlList = avatarThumb.getUrlList()) != null) {
            C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(urlList);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            c1324610kZfLIZJ.LJI = iLIZIZ;
            c1324610kZfLIZJ.LJII = iLIZIZ2;
            c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLIZJ.LJJI(this.LLILZLL);
        }
    }
}
