package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0PCY;
import X.C0PRC;
import X.C13BV;
import X.C1558520qew;
import X.C1559260qg8;
import X.C452501pT;
import X.C646370PWx;
import X.C656610PpD;
import X.C683220Qr2;
import X.C723580SZw;
import X.InterfaceC1631630sYr;
import X.InterfaceC655050Pmh;
import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchBuiltInFeedbackAssem extends SearchCardFeedbackAssem<InterfaceC655050Pmh> {
    public final C1559260qg8 LLJJJJLIIL = new C1559260qg8(new C723580SZw(this, C656610PpD.class, null), checkSupervisorPrepared());
    public final int LLJJL = R.id.nh_;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS547S0100000_3(this, 49));
    public InterfaceC655050Pmh LLJL;

    @Override // X.InterfaceC685830QvF
    public final String getFeedbackType() {
        C656610PpD<InterfaceC655050Pmh> c656610PpDSp;
        Function1<? super InterfaceC655050Pmh, String> function1;
        InterfaceC655050Pmh interfaceC655050Pmh = this.LLJL;
        if (interfaceC655050Pmh == null || (c656610PpDSp = sp()) == null || (function1 = c656610PpDSp.LL) == null) {
            return null;
        }
        return function1.invoke(interfaceC655050Pmh);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem
    public final void mp() {
        C656610PpD<InterfaceC655050Pmh> c656610PpDSp;
        Function2<? super AbstractC738140SxQ, ? super InterfaceC655050Pmh, Unit> function2;
        InterfaceC655050Pmh interfaceC655050Pmh = this.LLJL;
        if (interfaceC655050Pmh == null || (c656610PpDSp = sp()) == null || (function2 = c656610PpDSp.LLIZLLLIL) == null) {
            return;
        }
        function2.invoke(this, interfaceC655050Pmh);
    }

    @Override // X.InterfaceC685830QvF
    public final List<Integer> sf() {
        return (List) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C656610PpD<InterfaceC655050Pmh> sp() {
        return (C656610PpD) this.LLJJJJLIIL.getValue();
    }

    @Override // X.InterfaceC685830QvF
    public final int ue() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC685830QvF
    public final List<Integer> ya() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC685830QvF
    public final void Mj(C683220Qr2 c683220Qr2) {
        Aweme awemeInvoke;
        String string;
        Resources resources;
        UrlModel urlModelInvoke;
        String aid;
        Function1<? super InterfaceC655050Pmh, ? extends Map<String, String>> function1;
        Map<String, String> mapInvoke;
        C0PCY<C646370PWx> c0pcyWO2;
        C646370PWx c646370PWx;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        Function1<? super InterfaceC655050Pmh, ? extends UrlModel> function12;
        Function1<? super InterfaceC655050Pmh, String> function13;
        Function1<? super InterfaceC655050Pmh, ? extends Aweme> function14;
        InterfaceC655050Pmh interfaceC655050Pmh = this.LLJL;
        if (interfaceC655050Pmh == null) {
            return;
        }
        C656610PpD<InterfaceC655050Pmh> c656610PpDSp = sp();
        String authorUid = null;
        if (c656610PpDSp != null && (function14 = c656610PpDSp.LLILZ) != null) {
            awemeInvoke = function14.invoke(interfaceC655050Pmh);
        } else {
            awemeInvoke = null;
        }
        C656610PpD<InterfaceC655050Pmh> c656610PpDSp2 = sp();
        if (c656610PpDSp2 == null || (function13 = c656610PpDSp2.LLILLJJLI) == null || (string = function13.invoke(interfaceC655050Pmh)) == null) {
            Context context = getContext();
            if (context != null && (resources = context.getResources()) != null) {
                string = resources.getString(R.string.video);
            } else {
                string = null;
            }
        }
        c683220Qr2.LIZJ = string;
        C656610PpD<InterfaceC655050Pmh> c656610PpDSp3 = sp();
        if (c656610PpDSp3 != null && (function12 = c656610PpDSp3.LLILLL) != null) {
            urlModelInvoke = function12.invoke(interfaceC655050Pmh);
        } else {
            urlModelInvoke = null;
        }
        c683220Qr2.LIZIZ = urlModelInvoke;
        if (awemeInvoke != null) {
            aid = awemeInvoke.getAid();
        } else {
            aid = null;
        }
        c683220Qr2.LJFF = aid;
        if (awemeInvoke != null) {
            authorUid = AwemeExtKt.getAuthorUid(awemeInvoke);
        }
        c683220Qr2.LJII = authorUid;
        c683220Qr2.LJIILIIL = awemeInvoke;
        HashMap map = new HashMap();
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) this.LLJJJJ.getValue();
        if (iSearchContextAbility != null && (c0pcyPh1 = iSearchContextAbility.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null) {
            map.put("search_id", c0prc.LLILLL);
            map.put("search_keyword", c0prc.LLIZLLLIL);
        }
        ISearchContextAbility iSearchContextAbility2 = (ISearchContextAbility) this.LLJJJJ.getValue();
        String str = "";
        if (iSearchContextAbility2 != null && (c0pcyWO2 = iSearchContextAbility2.wO2()) != null && (c646370PWx = (C646370PWx) c0pcyWO2.LIZJ()) != null) {
            map.put("enter_from", c646370PWx.LLILLL);
            map.put("rank", String.valueOf(c646370PWx.LLILZLL));
            map.put("universal_rank", String.valueOf(c646370PWx.LLJILJIL));
            String str2 = c646370PWx.LLJILJILJ;
            if (str2 == null) {
                str2 = "";
            }
            map.put("insert_type", str2);
        }
        Map<String, String> mapXE0 = ((SearchServiceCenter$MobAbility) C1558520qew.LIZJ(C1558520qew.LJIIL(this), SearchServiceCenter$MobAbility.class)).XE0();
        String str3 = mapXE0.get("search_result_id");
        if (str3 == null) {
            str3 = "";
        }
        map.put("search_result_id", str3);
        String str4 = mapXE0.get("token_type");
        if (str4 == null) {
            str4 = "";
        }
        map.put("token_type", str4);
        String str5 = mapXE0.get("is_aladdin");
        if (str5 != null) {
            str = str5;
        }
        map.put("is_aladdin", str);
        C656610PpD<InterfaceC655050Pmh> c656610PpDSp4 = sp();
        if (c656610PpDSp4 != null && (function1 = c656610PpDSp4.LLILZLL) != null && (mapInvoke = function1.invoke(interfaceC655050Pmh)) != null) {
            map.putAll(mapInvoke);
        }
        c683220Qr2.LJ = map;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem
    /* JADX INFO: renamed from: kp */
    public final void up(InterfaceC655050Pmh interfaceC655050Pmh) {
        super.up(interfaceC655050Pmh);
        this.LLJL = interfaceC655050Pmh;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((InterfaceC655050Pmh) obj);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem
    public final void lp(C683220Qr2 c683220Qr2, FeedbackMultipleChoice feedbackMultipleChoice) {
        C656610PpD<InterfaceC655050Pmh> c656610PpDSp;
        InterfaceC1631630sYr<? super AbstractC738140SxQ, ? super InterfaceC655050Pmh, ? super C683220Qr2, ? super FeedbackMultipleChoice, Unit> interfaceC1631630sYr;
        InterfaceC655050Pmh interfaceC655050Pmh = this.LLJL;
        if (interfaceC655050Pmh != null && (c656610PpDSp = sp()) != null && (interfaceC1631630sYr = c656610PpDSp.LLIZ) != null) {
            interfaceC1631630sYr.invoke(this, interfaceC655050Pmh, c683220Qr2, feedbackMultipleChoice);
        }
    }
}
