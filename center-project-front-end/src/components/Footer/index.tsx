import {GithubOutlined} from '@ant-design/icons';
import {DefaultFooter} from '@ant-design/pro-layout';
import {ANT_LINK} from "@/constants";

const Footer: React.FC = () => {
  const defaultMessage = 'MADE BY CYQ';
  const currentYear = new Date().getFullYear();
  return (
    <DefaultFooter
      copyright={`${currentYear} ${defaultMessage}`}
      links={[
        {
          key: 'Ant Design Pro',
          title: '前端参考 : Ant Design Pro',
          href: ANT_LINK,
          blankTarget: true,
        },
        {
          key: 'cyq-website',
          title: '逸！',
          href: 'http://cccccyq.icu',
          blankTarget: true,
        },
        {
          key: 'github',
          title: <><GithubOutlined/> CYQ GitHub</>,
          href: 'https://github.com/unstoppablecyq',
          blankTarget: true,
        },
      {
          key: 'beian',
          title: '沪ICP备2021031669号',
          href: 'https://beian.miit.gov.cn',
          blankTarget: true,
      },

      ]}
    />
  );
};

export default Footer;
