package com.ss.android.ugc.aweme.poi.detail.reviews.v2;

import X.C03IT;
import X.C07ZP;
import X.C0C64;
import X.C1174900ggC;
import X.C1180060goW;
import X.C1188440h22;
import X.C1190660h5c;
import X.C1191160h6Q;
import X.C1192290h8F;
import X.C1193610hAN;
import X.C1203350hQ5;
import X.C1203360hQ6;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1602160rnK;
import X.C295220Bhg;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427660Gpo;
import X.C427690Gpr;
import X.C438710HIf;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1190800h5q;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import Y.ACListenerS147S0100000_12;
import Y.ACListenerS153S0100000_18;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.im.core.proto.UrlStruct;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.poi.experiment.TtlsStandardUiExperiment;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.uiwidget.richtext.LsRichText;
import com.ss.android.ugc.tiktok.location_api.service.experiment.PoiReviewFrequencyControl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewWriteEntranceWithAvatarSingleAssemV2 extends UISlotAssem {
    public PoiReviewsApi.PoiWriteReviewResponse LLJJI;
    public String LLJJIII;
    public C07ZP LLJJIJI;
    public SmartImageView LLJJIJIIJIL;
    public RadiusLayout LLJJIJIL;
    public ViewGroup LLJJJ;
    public TuxTextView LLJJJIL;
    public TuxTextView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public C1203360hQ6 LLJJJJLIIL;
    public C1203350hQ5 LLJJL;
    public C427660Gpo LLJJLIIIJLLLLLLLZ;
    public ViewGroup LLJL;
    public ViewGroup LLJLIL;
    public String LLJLILLLLZIIL;
    public SmartImageView LLJLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e88;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final InterfaceC1190800h5q hp() {
        TtlsStandardUiExperiment.LIZ.getClass();
        Integer num = ((TtlsStandardUiExperiment.TtlsStandardUiConfigModel) TtlsStandardUiExperiment.LIZJ.getValue()).ratingInput;
        if (num == null || num.intValue() != 1) {
            final C1203360hQ6 c1203360hQ6 = this.LLJJJJLIIL;
            if (c1203360hQ6 != null) {
                return new InterfaceC1190800h5q() { // from class: X.0h5l
                    @Override // X.InterfaceC1190800h5q
                    public final void reset() {
                        c1203360hQ6.setRatingInput(0);
                    }

                    @Override // X.InterfaceC1190800h5q
                    public final void LIZ(AwS597S0100000_18 awS597S0100000_18) {
                        C1203350hQ5 c1203350hQ5 = this.LLJJL;
                        if (c1203350hQ5 != null) {
                            c1203350hQ5.setOnValueSelectedListener(null);
                        }
                        c1203360hQ6.setOnValueSelectedListener(new AwS632S0100000_18(awS597S0100000_18, 125));
                    }
                };
            }
            return null;
        }
        final C1203350hQ5 c1203350hQ5 = this.LLJJL;
        if (c1203350hQ5 != null) {
            return new InterfaceC1190800h5q() { // from class: X.0h5m
                @Override // X.InterfaceC1190800h5q
                public final void reset() {
                    c1203350hQ5.setRatingInput(0);
                }

                @Override // X.InterfaceC1190800h5q
                public final void LIZ(AwS597S0100000_18 awS597S0100000_18) {
                    C1203360hQ6 c1203360hQ62 = this.LLJJJJLIIL;
                    if (c1203360hQ62 != null) {
                        c1203360hQ62.setOnValueSelectedListener(null);
                    }
                    c1203350hQ5.setOnValueSelectedListener(new AwS632S0100000_18(awS597S0100000_18, 124));
                }
            };
        }
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        InterfaceC1190800h5q interfaceC1190800h5qHp = hp();
        if (interfaceC1190800h5qHp != null) {
            interfaceC1190800h5qHp.reset();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        boolean z;
        PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse;
        String poiId;
        C07ZP c07zp;
        String entranceSubDescription;
        String entranceDescription;
        String displayInfo;
        PoiReviewsApi.PoiReviewEntrance postReviewEntrance;
        String str;
        PoiReviewsApi.PoiReviewEntrance postReviewEntrance2;
        PoiReviewsApi.PoiReviewUserModel poiReviewUserModel;
        PoiReviewsApi.PoiReviewUserLevelInfoModel poiReviewUserLevelInfoModel;
        PoiReviewsApi.PoiReviewEntrance postReviewEntrance3;
        PoiReviewsApi.PoiReviewUserModel poiReviewUserModel2;
        PoiReviewsApi.PoiReviewUserLevelInfoModel poiReviewUserLevelInfoModel2;
        PoiReviewsApi.PoiReviewEntrance postReviewEntrance4;
        LsRichText lsRichText;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        LsRichText lsRichText2;
        PoiReviewsApi.PoiReviewEntrance postReviewEntrance5;
        PoiReviewsApi.PoiReviewEntrance postReviewEntrance6;
        SpannableStringBuilder spannableStringBuilder2;
        LsRichText lsRichText3;
        PoiReviewsApi.PoiReviewEntrance postReviewEntrance7;
        PoiReviewsApi.PoiReviewEntrance postReviewEntrance8;
        SpannableStringBuilder spannableStringBuilder3;
        LsRichText lsRichText4;
        PoiReviewsApi.PoiReviewEntrance postReviewEntrance9;
        PoiReviewsApi.PoiReviewEntrance postReviewEntrance10;
        Aweme aweme;
        Video video;
        UrlStruct thumbAvatar;
        PoiReviewsApi.PoiReviewEntrance postReviewEntrance11;
        PoiReviewsApi.PoiReviewUserModel poiReviewUserModel3;
        UrlModel urlModel;
        IPoiWriteReviewsAbility iPoiWriteReviewsAbility;
        C1188440h22 c1188440h22;
        super.onViewCreated(view);
        this.LLJJJ = (ViewGroup) getContentView().findViewById(R.id.rel);
        this.LLJJJIL = (TuxTextView) getContentView().findViewById(R.id.req);
        this.LLJJJJ = (TuxTextView) getContentView().findViewById(R.id.rep);
        this.LLJJJJJIL = (TuxTextView) getContentView().findViewById(R.id.rec);
        this.LLJJJJLIIL = (C1203360hQ6) getContentView().findViewById(R.id.rek);
        C1203350hQ5 c1203350hQ5 = (C1203350hQ5) getContentView().findViewById(R.id.rem);
        this.LLJJL = c1203350hQ5;
        String entranceSubDescription2 = null;
        urlModel = null;
        urlModel = null;
        urlModel = null;
        UrlModel urlModel2 = null;
        if (c1203350hQ5 != null) {
            c1203350hQ5.setTrackParams(new C1174900ggC("poi_detail_page", "write_review_entrance", null));
        }
        this.LLJJIJIIJIL = (SmartImageView) getContentView().findViewById(R.id.red);
        this.LLJJIJIL = (RadiusLayout) getContentView().findViewById(R.id.reg);
        this.LLJL = (ViewGroup) getContentView().findViewById(R.id.re_);
        this.LLJJLIIIJLLLLLLLZ = (C427660Gpo) getContentView().findViewById(R.id.rea);
        this.LLJLIL = (ViewGroup) getContentView().findViewById(R.id.ren);
        this.LLJLL = (SmartImageView) getContentView().findViewById(R.id.rej);
        IPoiWriteReviewsAbility iPoiWriteReviewsAbility2 = (IPoiWriteReviewsAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPoiWriteReviewsAbility.class, null);
        if ((iPoiWriteReviewsAbility2 == null || !iPoiWriteReviewsAbility2.Yv()) && (viewGroup = this.LLJJJ) != null) {
            C426750GoL.LJIIIZ(viewGroup, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, false, 29);
        }
        TtlsStandardUiExperiment.LIZ.getClass();
        Integer num = ((TtlsStandardUiExperiment.TtlsStandardUiConfigModel) TtlsStandardUiExperiment.LIZJ.getValue()).ratingInput;
        if (num != null && num.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1203350hQ5 c1203350hQ52 = this.LLJJL;
            if (c1203350hQ52 != null) {
                int visibility = c1203350hQ52.getVisibility();
                c1203350hQ52.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c1203350hQ52);
            }
            C1203360hQ6 c1203360hQ6 = this.LLJJJJLIIL;
            if (c1203360hQ6 != null) {
                int visibility2 = c1203360hQ6.getVisibility();
                c1203360hQ6.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c1203360hQ6);
            }
        } else {
            C1203360hQ6 c1203360hQ62 = this.LLJJJJLIIL;
            if (c1203360hQ62 != null) {
                int visibility3 = c1203360hQ62.getVisibility();
                c1203360hQ62.setVisibility(0);
                C1602160rnK.LIZIZ(visibility3, 0, c1203360hQ62);
            }
            C1203350hQ5 c1203350hQ53 = this.LLJJL;
            if (c1203350hQ53 != null) {
                int visibility4 = c1203350hQ53.getVisibility();
                c1203350hQ53.setVisibility(8);
                C1602160rnK.LIZIZ(visibility4, 8, c1203350hQ53);
            }
        }
        C1192290h8F.LIZ(this, "poi_detail_reviews_write_entrance_v2", null, false, null, null, 26);
        C1192290h8F.LIZJ(this, new AwS597S0100000_18(this, 867));
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", PoiReviewsApi.PoiWriteReviewResponse.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            poiWriteReviewResponse = (PoiReviewsApi.PoiWriteReviewResponse) interfaceC1555100qZQLIZIZ.getSource();
        } else {
            poiWriteReviewResponse = null;
        }
        this.LLJJI = poiWriteReviewResponse;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ2 = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C1188440h22.class, null);
        if (interfaceC1555100qZQLIZIZ2 != null && (c1188440h22 = (C1188440h22) interfaceC1555100qZQLIZIZ2.getSource()) != null) {
            poiId = c1188440h22.getPoiId();
        } else {
            poiId = null;
        }
        this.LLJJIII = poiId;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ3 = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C07ZP.class, null);
        if (interfaceC1555100qZQLIZIZ3 != null) {
            c07zp = (C07ZP) interfaceC1555100qZQLIZIZ3.getSource();
        } else {
            c07zp = null;
        }
        this.LLJJIJI = c07zp;
        if (C295220Bhg.LIZJ() && (iPoiWriteReviewsAbility = (IPoiWriteReviewsAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPoiWriteReviewsAbility.class, null)) != null) {
            iPoiWriteReviewsAbility.Qo();
        }
        ViewGroup viewGroup2 = this.LLJL;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(8, viewGroup2);
        }
        if (getContext() != null) {
            PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse2 = this.LLJJI;
            if (poiWriteReviewResponse2 != null && (postReviewEntrance11 = poiWriteReviewResponse2.getPostReviewEntrance()) != null && (poiReviewUserModel3 = postReviewEntrance11.user) != null && (urlModel = poiReviewUserModel3.avatarThumb) != null) {
                C427660Gpo c427660Gpo = this.LLJJLIIIJLLLLLLLZ;
                if (c427660Gpo != null) {
                    C427660Gpo.LJIIJJI(c427660Gpo, new C03IT(urlModel.getUrlList()), false, null, null, false, false, null, null, false, null, 1022);
                }
                ViewGroup viewGroup3 = this.LLJL;
                if (viewGroup3 != null) {
                    C786410Ut5.LJLZ(0, viewGroup3);
                }
            }
            PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse3 = this.LLJJI;
            if (poiWriteReviewResponse3 != null && (thumbAvatar = poiWriteReviewResponse3.getThumbAvatar()) != null) {
                C427660Gpo c427660Gpo2 = this.LLJJLIIIJLLLLLLLZ;
                if (c427660Gpo2 != null) {
                    C427660Gpo.LJIIJJI(c427660Gpo2, new C03IT(thumbAvatar.url_list), false, null, null, false, false, null, null, false, null, 1022);
                }
                ViewGroup viewGroup4 = this.LLJL;
                if (viewGroup4 != null) {
                    C786410Ut5.LJLZ(0, viewGroup4);
                }
            }
            C427660Gpo c427660Gpo3 = this.LLJJLIIIJLLLLLLLZ;
            if (c427660Gpo3 != null) {
                C786410Ut5.T8(c427660Gpo3, new ACListenerS147S0100000_12(this, 368));
            }
            C427660Gpo c427660Gpo4 = this.LLJJLIIIJLLLLLLLZ;
            if (c427660Gpo4 != null) {
                C427690Gpr.LJ(c427660Gpo4, Float.MAX_VALUE);
            }
        }
        RadiusLayout radiusLayout = this.LLJJIJIL;
        if (radiusLayout != null) {
            C786410Ut5.LLZZ(radiusLayout, 8);
        }
        PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse4 = this.LLJJI;
        if (poiWriteReviewResponse4 != null && (postReviewEntrance10 = poiWriteReviewResponse4.getPostReviewEntrance()) != null && (aweme = postReviewEntrance10.aweme) != null) {
            RadiusLayout radiusLayout2 = this.LLJJIJIL;
            if (radiusLayout2 != null) {
                C786410Ut5.LLZZ(radiusLayout2, 0);
            }
            SmartImageView smartImageView = this.LLJJIJIIJIL;
            if (smartImageView != null && (video = aweme.getVideo()) != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(video.getCover()));
                c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
        }
        PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse5 = this.LLJJI;
        if (poiWriteReviewResponse5 != null && poiWriteReviewResponse5.getPostReviewEntrance() != null) {
            PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse6 = this.LLJJI;
            if (poiWriteReviewResponse6 != null && (postReviewEntrance8 = poiWriteReviewResponse6.getPostReviewEntrance()) != null && postReviewEntrance8.title != null) {
                TuxTextView tuxTextView = this.LLJJJIL;
                if (tuxTextView != null) {
                    Context context = getContext();
                    if (context != null) {
                        C1193610hAN c1193610hAN = new C1193610hAN(context);
                        PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse7 = this.LLJJI;
                        if (poiWriteReviewResponse7 != null && (postReviewEntrance9 = poiWriteReviewResponse7.getPostReviewEntrance()) != null) {
                            lsRichText4 = postReviewEntrance9.title;
                        } else {
                            lsRichText4 = null;
                        }
                        c1193610hAN.LIZ(lsRichText4, null);
                        spannableStringBuilder3 = c1193610hAN.LIZIZ;
                    } else {
                        spannableStringBuilder3 = null;
                    }
                    tuxTextView.setText(spannableStringBuilder3);
                }
            } else {
                TuxTextView tuxTextView2 = this.LLJJJIL;
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 8);
                }
            }
            PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse8 = this.LLJJI;
            if (poiWriteReviewResponse8 != null && (postReviewEntrance6 = poiWriteReviewResponse8.getPostReviewEntrance()) != null && postReviewEntrance6.content != null) {
                TuxTextView tuxTextView3 = this.LLJJJJJIL;
                if (tuxTextView3 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView3, 0);
                }
                TuxTextView tuxTextView4 = this.LLJJJJJIL;
                if (tuxTextView4 != null) {
                    Context context2 = getContext();
                    if (context2 != null) {
                        C1193610hAN c1193610hAN2 = new C1193610hAN(context2);
                        PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse9 = this.LLJJI;
                        if (poiWriteReviewResponse9 != null && (postReviewEntrance7 = poiWriteReviewResponse9.getPostReviewEntrance()) != null) {
                            lsRichText3 = postReviewEntrance7.content;
                        } else {
                            lsRichText3 = null;
                        }
                        c1193610hAN2.LIZ(lsRichText3, null);
                        spannableStringBuilder2 = c1193610hAN2.LIZIZ;
                    } else {
                        spannableStringBuilder2 = null;
                    }
                    tuxTextView4.setText(spannableStringBuilder2);
                }
            } else {
                TuxTextView tuxTextView5 = this.LLJJJJJIL;
                if (tuxTextView5 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView5, 8);
                }
            }
            PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse10 = this.LLJJI;
            if (poiWriteReviewResponse10 != null && (postReviewEntrance4 = poiWriteReviewResponse10.getPostReviewEntrance()) != null && (lsRichText = postReviewEntrance4.sourceTag) != null && (str2 = lsRichText.template) != null && str2.length() != 0) {
                TuxTextView tuxTextView6 = this.LLJJJJ;
                if (tuxTextView6 != null) {
                    Context context3 = getContext();
                    if (context3 != null) {
                        C1193610hAN c1193610hAN3 = new C1193610hAN(context3);
                        PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse11 = this.LLJJI;
                        if (poiWriteReviewResponse11 != null && (postReviewEntrance5 = poiWriteReviewResponse11.getPostReviewEntrance()) != null) {
                            lsRichText2 = postReviewEntrance5.sourceTag;
                        } else {
                            lsRichText2 = null;
                        }
                        c1193610hAN3.LIZ(lsRichText2, null);
                        spannableStringBuilder = c1193610hAN3.LIZIZ;
                    } else {
                        spannableStringBuilder = null;
                    }
                    tuxTextView6.setText(spannableStringBuilder);
                }
            } else {
                TuxTextView tuxTextView7 = this.LLJJJJ;
                if (tuxTextView7 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView7, 8);
                }
            }
            PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse12 = this.LLJJI;
            if (poiWriteReviewResponse12 != null && (postReviewEntrance2 = poiWriteReviewResponse12.getPostReviewEntrance()) != null && (poiReviewUserModel = postReviewEntrance2.user) != null && (poiReviewUserLevelInfoModel = poiReviewUserModel.userLevelInfo) != null && poiReviewUserLevelInfoModel.smallLevelIcon != null && C1190660h5c.LIZ()) {
                PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse13 = this.LLJJI;
                if (poiWriteReviewResponse13 != null && (postReviewEntrance3 = poiWriteReviewResponse13.getPostReviewEntrance()) != null && (poiReviewUserModel2 = postReviewEntrance3.user) != null && (poiReviewUserLevelInfoModel2 = poiReviewUserModel2.userLevelInfo) != null) {
                    urlModel2 = poiReviewUserLevelInfoModel2.smallLevelIcon;
                }
                SmartImageView smartImageView2 = this.LLJLL;
                if (smartImageView2 != null) {
                    C786410Ut5.LLFF(0, smartImageView2);
                }
                SmartImageView smartImageView3 = this.LLJLL;
                if (smartImageView3 != null) {
                    C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel2));
                    c1331670kl3LJIIIIZZ2.LJJ(smartImageView3);
                    C786410Ut5.h3(c1331670kl3LJIIIIZZ2);
                }
            }
        } else {
            TuxTextView tuxTextView8 = this.LLJJJIL;
            if (tuxTextView8 != null) {
                PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse14 = this.LLJJI;
                if (poiWriteReviewResponse14 != null) {
                    entranceDescription = poiWriteReviewResponse14.getEntranceDescription();
                } else {
                    entranceDescription = null;
                }
                tuxTextView8.setText(entranceDescription);
            }
            IPoiWriteReviewsAbility iPoiWriteReviewsAbility3 = (IPoiWriteReviewsAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPoiWriteReviewsAbility.class, null);
            if (iPoiWriteReviewsAbility3 != null && iPoiWriteReviewsAbility3.Yv()) {
                TuxTextView tuxTextView9 = this.LLJJJIL;
                if (tuxTextView9 != null) {
                    tuxTextView9.setTuxFont(42);
                }
            } else {
                TuxTextView tuxTextView10 = this.LLJJJIL;
                if (tuxTextView10 != null) {
                    tuxTextView10.setTuxFont(33);
                }
            }
            PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse15 = this.LLJJI;
            if (poiWriteReviewResponse15 != null && (entranceSubDescription = poiWriteReviewResponse15.getEntranceSubDescription()) != null && entranceSubDescription.length() != 0) {
                TuxTextView tuxTextView11 = this.LLJJJJJIL;
                if (tuxTextView11 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView11, 0);
                }
                TuxTextView tuxTextView12 = this.LLJJJJJIL;
                if (tuxTextView12 != null) {
                    PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse16 = this.LLJJI;
                    if (poiWriteReviewResponse16 != null) {
                        entranceSubDescription2 = poiWriteReviewResponse16.getEntranceSubDescription();
                    }
                    tuxTextView12.setText(entranceSubDescription2);
                }
                TuxTextView tuxTextView13 = this.LLJJJJJIL;
                if (tuxTextView13 != null) {
                    tuxTextView13.setTuxFont(61);
                }
            } else {
                TuxTextView tuxTextView14 = this.LLJJJJJIL;
                if (tuxTextView14 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView14, 8);
                }
            }
        }
        InterfaceC1190800h5q interfaceC1190800h5qHp = hp();
        if (interfaceC1190800h5qHp != null) {
            interfaceC1190800h5qHp.LIZ(new AwS597S0100000_18(this, 868));
        }
        PoiReviewFrequencyControl poiReviewFrequencyControl = PoiReviewFrequencyControl.LIZ;
        String str3 = this.LLJJIII;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        poiReviewFrequencyControl.getClass();
        PoiReviewFrequencyControl.LJ(str3);
        try {
            PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse17 = this.LLJJI;
            if (poiWriteReviewResponse17 != null && (postReviewEntrance = poiWriteReviewResponse17.getPostReviewEntrance()) != null && (str = postReviewEntrance.extraInfo) != null) {
                this.LLJLILLLLZIIL = new JSONObject(str).optString("incentive_type");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1180060goW.LIZ(getContentView(), new AwS562S0100000_18(this, 2556));
        C1191160h6Q c1191160h6Q = C1191160h6Q.LIZ;
        PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse18 = this.LLJJI;
        if (poiWriteReviewResponse18 != null && (displayInfo = poiWriteReviewResponse18.getDisplayInfo()) != null) {
            str4 = displayInfo;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(this));
        c1191160h6Q.getClass();
        C1191160h6Q.LJJIIJ(pageFinderVia, interfaceC665370Q7zLJIIL, null, str4);
        ViewGroup viewGroup5 = this.LLJL;
        if (viewGroup5 != null) {
            HandlerHook.viewPost(viewGroup5, new ARunnableS112S0100000_12(this, 339));
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_write_review_enlarge_area", false) == 2) {
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 171), getContentView());
        }
    }
}
