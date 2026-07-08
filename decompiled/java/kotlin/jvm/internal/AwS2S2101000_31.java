package kotlin.jvm.internal;

import X.C09AY;
import X.C09JN;
import X.C1166730gT1;
import X.C11O8;
import X.C20573115er;
import X.C20611915l7;
import X.C449290Hjb;
import X.EnumC1392960mLu;
import X.InterfaceC20573215es;
import Y.AfS187S0100000_18;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.tiktok.tns.userrelation.hideaccount.HiddenItem;
import com.ss.android.ugc.tiktok.tns.userrelation.hideaccount.HideAccountViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class AwS2S2101000_31 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS2S2101000_31 awS2S2101000_31, Object obj) {
        C11O8 c11o8LIZIZ;
        final boolean zIsHidden = ((HiddenItem) ListProtector.get(((C1166730gT1) obj).LL, awS2S2101000_31.i3)).isHidden();
        if (zIsHidden) {
            C20573115er c20573115er = InterfaceC20573215es.LIZ;
            String str = awS2S2101000_31.s0;
            EnumC1392960mLu enumC1392960mLu = EnumC1392960mLu.ALL;
            c20573115er.getClass();
            c11o8LIZIZ = C20573115er.LIZJ(str, enumC1392960mLu);
        } else {
            C20573115er c20573115er2 = InterfaceC20573215es.LIZ;
            String str2 = awS2S2101000_31.s0;
            EnumC1392960mLu enumC1392960mLu2 = EnumC1392960mLu.ALL;
            c20573115er2.getClass();
            c11o8LIZIZ = C20573115er.LIZIZ(str2, enumC1392960mLu2);
        }
        final String str3 = awS2S2101000_31.s0;
        final HideAccountViewModel hideAccountViewModel = (HideAccountViewModel) awS2S2101000_31.l2;
        final int i = awS2S2101000_31.i3;
        final String str4 = awS2S2101000_31.s1;
        c11o8LIZIZ.LJJLL(new C09JN() { // from class: X.15em
            @Override // X.C09JN
            public final void accept(Object obj2) {
                int value;
                C1C7U.LIZ("HideAccountViewModel@96be.hideOrUnHideAccount$2$1");
                if (zIsHidden) {
                    value = EnumC994420bz6.NOT_HIDE.getValue();
                } else {
                    value = EnumC994420bz6.HIDE.getValue();
                }
                C1589640rT8.LIZIZ.f2(EnumC1392960mLu.ALL, str3, !zIsHidden);
                HideAccountViewModel hideAccountViewModel2 = hideAccountViewModel;
                hideAccountViewModel2.setState(new C20572715en(i, value, hideAccountViewModel2, str4, zIsHidden));
                C1C7U.LIZIZ("HideAccountViewModel@96be.hideOrUnHideAccount$2$1");
            }
        }, new AfS187S0100000_18(hideAccountViewModel, 65));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S2101000_31 awS2S2101000_31, Object obj) throws JSONException {
        String id;
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("search_position", awS2S2101000_31.s0);
        jSONObject.put("new_sug_session_id", C449290Hjb.LIZ);
        jSONObject.put("impr_id", ((C20611915l7) awS2S2101000_31.l2).LJIIL.LJ);
        jSONObject.put("raw_query", ((C20611915l7) awS2S2101000_31.l2).LJIIL.LIZLLL);
        jSONObject.put("sug_user_id", ((C20611915l7) awS2S2101000_31.l2).LIZ);
        jSONObject.put("enter_from", awS2S2101000_31.s1);
        jSONObject.put("user_tag", ((C20611915l7) awS2S2101000_31.l2).LJIIL.LIZIZ);
        jSONObject.put("words_position", awS2S2101000_31.i3);
        Word word = ((C20611915l7) awS2S2101000_31.l2).LJIIL.LJFF;
        String wordSource = null;
        if (word != null) {
            wordSource = word.getWordSource();
        }
        if (wordSource == null) {
            wordSource = "";
        }
        jSONObject.put("words_source", wordSource);
        Word word2 = ((C20611915l7) awS2S2101000_31.l2).LJIIL.LJFF;
        if (word2 == null || (id = word2.getId()) == null) {
            id = "";
        }
        jSONObject.put("group_id", id);
        jSONObject.put("now_type", "");
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS2S2101000_31 awS2S2101000_31, Object obj) throws JSONException {
        String id;
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.put("search_position", awS2S2101000_31.s0);
        jSONObject.put("sug_user_id", ((C20611915l7) awS2S2101000_31.l2).LIZ);
        jSONObject.put("enter_from", awS2S2101000_31.s1);
        jSONObject.put("new_sug_session_id", C449290Hjb.LIZ);
        jSONObject.put("impr_id", ((C20611915l7) awS2S2101000_31.l2).LJIIL.LJ);
        jSONObject.put("user_tag", ((C20611915l7) awS2S2101000_31.l2).LJIIL.LIZIZ);
        jSONObject.put("raw_query", ((C20611915l7) awS2S2101000_31.l2).LJIIL.LIZLLL);
        jSONObject.put("words_position", awS2S2101000_31.i3);
        Word word = ((C20611915l7) awS2S2101000_31.l2).LJIIL.LJFF;
        String wordSource = null;
        if (word != null) {
            wordSource = word.getWordSource();
        }
        if (wordSource == null) {
            wordSource = "";
        }
        jSONObject.put("words_source", wordSource);
        Word word2 = ((C20611915l7) awS2S2101000_31.l2).LJIIL.LJFF;
        if (word2 == null || (id = word2.getId()) == null) {
            id = "";
        }
        jSONObject.put("group_id", id);
        jSONObject.put("now_type", "");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S2101000_31(int i, C20611915l7 c20611915l7, String str, String str2, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.l2 = c20611915l7;
        this.s1 = str2;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S2101000_31(int i, String str, HideAccountViewModel hideAccountViewModel, String str2, int i2) {
        super(1);
        this.$t = i2;
        this.i3 = i;
        this.s0 = str;
        this.l2 = hideAccountViewModel;
        this.s1 = str2;
    }
}
