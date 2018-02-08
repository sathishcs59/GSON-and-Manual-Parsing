package android.oneindia.in.datasubscription;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by greynium on 8/2/18.
 */

class Subscription {

    /**
     * data : {"type":"accounts","id":"2593177","attributes":{"payment-type":"prepaid","unbilled-charges":null,"next-billing-date":null,"title":"Ms","first-name":"Joe","last-name":"Bloggs","date-of-birth":"1985-01-01","contact-number":"0404000000","email-address":"test@mivi.com","email-address-verified":false,"email-subscription-status":false},"links":{"self":"http://localhost:3000/accounts/2593177"},"relationships":{"services":{"links":{"related":"http://localhost:3000/services/0468874507"}}}}
     * included : [{"type":"services","id":"0468874507","attributes":{"msn":"0468874507","credit":1200,"credit-expiry":"2016-11-20","data-usage-threshold":false},"links":{"self":"http://localhost:3000/services/0468874507"},"relationships":{"subscriptions":{"links":{"related":"http://localhost:3000/services/0468874507/subscriptions"},"data":[{"type":"subscriptions","id":"0468874507-0"}]}}},{"type":"subscriptions","id":"0468874507-0","attributes":{"included-data-balance":52400,"included-credit-balance":null,"included-rollover-credit-balance":null,"included-rollover-data-balance":null,"included-international-talk-balance":null,"expiry-date":"2016-11-19","auto-renewal":true,"primary-subscription":true},"links":{"self":"http://localhost:3000/services/0468874507/subscriptions/0468874507-0"},"relationships":{"service":{"links":{"related":"http://localhost:3000/services/0468874507"}},"product":{"data":{"type":"products","id":"0"}},"downgrade":{"data":null}}},{"type":"products","id":"4000","attributes":{"name":"UNLIMITED 7GB","included-data":null,"included-credit":null,"included-international-talk":null,"unlimited-text":true,"unlimited-talk":true,"unlimited-international-text":false,"unlimited-international-talk":false,"price":3990}}]
     */

    private DataBean data;
    private List<IncludedBean> included;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public List<IncludedBean> getIncluded() {
        return included;
    }

    public void setIncluded(List<IncludedBean> included) {
        this.included = included;
    }

    public static class DataBean {
        /**
         * type : accounts
         * id : 2593177
         * attributes : {"payment-type":"prepaid","unbilled-charges":null,"next-billing-date":null,"title":"Ms","first-name":"Joe","last-name":"Bloggs","date-of-birth":"1985-01-01","contact-number":"0404000000","email-address":"test@mivi.com","email-address-verified":false,"email-subscription-status":false}
         * links : {"self":"http://localhost:3000/accounts/2593177"}
         * relationships : {"services":{"links":{"related":"http://localhost:3000/services/0468874507"}}}
         */

        private String type;
        private String id;
        private AttributesBean attributes;
        private LinksBean links;
        private RelationshipsBean relationships;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public AttributesBean getAttributes() {
            return attributes;
        }

        public void setAttributes(AttributesBean attributes) {
            this.attributes = attributes;
        }

        public LinksBean getLinks() {
            return links;
        }

        public void setLinks(LinksBean links) {
            this.links = links;
        }

        public RelationshipsBean getRelationships() {
            return relationships;
        }

        public void setRelationships(RelationshipsBean relationships) {
            this.relationships = relationships;
        }

        public static class AttributesBean {
            /**
             * payment-type : prepaid
             * unbilled-charges : null
             * next-billing-date : null
             * title : Ms
             * first-name : Joe
             * last-name : Bloggs
             * date-of-birth : 1985-01-01
             * contact-number : 0404000000
             * email-address : test@mivi.com
             * email-address-verified : false
             * email-subscription-status : false
             */

            @SerializedName("payment-type")
            private String paymenttype;
            @SerializedName("unbilled-charges")
            private Object unbilledcharges;
            @SerializedName("next-billing-date")
            private Object nextbillingdate;
            private String title;
            @SerializedName("first-name")
            private String firstname;
            @SerializedName("last-name")
            private String lastname;
            @SerializedName("date-of-birth")
            private String dateofbirth;
            @SerializedName("contact-number")
            private String contactnumber;
            @SerializedName("email-address")
            private String emailaddress;
            @SerializedName("email-address-verified")
            private boolean emailaddressverified;
            @SerializedName("email-subscription-status")
            private boolean emailsubscriptionstatus;

            public String getPaymenttype() {
                return paymenttype;
            }

            public void setPaymenttype(String paymenttype) {
                this.paymenttype = paymenttype;
            }

            public Object getUnbilledcharges() {
                return unbilledcharges;
            }

            public void setUnbilledcharges(Object unbilledcharges) {
                this.unbilledcharges = unbilledcharges;
            }

            public Object getNextbillingdate() {
                return nextbillingdate;
            }

            public void setNextbillingdate(Object nextbillingdate) {
                this.nextbillingdate = nextbillingdate;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getFirstname() {
                return firstname;
            }

            public void setFirstname(String firstname) {
                this.firstname = firstname;
            }

            public String getLastname() {
                return lastname;
            }

            public void setLastname(String lastname) {
                this.lastname = lastname;
            }

            public String getDateofbirth() {
                return dateofbirth;
            }

            public void setDateofbirth(String dateofbirth) {
                this.dateofbirth = dateofbirth;
            }

            public String getContactnumber() {
                return contactnumber;
            }

            public void setContactnumber(String contactnumber) {
                this.contactnumber = contactnumber;
            }

            public String getEmailaddress() {
                return emailaddress;
            }

            public void setEmailaddress(String emailaddress) {
                this.emailaddress = emailaddress;
            }

            public boolean isEmailaddressverified() {
                return emailaddressverified;
            }

            public void setEmailaddressverified(boolean emailaddressverified) {
                this.emailaddressverified = emailaddressverified;
            }

            public boolean isEmailsubscriptionstatus() {
                return emailsubscriptionstatus;
            }

            public void setEmailsubscriptionstatus(boolean emailsubscriptionstatus) {
                this.emailsubscriptionstatus = emailsubscriptionstatus;
            }
        }

        public static class LinksBean {
            /**
             * self : http://localhost:3000/accounts/2593177
             */

            private String self;

            public String getSelf() {
                return self;
            }

            public void setSelf(String self) {
                this.self = self;
            }
        }

        public static class RelationshipsBean {
            /**
             * services : {"links":{"related":"http://localhost:3000/services/0468874507"}}
             */

            private ServicesBean services;

            public ServicesBean getServices() {
                return services;
            }

            public void setServices(ServicesBean services) {
                this.services = services;
            }

            public static class ServicesBean {
                /**
                 * links : {"related":"http://localhost:3000/services/0468874507"}
                 */

                private LinksBeanX links;

                public LinksBeanX getLinks() {
                    return links;
                }

                public void setLinks(LinksBeanX links) {
                    this.links = links;
                }

                public static class LinksBeanX {
                    /**
                     * related : http://localhost:3000/services/0468874507
                     */

                    private String related;

                    public String getRelated() {
                        return related;
                    }

                    public void setRelated(String related) {
                        this.related = related;
                    }
                }
            }
        }
    }

    public static class IncludedBean {
        /**
         * type : services
         * id : 0468874507
         * attributes : {"msn":"0468874507","credit":1200,"credit-expiry":"2016-11-20","data-usage-threshold":false}
         * links : {"self":"http://localhost:3000/services/0468874507"}
         * relationships : {"subscriptions":{"links":{"related":"http://localhost:3000/services/0468874507/subscriptions"},"data":[{"type":"subscriptions","id":"0468874507-0"}]}}
         */

        private String type;
        private String id;
        private AttributesBeanX attributes;
        private LinksBeanXX links;
        private RelationshipsBeanX relationships;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public AttributesBeanX getAttributes() {
            return attributes;
        }

        public void setAttributes(AttributesBeanX attributes) {
            this.attributes = attributes;
        }

        public LinksBeanXX getLinks() {
            return links;
        }

        public void setLinks(LinksBeanXX links) {
            this.links = links;
        }

        public RelationshipsBeanX getRelationships() {
            return relationships;
        }

        public void setRelationships(RelationshipsBeanX relationships) {
            this.relationships = relationships;
        }

        public static class AttributesBeanX {
            /**
             * msn : 0468874507
             * credit : 1200
             * credit-expiry : 2016-11-20
             * data-usage-threshold : false
             */

            private String msn;



            private int credit;
            @SerializedName("credit-expiry")
            private String creditexpiry;
            @SerializedName("data-usage-threshold")
            private boolean datausagethreshold;

            public String getMsn() {
                return msn;
            }

            public void setMsn(String msn) {
                this.msn = msn;
            }

            public int getCredit() {
                return credit;
            }

            public void setCredit(int credit) {
                this.credit = credit;
            }

            public String getCreditexpiry() {
                return creditexpiry;
            }

            public void setCreditexpiry(String creditexpiry) {
                this.creditexpiry = creditexpiry;
            }

            public boolean isDatausagethreshold() {
                return datausagethreshold;
            }

            public void setDatausagethreshold(boolean datausagethreshold) {
                this.datausagethreshold = datausagethreshold;
            }
        }

        public static class LinksBeanXX {
            /**
             * self : http://localhost:3000/services/0468874507
             */

            private String self;

            public String getSelf() {
                return self;
            }

            public void setSelf(String self) {
                this.self = self;
            }
        }

        public static class RelationshipsBeanX {
            /**
             * subscriptions : {"links":{"related":"http://localhost:3000/services/0468874507/subscriptions"},"data":[{"type":"subscriptions","id":"0468874507-0"}]}
             */

            private SubscriptionsBean subscriptions;

            public SubscriptionsBean getSubscriptions() {
                return subscriptions;
            }

            public void setSubscriptions(SubscriptionsBean subscriptions) {
                this.subscriptions = subscriptions;
            }

            public static class SubscriptionsBean {
                /**
                 * links : {"related":"http://localhost:3000/services/0468874507/subscriptions"}
                 * data : [{"type":"subscriptions","id":"0468874507-0"}]
                 */

                private LinksBeanXXX links;
                private List<DataBeanX> data;

                public LinksBeanXXX getLinks() {
                    return links;
                }

                public void setLinks(LinksBeanXXX links) {
                    this.links = links;
                }

                public List<DataBeanX> getData() {
                    return data;
                }

                public void setData(List<DataBeanX> data) {
                    this.data = data;
                }

                public static class LinksBeanXXX {
                    /**
                     * related : http://localhost:3000/services/0468874507/subscriptions
                     */

                    private String related;

                    public String getRelated() {
                        return related;
                    }

                    public void setRelated(String related) {
                        this.related = related;
                    }
                }

                public static class DataBeanX {
                    /**
                     * type : subscriptions
                     * id : 0468874507-0
                     */

                    private String type;
                    private String id;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }
            }
        }
    }
}
