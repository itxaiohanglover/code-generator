import { GithubOutlined } from '@ant-design/icons';
import { DefaultFooter } from '@ant-design/pro-components';
import '@umijs/max';
import React from 'react';

const Footer: React.FC = () => {
  const defaultMessage = '文艺倾年';
  const currentYear = new Date().getFullYear();
  return (
    <DefaultFooter
      style={{
        background: 'none',
      }}
      copyright={`${currentYear} ${defaultMessage}`}
      links={[
        {
          key: 'github',
          title: (
            <>
              <GithubOutlined /> Github源码
            </>
          ),
          href: 'https://github.com/itxaiohanglover?tab=repositories',
          blankTarget: true,
        },
      ]}
    />
  );
};
export default Footer;
