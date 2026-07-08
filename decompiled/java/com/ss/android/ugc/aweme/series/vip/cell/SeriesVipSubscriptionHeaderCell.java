package com.ss.android.ugc.aweme.series.vip.cell;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1324840ka2;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C427010Gol;
import X.C427660Gpo;
import X.C431520Gw2;
import X.C438710HIf;
import X.C786410Ut5;
import X.InterfaceC1334290kpH;
import X.InterfaceC1891350zJl;
import X.InterfaceC447230HgH;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.series.vip.cell.SeriesVipSubscriptionHeaderCell;
import com.zhiliaoapp.musically.R;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class SeriesVipSubscriptionHeaderCell extends PowerCell<C427010Gol> {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public C427660Gpo LLILZ;
    public TuxTextView LLILZIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (TuxTextView) this.itemView.findViewById(R.id.vip_sub_status_title);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.vip_sub_status_badge);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.vip_sub_status_status);
        this.LLILZ = (C427660Gpo) this.itemView.findViewById(R.id.lzi);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.vip_sub_status_username);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        UrlModel avatarThumb;
        User curUser;
        User curUser2;
        String nickname;
        String string;
        Resources resources;
        Resources resources2;
        int i;
        String string2;
        Resources resources3;
        C427010Gol c427010Gol = (C427010Gol) interfaceC1891350zJl;
        C431520Gw2 c431520Gw2 = c427010Gol.LL;
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            Context context = getContext();
            if (context != null && (resources3 = context.getResources()) != null) {
                string2 = resources3.getString(c431520Gw2.LIZ);
            } else {
                string2 = null;
            }
            tuxTextView.setText(string2);
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(c431520Gw2.LIZIZ);
        }
        TuxTextView tuxTextView3 = this.LLILLJJLI;
        int i2 = 8;
        if (tuxTextView3 != null) {
            String str = c431520Gw2.LIZIZ;
            if (str != null && str.length() != 0) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, tuxTextView3);
        }
        TuxTextView tuxTextView4 = this.LLILLL;
        String str2 = "";
        if (tuxTextView4 != null) {
            Integer num = c431520Gw2.LIZLLL;
            if (num == null) {
                string = "";
                tuxTextView4.setText(string);
            } else {
                int iIntValue = num.intValue();
                Long l = c431520Gw2.LJ;
                if (l == null) {
                    Context context2 = getContext();
                    if (context2 != null && (resources2 = context2.getResources()) != null) {
                        string = resources2.getString(iIntValue);
                        if (string == null) {
                        }
                        tuxTextView4.setText(string);
                    }
                    string = "";
                    tuxTextView4.setText(string);
                } else {
                    String str3 = DateFormat.getDateInstance(2, Locale.getDefault()).format(new Date(l.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                    Context context3 = getContext();
                    if (context3 != null && (resources = context3.getResources()) != null) {
                        string = resources.getString(iIntValue, str3);
                        if (string == null) {
                        }
                        tuxTextView4.setText(string);
                    }
                    string = "";
                    tuxTextView4.setText(string);
                }
            }
        }
        TuxTextView tuxTextView5 = this.LLILLL;
        if (tuxTextView5 != null) {
            if (c431520Gw2.LIZLLL != null) {
                i2 = 0;
            }
            C786410Ut5.LJLLLLLL(i2, tuxTextView5);
        }
        TuxTextView tuxTextView6 = this.LLILZIL;
        if (tuxTextView6 != null) {
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            if (iAccountUserServiceLJFF != null && (curUser2 = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null && (nickname = curUser2.getNickname()) != null) {
                str2 = nickname;
            }
            tuxTextView6.setText(str2);
        }
        C427660Gpo c427660Gpo = this.LLILZ;
        if ((c427660Gpo instanceof InterfaceC1334290kpH) && c427660Gpo != null) {
            IAccountUserService iAccountUserServiceLJFF2 = C0XQ7.LJFF();
            if (iAccountUserServiceLJFF2 != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF2).getCurUser()) != null) {
                avatarThumb = curUser.getAvatarThumb();
            } else {
                avatarThumb = null;
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
            c1331670kl3LJIIIIZZ.LJJ(c427660Gpo);
            c1331670kl3LJIIIIZZ.LIZLLL("SERIES_SUBSCRIPTION_HEADER_CARD");
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
        UrlModel urlModel = c427010Gol.LL.LIZJ;
        if (urlModel == null) {
            this.itemView.setBackground(null);
        } else {
            C1324840ka2.LJIJ(urlModel, 0, 0, new InterfaceC447230HgH() { // from class: X.01pU
                @Override // X.InterfaceC447230HgH
                public final void accept(Object obj) {
                    SeriesVipSubscriptionHeaderCell seriesVipSubscriptionHeaderCell = this.LIZ;
                    HandlerHook.viewPost(seriesVipSubscriptionHeaderCell.itemView, new RunnableC514501zT(seriesVipSubscriptionHeaderCell, (Bitmap) obj, 48));
                }
            });
        }
        C786410Ut5.LJLLLLLL(0, this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bie, viewGroup, false);
    }
}
