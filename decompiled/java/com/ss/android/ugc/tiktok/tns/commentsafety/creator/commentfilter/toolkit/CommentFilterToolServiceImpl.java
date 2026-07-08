package com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit;

import X.AnonymousClass1031;
import X.C103G;

/* JADX INFO: loaded from: classes29.dex */
public final class CommentFilterToolServiceImpl implements ICommentFilterToolService {
    @Override // com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.ICommentFilterToolService
    public final void LIZ() {
        AnonymousClass1031 anonymousClass1031 = new AnonymousClass1031() { // from class: X.109G
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.AnonymousClass1031
            public final AbstractC191843103l LIZ(C191848103q c191848103q, C104A c104a) {
                if (c104a instanceof C103P) {
                    String str = c104a.LIZ;
                    switch (str.hashCode()) {
                        case -2001728499:
                            if (!str.equals("filter_spam_offensive_comments_item")) {
                                return null;
                            }
                            return new C109I(c191848103q, (C103P) c104a);
                        case -1972956327:
                            if (!str.equals("filter_all_comments_item")) {
                                return null;
                            }
                            return new C109H(c191848103q, (C103P) c104a);
                        case 49399232:
                            if (!str.equals("review_filtered_comments_entrance")) {
                                return null;
                            }
                            return new C103M(c191848103q, (C103P) c104a);
                        case 1506478837:
                            if (!str.equals("filter_keywords_in_comments_entrance")) {
                                return null;
                            }
                            return new C109J(c191848103q, (C103P) c104a);
                        case 1723954389:
                            if (!str.equals("creator_care_mode_switch")) {
                                return null;
                            }
                            return new C109F(c191848103q, (C103P) c104a);
                        default:
                            return null;
                    }
                }
                return null;
            }
        };
        C103G.LIZ("creator_care_mode_switch", anonymousClass1031);
        C103G.LIZ("filter_all_comments_item", anonymousClass1031);
        C103G.LIZ("filter_spam_offensive_comments_item", anonymousClass1031);
        C103G.LIZ("filter_keywords_in_comments_entrance", anonymousClass1031);
        C103G.LIZ("review_filtered_comments_entrance", anonymousClass1031);
    }
}
