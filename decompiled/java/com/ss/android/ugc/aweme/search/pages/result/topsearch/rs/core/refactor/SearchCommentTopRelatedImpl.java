package com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.refactor;

import X.AbstractC1511510pR7;
import X.C01GW;
import X.C0BQY;
import X.C0BSN;
import X.C0N33;
import X.C0PD5;
import X.C0QQ8;
import X.C0QQB;
import X.C0QQK;
import X.C0QQS;
import X.C10EU;
import X.C1101304Sl;
import X.C1349800lEI;
import X.C1381440m3K;
import X.C13LP;
import X.C1697810uHb;
import X.C1959707lz;
import X.C19EG;
import X.C1ER1;
import X.C2189821An6;
import X.C419910GdJ;
import X.C452501pT;
import X.C523420Kfs;
import X.C666360QBu;
import X.C718860SHs;
import X.C786410Ut5;
import X.EnumC1350510lFR;
import X.InterfaceC1511740pRU;
import Y.ARunnableS43S0300000_10;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.comment.services.ICommentTopBarAbilityService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.config.SearchSecurityControlConfig;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarIcon;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarIconStyle;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarMargin;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.PromotionInfo;
import com.ss.android.ugc.aweme.feed.model.search.SuggestWordStruct;
import com.ss.android.ugc.aweme.feed.model.search.WordStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchAheadPrefetchOptConfig;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCommentTopRelatedImpl implements ICommentTopBarImplementService {
    public static final C01GW<AbstractC1511510pR7> LJIIZILJ = C452501pT.LIZIZ(new C0QQB());
    public String LJFF;
    public Integer LJII;
    public PromotionInfo LJIIIIZZ;
    public String LJIIIZ;
    public long LJIIJ;
    public String LJIIJJI;
    public Boolean LJIIL;
    public C0QQ8 LJIILJJIL;
    public Word LJIILL;
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJ = "";
    public String LJI = "";
    public final String LJIILIIL = "comment_ahead";
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(623));

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean addGlobalEventListener(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final HashMap<String, String> appendClickEventParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final HashMap<String, String> appendSchemaParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final HashMap<String, String> appendShowEventParams(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final View createCustomizeTopBarView(Context context, Aweme aweme, CommentContextSource commentContextSource) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final List<Integer> getBizTypes() {
        return C1697810uHb.LJIIJJI(Integer.valueOf(EnumC1350510lFR.SEARCH.getValue()), Integer.valueOf(EnumC1350510lFR.SEARCH_PRODUCT.getValue()));
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final Integer getCustomizeTopBarViewLayout(Aweme aweme) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean needSetTextOnClickPressState(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onComponentHide(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onGlobalComponentClick(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onGlobalComponentHide(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onGlobalComponentShow(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onPause(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onResumeShow(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onUnBindComponentView(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
    }

    public final void LIZ(float f, C19EG c19eg, Aweme aweme) {
        C666360QBu.LIZ.getClass();
        if (f >= C666360QBu.LIZ().scoreThreshold) {
            C786410Ut5.LJLIIL(C666360QBu.LIZ().prefetchDelayTime, new BPEAHandler(Looper.getMainLooper()), new ARunnableS43S0300000_10(aweme, this, c19eg, 7));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean canShow(C19EG c19eg, CommentTopBarComponent commentTopBarComponent, Aweme aweme, String str, C2189821An6 c2189821An6) {
        boolean z;
        AwemeStatus statusSafety;
        IFamilyPairingService iFamilyPairingServiceLJIIL;
        String curUserId;
        List<SuggestWordStruct> suggestWords;
        SuggestWordStruct suggestWordStruct;
        List<SuggestWordStruct> suggestWords2;
        String scene;
        if (aweme == null) {
            return false;
        }
        CommentSuggestWordList commentSuggestWordList = aweme.getCommentSuggestWordList();
        String qrecVirtualEnable = null;
        if (commentSuggestWordList != null && (suggestWords2 = commentSuggestWordList.getSuggestWords()) != null) {
            z = false;
            for (SuggestWordStruct suggestWordStruct2 : suggestWords2) {
                if (suggestWordStruct2 != null) {
                    scene = suggestWordStruct2.getScene();
                } else {
                    scene = null;
                }
                if (Intrinsics.LJFF("comment_top", scene)) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        SearchSecurityControlConfig.LIZ.getClass();
        if (SearchSecurityControlConfig.LIZIZ().disableSuggestWords) {
            return false;
        }
        CommentSuggestWordList commentSuggestWordList2 = aweme.getCommentSuggestWordList();
        if (commentSuggestWordList2 != null && (suggestWords = commentSuggestWordList2.getSuggestWords()) != null && (suggestWordStruct = (SuggestWordStruct) C13LP.LJJJLL(suggestWords)) != null) {
            qrecVirtualEnable = suggestWordStruct.getQrecVirtualEnable();
        }
        if (Intrinsics.LJFF(qrecVirtualEnable, "1") || !z || ComplianceServiceProvider.LJI().LJJJI() || C1ER1.LIZIZ.LLLLLLLLL()) {
            return false;
        }
        C0QQS c0qqs = new Object() { // from class: X.0QQS
        };
        C1349800lEI c1349800lEI = new C1349800lEI(aweme.getAid());
        c1349800lEI.setEventType(str);
        c0qqs.getClass();
        if (!C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme)) && !C10EU.LJIILL(aweme.getAuthor(), C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme)))) {
            CommentService.LIZ.getClass();
            if (!C523420Kfs.LIZ().LJIILLIIL(aweme) && C523420Kfs.LIZ().LJJIJIIJIL(aweme) && AwemeExtKt.getStatusSafety(aweme) != null && (statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null && statusSafety.getPrivateStatus() == 0 && !Intrinsics.LJFF(c1349800lEI.getEventType(), "selfharm") && ((iFamilyPairingServiceLJIIL = ComplianceServiceProvider.LJIIL()) == null || !iFamilyPairingServiceLJIIL.LJIIIZ())) {
                IAccountUserService iAccountUserService = (IAccountUserService) this.LJIILLIIL.getValue();
                if (iAccountUserService != null && iAccountUserService.isLogin() && C0BQY.LIZ()) {
                    Keva keva = C1959707lz.LIZ;
                    IAccountUserService iAccountUserService2 = (IAccountUserService) this.LJIILLIIL.getValue();
                    if (iAccountUserService2 == null || (curUserId = iAccountUserService2.getCurUserId()) == null) {
                        curUserId = "";
                    }
                    if (C1959707lz.LIZ(aweme, curUserId)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final Drawable mapLocalIconDrawable(Context context, Integer num, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource) {
        CommentTopBarIconStyle commentTopBarIconStyle;
        CommentTopBarIconStyle commentTopBarIconStyle2;
        if (context == null) {
            return null;
        }
        if (C1101304Sl.LIZ(this.LJIIIZ)) {
            CommentTopBarIcon commentTopBarIcon = commentTopBarComponent.tailIcon;
            if (commentTopBarIcon != null && (commentTopBarIconStyle2 = commentTopBarIcon.style) != null) {
                commentTopBarIconStyle2.setSize(14);
            }
            CommentTopBarIcon commentTopBarIcon2 = commentTopBarComponent.tailIcon;
            if (commentTopBarIcon2 != null) {
                commentTopBarIcon2.setMargin(new CommentTopBarMargin(1, 4, 4, 0));
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_arrow_broken_line_up;
            c419910GdJ.LIZLLL = Integer.valueOf(R.attr.a1n);
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1n);
            return c419910GdJ.LIZ(context);
        }
        CommentTopBarIcon commentTopBarIcon3 = commentTopBarComponent.tailIcon;
        if (commentTopBarIcon3 != null && (commentTopBarIconStyle = commentTopBarIcon3.style) != null) {
            commentTopBarIconStyle.setSize(10);
        }
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_magnifying_glass_fill;
        c419910GdJ2.LIZLLL = Integer.valueOf(R.attr.a1n);
        c419910GdJ2.LJ = Integer.valueOf(R.attr.a1n);
        return c419910GdJ2.LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onBindComponentView(final C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, final Aweme aweme, CommentContextSource commentContextSource) {
        String str;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        CommentSuggestWordList commentSuggestWordList;
        List<SuggestWordStruct> suggestWords;
        String scene;
        WordStruct wordStruct;
        String word;
        String wordsLang;
        String textnetId;
        PromotionInfo promoteInfo;
        String wordsType;
        String penetrateInfo;
        Boolean boolIsPersonalized;
        Word wordRecord;
        String wordId;
        Word wordRecord2;
        Word wordRecord3;
        if (aweme != null && (commentSuggestWordList = aweme.getCommentSuggestWordList()) != null && (suggestWords = commentSuggestWordList.getSuggestWords()) != null) {
            for (SuggestWordStruct suggestWordStruct : suggestWords) {
                Word wordRecord4 = null;
                if (suggestWordStruct != null) {
                    scene = suggestWordStruct.getScene();
                } else {
                    scene = null;
                }
                if (Intrinsics.LJFF("comment_top", scene)) {
                    List<WordStruct> words = suggestWordStruct.getWords();
                    if (words != null) {
                        wordStruct = (WordStruct) C13LP.LJJJLL(words);
                    } else {
                        wordStruct = null;
                    }
                    String str2 = "";
                    if (wordStruct == null || (word = wordStruct.getWord()) == null) {
                        word = "";
                    }
                    this.LIZ = word;
                    if (wordStruct == null || (wordRecord3 = wordStruct.getWordRecord()) == null || (wordsLang = wordRecord3.getWordsLang()) == null) {
                        wordsLang = "";
                    }
                    this.LIZJ = wordsLang;
                    if (wordStruct == null || (wordRecord2 = wordStruct.getWordRecord()) == null || (textnetId = wordRecord2.getTextnetId()) == null) {
                        textnetId = "";
                    }
                    this.LIZLLL = textnetId;
                    if (wordStruct != null) {
                        promoteInfo = wordStruct.getPromoteInfo();
                    } else {
                        promoteInfo = null;
                    }
                    this.LJIIIIZZ = promoteInfo;
                    if (wordStruct != null) {
                        wordsType = wordStruct.getWordsType();
                    } else {
                        wordsType = null;
                    }
                    this.LJIIIZ = wordsType;
                    if (wordStruct != null && (wordId = wordStruct.getWordId()) != null) {
                        str2 = wordId;
                    }
                    this.LIZIZ = str2;
                    suggestWordStruct.getHintText();
                    if (wordStruct != null) {
                        penetrateInfo = wordStruct.getPenetrateInfo();
                    } else {
                        penetrateInfo = null;
                    }
                    this.LJIIJJI = penetrateInfo;
                    if (wordStruct != null && (wordRecord = wordStruct.getWordRecord()) != null) {
                        boolIsPersonalized = wordRecord.isPersonalized();
                    } else {
                        boolIsPersonalized = null;
                    }
                    this.LJIIL = boolIsPersonalized;
                    if (wordStruct != null) {
                        wordRecord4 = wordStruct.getWordRecord();
                    }
                    this.LJIILL = wordRecord4;
                }
            }
        }
        if (commentContextSource != null) {
            this.LJ = CommentContextSourceKt.enterFrom(commentContextSource);
            this.LJFF = CommentContextSourceKt.enterMethod(commentContextSource);
            this.LJI = CommentContextSourceKt.tabName(commentContextSource);
            this.LJII = Integer.valueOf(commentContextSource.getCommonModel().pageType);
        }
        C718860SHs.LIZ.getClass();
        if (C0BSN.LIZ && commentContextSource != null && CommentContextSourceKt.isFromTitlePanel(commentContextSource)) {
            this.LJFF = "title_panel_comment_related_search";
            if (commentContextSource != null && (commonModel2 = commentContextSource.getCommonModel()) != null) {
                commonModel2.setWordsSource("title_panel_comment_related_search");
            }
        }
        String str3 = this.LJ;
        String str4 = this.LJI;
        String str5 = this.LIZ;
        String str6 = this.LJIIIZ;
        PromotionInfo promotionInfo = this.LJIIIIZZ;
        String str7 = this.LJIIJJI;
        String str8 = this.LIZJ;
        String str9 = this.LIZLLL;
        String str10 = this.LIZIZ;
        Integer num = this.LJII;
        Boolean bool = this.LJIIL;
        Word word2 = this.LJIILL;
        if (commentContextSource == null || (commonModel = commentContextSource.getCommonModel()) == null || (str = commonModel.wordsSource) == null) {
            str = "comment_related_search";
        }
        this.LJIILJJIL = new C0QQ8(str3, str4, str5, str6, promotionInfo, str7, str8, str9, str10, 0, num, bool, word2, str, this.LJFF);
        if (aweme != null && c19eg != null) {
            C0PD5.LIZ.getClass();
            C01GW c01gw = C0PD5.LIZJ;
            if (((SearchAheadPrefetchOptConfig) c01gw.getValue()).enableAheadPrefetch) {
                C786410Ut5.LJLIIL(((SearchAheadPrefetchOptConfig) c01gw.getValue()).prefetchDelayTime, new BPEAHandler(Looper.getMainLooper()), new ARunnableS43S0300000_10(aweme, this, c19eg, 14));
            }
            C666360QBu.LIZ.getClass();
            if (C666360QBu.LIZ().enableSmartAheadPrefetch) {
                C0N33 c0n33 = new C0N33();
                c0n33.LJIIJ = aweme;
                AbstractC1511510pR7 value = LJIIZILJ.getValue();
                if (value != null) {
                    value.runAsyncDelay(0L, c0n33, new InterfaceC1511740pRU() { // from class: X.0QQD
                        @Override // X.InterfaceC1511740pRU
                        public final void LIZ(C1512100pS4 c1512100pS4) {
                            String str11;
                            Map<String, Float> map;
                            Float f;
                            Float f2;
                            if (c1512100pS4 != null) {
                                str11 = c1512100pS4.LJI;
                            } else {
                                str11 = null;
                            }
                            if (Intrinsics.LJFF(str11, "byte_dt")) {
                                Map<String, Float> map2 = c1512100pS4.LIZJ;
                                if (map2 != null && (f2 = map2.get("1")) != null) {
                                    this.LIZ(f2.floatValue(), c19eg, aweme);
                                    return;
                                }
                                return;
                            }
                            if (c1512100pS4 == null || (map = c1512100pS4.LIZJ) == null || (f = map.get("click")) == null) {
                                return;
                            }
                            this.LIZ(f.floatValue(), c19eg, aweme);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01bc  */
    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onComponentClick(X.C19EG r18, androidx.fragment.app.Fragment r19, com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent r20, com.ss.android.ugc.aweme.feed.model.Aweme r21, com.ss.android.ugc.aweme.comment.model.CommentContextSource r22) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.refactor.SearchCommentTopRelatedImpl.onComponentClick(X.19EG, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.comment.model.CommentContextSource):boolean");
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final boolean onComponentLongClick(final C19EG c19eg, final Fragment fragment, CommentTopBarComponent commentTopBarComponent, final Aweme aweme, CommentContextSource commentContextSource) {
        IAccountUserService iAccountUserService;
        final String curUserId;
        if (c19eg == null || aweme == null || fragment == null) {
            return false;
        }
        C1ER1 c1er1 = C1ER1.LIZIZ;
        c1er1.LLJJJJJIL(-1L, "comment_related_search", true);
        c1er1.LLLJ("cancel", this.LIZ, "LONG_PRESS");
        if (!C0BQY.LIZ() || ((iAccountUserService = (IAccountUserService) this.LJIILLIIL.getValue()) != null && !iAccountUserService.isLogin())) {
            return false;
        }
        C0QQK c0qqk = C0QQK.LIZ;
        final String str = this.LIZ;
        final String str2 = this.LIZIZ;
        IAccountUserService iAccountUserService2 = (IAccountUserService) this.LJIILLIIL.getValue();
        if (iAccountUserService2 == null || (curUserId = iAccountUserService2.getCurUserId()) == null) {
            curUserId = "";
        }
        c0qqk.getClass();
        C1381440m3K c1381440m3K = new C1381440m3K(c19eg);
        c1381440m3K.LIZ(new String[]{c19eg.getResources().getString(2131847200), c19eg.getResources().getString(2131847202), c19eg.getResources().getString(2131847199), c19eg.getResources().getString(2131847201)}, new DialogInterface.OnClickListener() { // from class: X.0QQJ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                String str3;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                str3 = "undefined";
                            } else {
                                str3 = "others";
                            }
                        } else {
                            str3 = "Inappropriate content";
                        }
                    } else {
                        str3 = "Unrelated content";
                    }
                } else {
                    str3 = "Not interested";
                }
                C0QQK c0qqk2 = C0QQK.LIZ;
                Aweme aweme2 = aweme;
                String str4 = str;
                String str5 = str2;
                c0qqk2.getClass();
                C0QQK.LIZ(aweme2, str3, str4, str5, false);
                dialogInterface.dismiss();
                Keva keva = C1959707lz.LIZ;
                Aweme aweme3 = aweme;
                String str6 = curUserId;
                if (!TextUtils.isEmpty(aweme3.getAid()) && !TextUtils.isEmpty(str6)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str6);
                    sbLIZ.append(aweme3.getAid());
                    C1959707lz.LIZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
                }
                C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                c1389890mGx.LJIIIZ(2131822172);
                c1389890mGx.LJIIJJI();
                ICommentTopBarAbilityService iCommentTopBarAbilityService = (ICommentTopBarAbilityService) PluggableExtentionKt.pluggableSpi$default(ICommentTopBarAbilityService.class, false, false, false, 14, null);
                if (iCommentTopBarAbilityService != null) {
                    iCommentTopBarAbilityService.LIZIZ(EnumC1350510lFR.SEARCH.getValue(), fragment, str2);
                }
            }
        });
        c1381440m3K.LIZ.LIZ.LJIILIIL = new DialogInterface.OnCancelListener() { // from class: X.0QQH
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C0QQK c0qqk2 = C0QQK.LIZ;
                Aweme aweme2 = aweme;
                String str3 = str;
                String str4 = str2;
                c0qqk2.getClass();
                C0QQK.LIZ(aweme2, "cancel", str3, str4, false);
            }
        };
        C0QQK.LIZIZ(aweme, str, str2, false);
        c1381440m3K.LIZIZ();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0175  */
    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onComponentShow(X.C19EG r10, androidx.fragment.app.Fragment r11, com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent r12, com.ss.android.ugc.aweme.feed.model.Aweme r13, com.ss.android.ugc.aweme.comment.model.CommentContextSource r14) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.refactor.SearchCommentTopRelatedImpl.onComponentShow(X.19EG, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.comment.model.CommentContextSource):void");
    }

    @Override // com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService
    public final void onComponentTouchEvent(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource, MotionEvent motionEvent) {
        Bundle bundleLJFF;
        if (c19eg != null && aweme != null && motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                this.LJIIJ = System.currentTimeMillis();
                C1ER1 c1er1 = C1ER1.LIZIZ;
                C0QQ8 c0qq8 = this.LJIILJJIL;
                if (c0qq8 != null) {
                    bundleLJFF = c0qq8.LJFF(c19eg, aweme, false);
                } else {
                    bundleLJFF = null;
                }
                c1er1.LLIIJI(c19eg, bundleLJFF);
                return;
            }
            if (motionEvent.getAction() != 3) {
                return;
            }
            C1ER1 c1er12 = C1ER1.LIZIZ;
            c1er12.LLJJJJJIL(this.LJIIJ, "comment_related_search", true);
            c1er12.LLLJ("cancel", this.LIZ, "ACTION_CANCEL");
        }
    }
}
