package com.ss.android.ugc.aweme.donation.detail;

import X.AbstractC683590Qrd;
import X.C01GW;
import X.C098200Yq;
import X.C0P6P;
import X.C0W04;
import X.C0W58;
import X.C118300cf;
import X.C1255920ims;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C1910630zor;
import X.C1910680zow;
import X.C1910700zoy;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C259800zU;
import X.C418710GbN;
import X.C427870Gq9;
import X.C444890HcV;
import X.C446980Hfs;
import X.C452501pT;
import X.C703302op;
import X.C786410Ut5;
import X.C817470W4z;
import X.C828330WeV;
import X.InterfaceC1212360hec;
import X.InterfaceC828360WeY;
import Y.ACListenerS130S0200000_28;
import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.donation.BannerStruct;
import com.ss.android.ugc.aweme.donation.DonateResponse;
import com.ss.android.ugc.aweme.donation.DonorStruct;
import com.ss.android.ugc.aweme.donation.NgoStruct;
import com.ss.android.ugc.aweme.donation.detail.DonationFragment;
import com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class DonationFragment extends Fragment implements InterfaceC1212360hec<DonorStruct>, C0P6P {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiEjJyHELIOS4nISoiZys2PCQlJWEXJystPSY8JgM+KCg+LSs4";
    public RecyclerView LL;
    public C197039127h LLILLJJLI;
    public TuxIconView LLILLL;
    public C1749280vcc LLILZ;
    public ConstraintLayout LLILZIL;
    public C418710GbN LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public ConstraintLayout LLJ;
    public SmartImageView LLJI;
    public C427870Gq9 LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public TuxTextView LLJJI;
    public final C1910680zow LLJJIII = new C1255920ims<C1910630zor>() { // from class: X.0zow
    };
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 188));
    public String LLJJIJIIJIL = "";
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 190));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 196));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 184));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 186));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 191));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 193));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 194));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 195));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 187));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 189));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 192));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 185));
    public C1910700zoy LLJLLIL;
    public boolean LLJLLL;

    @Override // X.InterfaceC1212360hec
    public final void Jm() {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void SY() {
    }

    @Override // X.InterfaceC1212360hec
    public final void bD1(Exception exc) {
    }

    @Override // X.InterfaceC1212360hec
    public final void mE(List<DonorStruct> list, boolean z) {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void zK() {
        throw null;
    }

    @Override // X.C0P6P
    public final void LJJIFFI() {
        LIZJ(4);
    }

    public final ConstraintLayout MR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.br5) : null;
            this.LLJ = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final RecyclerView NR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.g35) : null;
            this.LL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final String OR() {
        return (String) this.LLJL.getValue();
    }

    public final TuxTextView PR() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.jom) : null;
            this.LLJJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final C1910700zoy RR() {
        C1910700zoy c1910700zoy = this.LLJLLIL;
        if (c1910700zoy != null) {
            return c1910700zoy;
        }
        return null;
    }

    public final TuxTextView SR() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.p91) : null;
            this.LLJJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final ConstraintLayout UR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.q2r) : null;
            this.LLILZIL = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final TuxTextView VR() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rna) : null;
            this.LLJILJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final String WR() {
        return (String) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C1749280vcc ZR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w28) : null;
            this.LLILZ = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final void aS() {
        String strWR;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String aid = getAid();
        if (aid == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        Aweme aweme = (Aweme) this.LLJJJJ.getValue();
        if ((aweme == null || (strWR = AwemeExtKt.getAuthorUid(aweme)) == null) && (strWR = WR()) == null) {
            strWR = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", strWR);
        Object value = this.LLJJJJJIL.getValue();
        if (value == null) {
            value = "";
        }
        c2344009Gk.LJ(value, "ngo_id");
        String str = (String) this.LLJJJJLIIL.getValue();
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("organization_id", str);
        String str2 = (String) this.LLJJL.getValue();
        c2344009Gk.LJIIIIZZ("organization_type", str2 != null ? str2 : "");
        c2344009Gk.LJIIIIZZ("enter_from", getEnterFrom());
        c2344009Gk.LJIIIIZZ("enter_method", this.LLJJIJIIJIL);
        c2344009Gk.LJIIIIZZ("log_pb", (String) this.LLJJIJIL.getValue());
        c2344009Gk.LJIIIIZZ("ngo_name", (String) this.LLJLILLLLZIIL.getValue());
        c2344009Gk.LJIIIIZZ("anchor_type", (String) this.LLJLL.getValue());
        c2344009Gk.LJIIIIZZ("powered_by", (String) this.LLJJL.getValue());
        c2344009Gk.LJIIIIZZ("page_type", "native");
        C20684815ws.LJIILLIIL("donation_panel_show", c2344009Gk.LIZ);
    }

    public final String getAid() {
        return (String) this.LLJJJIL.getValue();
    }

    public final String getEnterFrom() {
        return (String) this.LLJJIJI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        LJIILJJIL();
        LIZ();
        super.onDestroyView();
        new C828330WeV(new ThirdPartyBizCert(402677760)).LIZJ();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
    }

    @Override // X.InterfaceC1212360hec
    public final void LJ() {
        ZR().LJ();
        C786410Ut5.l9(ZR(), null);
        C786410Ut5.LLLZLZ(ZR(), 0);
        C786410Ut5.LL(8, UR());
    }

    @Override // X.InterfaceC1212360hec
    public final void Ng1() {
        if (RR().mShowFooter) {
            RR().setShowFooter(false);
            RR().notifyDataSetChanged();
            RR().showLoadMoreEmpty();
            RR().setShowFooter(false);
        }
        bS(true);
    }

    @Override // X.InterfaceC1212360hec
    public final void showLoadMoreLoading() {
        RR().showLoadMoreLoading();
    }

    @Override // X.InterfaceC1212360hec
    public final void Uq2(Exception exc) {
        if (RR().mShowFooter) {
            RR().setShowFooter(false);
            RR().notifyDataSetChanged();
        }
        C1749280vcc c1749280vccZR = ZR();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJIIIIZZ = getString(2131836754);
        c1749280vccZR.setStatus(c1722300uv6);
        C786410Ut5.LLLZLZ(ZR(), 0);
        C786410Ut5.l9(ZR(), new ACListenerS162S0100000_28(this, 51));
        C786410Ut5.LL(8, UR());
    }

    @Override // X.InterfaceC1212360hec
    public final void Wi(Exception exc) {
        RR().showPullUpLoadMore(NR(), false);
    }

    public final void bS(boolean z) {
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        String str4;
        String authorUid;
        if (ZR().getVisibility() == 0) {
            C786410Ut5.LLLZLZ(ZR(), 8);
            C786410Ut5.LL(0, UR());
        }
        DonateResponse donateResponse = (DonateResponse) this.LLJJIII.LL.getData();
        BannerStruct bannerStruct = donateResponse.banner;
        View viewFindViewById = null;
        if (bannerStruct != null) {
            str = bannerStruct.bannerImageUrl;
            str2 = bannerStruct.bannerSiteUrl;
        } else {
            str = null;
            str2 = null;
        }
        if (str2 != null && bannerStruct.bannerSiteUrl.length() > 0) {
            View viewFindViewById2 = this.LLILZLL;
            if (viewFindViewById2 == null) {
                View view = getView();
                if (view != null) {
                    viewFindViewById2 = view.findViewById(R.id.k0e);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILZLL = (C418710GbN) viewFindViewById2;
            }
            ImageView imageView = (ImageView) viewFindViewById2;
            int visibility = imageView.getVisibility();
            imageView.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, imageView);
        } else {
            View viewFindViewById3 = this.LLILZLL;
            if (viewFindViewById3 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById3 = view2.findViewById(R.id.k0e);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILZLL = (C418710GbN) viewFindViewById3;
            }
            ImageView imageView2 = (ImageView) viewFindViewById3;
            int visibility2 = imageView2.getVisibility();
            imageView2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, imageView2);
        }
        View viewFindViewById4 = this.LLIZ;
        if (viewFindViewById4 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById4 = view3.findViewById(R.id.g2p);
            } else {
                viewFindViewById4 = null;
            }
            this.LLIZ = (TuxTextView) viewFindViewById4;
        }
        TextView textView = (TextView) viewFindViewById4;
        String str5 = donateResponse.donationSummary;
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        textView.setText(str5);
        View viewFindViewById5 = this.LLIZLLLIL;
        if (viewFindViewById5 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById5 = view4.findViewById(R.id.p92);
            } else {
                viewFindViewById5 = null;
            }
            this.LLIZLLLIL = (TuxTextView) viewFindViewById5;
        }
        TextView textView2 = (TextView) viewFindViewById5;
        NgoStruct ngoStruct = donateResponse.ngo;
        if (ngoStruct != null) {
            str3 = ngoStruct.ngoName;
        } else {
            str3 = null;
        }
        textView2.setText(str3);
        C786410Ut5.Y7(MR(), new ACListenerS130S0200000_28(this, bannerStruct, 21));
        if (!TextUtils.isEmpty(str)) {
            C786410Ut5.LL(0, MR());
            if (str == null) {
                str = "";
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            View viewFindViewById6 = this.LLJI;
            if (viewFindViewById6 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById6 = view5.findViewById(R.id.brq);
                } else {
                    viewFindViewById6 = null;
                }
                this.LLJI = (SmartImageView) viewFindViewById6;
            }
            c1331670kl3LJIIIZ.LJJ((SmartImageView) viewFindViewById6);
            c1331670kl3LJIIIZ.LJIJJLI(R.drawable.cco);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("group_id", getAid());
            Aweme aweme = (Aweme) this.LLJJJJ.getValue();
            if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
                authorUid = "";
            }
            c2344009Gk.LJIIIIZZ("author_id", authorUid);
            c2344009Gk.LJIIIIZZ("enter_from", getEnterFrom());
            c2344009Gk.LJIIIIZZ("ngo_name", (String) this.LLJLILLLLZIIL.getValue());
            c2344009Gk.LJIIIIZZ("log_pb", (String) this.LLJJIJIL.getValue());
            C20684815ws.LJIILLIIL("donation_h5_entrance_show", c2344009Gk.LIZ);
        } else {
            C786410Ut5.LL(8, MR());
        }
        NgoStruct ngoStruct2 = donateResponse.ngo;
        if (ngoStruct2 == null || (TextUtils.isEmpty(ngoStruct2.description) && TextUtils.isEmpty(ngoStruct2.aboutPage))) {
            C786410Ut5.LLLLZLL(SR(), 8);
        } else {
            C786410Ut5.LLLLZLL(SR(), 0);
            String str7 = ngoStruct2.description;
            if (str7 == null) {
                str7 = "";
            }
            if (!TextUtils.isEmpty(ngoStruct2.aboutPage)) {
                final String str8 = ngoStruct2.aboutPage;
                String string = getString(2131836451);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str7);
                sbLIZ.append(' ');
                sbLIZ.append(string);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
                final int iLIZ = C446980Hfs.LIZ(getContext(), R.color.ct);
                C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0zou
                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view6) {
                        DonationFragment donationFragment = this.LL;
                        donationFragment.cS(str8, donationFragment.getEnterFrom());
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setColor(iLIZ);
                    }
                }, str7.length() + 1, spannableStringBuilder.length(), 33);
                SR().setText(spannableStringBuilder);
                SR().setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                SR().setText(str7);
            }
        }
        NgoStruct ngoStruct3 = donateResponse.ngo;
        if (ngoStruct3 != null && (str4 = ngoStruct3.url) != null) {
            str6 = str4;
        }
        C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(str6);
        View viewFindViewById7 = this.LLJIJIL;
        if (viewFindViewById7 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById7 = view6.findViewById(R.id.p90);
            } else {
                viewFindViewById7 = null;
            }
            this.LLJIJIL = (C427870Gq9) viewFindViewById7;
        }
        c1331670kl3LJIIIZ2.LJJ((SmartImageView) viewFindViewById7);
        c1331670kl3LJIIIZ2.LJJIIZ(R.color.aj);
        C786410Ut5.h3(c1331670kl3LJIIIZ2);
        VR().setText(getString(2131832360));
        VR().setTextColorRes(R.attr.a1j);
        C786410Ut5.LLLLZLL(VR(), 0);
        VR().setMovementMethod(LinkMovementMethod.getInstance());
        if (z) {
            C786410Ut5.LLIZLLLIL(NR(), 8);
            View viewFindViewById8 = this.LLJILJILJ;
            if (viewFindViewById8 == null) {
                View view7 = getView();
                if (view7 != null) {
                    viewFindViewById8 = view7.findViewById(R.id.hc1);
                } else {
                    viewFindViewById8 = null;
                }
                this.LLJILJILJ = (TuxTextView) viewFindViewById8;
            }
            C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById8, 0);
            View view8 = this.LLJILLL;
            if (view8 == null) {
                View view9 = getView();
                if (view9 != null) {
                    viewFindViewById = view9.findViewById(R.id.jok);
                }
                this.LLJILLL = (TuxTextView) viewFindViewById;
                view8 = viewFindViewById;
            }
            C786410Ut5.LLLLZLL((TuxTextView) view8, 8);
            C786410Ut5.LLLLZLL(PR(), 8);
            return;
        }
        C786410Ut5.LLLLZLL(PR(), 8);
        AbstractC683590Qrd abstractC683590Qrd = (AbstractC683590Qrd) NR().getAdapter();
        List<DonorStruct> list = donateResponse.donorList;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
        }
        abstractC683590Qrd.setData(arrayList);
        List<DonorStruct> list2 = donateResponse.donorList;
        if (list2 == null) {
            return;
        }
        Iterator<DonorStruct> it2 = list2.iterator();
        while (it2.hasNext()) {
            String str9 = it2.next().tiktokAmount;
            if (str9 != null && str9.length() > 0) {
                C786410Ut5.LLLLZLL(PR(), 0);
                return;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("enter_method", "")) != null) {
            str = string;
        }
        this.LLJJIJIIJIL = str;
        aS();
    }

    @Override // X.InterfaceC1212360hec
    public final void LLJJJIL(List<DonorStruct> list, boolean z) {
        RR().setShowFooter(true);
        if (!z) {
            RR().showLoadMoreEmpty();
            RR().setShowFooter(false);
        } else {
            RR().resetLoadMoreState();
        }
        bS(false);
    }

    @Override // X.InterfaceC1212360hec
    public final void Pj(List<DonorStruct> list, boolean z) {
        if (list != null && !list.isEmpty() && z) {
            RR().resetLoadMoreState();
        } else {
            RR().setShowFooter(false);
        }
        RR().setDataAfterLoadMore(list);
    }

    public final void cS(String str, String str2) {
        String string;
        if (getActivity() == null && getContext() == null) {
            return;
        }
        final Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("url", str, bundle);
        Context context = getContext();
        if (context == null || (string = context.getString(2131832346)) == null) {
            string = "";
        }
        C786410Ut5.LJJJI("title", string, bundle);
        C786410Ut5.LJJJI("enter_from", str2, bundle);
        C786410Ut5.LJJJI("hide_more", "false", bundle);
        Context context2 = getContext();
        if (context2 != null && C703302op.LIZ(str)) {
            C828330WeV c828330WeV = new C828330WeV(new ThirdPartyBizCert(402677760));
            c828330WeV.LIZ(context2, str);
            C0W58 c0w58 = new C0W58() { // from class: X.0zov
                @Override // X.C0W58
                public final void LIZLLL(int i, Bundle bundle2) {
                    if (6 == i) {
                        DonationFragment donationFragment = this.LIZ;
                        donationFragment.LLJJIJIIJIL = "tiltify";
                        donationFragment.aS();
                    }
                }
            };
            C0W04 c0w04 = c828330WeV.LIZIZ;
            if (c0w04 != null) {
                C817470W4z c817470W4z = c0w04.LLILLJJLI;
                if (c817470W4z == null) {
                    c0w04.LL = null;
                } else if (c0w04.LL == null) {
                    c0w04.LL = c817470W4z.LIZJ(c0w58);
                }
            }
            c828330WeV.LIZIZ(context2, str, new InterfaceC828360WeY() { // from class: X.0dXe
                @Override // X.InterfaceC828360WeY
                public final void LIZ(Context context3, String str3) throws Throwable {
                    String str4 = DonationWebPageDialogActivity._pnsPageId;
                    DonationFragment donationFragment = this.LIZ;
                    Bundle bundle2 = bundle;
                    Context context4 = donationFragment.getContext();
                    if (context4 != null) {
                        bundle2.putBoolean("show_load_dialog", false);
                        bundle2.putBoolean("webview_progress_bar", true);
                        Intent intent = new Intent(context4, (Class<?>) DonationWebPageDialogActivity.class);
                        intent.putExtras(bundle2);
                        C1701330uNH.LIZ(intent, donationFragment);
                        C2204961BRm.LLJL(donationFragment, intent, 9001, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6nbZ7a1T21WJxbnTTnLvTYFzWyWndIQCWXrlLWzRc3UbRI5AdIcd8IjSGGEj8=", null));
                    }
                }
            }, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v25, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v55, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0QrV, X.0zoy, X.19ry] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) throws JSONException {
        boolean z;
        Long lValueOf;
        super.onViewCreated(view, bundle);
        final Context context = view.getContext();
        ?? r4 = new AbstractC683590Qrd<DonorStruct>(this) { // from class: X.0zoy
            public final DonationFragment LL;

            {
                super(false);
                this.LL = this;
            }

            @Override // X.AbstractC438050HFr
            public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                UrlModel avatarThumb;
                long jCurrentTimeMillis;
                List<DonorStruct> data = getData();
                if (data != null && (viewHolder instanceof C1910710zoz) && ListProtector.get(data, i) != null) {
                    C1910710zoz c1910710zoz = (C1910710zoz) viewHolder;
                    DonorStruct donorStruct = (DonorStruct) ListProtector.get(data, i);
                    c1910710zoz.LLIZ.setText(2131832352);
                    c1910710zoz.LLIZLLLIL.setText("•");
                    if (donorStruct.isTopDonor) {
                        C786410Ut5.LJZI(0, c1910710zoz.LLILZLL);
                        C786410Ut5.LLIL(c1910710zoz.LLIZ, 0);
                        C786410Ut5.LLIL(c1910710zoz.LLIZLLLIL, 0);
                    } else {
                        C786410Ut5.LJZI(8, c1910710zoz.LLILZLL);
                        C786410Ut5.LLIL(c1910710zoz.LLIZ, 8);
                        C786410Ut5.LLIL(c1910710zoz.LLIZLLLIL, 8);
                    }
                    if (Intrinsics.LJFF(donorStruct.anonymous, Boolean.TRUE)) {
                        c1910710zoz.LLILLL.setText(c1910710zoz.itemView.getContext().getString(2131832351));
                        C1331670kl3 c1331670kl3LJFF = C1331660kl2.LJFF(R.drawable.fhw);
                        c1331670kl3LJFF.LIZLLL("Donation");
                        c1331670kl3LJFF.LJJ(c1910710zoz.LLILLJJLI);
                        c1331670kl3LJFF.LJJIIZ(R.color.aj);
                        C786410Ut5.h3(c1331670kl3LJFF);
                        C786410Ut5.G9(c1910710zoz.LLILLJJLI, new View.OnClickListener() { // from class: X.0zp1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                            }
                        });
                        C786410Ut5.T7(c1910710zoz.LLILLL, new View.OnClickListener() { // from class: X.0zp2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                            }
                        });
                    } else {
                        ACListenerS130S0200000_28 aCListenerS130S0200000_28 = new ACListenerS130S0200000_28(c1910710zoz, donorStruct, 38);
                        C786410Ut5.G9(c1910710zoz.LLILLJJLI, aCListenerS130S0200000_28);
                        C786410Ut5.T7(c1910710zoz.LLILLL, aCListenerS130S0200000_28);
                        c1910710zoz.LLILLL.setText(C10EU.LJ(donorStruct.user));
                        User user = donorStruct.user;
                        String uid = null;
                        if (user != null) {
                            avatarThumb = user.getAvatarThumb();
                        } else {
                            avatarThumb = null;
                        }
                        User curUser = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser();
                        if (curUser.getUid() != null) {
                            String uid2 = curUser.getUid();
                            User user2 = donorStruct.user;
                            if (user2 != null) {
                                uid = user2.getUid();
                            }
                            if (Intrinsics.LJFF(uid2, uid)) {
                                avatarThumb = curUser.getAvatarThumb();
                            }
                        }
                        if (c1910710zoz.LLILLJJLI != null && avatarThumb != null && avatarThumb.getUrlList() != null && avatarThumb.getUrlList().size() != 0) {
                            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
                            c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
                            int i2 = C1910710zoz.LLJ;
                            c1331670kl3LJIIIIZZ.LJIIIIZZ = i2;
                            c1331670kl3LJIIIIZZ.LJIIIZ = i2;
                            c1331670kl3LJIIIIZZ.LJJIJLIJ = true;
                            c1331670kl3LJIIIIZZ.LIZLLL("Donation");
                            c1331670kl3LJIIIIZZ.LJJIIZ(R.color.aj);
                            c1331670kl3LJIIIIZZ.LJJ(c1910710zoz.LLILLJJLI);
                            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                        }
                    }
                    Context context2 = c1910710zoz.itemView.getContext();
                    Long l = donorStruct.timestamp;
                    if (l != null) {
                        jCurrentTimeMillis = l.longValue();
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    String strReplace = new Regex("(.)").replace(C1356610lPH.LIZJ(jCurrentTimeMillis * 1000, context2), "$1\u2060");
                    String str = donorStruct.amount;
                    if (str == null) {
                        str = "";
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c1910710zoz.itemView.getContext().getString(2131832350) + ' ' + donorStruct.amount + ' ' + strReplace);
                    int iLJJJ = a0.LJJJ(spannableStringBuilder, str, 0, false, 6);
                    int iLJJJ2 = a0.LJJJ(spannableStringBuilder, strReplace, 0, false, 6);
                    final int color = c1910710zoz.itemView.getContext().getResources().getColor(R.color.da);
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(color) { // from class: com.ss.android.ugc.aweme.donation.detail.DonationVH$bind$3$1
                        @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                        public final void updateDrawState(TextPaint textPaint) {
                            super.updateDrawState(textPaint);
                            C444890HcV c444890HcV = new C444890HcV();
                            c444890HcV.LIZ(82);
                            textPaint.setTypeface(c444890HcV.getTypeface());
                        }
                    }, iLJJJ, str.length() + iLJJJ, 34);
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(c1910710zoz.itemView.getContext().getResources().getColor(R.color.di)), iLJJJ2, strReplace.length() + iLJJJ2, 34);
                    c1910710zoz.LLILZ.setText(spannableStringBuilder);
                    String str2 = donorStruct.tiktokAmount;
                    if (str2 != null && str2.length() != 0) {
                        TextView textView = c1910710zoz.LLILZIL;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("+ ");
                        sbLIZ.append(donorStruct.tiktokAmount);
                        textView.setText(C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    c1910710zoz.LLILZIL.setText("");
                }
            }

            @Override // X.AbstractC438050HFr
            public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
                Context context2;
                if (viewGroup != null) {
                    context2 = viewGroup.getContext();
                } else {
                    context2 = null;
                }
                return new C1910710zoz(C786410Ut5.Td(C786410Ut5.ne(context2), R.layout.bnf, viewGroup, false), this.LL);
            }
        };
        r4.setLoadMoreListener(this);
        NR().setLayoutManager(new LinearLayoutManager(context));
        NR().setAdapter(r4);
        this.LLJLLIL = r4;
        final C259800zU c259800zU = new C259800zU();
        final C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        Integer num = (Integer) this.LLJLIL.getValue();
        if (num != null && num.intValue() == 4) {
            c259800zU.element = OR();
            c118300cf.element = 4;
        } else {
            Integer num2 = (Integer) this.LLJLIL.getValue();
            if (num2 != null && num2.intValue() == 3) {
                c259800zU.element = WR();
                c118300cf.element = 3;
            } else {
                Integer num3 = (Integer) this.LLJLIL.getValue();
                if (num3 != null && num3.intValue() == 1) {
                    c259800zU.element = getAid();
                    c118300cf.element = 1;
                } else {
                    String aid = getAid();
                    if (aid != null && aid.length() != 0) {
                        c259800zU.element = getAid();
                        c118300cf.element = 1;
                    } else {
                        String strWR = WR();
                        if (strWR != null && strWR.length() != 0) {
                            c259800zU.element = WR();
                            c118300cf.element = 3;
                        } else {
                            String strOR = OR();
                            if (strOR != null && strOR.length() != 0) {
                                c259800zU.element = OR();
                                c118300cf.element = 4;
                            }
                        }
                    }
                }
            }
        }
        final JSONObject jSONObject = new JSONObject();
        String strOR2 = OR();
        if (strOR2 != null && strOR2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Long lValueOf2 = null;
        if (!z) {
            try {
                String strOR3 = OR();
                if (strOR3 != null) {
                    lValueOf = Long.valueOf(CastLongProtector.parseLong(strOR3));
                } else {
                    lValueOf = null;
                }
                jSONObject.put("effect_id", lValueOf);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.g2c);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (C197039127h) viewFindViewById;
        }
        C786410Ut5.U8((C197039127h) viewFindViewById, new View.OnClickListener() { // from class: X.0zoq
            /* JADX WARN: Removed duplicated region for block: B:68:0x01b1  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r13) {
                /*
                    Method dump skipped, instruction units count: 457
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1910620zoq.onClick(android.view.View):void");
            }
        });
        View viewFindViewById2 = this.LLILLL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.bn2);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILLL = (TuxIconView) viewFindViewById2;
        }
        C786410Ut5.a9((TuxIconView) viewFindViewById2, new ACListenerS162S0100000_28(this, 50));
        C1910680zow c1910680zow = this.LLJJIII;
        try {
            String str = (String) c259800zU.element;
            if (str != null) {
                lValueOf2 = Long.valueOf(CastLongProtector.parseLong(str));
            }
        } catch (NumberFormatException e2) {
            TryCatchGuardChecker.doCheck(e2);
            lValueOf2 = 0L;
        }
        c1910680zow.LJIIJ(new C1910630zor(getAid(), (String) this.LLJJJJLIIL.getValue(), (String) this.LLJJL.getValue(), WR(), (Integer) this.LLJJJJJIL.getValue(), Integer.valueOf(c118300cf.element), C786410Ut5.J3(jSONObject), lValueOf2));
        c1910680zow.LLILLJJLI = this;
        c1910680zow.LIZJ(1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9001) {
            this.LLJJIJIIJIL = "tiltify";
            aS();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bne, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
